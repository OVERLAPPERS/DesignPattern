package 建造者模式;


public class SubMealBuilderA extends MealBuilder {
    @Override
    public void BuildFood(){
        meal.setFood("薯条");
    }

    @Override
    public void BuildDrinks(){
        meal.setDrinks("橙汁" );
    }

}
