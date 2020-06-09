package 代理模式;

public class Pursuit implements GiveGift {
    SchoolGirl	mm;

    public Pursuit(SchoolGirl mm)
    {
        this.mm = mm;
    }

    @Override
    public void giveNecklace()
    {

        System.out.println(mm.name + " 送你项链");
    }

    @Override
    public void giveRings()
    {
        System.out.println(mm.name + " 送你戒指");
    }

    @Override
    public void giveRose()
    {
        System.out.println(mm.name + " 送你玫瑰");
    }

    @Override
    public void givePiano()
    {
        System.out.println(mm.name + " 送你钢琴");
    }
}
