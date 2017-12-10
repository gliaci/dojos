package com.gliaci;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals
{
  private Map<Integer, String> romanSymbolsMap;

  public RomanNumerals()
  {
    romanSymbolsMap = new HashMap<>();
    romanSymbolsMap.put(1, "I");
    romanSymbolsMap.put(2, "II");
    romanSymbolsMap.put(3, "III");
    romanSymbolsMap.put(4, "IV");
    romanSymbolsMap.put(5, "V");
    romanSymbolsMap.put(9, "IX");
    romanSymbolsMap.put(10, "X");
    romanSymbolsMap.put(40, "XL");
    romanSymbolsMap.put(50, "L");
    romanSymbolsMap.put(90, "XC");
    romanSymbolsMap.put(100, "C");
    romanSymbolsMap.put(400, "CD");
    romanSymbolsMap.put(500, "D");
    romanSymbolsMap.put(900, "CM");
    romanSymbolsMap.put(1000, "M");
  }


  public String convert(int arabicNumber)
  {
    StringBuilder romanNumeralSb = new StringBuilder();
    int currentArabicNumber = arabicNumber;
    do
    {
      Map.Entry<Integer, String> maxSymbolEntry = findMaxSymbolEntry(currentArabicNumber);

      romanNumeralSb.append(maxSymbolEntry.getValue());

      currentArabicNumber = currentArabicNumber - maxSymbolEntry.getKey();
    }
    while (currentArabicNumber > 0);

    return romanNumeralSb.toString();
  }

  private Map.Entry<Integer, String> findMaxSymbolEntry(int arabicNumber)
  {
    return romanSymbolsMap.entrySet().stream()
            .filter(romanSymbolEntry -> arabicNumber - romanSymbolEntry.getKey() >= 0)
            .max((o1, o2) -> o1.getKey().compareTo(o2.getKey()))
            .get();
  }
}
