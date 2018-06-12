package com.example.kimsy.somup;

public class Student {
    private String _id;
    private String _password;
    private int _quantity;

    public Student() {
    }

    public Student(String id, String password, int quantity) {
        this._id = id;
        this._password = password;
        this._quantity = quantity;
    }

    public Student(String id, String password) {
        this._id = id;
        this._password = password;
    }
    public void setID(String id){
        this._id= id;
    }
    public String get_id(){
        return _id;
    }
    public void setProductName(String password){
        this._password = password;
    }
    public String get_password(){
        return _password;
    }
    public void setQuantity(int quantity){
        this._quantity= quantity;
    }
    public int get_quantity(){
        return _quantity;
    }
}
