public class FabulousTest{
	
	@test
	public void testThatTheNumberReverses(){
	
		Confirm confirm = new Confirm();
		switch = confirm.reverse(12345);
		assertEquals(54321);
	}
}