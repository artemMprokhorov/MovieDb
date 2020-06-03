package com.example.moviedb

import android.text.SpannableString
import java.util.*
import java.util.concurrent.ThreadLocalRandom

object RandomFactory {

//    fun String.randomString(): String = UUID.randomUUID().toString()

    fun generateString(): String = UUID.randomUUID().toString()
    fun generateDouble(): Double = Math.random()
    fun generateInt(): Int = ThreadLocalRandom.current().nextInt(0, 1000 + 1)
    fun generateBoolean(): Boolean = Math.random() < 0.5
    fun generateInt(min: Int = 0, max: Int): Int = ThreadLocalRandom.current().nextInt(min, max)
    fun generateLong(): Long = Random().nextLong()
    fun generateLong(min: Long = 0, max: Long = 1): Long =
        ThreadLocalRandom.current().nextLong(min, max)

    fun generateSpannableString() = SpannableString(generateString())
    fun generateColorHex(): String {
        val random = Random()
        val nextInt = random.nextInt(0xffffff + 1)
        return String.format("#%06x", nextInt)
    }

    fun generateRandomValidEmail() =
        "${generateStringWithoutDash()}@${generateStringWithoutDashAndSubSequence(0, 4)}.com"

    private fun generateStringWithoutDash() = generateString().replace("-", "")
    private fun generateStringWithoutDashAndSubSequence(start: Int, end: Int) =
        generateStringWithoutDash().subSequence(start, end)
}