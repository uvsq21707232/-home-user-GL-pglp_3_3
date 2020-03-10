package Abdelhafid.pglp_3_3;

public class RebotStatique {
	
	protected Position pos;
	protected Direction dir;
	
	public RebotStatique (Position position, Direction direction) {
		
		this.pos=position;
		this.dir=direction;
	}
	/* récuperer la direction du rebot*/
	
	public Direction getDirection() {
		return this.dir;
	}
	
	/* récuperer la position du rebot*/
	public Position getPosition() {
		return this.pos;
	}
	/* méthode qui fait avacer le rebot qui est vide pour le RebotStaique
	 * parcequ'il n'avace pas
	 *  */
	
	public void avance() {
		
		;
	}

}
