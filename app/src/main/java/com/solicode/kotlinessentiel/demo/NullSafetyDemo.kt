package com.solicode.kotlinessentiel.demo

fun greet(input: String?): String =
    input
        ?.trim()
        ?.takeIf { it.isNotEmpty() }
        ?.let { "Bonjour, $it !" }
        ?: ""

fun parseCount(input: String?): Int =
    input
        ?.trim()
        ?.toIntOrNull()
        ?.coerceAtLeast(0)
        ?: 0

fun safeAt(xs: List<Int>, index: Int): Int =
    xs.getOrNull(index) ?: -1

fun parseAnyToNonNegativeInt(x: Any?): Int =
    (x as? String)?.toIntOrNull()?.coerceAtLeast(0) ?: 0

fun pipeline(name: String?, countText: String?): String =
    "${greet(name)}#${parseCount(countText)}"

fun lengthOrZero(s: String?): Int = s?.length ?: 0

fun nonNullOrFail(s: String?): String =
    requireNotNull(s) { "Valeur requise non fournie" }

fun main() {
    println("=== DEMO Null-safety ===")
    println(greet("  Ada "))
    println(parseCount(" 12 "))
    println(safeAt(listOf(10, 20), 1))
    println(parseAnyToNonNegativeInt("42"))   // 42
    println(parseAnyToNonNegativeInt("x"))    // 0
    println(parseAnyToNonNegativeInt(null))   // 0
    println(pipeline(" Ada ", " 12 "))        // "Bonjour, Ada !#12"
    println(lengthOrZero(null))     // 0
    println(lengthOrZero("Kotlin")) // 6

    println(nonNullOrFail("OK"))    // "OK"
}