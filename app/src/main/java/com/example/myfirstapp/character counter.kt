package com.example.myfirstapp
import java.io.BufferedReader
import java.io.FileReader

fun main() {
    val filename = "D:\\text file.txt"
    val charCount = mutableMapOf<Char, Int>()
    BufferedReader(FileReader(filename)).useLines { lines ->
        lines.forEach { line ->
            line.forEach { ch ->
                charCount[ch] = charCount.getOrDefault(ch, 0) + 1
            }
        }
    }
    println("Character count:")
    charCount.forEach { (ch, count) ->
        println("$ch: $count")
    }
}
