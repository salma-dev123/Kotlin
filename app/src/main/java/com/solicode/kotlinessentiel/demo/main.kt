package com.solicode.kotlinessentiel.demo

// Main.kt

// --- Étape 1 : Classe Person ---
class Person(val name: String, val age: Int) {
    fun isAdult(): Boolean = age >= 18
}

// --- Étape 2 : Fonctions simples ---
fun greet(name: String) {
    println("Bonjour, $name")
}

fun checkAge(age: Int): String =
    if (age >= 18) "Majeur" else "Mineur"

// --- Étape 3 : Data class Counter ---
data class Counter(val count: Int = 0) {
    fun increment() = copy(count = count + 1)
}

// --- Fonction principale ---
fun main() {
    // Test de la classe Person
    val person = Person("Ali", 20)
    println("${person.name} est adulte ? ${person.isAdult()}")

    // Test des fonctions greet et checkAge
    greet("Sara")
    println(checkAge(17))

    // Test de la data class Counter
    val c1 = Counter()
    val c2 = c1.increment()
    println(c1) // Counter(count=0)
    println(c2) // Counter(count=1)
}
