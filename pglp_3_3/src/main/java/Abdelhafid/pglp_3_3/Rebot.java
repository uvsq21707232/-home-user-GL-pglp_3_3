package Abdelhafid.pglp_3_3;

public class Rebot extends RebotStatique {

	public Rebot(Position position, Direction direction) {
		super(position, direction);
		
	}
	
	public void tourne() {
		
			if(dir.equals(Direction.NORD)) {
				this.dir=Direction.EST;
			}
			else if(dir.equals(Direction.EST)) {
				this.dir=Direction.SUD;
			}
			else if(dir.equals(Direction.SUD)) {
				this.dir=Direction.OUEST;
			}
			else {
				this.dir=Direction.NORD;
			}
		}
	
	
	@Override
	public void avance(){
		switch (dir) {
		case NORD :
			pos.y++;
		break;
		case SUD :
			pos.y--;
		break;
		case OUEST :
			pos.x--;
		break;
		case EST :
			pos.x++;
		break;
		default :
		break;
		}
	}
	
}
