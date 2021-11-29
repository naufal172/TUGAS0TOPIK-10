package com;

public abstract class Member {
    String nik, nama, noTelp;
    double saldo = 0;

    public Member(String nik, String nama, String noTelp, double saldo){
        this.nik = nik;
        this.nama = nama;
        this.noTelp = noTelp;
        this.saldo = saldo;
    }

    public void transaksi(Member member, double cost){
        this.saldo += cost;
        member.saldo -= cost;
    }

    public String getNik() {
        return nik;
    }

    public abstract void display();
}

