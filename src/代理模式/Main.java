package 代理模式;

public class Main {
    public static void main(String[]args){
        SchoolGirl Lisa = new SchoolGirl();
        Lisa.setName("Lisa");
        SchoolGirl Jennie = new SchoolGirl();
        Jennie.setName("Jennie");
        SchoolGirl Jisoo = new SchoolGirl();
        Jisoo.setName("Jisoo");
        SchoolGirl Rose = new SchoolGirl();
        Rose.setName("Rose");


        Proxy daili1 = new Proxy(Lisa);
        daili1.giveRose();
        Proxy daili2 = new Proxy(Jennie);
        daili2.giveNecklace();
        Proxy daili3 = new Proxy(Jisoo);
        daili3.giveRings();
        Proxy daili4 = new Proxy(Rose);
        daili4.givePiano();
    }


}
