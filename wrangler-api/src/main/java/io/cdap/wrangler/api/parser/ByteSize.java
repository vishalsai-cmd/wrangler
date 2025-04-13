package io.cdap.wrangler.api.parser;

import io.cdap.wrangler.api.annotations.PublicEvolving;

@PublicEvolving
public class ByteSize extends Token {
  private final long bytes;
  
  public ByteSize(String value) {
    super(TokenType.BYTE_SIZE, value);
    this.bytes = parseByteSize(value);
  }
  
  public long getBytes() { return bytes; }
  public double getKB() { return bytes / 1024.0; }
  public double getMB() { return bytes / (1024.0 * 1024); }
  
  private static long parseByteSize(String value) {
    // Implementation that parses "10KB" into bytes
  }
}
