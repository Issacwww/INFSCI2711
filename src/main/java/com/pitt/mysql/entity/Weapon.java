package com.pitt.mysql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Weapon")
public class Weapon {
    @Id
    @Column(name = "id")
    private int weaponid;

    @Column(name = "weaptype1")
    private int weaptype1;

    @Column(name = "weaptype1_txt")
    private String weaptype1_txt;

    public int getWeaponid() {
        return weaponid;
    }

    public void setWeaponid(int weaponid) {
        this.weaponid = weaponid;
    }

    public int getWeaptype1() {
        return weaptype1;
    }

    public void setWeaptype1(int weaptype1) {
        this.weaptype1 = weaptype1;
    }

    public String getWeaptype1_txt() {
        return weaptype1_txt;
    }

    public void setWeaptype1_txt(String weaptype1_txt) {
        this.weaptype1_txt = weaptype1_txt;
    }
}
