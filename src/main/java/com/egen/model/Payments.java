package com.egen.model;
import java.util.Date;
public class Payments{
 //   c. provides an ability to pay the order by accepting more than one payment
   // transactions. For example, pay for an order amount using two credit cards (split
     //   the total). Make some assumptions about the billing address/es.



    private float order_total;
    private String order_id;
    private String order_payment_method;
    private Date order_payment_date;
    private String order_payment_confirmation_number;

    public void setOrder_total(float order_total) {
        this.order_total = order_total;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public void setOrder_payment_method(String order_payment_method) {
        this.order_payment_method = order_payment_method;
    }

    public void setOrder_payment_date(Date order_payment_date) {
        this.order_payment_date = order_payment_date;
    }

    public void setOrder_payment_confirmation_number(String order_payment_confirmation_number) {
        this.order_payment_confirmation_number = order_payment_confirmation_number;
    }

    public float getOrder_total() {
        return order_total;
    }

    public String getOrder_id() {
        return order_id;
    }

    public String getOrder_payment_method() {
        return order_payment_method;
    }

    public Date getOrder_payment_date() {
        return order_payment_date;
    }

    public String getOrder_payment_confirmation_number() {
        return order_payment_confirmation_number;
    }
}


public enum Payments {
    CREDIT_CARD,DEBIT_CARD, PAYPAL,GOOGLEPAY,AMAZONPAY
}
