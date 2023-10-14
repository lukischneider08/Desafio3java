package comejercicioaeropuerto;

import java.util.ArrayList;
import java.util.List;

public class MainTorre {

	public static void main(String[] args) {

		List<IVolador> voladores = new ArrayList<>();

		voladores.add(new ObjetosVoladores("Avion 1", true));

		voladores.add(new ObjetosVoladores("Ovni", false));

		voladores.add(new ObjetosVoladores("Helicoptero 1", true));

		Operario operario = new Operario();

		
		
		
		for (IVolador volador : voladores) {
			if (volador.cumpleContrato()) {
				volador.aterrizar();
			} else {
				boolean autorizacion = operario.autorizarAterrizaje(volador);
				if (autorizacion) {
					System.out
							.println(volador.getClass().getSimpleName() + " autorizado para aterrizar en la Pista 2.");
				} else {
					System.out.println("No es posible aterrizar " + volador.getClass().getSimpleName());
				}
			}

		}
	}
}
