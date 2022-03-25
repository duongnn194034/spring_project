package com.example.Manage.NhanVien;

import com.example.Manage.ToaBao.ToaBao;

public abstract class NhanVien {
    private static int counter = 1;
    private int id;
    private String name;
    private ToaBao toaBao;

    public NhanVien () {
        this.id = counter;
        counter++;
    }
    public NhanVien (String name) {
        this.id = counter;
        this.name = name;
        counter++;
    }

    public int getId () {
        return id;
    }
    public String getName () {
        return  name;
    }
    public void setName (String name) {
        this.name = name;
    }

    public ToaBao getToaBao() {
        return toaBao;
    }

    public String inThe () {
        return "Toa bao: " + this.getToaBao().getName() + "ID: " + this.getId() + "\n" + this.getName() + "\n";
    }
}
