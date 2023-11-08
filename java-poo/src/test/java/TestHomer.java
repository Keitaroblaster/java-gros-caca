import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestHomer {

	@Test
	public void TestDrinkBeer() {
		assertEquals("duff", HomerSimpson.drinkBeer());
	}

	@Test
	public void TestEat() {
		assertEquals("donuts", HomerSimpson.eat());
	}
}
