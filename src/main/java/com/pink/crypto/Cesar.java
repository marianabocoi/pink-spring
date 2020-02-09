package com.pink.crypto;

import java.util.stream.Collectors;

public class Cesar {

  private final long id;
  private final String content;
  private final String encryptedContent;

  public Cesar(long id, String content, int offset) {
    this.id = id;
    this.content = content;
    this.encryptedContent = encrypt(content, offset);
  }

  protected static String encrypt(String text, int offset) {
    StringBuffer encrypted = new StringBuffer();
    for (char character : text.toCharArray()) {
      encrypted.append(getShiftedCharacter(character, offset));
    }
    return encrypted.toString();
  }

  private static char getShiftedCharacter(char character, int offset) {
    if (character >= 'A' && character <= 'z') {
      return (char) ('A' + (character % 'A' + offset) % 57);
    } else {
      return character;
    }
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  public String getEncryptedContent() {
    return encryptedContent;
  }
}