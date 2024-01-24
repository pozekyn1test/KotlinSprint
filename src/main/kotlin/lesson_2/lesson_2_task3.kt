package org.example.lesson_2

fun main() {
    val NUMBER_OF_MINUTES = 60
    val departureTime = 579
    val travelTime = 457
    val arrivalTime = departureTime + travelTime

    println(String.format("%02d:%02d", arrivalTime / NUMBER_OF_MINUTES, arrivalTime % NUMBER_OF_MINUTES))
}