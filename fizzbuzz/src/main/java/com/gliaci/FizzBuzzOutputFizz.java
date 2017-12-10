package com.gliaci;

public class FizzBuzzOutputFizz implements FizzBuzzOutput
{
  @Override
  public String convert(int number)
  {
    if (number % 3 == 0)
    {
      return "Fizz";
    }
    return "";
  }
}
