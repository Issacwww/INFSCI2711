package com.pitt.mongo.entity;

import org.springframework.data.annotation.Id;

public class View {
    @Id
    private InnerId id;

    private int nkill;

    private int nwound;

    private int propvalue;

    private int num;

    public View() {
    }

    public InnerId getId() {
        return id;
    }

    public void setId(InnerId id) {
        this.id = id;
    }

    public int getNkill() {
        return nkill;
    }

    public void setNkill(int nkill) {
        this.nkill = nkill;
    }

    public int getNwound() {
        return nwound;
    }

    public void setNwound(int nwound) {
        this.nwound = nwound;
    }

    public int getPropvalue() {
        return propvalue;
    }

    public void setPropvalue(int propvalue) {
        this.propvalue = propvalue;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
