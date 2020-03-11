package Abdelhafid.pglp_3_3;


import static org.junit.Assert.*;

import org.junit.Test;

public class TestRebot {
	
	@Test
	public void avanceTest() throws UnsupportedOperationException {
		
		Position pos=new Position(4,5);
		Direction dir=Direction.NORD;
		
		Rebot rebot=new Rebot(pos,dir);
		
		Position pos_test=new Position(4,6);
		rebot.avance();
		
		assertEquals( pos_test.getY(),rebot.getPosition().getY());
		assertEquals( pos_test.getX(),rebot.getPosition().getX());
	}
	
	
}
