package comejercicioaeropuerto;

public class Operario {
	
	
	  public boolean autorizarAterrizaje(IVolador volador) {
	        return volador.solicitarAutorizacion();
	    }
}
