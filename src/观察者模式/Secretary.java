package 观察者模式;

import java.util.ArrayList;
import java.util.List;

public class Secretary {
    private List<SoloObserver> observers	= new ArrayList<SoloObserver>();

    private String	action;

    public void attach(SoloObserver observer)
    {

        observers.add(observer);
    }

    public void announce()
    {
        for (SoloObserver obj : observers)
        {
            obj.update();
        }
    }

    public String getAction()
    {
        return action;
    }

    public void setAction(String action)
    {

        this.action = action;
    }
}
