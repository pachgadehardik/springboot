package com.myfirstapp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GREETINGS")
public class Greeting {
    @Id
    private long incrementAndGet;
    private String format;

    public Greeting(long incrementAndGet, String format) {
        this.incrementAndGet = incrementAndGet;
        this.format = format;
    }

    public Greeting() {
        incrementAndGet =0;
        format="";
    }

    public long getIncrementAndGet() {
        return incrementAndGet;
    }

    public void setIncrementAndGet(long incrementAndGet) {
        this.incrementAndGet = incrementAndGet;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
