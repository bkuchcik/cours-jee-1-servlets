package fr.isima.service;

import org.junit.Before;
import org.junit.Test;

import java.util.AbstractMap.SimpleImmutableEntry;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void before() {
        this.fizzBuzz = new FizzBuzz();
    }

    @Test
    public void fizzBuzz_with3_returnFizz() {
        assertThat(this.fizzBuzz.fizzBuzz(3)).isEqualTo("Fizz");
    }

    @Test
    public void fizzBuzz_with5_returnBuzz() {
        assertThat(this.fizzBuzz.fizzBuzz(5)).isEqualTo("Buzz");
    }

    @Test
    public void fizzBuzz_with1_return1() {
        assertThat(this.fizzBuzz.fizzBuzz(1)).isEqualTo("1");
    }

    @Test
    public void fizzBuzz_with15_returnFizzBuzz() {
        assertThat(this.fizzBuzz.fizzBuzz(15)).isEqualTo("FizzBuzz");
    }

    @Test
    public void fizzBuzzAll_from1To3_return1And2AndFizz() {
        assertThat(this.fizzBuzz.fizzBuzzAll(1, 3).toMap())
                .hasSize(3)
                .contains(new SimpleImmutableEntry<>(1, "1"),
                        new SimpleImmutableEntry<>(2, "2"),
                        new SimpleImmutableEntry<>(3, "Fizz"));
    }

}