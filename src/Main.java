
public class Main {
    public static void main(String[] args) {

        Cassier cassier = new Cassier();


        for(int i=0; i<=10; i++){
            Client client = new Client(i,cassier);
            client.start();
        }



    }
}
