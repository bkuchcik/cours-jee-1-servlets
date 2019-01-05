package fr.isima.service

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class FizzBuzzTest {

    @Test
    fun fizzBuzz_with3_returnFizz() {
        assertThat(3.fizzBuzz).isEqualTo("Fizz")
    }

    @Test
    fun fizzBuzz_with5_returnBuzz() {
        assertThat(5.fizzBuzz).isEqualTo("Buzz")
    }

    @Test
    fun fizzBuzz_with1_return1() {
        assertThat(1.fizzBuzz).isEqualTo("1")
    }

    @Test
    fun fizzBuzz_with15_returnFizzBuzz() {
        assertThat(15.fizzBuzz).isEqualTo("FizzBuzz")
    }

    @Test
    fun fizzBuzz_from1To3_return1And2AndFizz() {
        assertThat((1..3).fizzBuzz)
                .isEqualTo(sortedMapOf(1 to "1",
                        2 to "2",
                        3 to "Fizz"))
    }

    @Test
    fun fizzBuzzToPlainText_WithOneItem_ShouldBeEqualToFizzBuzzString() {
        assertThat((10..11).fizzBuzz.plainText).isEqualTo("FizzBuzz all !!!! :\n10 : Buzz\n11 : 11")
    }

}