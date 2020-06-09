package 工厂方法模式;
public class Volunteer extends LeiFeng{
    public LeiFeng createLeiFeng()
    {
        return new Volunteer();
    }

}
