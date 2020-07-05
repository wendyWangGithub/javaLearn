package com.test.json;

public class ConstructionMethodTest {

    public ConstructionMethodTest(String color, String tail) {
        this.color = color;
        this.tail = tail;
    }

    public ConstructionMethodTest() {

    }

    private String color;
    private String tail;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
