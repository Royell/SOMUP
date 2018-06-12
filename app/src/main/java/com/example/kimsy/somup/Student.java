package com.example.kimsy.somup;

import java.util.ArrayList;

public class Student {
    private String _id;
    private String _password;
    private String _name;
    private int _num;
    public ArrayList<String> subject;

    public Student() {

    }

    public Student(String id, String password,String name,int num) {
        this._id = id;
        this._password = password;
        this._name = name;
        this._num = num;
    }

    public Student(String id, String password) {
        this._id = id;
        this._password = password;
        this._num = 20000000;
    }

    public void setID(String id){
        this._id= id;
    }
    public String get_id(){
        return _id;
    }
    public String get_name(){ return _name; }
    public int get_num(){return _num; }
    public void setProductName(String password){
        this._password = password;
    }
    public String get_password(){
        return _password;
    }



}
