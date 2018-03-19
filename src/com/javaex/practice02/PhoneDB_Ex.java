package com.javaex.practice02;

public class PhoneDB_Ex {
    private String name;
    private String hp;
    private String company;

    public PhoneDB_Ex() {
    }

    public PhoneDB_Ex(String name, String hp, String company) {
        this.name = name;
        this.hp = hp;
        this.company = company;
    }

    public String printInfo() {
        return name + "," + hp + "," + company + "\n";
    }

    @Override
    public String toString() {
        return name + "," + hp + "," + company;
    }
}
