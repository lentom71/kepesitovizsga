package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits
{
    public double addDigits(String input)
    {
        if(input == null || input =="")
        {
            return -1;
        }
        else
        {
            double osszeg = 0;
            for(Character ch: input.toCharArray())
            {
                osszeg = osszeg + Integer.parseInt(String.valueOf(ch));
            }
            return  osszeg;
        }
    }
}
