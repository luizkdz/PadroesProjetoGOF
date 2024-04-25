package Player;

public class Main {
        public static void main(String args[]){
            SoccerPlayer sc = new SoccerPlayer("Roger Guedes", new Runningfast());
            sc.compete();
            sc.train();
            sc.doRun();
            System.out.println("");
            GolfJogador gj = new GolfJogador("Guga", new NoRunning());
            gj.compete();
            gj.train();
            gj.doRun();
    }
}
