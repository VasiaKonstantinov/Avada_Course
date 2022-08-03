package com.company.Spawning.FactoryMethod;

import java.util.Scanner;

public class FactoryMethod
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        CreateEmployee newEmployee = CreateEmployeeBySpeciality("Boss");
        Employee employee = newEmployee.createEmployee();
        employee.Working();
    }
    static CreateEmployee CreateEmployeeBySpeciality(String speciality)
    {
       if(speciality == "Worker")
       {
           return new CreateWorker();
       }
       else if(speciality == "Boss")
       {
           return new CreateBoss();
       }
       else
       {
           throw new RuntimeException("Такої посади немає " + speciality);
       }
    }
}
