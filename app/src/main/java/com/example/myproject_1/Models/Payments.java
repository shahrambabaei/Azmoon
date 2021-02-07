package com.example.myproject_1.Models;

import java.util.Date;

public class Payments {
    private int paymentId;
    private String titlePayment;
    private int price;
    private boolean resultPayment;
    private byte resultCode;
    private Date updateDate;
    private Date registerDate;
    private String transactionCode;
    private String randomFactorId;
    private String apiKey;
    private int factorId;
    private int userId;

    public Payments () {
    }

    public Payments (int paymentId, String titlePayment, int price, boolean resultPayment, byte resultCode, Date updateDate, Date registerDate, String transactionCode, String randomFactorId, String apiKey, int factorId, int userId) {
        this.paymentId = paymentId;
        this.titlePayment = titlePayment;
        this.price = price;
        this.resultPayment = resultPayment;
        this.resultCode = resultCode;
        this.updateDate = updateDate;
        this.registerDate = registerDate;
        this.transactionCode = transactionCode;
        this.randomFactorId = randomFactorId;
        this.apiKey = apiKey;
        this.factorId = factorId;
        this.userId = userId;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getTitlePayment() {
        return titlePayment;
    }

    public void setTitlePayment(String titlePayment) {
        this.titlePayment = titlePayment;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isResultPayment() {
        return resultPayment;
    }

    public void setResultPayment(boolean resultPayment) {
        this.resultPayment = resultPayment;
    }

    public byte getResultCode() {
        return resultCode;
    }

    public void setResultCode(byte resultCode) {
        this.resultCode = resultCode;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public String getRandomFactorId() {
        return randomFactorId;
    }

    public void setRandomFactorId(String randomFactorId) {
        this.randomFactorId = randomFactorId;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public int getFactorId() {
        return factorId;
    }

    public void setFactorId(int factorId) {
        this.factorId = factorId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
