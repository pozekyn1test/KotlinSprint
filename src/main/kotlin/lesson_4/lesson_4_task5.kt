package org.example.lesson_4

const val CREW_MIN = 55
const val CREW_MAX = 70
const val MIN_SUPPLIES = 50
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
        (!isDamaged) && (crew in CREW_MIN..CREW_MAX) && (cratesOfSupplies > MIN_SUPPLIES) -> println("Корабль может приступить к плаванию")
        (crew == CREW_MAX) && (cratesOfSupplies >= MIN_SUPPLIES) && (isGoodWeather) -> println("Корабль может приступить к плаванию")
        else -> println("Корабль не может приступить к плаванию")
    }
}