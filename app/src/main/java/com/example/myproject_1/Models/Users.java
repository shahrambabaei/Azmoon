package com.example.myproject_1.Models;

public class Users {
    private int userId;
    private String name;
    private String family;
    private String mobileNumber;
    private String password;
    private boolean isActive;
    private byte fieldId;

    public Users() {
    }

    public Users(int userId, String name, String family, String mobileNumber, String password, boolean isActive, byte fieldId) {
        this.userId = userId;
        this.name = name;
        this.family = family;
        this.mobileNumber = mobileNumber;
        this.password = password;
        this.isActive = isActive;
        this.fieldId = fieldId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public byte getFieldId() {
        return fieldId;
    }

    public void setFieldId(byte fieldId) {
        this.fieldId = fieldId;
    }
}
