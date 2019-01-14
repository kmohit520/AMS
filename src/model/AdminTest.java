package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdminTest {

	@Test
	public void testAdmin() {
		
	}

	@Test
	public void testAdminStringString() {
		
	}

	@Test
	public void testGetAdminName() {
		String a="Naveen";
		String b="kaushal";
		Admin c=new Admin(a,b);
		
		assertEquals(a, c.getAdminName());
		assertEquals(b, c.getAdminPassword());
	}

	@Test
	public void testSetAdminName() {
		
	}

	@Test
	public void testGetAdminPassword() {
		
	}

	@Test
	public void testSetAdminPassword() {
		
	}

}
