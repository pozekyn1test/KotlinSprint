package org.example.lesson_5

const val LOGIN = "Zaphod"
const val PASSWORD = "PanGalactic"
fun main() {
    println("Введите логин:")
    val login = readln()
    val password: String

    if (login == LOGIN) {
        println("Введите пароль:")
        password = readln()
        if (password == PASSWORD) println("Добро пожаловать на борт!")
        else println("Пароль неверный")
    }
    else println("Необходимо зарегистрироваться")

}