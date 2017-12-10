package com.gliaci;

public class FizzBuzzOutputFizzBuzz implements FizzBuzzOutput
{
  @Override
  public String convert(int number)
  {
    if (number % 3 == 0 && number % 5 == 0)
    {
      return "FizzBuzz";
    }
    return "";
  }
}
