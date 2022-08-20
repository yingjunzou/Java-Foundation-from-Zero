package com.hspedu.encap;

public class Account {
    private String name;
    private double balance;
    private String pwd;

    public Account() {
    }

    public Account(String name, double balance, String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("name request (length is 2, 3 or 4 characters, default is no name");
            this.name = "no name";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("balance must larger than 20, default value is 0");
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if(pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("Password has to be 6 digits, default password is 000000");
            this.pwd = "000000";
        }
    }
    public void showInfo() {
        System.out.println("Account Info name=" + name + " balance=" + balance + " pwd" + pwd);
    }
}
