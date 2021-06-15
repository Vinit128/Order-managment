package com.egen.model;


public class Shiping {

   //e. supports more shipping/delivery methods: In-store pickup, curbside delivery,
    //	ship to home, 3rd party delivery etc.

    private String shippingId;

    private String shippingAddress1;
    private String shippingAddress2;
    private String shippingCity;
    private String shippingState;
    private String shippingZip;

    public void setShippingId(String shippingId) {
        this.shippingId = shippingId;
    }

    public void setShippingAddress1(String shippingAddress1) {
        this.shippingAddress1 = shippingAddress1;
    }

    public void setShippingAddress2(String shippingAddress2) {
        this.shippingAddress2 = shippingAddress2;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }

    public void setShippingZip(String shippingZip) {
        this.shippingZip = shippingZip;
    }

    public String getShippingId() {
        return shippingId;
    }

    public String getShippingAddress1() {
        return shippingAddress1;
    }

    public String getShippingAddress2() {
        return shippingAddress2;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public String getShippingState() {
        return shippingState;
    }

    public String getShippingZip() {
        return shippingZip;
    }
}






public enum Shipping {
    INSTORE ,CURBSIDE, SHIP_HOME,OTHERPARTY ;

}
