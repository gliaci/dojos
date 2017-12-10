package com.gliaci;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals
{
  private Map<Integer, String> romanSymbolMap;
  private StringBuilder romanNumeralSb;

  public RomanNumerals()
  {
    romanNumeralSb = new StringBuilder();

    romanSymbolMap = new HashMap<>();
    romanSymbolMap.put(1, "I");
    romanSymbolMap.put(2, "II");
    romanSymbolMap.put(3, "III");
    romanSymbolMap.put(4, "IV");
    romanSymbolMap.put(5, "V");
    romanSymbolMap.put(9, "IX");
    romanSymbolMap.put(10, "X");
    romanSymbolMap.put(40, "XL");
    romanSymbolMap.put(50, "L");
    romanSymbolMap.put(90, "XC");
    romanSymbolMap.put(100, "C");
    romanSymbolMap.put(400, "CD");
    romanSymbolMap.put(500, "D");
    romanSymbolMap.put(900, "CM");
    romanSymbolMap.put(1000, "M");
  }


  public String convert(int arabicNumber)
  {
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
    return romanSymbolMap.entrySet().stream()
            .filter(integerStringEntry -> arabicNumber - integerStringEntry.getKey() >= 0)
            .max((o1, o2) -> o1.getKey().compareTo(o2.getKey()))
            .get();
  }
}
