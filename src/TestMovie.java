import static org.junit.Assert.*;

import org.junit.Test;

public class TestMovie {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Movie Teatime = new Movie("Teatime",5);
		Rental rent = new Rental(Teatime,5);
		Customer Dan = new Customer("Dan");
		Teatime.getPriceCode();
		Teatime.getTitle();
		Teatime.setPriceCode(3);
	}

}
