package com.example.artem.myapplication.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.artem.myapplication.Config;
import com.example.artem.myapplication.R;

public class MainActivity extends AppCompatActivity {

    TextView textViewAM;
    Button btn;
    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//layout
        textViewAM = (TextView) findViewById(R.id.id1);//поиск по id
        Log.i(Config.TAG, "MainActivity - onCreate");//log
        //textViewAM.setText("qwerty");
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//регистрация обработчика
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);//переход к следующей активности
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
