package org.example.lesson_3

fun main() {
    var lastName = "Андреева"
    var firstName = "Татьяна"
    val patronymicName = "Сергеевна" // думаю, что это нельзя изменить, а остальное можно, поэтому тут val
    var age = 20

    println("$lastName $firstName $patronymicName, $age")

    lastName = "Сидорова"

    println("$lastName $firstName $patronymicName, ${age + 2}")
}