
public class Client extends Thread{
    int clientNum;
    Cassier cassier;

    public Client(int clientNum, Cassier cassier) {
        this.clientNum = clientNum;
        this.cassier= cassier;
    }

    @Override
    public void run() {
        System.out.println("I've got" + cassier.giveMeal());
        super.run();    //To change body of overridden methods use File | Settings | File Templates.
    }


}
