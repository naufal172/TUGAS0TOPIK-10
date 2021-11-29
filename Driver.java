package com;

public class Driver extends Member {
    private final String plat, jenisKendaraan;

    public Driver (String noPlat, String jenisKendaraan, String nik, String nama, String noTelp, double saldo){
        super(nik, nama, noTelp, saldo);
        this.plat = noPlat;
        this.jenisKendaraan = jenisKendaraan;
    }

    @Override
    public void display() {
        System.out.println("==== Data Driver ====");
        System.out.println("NIK : " + nik);
        System.out.println("Nama : " + nama);
        System.out.println("Saldo : " + saldo);
        System.out.println("Nomor Plat : " + plat);
        System.out.println("Jenis Kendaraan : " + jenisKendaraan);
    }
}
