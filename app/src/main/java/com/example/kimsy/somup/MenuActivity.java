package com.example.kimsy.somup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void onBackClicked(View v){
        //fireBase로 데이터 저장하기
        //회원가입 장면에서 회원가입 버튼 눌렀을 때 반응
        finish();
    }
}
