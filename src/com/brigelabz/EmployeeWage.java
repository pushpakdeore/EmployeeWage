package com.brigelabz;
import java.util.*;
class EmployeeWage{

    private int wagePerHr=20;
    private int FullDayHr=8;
    private int totalWage=0;

    public void dailywage(boolean add){

        if(add==true){

            totalWage=totalWage+(wagePerHr *FullDayHr);
        }else{

            totalWage=totalWage+0;
        }
        System.out.println("TotalWage= "+totalWage);
    }
    public void isPresent(){
        Random random = new Random();
        int attendance = random.nextInt(2);

        if (attendance == 1) {
            dailywage(true);
        }else{

            dailywage(false);
        }

    }
    public static void main(String[] args){

        System.out.println("Welcome to Employee wage computation program");

        EmployeeWage ew1=new EmployeeWage();
        ew1.isPresent();
    }
}
