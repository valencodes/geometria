/**
 * @author Daniela Valentina Galeote Calderón
 * @version 1.2
 */
public class Rectangulo_DVGC extends FiguraGeometrica_DVGC {
	private double l1;
	private double l2;
	/**
	 * Constructor con los dos lados del rectángulo
	 * @param tipoFigura
	 * @param lG
	 * @param lP
	 */
	public Rectangulo_DVGC(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * @return devuelve area del rectángulo
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * @return el perímetro del rectángulo
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
