package org.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class TestClass {

    @Test
    public void testOne(){
        assertThat(true).isTrue();
    }

    @Test
    public void testTwo(){
        assertThat(true).isFalse();
    }

    @Test
    public void testTree(){
        assertThat(true).isTrue();
    }
}
