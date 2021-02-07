package com.example.myproject_1.Models;

public class Terms {
    private int termId;
    private String termName;
    private String imageName;
    private int price;
    private boolean isActive;
    private int testTime;
    private byte numberQuestionOfLevel;
    private byte fieldId;

    public Terms() {
    }

    public Terms(int termId, String termName, String imageName, int price, boolean isActive, int testTime, byte numberQuestionOfLevel, byte fieldId) {
        this.termId = termId;
        this.termName = termName;
        this.imageName = imageName;
        this.price = price;
        this.isActive = isActive;
        this.testTime = testTime;
        this.numberQuestionOfLevel = numberQuestionOfLevel;
        this.fieldId = fieldId;
    }

    public int getTermId() {
        return termId;
    }

    public void setTermId(int termId) {
        this.termId = termId;
    }

    public String getTermName() {
        return termName;
    }

    public void setTermName(String termName) {
        this.termName = termName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getTestTime() {
        return testTime;
    }

    public void setTestTime(int testTime) {
        this.testTime = testTime;
    }

    public byte getNumberQuestionOfLevel() {
        return numberQuestionOfLevel;
    }

    public void setNumberQuestionOfLevel(byte numberQuestionOfLevel) {
        this.numberQuestionOfLevel = numberQuestionOfLevel;
    }

    public byte getFieldId() {
        return fieldId;
    }

    public void setFieldId(byte fieldId) {
        this.fieldId = fieldId;
    }
}
