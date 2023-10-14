package comejercicioaeropuerto;

public class ObjetosVoladores implements IVolador {
	
	String nombre;
	boolean cumpleContrato;
	
	

	public ObjetosVoladores(String nombre, boolean cumpleContrato) {
	
		this.nombre = nombre;
		this.cumpleContrato = cumpleContrato;
	}

	public void aterrizar() {       
		
		System.out.println(nombre + " ha aterrizado en la Pista 1.");

		
	}
	
	public boolean cumpleContrato() {
		// TODO Auto-generated method stub
		return cumpleContrato;
	}

	public boolean solicitarAutorizacion() {
		// TODO Auto-generated method stub
		return true;
	}

	
	

}
