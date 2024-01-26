package org.example.lesson_4

const val GOOD_AIR_HUMIDITY = 20
const val WINTER_SEASON = "Winter"
fun main() {
    val isSunny = true
    val isOpened = true
    val airHumidity = 20
    val season = "Winter"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${isSunny && isOpened && (airHumidity == GOOD_AIR_HUMIDITY) && (season != WINTER_SEASON)}")
}