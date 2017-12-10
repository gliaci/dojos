package com.gliaci;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzGame
{
  private List<FizzBuzzOutput> fizzBuzzOutputs;

  public FizzBuzzGame()
  {
    fizzBuzzOutputs = new ArrayList<>();
    fizzBuzzOutputs.add(new FizzBuzzOutputFizzBuzz());
    fizzBuzzOutputs.add(new FizzBuzzOutputFizz());
    fizzBuzzOutputs.add(new FizzBuzzOutputBuzz());
    fizzBuzzOutputs.add(new FizzBuzzDefault());

  }

  public String say(int number)
  {
    for (FizzBuzzOutput fizzBuzzOutput : fizzBuzzOutputs)
    {
      String fizzBuzzResult = fizzBuzzOutput.convert(number);
      if (StringUtils.isEmpty(fizzBuzzResult))
      {
        continue;
      }
      return fizzBuzzResult;
    }
    return "FizzBuzz error!";
  }
}
