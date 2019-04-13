package com.pitt.mongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "year_state")
public class YearState {
    @Id
    private InnerId id;

    private int nkill;

    private int nwound;

    private int propvalue;

    private int num;

    public YearState() {
    }

    public YearState(InnerId id, int nkill, int nwound, int propvalue, int num) {
        this.id = id;
        this.nkill = nkill;
        this.nwound = nwound;
        this.propvalue = propvalue;
        this.num = num;
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
