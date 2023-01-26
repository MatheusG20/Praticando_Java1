package método_calc;

public class Método_calc {
	int yDias;
	int zMeses;
	int xAnos;
	int dias;
	
	public void Calc (String calcular) {
		dias = (365 * xAnos) + (30 * zMeses) + (yDias);  
	}
	
}
