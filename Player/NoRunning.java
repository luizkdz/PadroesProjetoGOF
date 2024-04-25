package Player;

public class NoRunning implements RunBehavior{

    @Override
    public void run() {
        System.out.println("O Jogador não corre");
    }
    
}
