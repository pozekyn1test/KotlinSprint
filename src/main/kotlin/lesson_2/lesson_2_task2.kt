package org.example.lesson_2

fun main() {
    val numberOfEmployees = 50
    val employeeSalary = 30000
    val totalEmployeesSalary = numberOfEmployees * employeeSalary

    val numberOfInterns = 30
    val internSalary = 20000
    val totalInternsSalary = numberOfInterns * internSalary

    val totalCost = totalEmployeesSalary + totalInternsSalary
    val averageEmployeeSalary = totalCost / numberOfEmployees

    println(totalEmployeesSalary)
    println(totalCost)
    println(averageEmployeeSalary)
}