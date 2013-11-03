import java.util.LinkedList;
import java.util.List;

public class Cassier implements Runnable{

    List<Meal> meals = new LinkedList<Meal>();

    public Cassier(List<Meal> meals) {
        this.meals = meals;
         for (int i =0; i < 10; i++){
             Meal meal = new Meal();
             meals.add(meal);
         }
    }




    @Override
    public void run() {

    }
    public Meal giveMeal(){

        return meals.remove(0);
    }


}
