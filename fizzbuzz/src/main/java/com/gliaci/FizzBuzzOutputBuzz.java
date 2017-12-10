package com.gliaci;

public class FizzBuzzOutputBuzz implements FizzBuzzOutput
{
  @Override
  public String convert(int number)
  {
    if (number % 5 == 0)
    {
      return "Buzz";
    }
    return "";
  }
}
