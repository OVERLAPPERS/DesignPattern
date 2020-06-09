package 观察者模式;

public class SoloObserver extends Observer{
    public SoloObserver(String name, Subject sub)
    {
        super(name, sub);
    }

    @Override
    public void update()
    {
        System.out.println(sub.getAction() + "	" + name + "Solo单曲专辑要上线了！");
    }
}
