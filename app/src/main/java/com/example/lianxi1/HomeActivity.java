package com.example.lianxi1;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.alex.greendao.gen.YesterdayBeanDao;
import com.example.lianxi1.adapter.MyAdapter;
import com.google.gson.Gson;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private ListView lv;
    private Button button;
   private List<YesterdayBean> list=new ArrayList<>();
    private MyAdapter adapter;

    private YesterdayBeanDao yesterdayBeanDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        yesterdayBeanDao=MyApplication.getInstance().getDao();
        initData();
        initeLinsenner();
        query();

    }

    private void query() {
        List<YesterdayBean> list2=yesterdayBeanDao.loadAll();
        list.addAll(list2);

    }


    private void initeLinsenner() {
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, final int pos, long l) {

            new AlertDialog.Builder(HomeActivity.this).setTitle("提示").setMessage("请选择操作按钮").setNegativeButton("删除", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    list.remove(pos);
                    adapter.notifyDataSetChanged();

                }
            }).setPositiveButton("修改", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    Intent in=new Intent(HomeActivity.this,gaiActivity.class);
                    startActivity(in);
                }
            }).create().show();
                return false;
            }
        });
    }

    private void initData() {
        toolbar.setTitle("首页");


        OkHttpClient okHttpClient=new OkHttpClient();
        Request request=new Request.Builder().url("http://www.sojson.com/open/api/weather/json.shtml?city=北京").build();
        okHttpClient.newCall(request).enqueue(new Callback() {


            @Override
             public void onFailure(Request request, IOException e) {

             }

             @Override
             public void onResponse(Response response) throws IOException {

                      String str=response.body().string();
                // Log.e("TAG",str);
                      Gson gson=new Gson();
                      Demo demo=gson.fromJson(str,Demo.class);
                     YesterdayBean yesterdayBen=   demo.getData().getYesterday();
                     list.add(yesterdayBen);

                      yesterdayBeanDao.insertInTx(list);


                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                         adapter.notifyDataSetChanged();
                    }

                });




             }

         });
    }

    private void initView() {

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        lv = (ListView) findViewById(R.id.lv);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

        adapter=new MyAdapter(list,HomeActivity.this);
        lv.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Intent in=new Intent(HomeActivity.this,AddActivity.class);
                startActivity(in);
                break;
        }
    }
}
