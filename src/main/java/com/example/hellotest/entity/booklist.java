package com.example.hellotest.entity;

public class booklist {
    private Integer bId;

    private String data;

    private String publish;

    private String classify;

    private String bSummary;

    private String bName;

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish == null ? null : publish.trim();
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify == null ? null : classify.trim();
    }

    public String getbSummary() {
        return bSummary;
    }

    public void setbSummary(String bSummary) {
        this.bSummary = bSummary == null ? null : bSummary.trim();
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName == null ? null : bName.trim();
    }
}