package com.example.Manage.NhanVien.NhanVienHanhChinh;

import com.example.Manage.NhanVien.NhanVien;

public class NhanVienHanhChinh extends NhanVien {
    private String chucVu;

    public String getChucVu () {
        return chucVu;
    }
    public void setChucVu (String chucVu) {
        this.chucVu = chucVu;
    }

    @Override
    public String inThe () {
        return super.inThe() + "Chuc vu: " + this.getChucVu() + "\n";
    }
}
