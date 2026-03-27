package systementor.cidemo1;

public class PingPong {
    // Initialized till -1 för att få pass till "no ping has been called" test
    private int pingCounter = -1;//denna fanns inte förut

    private int pingCounter = 0;
    public String ping(String input){
        if(input.equals("ping")){
            pingCounter += 1;//var +5 förut, ska vara +1
            return "pong";
        }
        else{
            return "You didn't say ping!";//sa "pong förut" men vi vill att det ska stå: "You didn't say ping!"
        }
    }

    public int getPingCounter(){
        if (pingCounter < 0){
            return pingCounter;
        }
        else{
            return PingCounter; //var 100 förut, men vi vill ju veta vad PingCounter är
        }
    }
}
