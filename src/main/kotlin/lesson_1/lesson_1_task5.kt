package org.example.lesson_1

const val SECONDS_IN_MINUTE = 60
fun main() {
    val seconds: Short = 6480
    val minutes = seconds / SECONDS_IN_MINUTE
    val secondsLeft = seconds % SECONDS_IN_MINUTE
    val hours = minutes / SECONDS_IN_MINUTE
    val minutesLeft = minutes % SECONDS_IN_MINUTE


    println(String.format("%02d:%02d:%02d", hours, minutesLeft, secondsLeft))
}