/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.swing.lab;

import java.io.*;

/**
 *
 * @author edwardjanson
 */
public class Employee implements Serializable {
    
   private String firstName;
   private String lastName;
   private Job job;
   private int staffNr;

    public Employee(String firstName, String lastName, Job job, int staffNr) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.job = job;
        this.staffNr = staffNr;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String surname) {
        this.lastName = surname;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public int getStaffNr() {
        return staffNr;
    }

    public void setStaffNr(int staffNr) {
        this.staffNr = staffNr;
    }
   
   
   
}
