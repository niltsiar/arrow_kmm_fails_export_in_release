package dev.niltsiar.arrow_fails_export_release

import arrow.core.left
import arrow.core.right
import kotlin.random.Random

class Greeting {
    fun greeting(): String {
        val platform = Platform().platform

        val either = if (Random.nextInt() % 2 == 0) {
            "This is a Right, $platform!".right()
        } else {
            "This is a Left, $platform!".left()
        }

        return either.fold(
            ifLeft = { it },
            ifRight = { it }
        )
    }
}
