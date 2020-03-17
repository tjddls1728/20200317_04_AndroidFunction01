package kr.co.a20200317_04_androidfunction01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import kr.co.a20200317_04_androidfunction01.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        binding.goTofisrtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                FirstActivity로 이동하자!
                Intent intent = new Intent(MainActivity.this,FirstActivity.class);
                startActivity(intent);

            }
        });

        binding.goTosecondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputEdt =binding.inputEdt.getText().toString();


                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
//                inputmessage변수를, message라는 이름으로 붙여서 첨부.
                intent.putExtra("message",inputEdt);
                startActivity(intent);

            }
        });

    }
}
