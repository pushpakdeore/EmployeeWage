package com.brigelabz;
import java.util.*;
public class EmployeeWage {
    public void isPresent(){
        Random random = new Random();
        int attendance = random.nextInt(2);

        if (attendance == 0) {
            System.out.println("Employee is absent.");
        } else {
            System.out.println("Employee is present.");
        }
    }
    public static void main(String[] args){

        System.out.println("Welcome to Employee wage computation program");

        EmployeeWage ew1=new EmployeeWage();
        ew1.isPresent();
    }

}
