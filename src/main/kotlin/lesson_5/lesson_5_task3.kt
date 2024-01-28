package org.example.lesson_5

fun main() {
    val firstNumber = 2
    val secondNumber = 1

    println("Введите первое число:")
    val userFirstNumber = readln().toInt()

    println("Введите второе число:")
    val userSecondNumber = readln().toInt()

    if (userFirstNumber == firstNumber && userSecondNumber == secondNumber) println("Поздравляем! Вы выиграли главный приз!")
    else if (userFirstNumber == secondNumber && userSecondNumber == firstNumber) println("Поздравляем! Вы выиграли главный приз!")
    else if (userFirstNumber != firstNumber && userSecondNumber == secondNumber) println("Вы выиграли утешительный приз!")
    else if (userFirstNumber != secondNumber && userSecondNumber == firstNumber) println("Вы выиграли утешительный приз!")
    else if (userSecondNumber != firstNumber && userFirstNumber == secondNumber) println("Вы выиграли утешительный приз!")
    else if (userSecondNumber != secondNumber && userFirstNumber == firstNumber) println("Вы выиграли утешительный приз!")
    else println("Неудача!")
}