package com.test.json;

public class Qgl {
    public Qgl(String a, String b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Qgl() {
        super();
    }

    private String a;
    private String b;
    private int c;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
