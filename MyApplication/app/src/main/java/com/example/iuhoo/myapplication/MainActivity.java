package com.example.iuhoo.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    ListView listView;
    MyListAdapter myListAdapter;
    ArrayList<list_item> list_itemArrayList;
    Button click_btn;
    EditText input1;
    EditText input2;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_bookroom:
                    mTextMessage.setText(R.string.title_bookroom);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_sell);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.Listview);
        list_itemArrayList = new ArrayList<list_item>();
        list_itemArrayList.add(new list_item("책","가격"));
        list_itemArrayList.add(new list_item("C++++++++","21,000"));
        list_itemArrayList.add(new list_item("JAVA","1,100"));
        list_itemArrayList.add(new list_item("JAVASCRIPT","123"));
        list_itemArrayList.add(new list_item("ASDF","2,200"));
        list_itemArrayList.add(new list_item("PyTHon","ii,iii"));

        click_btn = (Button)findViewById(R.id.button);
        input1 = (EditText)findViewById(R.id.editText);
        input2 = (EditText)findViewById(R.id.editText2);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        click_btn.setOnClickListener(mClickListener);
        myListAdapter = new MyListAdapter(MainActivity.this,list_itemArrayList);
        listView.setAdapter(myListAdapter);
    }
    View.OnClickListener mClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            list_itemArrayList.add(new list_item(input1.getText().toString(),input2.getText().toString()));
            myListAdapter.notifyDataSetChanged();
        }
    };
}



