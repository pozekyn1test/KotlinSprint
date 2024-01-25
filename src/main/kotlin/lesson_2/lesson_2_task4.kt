package org.example.lesson_2

const val PERCENT = 100
fun main() {
    val cristalOre = 7
    val ironOre = 11

    val buffMultiplier = 20

    println("Количество бонусной кристаллической руды: ${(cristalOre * buffMultiplier / PERCENT).toInt()}")
    println("Количество бонусной железной руды: ${(ironOre * buffMultiplier / PERCENT).toInt()}")
}