package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit
{
    private boolean pajzs = true;
    public Swordsman(boolean hasArmor)
    {
        super(100,10, hasArmor);
    }

    @Override
    public void sufferDamage(int damage)
    {
        if (pajzs = true) {
            pajzs = false;
        }
        else
        {
            super.sufferDamage(damage);
        }
    }

}
