package 建造者模式;

public class Main {

    public static void main(String[] args) {
        // 套餐A
        SubMealBuilderA a = new SubMealBuilderA();
        //套餐A的服务员
        KFCWaiter waiter = new KFCWaiter(a);
        //获得套餐
        Meal mealA = waiter.construct();
        System.out.print("A套餐有：");
        System.out.println("食物："+mealA.getFood()+"；   "+"饮品："+mealA.getDrinks());
        // 套餐B
        SubMealBuilderB b = new SubMealBuilderB();
        //套餐B的服务员
        KFCWaiter waiter1 = new KFCWaiter(b);
        //获得套餐
        Meal mealB = waiter.construct();
        System.out.print("B套餐有：");
        System.out.println("食物："+mealB.getFood()+"；   "+"饮品："+mealB.getDrinks());

    }
}
