package com.example.lianxi1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.alex.greendao.gen.YesterdayBeanDao;

public class AddActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private EditText name;
    private EditText jieduan;
    private EditText heard;
    private Button button;
    private YesterdayBeanDao yesterdayBeanDao;
    private YesterdayBean yesterdayBean;
    private String name1;
    private String jieduan1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        yesterdayBeanDao=MyApplication.getInstance().getDao();
        initView();
        initData();
    }

    private void initData() {
        toolbar.setTitle("添加");

         name1=name.getText().toString();
        jieduan1=jieduan.getText().toString();
        int heard1=R.mipmap.ic_launcher;

    }

    private void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        name = (EditText) findViewById(R.id.name);
        jieduan = (EditText) findViewById(R.id.jieduan);
        heard = (EditText) findViewById(R.id.heard);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                yesterdayBean=new YesterdayBean(null,name1,jieduan1);
            yesterdayBeanDao.insert(yesterdayBean);
                Intent in=new Intent(this,HomeActivity.class);
                startActivity(in);
                break;
        }
    }

    private void submit() {
        // validate
        String nameString = name.getText().toString().trim();
        if (TextUtils.isEmpty(nameString)) {
            Toast.makeText(this, "nameString不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        String jieduanString = jieduan.getText().toString().trim();
        if (TextUtils.isEmpty(jieduanString)) {
            Toast.makeText(this, "jieduanString不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        String heardString = heard.getText().toString().trim();
        if (TextUtils.isEmpty(heardString)) {
            Toast.makeText(this, "heardString不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO validate success, do something


    }
}
