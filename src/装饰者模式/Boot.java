package 装饰者模式;

public class Boot extends Finery {
    @Override
    public void show() {
        super.show();
        System.out.println("黑色短靴");
    }
}
