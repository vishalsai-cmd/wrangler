package io.cdap.wrangler.api.parser;

import io.cdap.wrangler.api.annotations.PublicEvolving;

@PublicEvolving
public class TimeDuration extends Token {
  private final long nanos;
  
  public TimeDuration(String value) {
    super(TokenType.TIME_DURATION, value);
    this.nanos = parseTimeDuration(value);
  }
  
  public long getNanos() { return nanos; }
  public double getMillis() { return nanos / 1_000_000.0; }
  public double getSeconds() { return nanos / 1_000_000_000.0; }
  
  private static long parseTimeDuration(String value) {
    // Implementation that parses "150ms" into nanoseconds
  }
}
