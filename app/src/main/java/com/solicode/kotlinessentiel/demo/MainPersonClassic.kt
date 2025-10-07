package com.solicode.kotlinessentiel.demo

// MainPersonClassic.kt
fun main() {
    println("===== Classe classique =====")

    val p1 = PersonClassic("Ada", 36)
    val p2 = PersonClassic("Ada", 36)
    val p3 = p1.copy(age = 37)

    println("p1 == p2 ? ${p1 == p2}")    // true (equals redéfini)
    println("p1: $p1")
    println("p3: $p3")

    // Effet dans les collections
    val s = setOf(
        PersonClassic("Ada", 36),
        PersonClassic("Ada", 36)
    )
    println("Set (classique) taille = ${s.size}") // 2, car deux instances distinctes
}
