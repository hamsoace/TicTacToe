import com.example.tictactoe.Main;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testMain() {
        Main.main(new String[]{
                "--player1", "Human",
                "--player2", "Human",
                "--board-size", "3",
                "--first-player", "1",
                "--second-player", "2",
                "--first-player-symbol", "X",
                "--second-player-symbol", "O",
        });
    }
}
