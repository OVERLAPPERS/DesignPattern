package 策略模式;
public class CashFactory {
    public static CashSuper createCash(String type)
    {
        CashSuper cs = null;
        if ("正常价位".equals(type))
        {
            cs = new CashNormal();
        }
        else if ("满200返50".equals(type))
        {
            cs = new CashReturn(200, 50);
        }
        else if ("打九五折".equals(type))
        {
            cs = new CashRebate(0.95);
        }

        return cs;
    }
}
