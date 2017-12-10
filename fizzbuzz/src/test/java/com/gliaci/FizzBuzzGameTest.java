package com.gliaci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzGameTest
{
  @Test
  public void oneIs1() throws Exception
  {
    assertEquals("1", new FizzBuzzGame().say(1));
  }

  @Test
  public void twoIs2() throws Exception
  {
    assertEquals("2", new FizzBuzzGame().say(2));
  }

  @Test
  public void threeIsFizz() throws Exception
  {
    assertEquals("Fizz", new FizzBuzzGame().say(3));
  }

  @Test
   public void fourIs4() throws Exception
   {
     assertEquals("4", new FizzBuzzGame().say(4));
   }

  @Test
   public void fiveIsBuzz() throws Exception
   {
     assertEquals("Buzz", new FizzBuzzGame().say(5));
   }

  @Test
    public void sixIsFizz() throws Exception
    {
      assertEquals("Fizz", new FizzBuzzGame().say(6));
    }

  @Test
    public void tenIsBuzz() throws Exception
    {
      assertEquals("Buzz", new FizzBuzzGame().say(10));
    }

  @Test
    public void fifteenIsFizzBuzz() throws Exception
    {
      assertEquals("FizzBuzz", new FizzBuzzGame().say(15));
    }

}
