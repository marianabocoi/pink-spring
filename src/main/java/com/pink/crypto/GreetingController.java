package com.pink.crypto;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  private final AtomicLong counter = new AtomicLong();

  // https://www.baeldung.com/spring-request-response-body
  // note http instead of https in curl
  @PostMapping("/cesar/encode")
  public CesarPayload cesarEncode(@RequestBody CesarInput input) {
    String encodedText = Cesar.encode(input.getText(), input.getOffset());
    return new CesarPayload(counter.incrementAndGet(), input.getText(), encodedText);
  }

  @PostMapping("/cesar/decode")
  public CesarPayload cesarDecode(@RequestBody CesarInput input) {
    String decodedText = Cesar.decode(input.getText(), input.getOffset());
    return new CesarPayload(counter.incrementAndGet(), decodedText, input.getText());
  }
}