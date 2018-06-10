package com.example.kimsy.somup;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseDatabase database = FirebaseDatabase.getInstance();

    }

    public void onButton1Clicked(View v){
        //로그인 화면 -> 생각해보니깐 시작화면이 없네 ^^ㅠ
        //로그인 버튼 눌렀을 때
        //db랑 연동해서 로그인 확인!
        Toast.makeText(getApplicationContext(),"로그인 버튼이 눌렸어요",Toast.LENGTH_LONG).show();
        EditText idText=findViewById(R.id.idText);
        String id=idText.getText().toString();
        TextView idCheck = findViewById(R.id.idCheck);
        idCheck.setText(id);

        EditText pwText=findViewById(R.id.pwText);
        String pw=pwText.getText().toString();
        TextView pwCheck = findViewById(R.id.pwCheck);
        pwCheck.setText(pw);
    }

    public void onButton2Clicked(View v){
        //웹 페이지 버튼
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(intent);
    }

    public void signUpUser(String email, String password){

    }
    public void onButton3Clicked(View v){
        //회원가입 버튼 눌렀을 때 menuActivity 띄움

        Intent intent = new Intent(this,MenuActivity.class);
        startActivity(intent);

    }

}
