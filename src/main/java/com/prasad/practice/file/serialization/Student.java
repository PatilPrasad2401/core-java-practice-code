package com.prasad.practice.file.serialization;

import javax.xml.namespace.QName;
import java.io.Serializable;

public class Student implements Serializable {
    private int rollNo;
    private String name;
    private Address address;
//    private String address;
    public Student(int rollNo,String name,Address address){
        this.rollNo=rollNo;
        this.name=name;
        this.address=address;
    }
    @Override
    public String toString() {
        return "Student : {" +
                "RollNo " + rollNo +
                "Name " + name +
                "Address " + address +
                '}';
    }
    static class Address implements Serializable{
        String city;
        public Address(String city){
            this.city=city;
        }


    }

}
