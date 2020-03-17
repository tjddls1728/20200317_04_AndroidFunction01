package kr.co.a20200317_04_androidfunction01;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import kr.co.a20200317_04_androidfunction01.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    String sandmessage = getIntent().getStringExtra("message");

        Log.d("받아온String",sandmessage);

    }
}
