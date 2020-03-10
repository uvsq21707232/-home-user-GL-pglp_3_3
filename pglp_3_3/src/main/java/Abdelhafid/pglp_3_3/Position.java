package Abdelhafid.pglp_3_3;

public class Position {
  /* Coordonnées */
	
	private int x;
	private int y;
	
	public Position(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public Position() {
		this.x=0;
		this.y=0;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
   /* fonction pour modifier X*/
	
	protected void bougerX(int nombre) {
		this.x=this.x+nombre;
	}
	/* fonction pour modifier Y*/
	
	protected void bougerY(int nombre) {
		this.y=this.y+nombre;
	}
	
}
