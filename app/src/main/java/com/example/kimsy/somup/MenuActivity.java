/***회원가입 화면***/
package com.example.kimsy.somup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MenuActivity extends AppCompatActivity {

    public EditText id;
    public EditText pw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);



    }

    public void onBackClicked(View v){
        //fireBase로 데이터 저장하기
        id=findViewById(R.id.id);
        pw=findViewById(R.id.pw);
        DatabaseReference mDatabase;
        mDatabase = FirebaseDatabase.getInstance().getReference("sw");
        DatabaseReference rDatabase = mDatabase.child("students");
        Student items = new Student(id.getText().toString(), pw.getText().toString());
        rDatabase.child(id.getText().toString()).setValue(items);

        Intent intent=new Intent(this, Menu2Activity.class);
        startActivity(intent);

        finish();
    }

}
