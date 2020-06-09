package 策略模式;
public class Main {
    private static double	total	= 0;

    public static void main(String[] args)
    {
        consume("正常价位", 3, 3000);
        consume("满200返50", 3, 3000);
        consume("打九五折", 3, 3000);

        System.out.println("总计:" + total);
    }

    public static void consume(String type, int num, double price)
    {
        CashSuper csuper = CashFactory.createCash(type);
        double totalPrices = 0;
        totalPrices = csuper.acceptCash(num * price);
        total += totalPrices;
        System.out.println("单价:" + price + " 数量:" + num + "合计:" + totalPrices);
    }
}

