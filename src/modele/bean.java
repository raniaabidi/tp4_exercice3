package modele;


public class bean  {
	private int num;
	
 public bean() {
	 setNum(0);
 }
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
        this.num=num ;		
	}
	public static double getaleatoire(String nbrsaisie) {
		int nbrsaisie1= Integer.parseInt(nbrsaisie);
		return Math.random() *nbrsaisie1 ;
	}
	
}
