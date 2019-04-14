package com.pitt.mysql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Attack")
public class Attack {
    @Id
    @Column(name = "id")
    private int attackid;

    @Column(name = "crit1")
    private int crit1;

    @Column(name = "crit2")
    private int crit2;

    @Column(name = "cirt3")
    private int crit3;

    @Column(name = "doubtterr")
    private int doubtterr;

    @Column(name = "multiple")
    private int multiple;

    @Column(name = "success")
    private int success;

    @Column(name = "suicide")
    private int suicide;

    @Column(name = "attacktype1")
    private int attacktype1;

    public int getAttackid() {
        return attackid;
    }

    public void setAttackid(int attackid) {
        this.attackid = attackid;
    }

    public int getCrit1() {
        return crit1;
    }

    public void setCrit1(int crit1) {
        this.crit1 = crit1;
    }

    public int getCrit2() {
        return crit2;
    }

    public void setCrit2(int crit2) {
        this.crit2 = crit2;
    }

    public int getCrit3() {
        return crit3;
    }

    public void setCrit3(int crit3) {
        this.crit3 = crit3;
    }

    public int getDoubtterr() {
        return doubtterr;
    }

    public void setDoubtterr(int doubtterr) {
        this.doubtterr = doubtterr;
    }

    public int getMultiple() {
        return multiple;
    }

    public void setMultiple(int multiple) {
        this.multiple = multiple;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public int getSuicide() {
        return suicide;
    }

    public void setSuicide(int suicide) {
        this.suicide = suicide;
    }

    public int getAttacktype1() {
        return attacktype1;
    }

    public void setAttacktype1(int attacktype1) {
        this.attacktype1 = attacktype1;
    }
}
