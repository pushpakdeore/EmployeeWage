package com.brigelabz;
import java.util.*;

class CompanyEmpWage {
    private String companyName;
    private int wagePerHrs;
    private int numOfWorkingDays;
    private int numOfWorkingHrs;
    private int totalEmpWage;

    public CompanyEmpWage(String companyName, int wagePerHrs, int numOfWorkingDays, int numOfWorkingHrs) {
        this.companyName = companyName;
        this.wagePerHrs = wagePerHrs;
        this.numOfWorkingDays = numOfWorkingDays;
        this.numOfWorkingHrs = numOfWorkingHrs;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "Total Employee Wage for company: " + companyName + " is " + totalEmpWage;
    }
}

public class EmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public void calculateEmpWage(String companyName, int wagePerHrs, int numOfWorkingDays, int numOfWorkingHrs) {
        int empHrs;
        int totalEmpHrs = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= numOfWorkingHrs && totalWorkingDays <= numOfWorkingDays) {
            Random random = new Random();
            int empCheck = random.nextInt(3);

            switch (empCheck) {
                case IS_PART_TIME:
                    System.out.println("Employee is Present as PART TIME");
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    System.out.println("Employee is Present as FULL TIME");
                    empHrs = 8;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    empHrs = 0;
                    break;
            }

            totalEmpHrs += empHrs;
            totalEmpWage += empHrs * wagePerHrs;
            totalWorkingDays++;

            System.out.println("Day No: " + totalWorkingDays + " Emp Hrs: " + empHrs);
            System.out.println("Total Wage: " + totalEmpWage);
        }

        CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, wagePerHrs, numOfWorkingDays, numOfWorkingHrs);
        companyEmpWage.setTotalEmpWage(totalEmpWage);

        System.out.println(companyEmpWage);
        System.out.println("Total Working Hrs for " + companyName + ": " + totalEmpHrs);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmployeeWage ew1 = new EmployeeWage();
        EmployeeWage ew2 = new EmployeeWage();

        System.out.println("Jio");
        ew1.calculateEmpWage("Jio", 20, 24, 100);
        System.out.println("-----------------------------------------");
        System.out.println("Reliance");
        ew2.calculateEmpWage("Reliance", 20, 25, 110);
    }
}