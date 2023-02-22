
public class Circulo_DVGC extends FiguraGeometrica_DVGC {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_DVGC(double r, String tipoFigura) {
		super(tipoFigura);
		radio = r;
		if(radio < 0) {
			radio = -radio;
		}
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
