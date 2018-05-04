package com.example.asus.benevit;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Asus on 5/3/2018.
 */

public class VitaminHome extends AppCompatActivity {

    int pict;
    String name;
    String desc;

    public VitaminHome(int pict, String name, String desc) {
        this.pict = pict;
        this.name = name;
        this.desc = desc;
    }

    public int getPict() {

        return pict;
    }

    public String getName() {

        return name;
    }

    public String getDesc() {

        return desc;

    }
}
