package com.codename1.uikit.pheonixui.model;

import java.util.Date;

public class Commande {
    String id;
    String date;
    String avisClient;
    String idClient;
    String total;

    public String getAvisClient() {
        return avisClient;
    }

    public void setAvisClient(String avisClient) {
        this.avisClient = avisClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getIdClient() {
        return idClient;
    }

    public Commande() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", avisClient='" + avisClient + '\'' +
                ", idClient='" + idClient + '\'' +
                ", total='" + total + '\'' +
                '}';
    }
}
