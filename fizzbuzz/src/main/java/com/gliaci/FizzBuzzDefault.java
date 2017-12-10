package com.gliaci;

public class FizzBuzzDefault implements FizzBuzzOutput
{
  @Override
  public String convert(int number)
  {
    return String.valueOf(number);
  }
}
