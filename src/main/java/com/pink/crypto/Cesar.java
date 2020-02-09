package com.pink.crypto;

public class Cesar {

  public static String decode(String enc, int offset) {
    return encode(enc, 26 - offset);
  }

  public static String encode(String enc, int offset) {
    offset = offset % 26 + 26;
    StringBuilder encoded = new StringBuilder();
    for (char i : enc.toCharArray()) {
      encoded.append(encodeChar(i, offset));
    }
    return encoded.toString();
  }

  private static char encodeChar(char c, int offset) {
    char encodedChar = c;
    if (Character.isLetter(c)) {
      if (Character.isUpperCase(c)) {
        return (char) ('A' + (c - 'A' + offset) % 26);
      } else {
        return (char) ('a' + (c - 'a' + offset) % 26);
      }
    } else {
      return c;
    }
  }
}
