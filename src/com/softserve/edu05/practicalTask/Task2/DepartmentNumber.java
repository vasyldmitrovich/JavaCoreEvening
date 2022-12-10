package com.softserve.edu05.practicalTask.Task2;

public enum DepartmentNumber {
    DEPARTMENT_101(101),
    DEPARTMENT_102(102),
    DEPARTMENT_103(103),
    DEPARTMENT_104(104),
    DEPARTMENT_105(105);

    int numberOfDepartment;

    DepartmentNumber(int numberOfDepartment){
        this.numberOfDepartment = numberOfDepartment;
    }
}
