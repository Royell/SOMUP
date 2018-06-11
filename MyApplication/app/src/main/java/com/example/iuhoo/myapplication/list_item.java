package com.example.iuhoo.myapplication;

public class list_item {
    private String nickname;
    private String title;

    public list_item(String nickname, String title) {
        this.nickname = nickname;
        this.title = title;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
