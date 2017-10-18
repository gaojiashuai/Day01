package com.example.lianxi1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(in);
                overridePendingTransition(R.anim.tran1,R.anim.tran2);
            }
        });

    }

    private void initView() {
        txt = (TextView) findViewById(R.id.txt);
    }
}
