package com.pink.crypto;

public class CesarPayload {

  private final long id;
  private final String content;
  private final String encryptedContent;

  public CesarPayload(long id, String content, String encryptedContent) {
    this.id = id;
    this.content = content;
    this.encryptedContent = encryptedContent;
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