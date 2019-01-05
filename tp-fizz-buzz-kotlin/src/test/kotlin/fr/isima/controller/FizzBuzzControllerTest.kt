package fr.isima.controller

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test


class FizzBuzzControllerTest {

    private val fizzBuzzController = FizzBuzzController()

    @Test
    fun fizzBuzz_3_returnsFizz() {
        assertThat(fizzBuzzController.fizzBuzz(3)).isEqualTo("Fizz")
    }

    @Test
    fun fizzBuzzAll_1to3_returnsExpectedFizzBuzz() {
        assertThat(fizzBuzzController.fizzBuzzAll(1, 3)).isEqualTo("FizzBuzz all !!!! :\n" +
                "1 : 1\n" +
                "2 : 2\n" +
                "3 : Fizz")
    }
}