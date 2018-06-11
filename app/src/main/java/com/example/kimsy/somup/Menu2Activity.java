package com.example.kimsy.somup;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class Menu2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

       RadioGroup rg_status=(RadioGroup)findViewById(R.id.rg_status);

        final LinearLayout user_con=(LinearLayout)findViewById(R.id.user_con);
        final LinearLayout admin_con=(LinearLayout)findViewById(R.id.admin_con);

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
}
