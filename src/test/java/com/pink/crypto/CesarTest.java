package com.pink.crypto;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CesarTest {

  @Test
  void encryptSimple() {
    assertThat(Cesar.encrypt("abc", 3)).isEqualTo("def");
  }

  @Test
  void encryptComplex() {
    assertThat(Cesar.encrypt("aBze42", 7)).isEqualTo("hIHl42");
  }
}