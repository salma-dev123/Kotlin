package com.solicode.kotlinessentiel.demo

// MainPersonData.kt
fun main() {
    println("===== Data class =====")

    val p1 = PersonData("Ada", 36)
    val p2 = PersonData("Ada", 36)
    val p3 = p1.copy(age = 37)

    println("p1 == p2 ? ${p1 == p2}")    // true (égalité structurelle)
    println("p1: $p1")
    println("p3: $p3")

    // Déstructuration
    val (n, a) = p3
    println("name=$n, age=$a")

    // Effet dans les collections
    val s = setOf(
        PersonData("Ada", 36),
        PersonData("Ada", 36)
    )
    println("Set (data class) taille = ${s.size}") // 1, car même contenu
}
