package org.example.lesson_3

fun main() {
    var from = "E2"
    var to = "E4"
    var step = 1

    println("$from-$to;$step") // формат в задаче указан как: [откуда-куда;номер хода]. Не знаю, нужны ли квадратные скобки, но их не добавлял

    from = "D2"
    to = "D3"
    step = 2

    println("$from-$to;$step")
}