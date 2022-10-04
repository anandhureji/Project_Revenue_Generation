package com.dumping.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sno;

    private Integer accountId;

   private String accountName;

   private String accountManagerId;

   private String accountManagerName;


    public void setProperty(String property, String data)
    {
        switch (property)
        {
            case "Account ID" :
                this.setAccountId( Integer.parseInt(data));
                break;
            case "Account Name" :
                this.setAccountName(data);
                break;
            case "Account Manager ID" :
                this.setAccountManagerId(data);
                break;
            case "Account Manager Name":
                this.setAccountManagerName(data);
                break;
        }
    }

    public Long getSno() {
        return sno;
    }

    public void setSno(Long sno) {
        this.sno = sno;
    }
    public Account() {
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountManagerId() {
        return accountManagerId;
    }

    public void setAccountManagerId(String accountManagerId) {
        this.accountManagerId = accountManagerId;
    }

    public String getAccountManagerName() {
        return accountManagerName;
    }


    public void setAccountManagerName(String accountManagerName) {
        this.accountManagerName = accountManagerName;
    }

    public Account(Long sno, Integer accountId, String accountName, String accountManagerId, String accountManagerName) {
        this.sno = sno;
        this.accountId = accountId;
        this.accountName = accountName;
        this.accountManagerId = accountManagerId;
        this.accountManagerName = accountManagerName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "sno=" + sno +
                ", accountId=" + accountId +
                ", accountName='" + accountName + '\'' +
                ", accountManagerId='" + accountManagerId + '\'' +
                ", accountManagerName='" + accountManagerName + '\'' +
                '}';
    }
}

