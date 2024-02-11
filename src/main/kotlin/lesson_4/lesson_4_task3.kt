package org.example.lesson_4

const val GOOD_AIR_HUMIDITY = 20
const val WINTER_SEASON = "Winter"
const val SUNNY = true
const val TENT_IS_OPENED = true
fun main() {
    val isSunny = true
    val isOpened = true
    val airHumidity = 20
    val season = "Winter"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${(SUNNY == isSunny) && (TENT_IS_OPENED == isOpened) && (airHumidity == GOOD_AIR_HUMIDITY) && (season != WINTER_SEASON)}")
}