package com.example.artem.myapplication.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.artem.myapplication.Config;
import com.example.artem.myapplication.R;

/**
 * Created by Artem on 13.09.2016.
 */
public class SecondActivity extends AppCompatActivity {
    TextView textViewAM;

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textViewAM = (TextView) findViewById(R.id.id2);
        textViewAM.setText("qwertyu");
        Log.i(Config.TAG, "MainActivity - onCreate");

        //onBackPressed();

    }
    @Override
    public void onBackPressed() {//регистрация обработчика
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);//возврат к предыдущей активности
        startActivity(intent);
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
