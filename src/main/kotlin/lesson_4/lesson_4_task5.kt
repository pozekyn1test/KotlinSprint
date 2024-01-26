package org.example.lesson_4

fun main() {
    val scan = java.util.Scanner(System.`in`)

    println("Корабль поврежден?(true/false):")
    val isDamaged = scan.nextBoolean()

    println("Введите количество команды:")
    val crew = scan.nextInt()

    println("Введите количество припасов:")
    val cratesOfSupplies = scan.nextInt()

    println("Погода благоприятная?(true/false):")
    val isGoodWeather = scan.nextBoolean()

    println("Корабль мможет приступить к плаванию: " +
            "${(!isDamaged && crew in 50..70 && cratesOfSupplies > 50)
                    || (isDamaged && crew == 70 && cratesOfSupplies >= 50 && isGoodWeather)}")
}