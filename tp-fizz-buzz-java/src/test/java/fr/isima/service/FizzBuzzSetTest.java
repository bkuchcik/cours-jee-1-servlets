package fr.isima.service;

import org.junit.Before;
import org.junit.Test;

import java.util.SortedMap;
import java.util.TreeMap;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class FizzBuzzSetTest {

    private SortedMap<Integer, String> fizzBuzzMap;

    private FizzBuzzSet fizzBuzzSet;

    @Before
    public void setUp() throws Exception {
        this.fizzBuzzMap = new TreeMap<>();
        this.fizzBuzzSet = new FizzBuzzSet(this.fizzBuzzMap);
    }

    @Test
    public void toString_Empty_ShouldReturnNoFizzBuzz() throws Exception {
        assertThat(this.fizzBuzzSet.toString()).isEqualTo("No fizz buzz !");
    }

    @Test
    public void toString_WithOneItem_ShouldBeEqualToFizzBuzzString() throws Exception {
        this.fizzBuzzMap.put(10,"Buzz");
        this.fizzBuzzMap.put(15,"FizzBuzz");
        assertThat(this.fizzBuzzSet.toString()).isEqualTo("FizzBuzz all !!!! :\n10 : Buzz\n15 : FizzBuzz");
    }


}