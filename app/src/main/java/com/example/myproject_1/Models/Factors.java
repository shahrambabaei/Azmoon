package com.example.myproject_1.Models;

import java.util.Date;

public class Factors {
    private int factorId;
    private boolean isFinally;
    private int validateTime;
    private Date finallyDate;
    private Date registerDate;
    private int price;
    private int userId;
    private byte termId;

    public Factors() {
    }

    public Factors(int factorId, boolean isFinally, int validateTime, Date finallyDate, Date registerDate, int price, int userId, byte termId) {
        this.factorId = factorId;
        this.isFinally = isFinally;
        this.validateTime = validateTime;
        this.finallyDate = finallyDate;
        this.registerDate = registerDate;
        this.price = price;
        this.userId = userId;
        this.termId = termId;
    }

    public int getFactorId() {
        return factorId;
    }

    public void setFactorId(int factorId) {
        this.factorId = factorId;
    }

    public boolean isFinally() {
        return isFinally;
    }

    public void setFinally(boolean aFinally) {
        isFinally = aFinally;
    }

    public int getValidateTime() {
        return validateTime;
    }

    public void setValidateTime(int validateTime) {
        this.validateTime = validateTime;
    }

    public Date getFinallyDate() {
        return finallyDate;
    }

    public void setFinallyDate(Date finallyDate) {
        this.finallyDate = finallyDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public byte getTermId() {
        return termId;
    }

    public void setTermId(byte termId) {
        this.termId = termId;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
}
