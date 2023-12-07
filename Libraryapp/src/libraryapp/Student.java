/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libraryapp;

import java.util.Date;


public class Student {
     private int id;
    private String name;
    private String address;
    private Date birthDate = new Date ("dd/MM/yyyy");;
    private String major;
    private int numLoans;

    public Student(int id, String name, String address, Date birthDate, String major) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
        this.major = major;
        this.numLoans = 0; 
    }

    Student() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setNumLoans(int numLoans) {
        this.numLoans = numLoans;
    }
    
    public String getInfo() {
        return "Student ID: " + id + "\nName: " + name + "\nAddress: " + address
                + "\nBirth Date: " + birthDate.toString() + "\nMajor: " + major;
    }

    
    public int getNumLoans() {
        return numLoans;
    }
    
    
    public void incrementNumLoans() {
        if (numLoans < 3) {
            numLoans++;
        }
    }

    public void decrementNumLoans() {
        if (numLoans > 0) {
            numLoans--;
        }
    }
}
