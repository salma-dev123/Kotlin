package com.solicode.kotlinessentiel.demo

fun levelLabel(count: Int): String = when {
    count < 0  -> "Invalide"
    count == 0 -> "Début"
    count in 1..9 -> "Bas"
    count in 10..99 -> "Moyen"
    else -> "Élevé"
}

fun sum0to(n: Int): Int {
    require(n >= 0)
    var s = 0
    for (i in 0..n) s += i
    return s
}

fun DemoValVar() {
    val appName = "HelloCounter"
    var count = 0
    println("Nom app: $appName, count=$count")
}


fun main() {
    DemoValVar()

    val sum = sum0to(10)
    println("Somme de 0 à 10 = $sum")

    val testValues = listOf(-5, 0, 3, 15, 100)

    testValues.forEach { count ->
        println("Count = $count => Label = ${levelLabel(count)}")
    }
}