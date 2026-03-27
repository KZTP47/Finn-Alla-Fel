package systementor.cidemo1;

public class PingPong {
    // 1. Vi har bara EN variabel och döper den med litet 'p'
    private int pingCounter = -1;

    public String ping(String input) {
        // Vi kollar om input är exakt "ping"
        if ("ping".equals(input)) {
            // Om det är första gången (den är -1), sätter vi den till 1
            if (pingCounter == -1) {
                pingCounter = 1;
            } else {
                pingCounter += 1;
            }
            return "pong";
        } else {
            // Om man säger något annat än "ping"
            return "You didn't say ping!";
        }
    }

    public int getPingCounter() {
        // 2. Vi returnerar variabeln med litet 'p'
        // Vi behöver ingen if/else här, vi vill bara ha värdet
        return pingCounter;
    }
}
