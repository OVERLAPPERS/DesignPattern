package 原型模式;

public class Main {
    public static void main(String[]args){
        Resume a = new Resume("Lisa");
        a.setPersonalInfo("女", "24");
        a.setWorkExperience("2018-2019", "SM公司");

        Resume b = a.clone();
        b.setWorkExperience("2019-2020", "YG企业");

        Resume c = new Resume("Mike");
        c.setPersonalInfo("男", "24");
        c.setWorkExperience("2017-2019", "YG企业");

        Resume d = c.clone();
        d.setWorkExperience("2019-2020", "JYP企业");

        a.display();
        b.display();
        c.display();
        d.display();
    }


}
