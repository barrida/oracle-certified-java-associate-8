package lambda;

import static org.junit.Assert.*;

import org.junit.Test;

public class LambdaFunctionsTest {

	@Test
	public void testCallPredicate() {
		
		Predicate<Integer> predicate = i -> i % 2 == 0;
		assertEquals(true, LambdaFunctions.callPredicate(10, predicate));
		
	}

}
