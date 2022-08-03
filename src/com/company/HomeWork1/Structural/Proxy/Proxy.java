package com.company.Structural.Proxy;

public class Proxy implements Project
{
private String AccountName;
private Common common;

    public Proxy(String accountName) {
        AccountName = accountName;
    }

    @Override
    public void access() {
        if(common == null)
        {
            common = new Common(AccountName);
        }
        common.access();
    }
}
