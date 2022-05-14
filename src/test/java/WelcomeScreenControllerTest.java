import com.example.tictactoe.WelcomeScreenController;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class WelcomeScreenControllerTest {
    private WelcomeScreenController controller;

    @Before
    public void setUp() {
        controller = new WelcomeScreenController();
    }

    @Test
    public void testGetName() {
        String name = "Test";
        try {
            controller.getClass()
                    .getDeclaredField("name")
                    .set(controller, name);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}
