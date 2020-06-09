package 观察者模式;

public class TeleplayObserver extends Observer {
    public TeleplayObserver(String name, Subject sub)
    {
        super(name, sub);
    }

    @Override
    public void update()
    {
        System.out.println(sub.getAction() + "	" + name + "新剧要开播了！");
    }
}
