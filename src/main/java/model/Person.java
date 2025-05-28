package model;

import annotations.ExcelColumn;

public class Person {
    @ExcelColumn(name = "FirstName",order = 0)
    String firstName;
    @ExcelColumn(name = "LastName",order = 1)
    String lastName;
    @ExcelColumn(name = "Age",order = 2)
    int age;
}
