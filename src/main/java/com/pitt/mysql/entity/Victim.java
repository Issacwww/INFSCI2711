package com.pitt.mysql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Victim")
public class Victim {
    @Id
    @Column(name = "id")
    private int victimid;

    @Column(name = "targettype1")
    private int targettype1;

    @Column(name = "natlty1")
    private String natlty1;

    @Column(name = "ishostkid")
    private int ishostkid;

    @Column(name = "nhostkid")
    private int nhostkid;

    @Column(name = "nhostkidus")
    private int nhostkidus;

    public int getVictimid() {
        return victimid;
    }

    public void setVictimid(int victimid) {
        this.victimid = victimid;
    }

    public int getTargettype1() {
        return targettype1;
    }

    public void setTargettype1(int targettype1) {
        this.targettype1 = targettype1;
    }

    public String getNatlty1() {
        return natlty1;
    }

    public void setNatlty1(String natlty1) {
        this.natlty1 = natlty1;
    }

    public int getIshostkid() {
        return ishostkid;
    }

    public void setIshostkid(int ishostkid) {
        this.ishostkid = ishostkid;
    }

    public int getNhostkid() {
        return nhostkid;
    }

    public void setNhostkid(int nhostkid) {
        this.nhostkid = nhostkid;
    }

    public int getNhostkidus() {
        return nhostkidus;
    }

    public void setNhostkidus(int nhostkidus) {
        this.nhostkidus = nhostkidus;
    }
}
