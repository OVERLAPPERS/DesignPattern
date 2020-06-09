package 建造者模式;

public class SubMealBuilderB extends MealBuilder {
    @Override
    public void BuildFood(){
        meal.setFood("汉堡");
    }

    @Override
    public void BuildDrinks(){
        meal.setDrinks("可乐" );
    }
}
