package com.fintech.fintech.classes.finhub;

public class CompanyNews {
    private String category;
    private int datetime;
    private String headline;
    private int id;
    private String related;
    private String source;
    private String summary;
    private String url;

    public void setCategory(String s) {
        this.category = s;
    }
    public String getCategory() {
        return this.category;
    }
    public void setDatetime(int time) {
        this.datetime = time;
    }
    public int getDatetime() {
        return this.datetime;
    }

    public void setHeadline(String s) {
        this.headline = s;
    }
    public String getHeadline() {
        return this.headline;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public String getRelated() {
        return this.related;
    }
    public void setRelated(String s) {
        this.related = s;
    }


    public String getSource() {
        return this.source;
    }
    public void setSource(String s) {
        this.source = s;
    }

    public String getSummary() {
        return this.summary;
    }
    public void setSummary(String s) {
        this.summary = s;
    }
    public String getUrl() {
        return this.url;
    }
    public void setUrl(String s) {
        this.url = s;
    }

}
