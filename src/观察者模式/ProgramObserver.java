package 观察者模式;

public class ProgramObserver extends Observer {
    public ProgramObserver(String name, Subject sub)
    {
        super(name, sub);
    }

    @Override
    public void update()
    {
        System.out.println(sub.getAction() + "	" + name + "新节目要开始直播了！");
    }
}
