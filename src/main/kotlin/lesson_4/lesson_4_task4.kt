package org.example.lesson_4

fun main() {
    val day = 5
    val handsAndAbs = day % 2 != 0
    val legsAndBack = !handsAndAbs

    println("""
        Упражнения для рук:    $handsAndAbs
        Упражнения для ног:    $legsAndBack
        Упражнения для спины:  $legsAndBack
        Упражнения для пресса: $handsAndAbs

    """.trimIndent())
}