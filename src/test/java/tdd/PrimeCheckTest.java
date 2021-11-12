package tdd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeCheckTest {
PrimeCheck  obj=new PrimeCheck();
	@Test
	public void isPrimeTest1() {
		Assert.assertTrue(obj.isPrime(23));
	}
	@Test
	public void isPrimeTest2() {
		Assert.assertTrue(obj.isPrime(1));
	
	}

@Test
public void isPrimeTest3() {
	Assert.assertFalse(obj.isPrime(4));
}

}
