package com.solicode.kotlinessentiel.demo

// PersonClassic.kt
class PersonClassic(val name: String, val age: Int) {
    // Copie manuelle
    fun copy(name: String = this.name, age: Int = this.age) = PersonClassic(name, age)

    // toString lisible
    override fun toString(): String = "PersonClassic(name=$name, age=$age)"

    // Égalité structurelle
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PersonClassic) return false
        return name == other.name && age == other.age
    }

    // Cohérent avec equals
    override fun hashCode(): Int = 31 * name.hashCode() + age
}
