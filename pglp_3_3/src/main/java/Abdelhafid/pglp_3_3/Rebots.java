package Abdelhafid.pglp_3_3;

import java.util.ArrayList;

public class Rebots {
		
private ArrayList<RebotStatique> tous_Robots;
	
	public Rebots() {
		
		tous_Robots = new ArrayList<RebotStatique>();
	}
	
	
	public void ajouRobot(RebotStatique rebots) {
		this.tous_Robots.add(rebots);
	}
	
	
	public void avancerTous() throws UnsupportedOperationException {
		if(!tous_Robots.isEmpty()) {
			for(RebotStatique rebot: tous_Robots) {
				rebot.avance();
			}
		}
	}

}
