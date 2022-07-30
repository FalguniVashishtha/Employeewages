package com.bridgelabz.assignment.employewages.employeewages;

public class EmplyoeeWages {
    public static String getEmployeeAttendance(){
        return Math.random()%2==0?"P":"A";
    }
    public static Integer getEmployeeDailyWage(Integer wagePerHr,Integer fullDayHr){
        return wagePerHr*fullDayHr;
    }

    public static void main(String args[]){

        System.out.println("Employee is "+getEmployeeAttendance());
        System.out.println("Employee wage is "+getEmployeeDailyWage(20,8));
        final int IS_PART_TIME=1;
        final int IS_FULL_TIME=2;
        int EMP_RATE_PER_HR=20;
        final int NUM_OF_WORKING_DAYS=2;
        final int MAX_HR_IN_MONTH=10;
        int empHr=0,empWage=0;
        double empCheck = Math.floor(Math.random()*10)%3;
        if(empCheck==IS_PART_TIME)
            empHr=4;
        if(empCheck==IS_FULL_TIME)
            empHr=8;
        else
            empHr=0;
        System.out.println("Emp Wage is : "+getEmployeeDailyWage(empHr,EMP_RATE_PER_HR));

        //switch case statement
        int empCheck1 = (int)Math.floor(Math.random()*10)%3;

        switch (empCheck1){
            case IS_PART_TIME:
                empHr=4;
                break;
            case IS_FULL_TIME:
                empHr=8;
                break;
            default:
                empHr=0;
        }
        System.out.println("Emp Wage is : "+getEmployeeDailyWage(empHr,EMP_RATE_PER_HR));

        int totalEmpWage = 0;
        empHr=0;
        empWage=0;
        for(int day=0;day<NUM_OF_WORKING_DAYS;day++){
            int empChk= (int) Math.floor(Math.random()*10)%3;
            switch (empChk){
                case IS_PART_TIME:
                    empHr=4;
                    break;
                case IS_FULL_TIME:
                    empHr=8;
                    break;
                default:
                    empHr=0;
            }
            empWage = empHr*EMP_RATE_PER_HR;
            totalEmpWage+=empWage;
            System.out.println("Emp Wage : "+empWage);
        }
        System.out.println("Total Emp Wage: "+totalEmpWage);




        int totalEmpHr= 0,totalWorkingDays=0;
        empHr=0;

        while(totalEmpHr<=MAX_HR_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS){
            totalWorkingDays++;
            int empChk= (int) Math.floor(Math.random()*10)%3;
            switch (empChk){
                case IS_PART_TIME:
                    empHr=4;
                    break;
                case IS_FULL_TIME:
                    empHr=8;
                    break;
                default:
                    empHr=0;
            }
            totalEmpHr+=empHr;
            System.out.println("Days:"+totalWorkingDays+"Emp hr "+empHr );

        }
        System.out.println("Total Emp Wage "+(totalEmpHr*EMP_RATE_PER_HR));

    }

}
