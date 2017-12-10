package com.gliaci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest
{
  @Test
  public void oneIsI() throws Exception
  {
    assertEquals("I", new RomanNumerals().convert(1));
  }

  @Test
  public void twoIsII() throws Exception
  {
    assertEquals("II", new RomanNumerals().convert(2));
  }

  @Test
  public void threeIsIII() throws Exception
  {
    assertEquals("III", new RomanNumerals().convert(3));
  }

  @Test
  public void fourIsIV() throws Exception
  {
    assertEquals("IV", new RomanNumerals().convert(4));
  }

  @Test
  public void fiveIsV() throws Exception
  {
    assertEquals("V", new RomanNumerals().convert(5));
  }

  @Test
  public void sixIsVI() throws Exception
  {
    assertEquals("VI", new RomanNumerals().convert(6));
  }

  @Test
  public void eightIsVIII() throws Exception
  {
    assertEquals("VIII", new RomanNumerals().convert(8));
  }

  @Test
  public void nineIsIX() throws Exception
  {
    assertEquals("IX", new RomanNumerals().convert(9));
  }

  @Test
  public void elevenIsXI() throws Exception
  {
    assertEquals("XI", new RomanNumerals().convert(11));
  }

  @Test
  public void thirteenIsXIII() throws Exception
  {
    assertEquals("XIII", new RomanNumerals().convert(13));
  }

  @Test
  public void fourteenIsXIV() throws Exception
  {
    assertEquals("XIV", new RomanNumerals().convert(14));
  }

  @Test
  public void sixteenIsXVI() throws Exception
  {
    assertEquals("XVI", new RomanNumerals().convert(16));
  }

  @Test
  public void nineteenIsXIX() throws Exception
  {
    assertEquals("XIX", new RomanNumerals().convert(19));
  }

  @Test
  public void thirtyFourIsXXXIV() throws Exception
  {
    assertEquals("XXXIV", new RomanNumerals().convert(34));
  }

  @Test
  public void seventyFourIsLXXIV() throws Exception
  {
    assertEquals("LXXIV", new RomanNumerals().convert(74));
  }

  @Test
  public void oneThousandFourHundredThirtyFourIsMCDXXXIV() throws Exception
  {
    assertEquals("MCDXXXIV", new RomanNumerals().convert(1434));
  }
}