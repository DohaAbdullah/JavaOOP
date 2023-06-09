package com.relations.examples;

public class Department {
    private int depNo;
    private String depName;

    public Department() {
    }

    public Department(int depNo, String depName) {
        this.depNo = depNo;
        this.depName = depName;
    }


    public int getDepNo() {
        return depNo;
    }

    public void setDepNo(int depNo) {
        this.depNo = depNo;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "depNo=" + depNo +
                ", depName='" + depName + '\'' +
                '}';
    }
}
