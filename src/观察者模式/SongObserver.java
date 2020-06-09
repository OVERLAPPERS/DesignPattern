package 观察者模式;


public class SongObserver extends Observer{
    public SongObserver(String name, Subject sub)
    {
        super(name, sub);
    }

    @Override
    public void update()
    {
        System.out.println(sub.getAction() + "	" + name + "新专辑要公演了！");
    }
}
