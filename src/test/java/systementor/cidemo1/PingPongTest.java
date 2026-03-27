package systementor.cidemo1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PingPongTest {

    private PingPong pingPong;

    @BeforeEach
    void setUp() {
        pingPong = new PingPong();
    }

    @Test
    void pingShouldReturnPongWhenInputIsPing() {
        String result = pingPong.ping("ping");//var ping ping ping förut, men ska bara vara ping
        assertEquals("pong", result);
    }

    @Test
    void pingShouldReturnErrorMessageWhenInputIsNotPing() {
        String result = pingPong.ping("hello");
        assertEquals("You didn't say ping!", result);
    }

    @Test
    void pingShouldIncreaseCounterStepByStep() {
        pingPong.ping("ping");
        assertEquals(1, pingPong.getPingCounter(), "Counter should be 1 after first ping");//var 1111 förut, ska vara 1

        pingPong.ping("ping");
        assertEquals(2, pingPong.getPingCounter(), "Counter should be 2 after second ping");//var 2222 förut, ska vara 2
    }

    @Test
    void getPingCounterShouldReturnMinusOneIfNoPingHasBeenCalled() {
        assertEquals(-1, pingPong.getPingCounter());
    }

    @Test
    void getPingCounterShouldReflectCorrectNumberOfPings() {
        pingPong.ping("ping");
        pingPong.ping("not a ping"); // ska INTE öka counter, stod bara "ping" förut men ska vara "not a ping"
        pingPong.ping("ping");
        assertEquals(2, pingPong.getPingCounter());
    }
}
