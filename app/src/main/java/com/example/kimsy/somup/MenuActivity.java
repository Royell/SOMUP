/***회원가입 화면***/
package com.example.kimsy.somup;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MenuActivity extends AppCompatActivity {

    public EditText etEmail;
    EditText etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        RadioGroup rg_status=(RadioGroup)findViewById(R.id.rg_status);

        final ConstraintLayout user_con=(ConstraintLayout)findViewById(R.id.user_con);
        final ConstraintLayout admin_con=(ConstraintLayout)findViewById(R.id.admin_con);

        rg_status.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rBtn_user){
                    user_con.setVisibility(View.VISIBLE);
                    admin_con.setVisibility(View.INVISIBLE);
                }
                else{
                    user_con.setVisibility(View.INVISIBLE);
                    admin_con.setVisibility(View.VISIBLE);
                }
            }
        });
    }




    public void onBackClicked(View v){
        //fireBase로 데이터 저장하기
        etEmail=findViewById(R.id.id);
        String id=etEmail.getText().toString();
        etPassword=findViewById(R.id.pw);
        String pw=etPassword.getText().toString();
        FirebaseDatabase database = FirebaseDatabase. getInstance (); DatabaseReference table = database.getReference("SomupDB/Student");
        DatabaseReference num1 = table.child("학번");
        num1.child("ID").setValue(id);
        num1.child("PASSWORD").setValue(pw);

        finish();
    }
}
