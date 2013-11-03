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

    public synchronized Meal giveMeal() {
        if (meals.isEmpty()){
            System.out.println("error");
            return null;
        }else{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            return meals.remove(0);
        }
    }


}
