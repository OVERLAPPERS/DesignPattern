package 装饰者模式;
public class Main {
    public static void main(String[]args){
        Person person = new Person("Lisa");

        System.out.println("第一种装扮：");

        Converse pqx = new Converse();
        shorts kk = new shorts();
        Harness dtx = new Harness();
        pqx.decorate(person);
        kk.decorate(pqx);
        dtx.decorate(kk);
        dtx.show();

        System.out.println("第二种装扮：");

        HighHeeledShoes px = new HighHeeledShoes();
        necklace ld = new necklace();
        FormalDress xz = new FormalDress();

        px.decorate(person);
        ld.decorate(px);
        xz.decorate(ld);
        xz.show();
        System.out.println("第三种装扮：");

        BM sw = new BM();
        Overalls ov = new Overalls();
        Boot ca = new Boot();

        sw.decorate(person);
        ov.decorate(sw);
        ca.decorate(ov);
        ca.show();

        


    }


}
