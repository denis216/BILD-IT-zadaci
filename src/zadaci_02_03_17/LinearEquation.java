package zadaci_02_03_17;

public class LinearEquation {

	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	public LinearEquation() {
		// TODO Auto-generated constructor stub
	}
	
	//Konstruktor sa argumentima
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}	
	
	/*Pitanje jedno Ensare.Da sam ovu metoru ispod dole stavio ovako
	 * public double getX() {
		return (((getE() * getD()) - (getB() * getF())) / (((getA() * getD()) - (getB() * getC()))));
	}
	da li bi bila ekvilavent ovoj isSolvable sto sam ja napisao tj.da li rade istu stvar?
	 */

	//Vraca true ako ad - bc nije jednako 0
	public boolean isSolvable(){
		if(a*d - b*c !=0){
			return true;
		}
		return false;
	}
	//Vraca resenje za jednacinu
	public double getX() {
		return (((getE() * getD()) - (getB() * getF())) / (((getA() * getD()) - (getB() * getC()))));
	}

	//Vraca resenje za jednacinu
	public double getY() {
		return (((getA() * getF()) - (getE() * getC())) / (((getA() * getD()) - (getB() * getC()))));
	}
	
}
