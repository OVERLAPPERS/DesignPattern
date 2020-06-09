package 观察者模式;

public class Main {

    public static void main(String[] args) {

        Boss YG = new Boss();

        SoloObserver tongshi1 = new SoloObserver("Lisa", YG);
        YG.attach(tongshi1);
        SoloObserver tongshi2 = new SoloObserver("Jennie", YG);
        YG.attach(tongshi2);
        ProgramObserver tongshi3 = new ProgramObserver("Rose", YG);
        YG.attach(tongshi3);
        TeleplayObserver tongshi4 = new TeleplayObserver("Jisoo", YG);
        YG.attach(tongshi4);
        YG.setAction("Blackpink in your area！");
        YG.announce();

    }
}
