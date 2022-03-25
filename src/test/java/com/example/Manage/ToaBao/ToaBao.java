package com.example.Manage.ToaBao;

import com.example.Manage.NhanVien.NhanVien;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;

public class ToaBao {

    @Id private String id;
    private ArrayList<NhanVien> nhanViens;
    private String name;

    public ToaBao() {
    }

    public String getName () {
        return name;
    }
}
