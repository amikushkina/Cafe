
public class Client extends Thread{
    int clientNum;
    Cassier cassier;

    public Client(int clientNum, Cassier cassier) {
        this.clientNum = clientNum;
        this.cassier= cassier;
    }

    @Override
    public void run() {
        Meal meal = cassier.giveMeal();
        if (meal == null)  {
            System.out.println("empty");
        } else {
        System.out.println("I've got" + meal.toString());
        }
        super.run();    //To change body of overridden methods use File | Settings | File Templates.
    }


}
