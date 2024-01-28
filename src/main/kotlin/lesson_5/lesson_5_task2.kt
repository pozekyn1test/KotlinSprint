package org.example.lesson_5

const val AGE_OF_MAJORITY = 18
fun main() {
    val currentYear = 2024
    println("Введите свой год рождения:")
    val birthYear = readln().toInt()
    val userAge = currentYear - birthYear

    if (userAge >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
}