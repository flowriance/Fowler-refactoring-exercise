import static org.junit.Assert.*;

import org.junit.Test;

public class TestCustomer {

	@Test
	public void test() {
		Movie Teatime = new Movie("Teatime",5);
		Rental rent = new Rental(Teatime,5);
		Customer Dan = new Customer("Dan");
		Dan.addRental(rent);
		Dan.getName();
		Dan.statement();
		//fail("Not yet implemented");
	}

}
