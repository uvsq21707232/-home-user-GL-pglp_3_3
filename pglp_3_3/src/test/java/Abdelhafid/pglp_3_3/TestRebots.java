package Abdelhafid.pglp_3_3;


import static org.junit.Assert.*;

import java.awt.Robot;

import org.junit.Test;

public class TestRebots {	
	
	@Test
	public void avancerTousTest() throws UnsupportedOperationException {
		
		/* Rebot 1*/
		Position pos=new Position(4,3);
		Direction dir=Direction.SUD;
		RebotStatique rebot=new Rebot(pos,dir);
		
		Position pos_test_1= new Position(4,2);
		
		/* Rebot 2*/
		Position pos2=new Position(2,2);
		Direction dir2=Direction.EST;
		RebotStatique rebot2=new RebotStatique(pos2,dir2);
		
		Position pos_test_2=new Position(2,2);
		
		/* Liste des rebots*/
		Rebots Liste=new Rebots();
		Liste.ajouRobot(rebot);
		Liste.ajouRobot(rebot2);
		
		Liste.avancerTous();
		
		/* test rebot 1 */
		assertEquals(pos_test_1.getX(),rebot.getPosition().getX());
		assertEquals(pos_test_1.getY(),rebot.getPosition().getY());
		
		/* test rebot 2 , il n'avance pas */
		assertEquals(pos_test_2.getX(),rebot2.getPosition().getX());
		assertEquals(pos_test_2.getY(),rebot2.getPosition().getY());
		
	
}
}
