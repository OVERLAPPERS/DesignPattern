package 装饰者模式;

public class Harness extends Finery {
    public void show()
    {
        super.show();
        System.out.println("吊带");
    }
}
