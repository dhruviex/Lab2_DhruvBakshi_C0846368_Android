package com.example.lab2_dhruvbakshi_c0846368_android;

import java.util.ArrayList;
import java.util.Date;

public class Product {

    public static ArrayList<Product> productArrayList = new ArrayList<>();


    private int prodId;
    private String prodName;
    private String prodDesc;
    private String prodPrice;
    private Date deleted;

    public Product(int prodId, String prodName, String prodDesc, String  prodPrice, Date deleted) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodDesc = prodDesc;
        this.prodPrice = prodPrice;
        this.deleted = deleted;
    }

    public Product(int prodId, String prodName, String prodDesc, String prodPrice) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodDesc = prodDesc;
        this.prodPrice = prodPrice;
        this.deleted = null;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }

    public String getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(String prodPrice) {
        this.prodPrice = prodPrice;
    }

    public Date getDeleted() {
        return deleted;
    }

    public void setDeleted(Date deleted) {
        this.deleted = deleted;
    }
}
