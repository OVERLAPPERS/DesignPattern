package 代理模式;

public class Proxy implements GiveGift {
    Pursuit	gg;

    public Proxy(SchoolGirl mm)
    {
        gg = new Pursuit(mm);
    }

    @Override
    public void giveRose()
    {

        gg.giveRose();
    }

    @Override


    public void giveNecklace()
    {

        gg.giveNecklace();
    }

    @Override
    public void giveRings()
    {

        gg.giveRings();
    }
    public void givePiano()
    {

        gg.givePiano();
    }
}
