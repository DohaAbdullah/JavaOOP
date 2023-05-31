package com.relations.examples;

public class PersonalInfo {
    private String firstName;
    private String lastname;
    private String bloodGroup;
    private String accountNo;
    private String nationality;
    private int yearOfBirth;

    public PersonalInfo() {
    }

    ;

    public PersonalInfo(String firstName, String lastname, String bloodGroup, String accountNo, String nationality, int yearOfBirth) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.bloodGroup = bloodGroup;
        this.accountNo = accountNo;
        this.nationality = nationality;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", nationality='" + nationality + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
