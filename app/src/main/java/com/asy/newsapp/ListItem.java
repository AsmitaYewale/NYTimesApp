package com.asy.newsapp;

public class ListItem {
    private String head;
    private String desc;
    private String abs;
    private String url;
    private String date;


    public ListItem(String head, String desc, String abs, String url, String date) {
        this.head = head;
        this.desc = desc;
        this.abs = abs;
        this.url = url;
        this.date = date;

    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
