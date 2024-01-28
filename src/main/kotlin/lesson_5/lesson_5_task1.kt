package org.example.lesson_5

fun main() {
    println("2 + 2 =")
    val result = readln().toInt()

    when (result) {
        4 -> println("Добро пожаловать!")
        else -> println("Доступ запрещен.")
    }
}