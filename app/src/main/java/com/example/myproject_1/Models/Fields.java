package com.example.myproject_1.Models;

public class Fields {
    private byte fieldId;
    private String fieldName;
    private String imageName;
    private boolean isActive;

    public Fields() {
    }

    public Fields(byte fieldId, String fieldName, String imageName, boolean isActive) {
        this.fieldId = fieldId;
        this.fieldName = fieldName;
        this.imageName = imageName;
        this.isActive = isActive;
    }

    public byte getFieldId() {
        return fieldId;
    }

    public void setFieldId(byte fieldId) {
        this.fieldId = fieldId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
