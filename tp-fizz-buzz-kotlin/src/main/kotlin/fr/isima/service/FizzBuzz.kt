package fr.isima.service

/**
 * Type alias, in current implementation we just want to use an immutable map (map is immutable in kotlin)
 * In future, if we want to create a complex, can we will be able to do it
 */

typealias FizzBuzzSet = Map<Int, String>
/**
 * This is the main extension function solving
 */
val Int.fizzBuzz: String
    get() {
        //just an example of 'by lazy usage', here we could simply
        //initialize isFizz or isBuzz directly
        //but the examples shows how lambda can be smart
        val isFizz by lazy { this % 3 == 0 }
        val isBuzz by lazy { this % 5 == 0 }
        return when {
            isFizz && isBuzz -> "FizzBuzz"
            isFizz -> "Fizz"
            isBuzz -> "Buzz"
            else -> this.toString()
        }
    }

/**
 * Using property exension to add fizzBuzz to IntRange
 */
val IntRange.fizzBuzz: FizzBuzzSet
    get() = asIterable().fizzBuzz

/**
 * Iterable is a Java interface more general than Collection. It just means i can browse some values. A lot of Kotlin extensions functions are avaialable through Iterable.
 *
 *
 */
val Iterable<Int>.fizzBuzz: FizzBuzzSet
    get() = associate { it to it.fizzBuzz }.toSortedMap()


val FizzBuzzSet.plainText: String
    get() = when {
        isEmpty() -> "No fizz buzz !"
        else -> "FizzBuzz all !!!! :\n" + map { (key, value) -> "$key : $value" }.reduce { prev, next -> "$prev\n$next" }
    }

