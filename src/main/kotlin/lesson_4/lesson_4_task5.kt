package org.example.lesson_4

fun main() {
    println("Корабль поврежден?(true/false):")
    val isDamaged = readln().toBoolean()

    println("Введите количество команды:")
    val crew = readln().toInt()

    println("Введите количество припасов:")
    val cratesOfSupplies = readln().toInt()

    println("Погода благоприятная?(true/false):")
    val isGoodWeather = readln().toBoolean()

    when {
        (!isDamaged) && (crew in 50..70) && (cratesOfSupplies > 50) -> println("Корабль может приступить к плаванию")
        (isDamaged) && (crew == 70) && (cratesOfSupplies >= 50) && (isGoodWeather) -> println("Корабль может приступить к плаванию")
        else -> println("Корабль не может приступить к плаванию")
    }
}