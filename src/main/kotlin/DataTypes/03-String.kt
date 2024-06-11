package org.example.DataTypes

fun main() {
    // String
    val stringText = "Kotlin Language"
    // Indexing
    val firstChar = stringText[0]

    println("First character of $stringText is $firstChar")

    // Escaped String
    val iniEscape = "Kampus Merdeka \nby \"Infinite Learning\""
    println(iniEscape)

    // Raw String
    val iniRaw = """
        ini adalah contoh
        -----------------
        penerapan Raw String
    """.trimIndent()

    println(iniRaw)
}