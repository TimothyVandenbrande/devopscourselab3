import org.assertj.core.api.Assertions;
import org.junit.Test;

public class GreeterTest {

    @Test
    public void greet() {
        String greet = new Greeter().greet("Timothy");
        Assertions.assertThat(greet).isEqualTo("Hello Timothy!");
    }

}