package fr.isima.controller;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzControllerTest {

    private FizzBuzzController fizzBuzzController = new FizzBuzzController();

    @Test
    public void fizzBuzz_3_returnsFizz() throws Exception {
        assertThat(fizzBuzzController.fizzBuzz(3)).isEqualTo("Fizz");
    }

    @Test
    public void fizzBuzzAll_1to3_returnsExpectedFizzBuzz() throws Exception {
        assertThat(fizzBuzzController.fizzBuzzAll(1, 3)).isEqualTo("FizzBuzz all !!!! :\n" +
                "1 : 1\n" +
                "2 : 2\n" +
                "3 : Fizz");
    }
}