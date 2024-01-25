package org.example.lesson_2

import kotlin.math.pow
fun main() {
    val startDeposit = 70_000
    val percent = 16.7
    val period = 20

    val depositAfterTwentyYears = startDeposit * (1 + percent / 100).pow(period)
    println(String.format("%.3f", depositAfterTwentyYears))

}