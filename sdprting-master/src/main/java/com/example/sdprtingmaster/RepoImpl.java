package com.example.sdprtingmaster;

public class RepoImpl implements Repo{

    private String field1;
    private String field2;
    @Override
    public String chuj() {
        return "chuj ci w dupe" + field1;

    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }
}