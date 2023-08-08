package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Id
    private long clientId;

    @Column(nullable = false)
    private String creationDate;


    protected Portfolio() {

    }

    public Portfolio(String creationDate, Client c) {
        this.creationDate = creationDate;
        this.clientId = c.getClientId();
    }

    public Long getClientId() {
        return clientId;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate1){
        this.creationDate = creationDate1;
    }
}
