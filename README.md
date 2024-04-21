# Assignment 4 - Object-Oriented Programming

## Introduction
This repository contains exercises from the book "How to Program - Java".

### Task 1: Exercise 10.13

The task named Task_1, located in the Task_1 branch, involves modifying the payroll system described in Figs. 10.4–10.9. The modification includes adding a private instance variable, birthDate, in the Employee class. The Date class from Fig. 8.7 is used to represent an employee’s birthday. Additionally, get methods are added to the Date class. The payroll is processed once per month. An array of Employee variables is created to store references to various employee objects. In a loop, the payroll for each employee is calculated polymorphically. Moreover, a $100.00 bonus is added to the person’s payroll amount if the current month is the one in which the employee’s birthday occurs.

### Task 2: Exercise 10.15

The task named Task_2, located in the Task_2 branch, involves modifying the payroll system described in Figs. 10.4–10.9 to include an additional Employee subclass named PieceWorker. This subclass represents an employee whose pay is based on the number of pieces of merchandise produced. The PieceWorker class contains private instance variables wage (to store the employee’s wage per piece) and pieces (to store the number of pieces produced). A concrete implementation of the earnings method in the PieceWorker class calculates the employee’s earnings by multiplying the number of pieces produced by the wage per piece. An array of Employee variables is created to store references to objects of each concrete class in the new Employee hierarchy. For each Employee, its string representation and earnings are displayed.

Feel free to explore each task in their respective branches for detailed implementations.
