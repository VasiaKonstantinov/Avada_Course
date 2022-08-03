package com.company.Structural.Proxy;

public class Common implements Project
{
    private String AccountName;

    public Common(String creatingAccount) {
        this.AccountName = creatingAccount;
        create(AccountName);
    }

    public void create(String AccountName)
    {
        System.out.println("Створено акаунт " + AccountName);
    }
    @Override
    public void access() {
        System.out.println("Надано доступ до особистого кабінету користувача " + AccountName);
    }
}
