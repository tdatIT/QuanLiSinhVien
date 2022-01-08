package com.javaswing.studentmanagement;

public class Student {
    private String id;
    private String name;
    private String address;
    private boolean sex;
    private double gpa;
    //contructor
    public Student(String id,String name,String address,
            boolean sex,double gpa){
        this.id=id;
        this.name=name;
        this.address=address;
        this.sex=sex;
        this.gpa=gpa;
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSex(boolean sex) {
        this.sex = sex;
    }
    public boolean getSex(){
        return this.sex;
    }
    public String inThongTin(){
        String str="";
        str = id+"\n"+name+"\n"+address+"\n"+(sex?"Nam":"Nữ")+"\n"+gpa;
        return str;
    }
}
