package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit
{
    private int utesek;
    public HeavyCavalry() {
        super(150, 20, true);
    }
    @Override
    public int doDamage()
    {
        if (utesek == 0) {
            utesek++;
            return 3* super.doDamage();
        } else return super.doDamage();
    }
}
