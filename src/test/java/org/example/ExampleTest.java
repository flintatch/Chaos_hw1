package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    void exampleTest0() {
        Assertions.assertTrue (new Random(). nextint() > 71);
    }

    @Test
    void exampleTest1() {
        Assertions.assertTrue (new Random(). nextint() > 76);
    }
}
