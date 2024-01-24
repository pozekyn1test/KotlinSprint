package org.example.lesson_1

fun main() {
    val SECONDS_IN_MINUTE = 60
    val MINUTES_IN_HOUR = 60
    val seconds: Short = 6480
    val minutes = seconds / SECONDS_IN_MINUTE
    val secondsLeft = seconds % SECONDS_IN_MINUTE
    val hours = minutes / MINUTES_IN_HOUR
    val minutesLeft = minutes % MINUTES_IN_HOUR


    println(String.format("%02d:%02d:%02d", hours, minutesLeft, secondsLeft))
}