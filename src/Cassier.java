import java.util.LinkedList;
import java.util.List;

public class Cassier implements Runnable{

    List<Meal> meals = new LinkedList<Meal>();

    public Cassier(List<Meal> meals) {
        this.meals = meals;

    }




    @Override
    public void run() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
    public Meal giveMeal(){
        return ;
    }


}
