package Player;

public abstract class Player {
    private String name;
    private RunBehavior runBehavior;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RunBehavior getRunBehavior() {
        return runBehavior;
    }

    public void setRunBehavior(RunBehavior runBehavior) {
        this.runBehavior = runBehavior;
    }

    public Player(String name, RunBehavior runBehavior) {
        this.name = name;
        this.runBehavior = runBehavior;
    }

    public void train(){
        System.out.println("O jogador " + name + " treina muito");
    }

    public void compete(){
        System.out.println("O jogador " + name +" é muito competitivo");
    }

    public void doRun(){
        runBehavior.run();
    }

    
}
