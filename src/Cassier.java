import java.util.LinkedList;
import java.util.List;

public class Cassier{

    private List<Meal> meals = new LinkedList<Meal>();

    public Cassier() {
        this.meals = meals;
         for (int i =0; i < 10; i++){
             Meal meal = new Meal(i);
             meals.add(meal);
         }
    }

    public Meal giveMeal(){

        return meals.remove(0);
    }


}
