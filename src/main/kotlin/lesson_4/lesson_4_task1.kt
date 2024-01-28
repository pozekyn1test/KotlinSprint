package org.example.lesson_4

const val NUMBER_OF_TABLES = 13
fun main() {
    val reservedTablesForToday = NUMBER_OF_TABLES
    val reservedTablesForTomorrow = NUMBER_OF_TABLES - 4

    println("Доступность столиков на сегодня: ${reservedTablesForToday < NUMBER_OF_TABLES}\n" +
            "Доступность столиков на завтра: ${reservedTablesForTomorrow < NUMBER_OF_TABLES}")
}