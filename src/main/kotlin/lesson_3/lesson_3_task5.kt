package org.example.lesson_3

fun main() {
    val requestString = "D2-D4;0"

    val from = requestString.split("-", ";")[0]
    val to = requestString.split("-", ";")[1]
    val step = requestString.split("-", ";")[2].toInt()

    println(from)
    println(to)
    println(step)
}