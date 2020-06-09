package 外观模式;
public class Fund
{
    Stock1			gu1;
    Stock2			gu2;
    Stock3			gu3;
    Stock4			gu4;
    NationalDebt1	nd1;
    Relaty1			rt1;
    Relaty2			rt2;


    public Fund()
    {
        gu1 = new Stock1();
        gu2 = new Stock2();
        gu3 = new Stock3();
        gu4 = new Stock4();
        nd1 = new NationalDebt1();
        rt1 = new Relaty1();
        rt2 = new Relaty2();
    }

    public void buyFund()
    {
        gu1.buy();
        gu2.buy();
        gu3.buy();
        gu4.buy();
        nd1.buy();
        rt1.buy();
        rt2.buy();
    }

    public void sellFund()
    {
        gu1.sell();
        gu2.sell();
        gu3.sell();
        gu4.sell();
        nd1.sell();
        rt1.sell();
        rt2.sell();
    }
}