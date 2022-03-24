package com.example.Manage;

public class NhaBao extends NhanVien {
    private int soBaiBao;

    public int getSoBaiBao () {
        return soBaiBao;
    }

    public void setSoBaiBao (int so) {
        this.soBaiBao = so;
    }

    public String inThe () {
        return super.inThe() + "So bai bao: " + this.getSoBaiBao() + "\n";
    }
}
