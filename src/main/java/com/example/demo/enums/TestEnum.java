package com.example.demo.enums;

public enum TestEnum {
    ONE(1, "星期一"), TWO(2, "星期二"),THREE(3);

    TestEnum(int day, String name) {
        this.day = day;
        this.name = name;
    }

    TestEnum(int day) {
        this.day = day;
    }

    private int day;
    private String name;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
