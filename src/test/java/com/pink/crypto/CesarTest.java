package com.pink.crypto;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CesarTest {

  @Test
  void encodeSimple() {
    assertThat(Cesar.encode("abc", 3)).isEqualTo("def");
  }

  @Test
  void encodeComplex() {
    assertThat(Cesar.encode("aB ze42", 7)).isEqualTo("hI gl42");
  }


  @Test
  void decodeSimple() {
    assertThat(Cesar.decode("def", 3)).isEqualTo("abc");
  }

  @Test
  void decodeComplex() {
    assertThat(Cesar.decode("hI gl42", 7)).isEqualTo("aB ze42");
  }

}