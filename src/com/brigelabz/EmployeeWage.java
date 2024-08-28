package com.brigelabz;
import java.util.*;
public class EmployeeWage{
    public final int IS_PART_TIME = 1;
    public final int IS_FULL_TIME = 2;

    public void calculateEmpWage() {
        int empHrs;
        int totalEmpHrs = 0;
        int totalEmpWage=0;
        int wagePerHrs=20;

        Random random = new Random();
        // Generate a random 0 ,1 or 2
        int empCheck = random.nextInt(3);

        switch ((int) empCheck) {
            case IS_PART_TIME:
                System.out.println("Employee is Present as PART TIME");
                empHrs = 4;
                totalEmpHrs += empHrs;
                totalEmpWage+=empHrs*wagePerHrs;
                System.out.println("Total Wage :"+totalEmpWage);
                break;
            case IS_FULL_TIME:
                System.out.println("Employee is Present as FULL TIME");
                empHrs = 8;
                totalEmpHrs += empHrs;
                totalEmpWage+=empHrs*wagePerHrs;
                System.out.println("Total Wage :"+totalEmpWage);
                break;
            default:
                System.out.println("Employee is Absent");
                empHrs = 0;
                totalEmpHrs += empHrs;
                totalEmpWage+=empHrs*wagePerHrs;
                System.out.println("Total Wage :"+totalEmpWage);
                break;
        }

        totalEmpWage = totalEmpHrs * wagePerHrs;
        System.out.println("Total Working Hrs for  :"+totalEmpHrs);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmployeeWage ew1 = new EmployeeWage();
        EmployeeWage ew2 = new EmployeeWage();

        ew1.calculateEmpWage();
        ew2.calculateEmpWage();
    }
}