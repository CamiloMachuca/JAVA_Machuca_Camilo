
package Java_punto4;

import java.util.ArrayList;
import java.util.List;


public class NotificarPorMail implements NotificacionConfirmacion {
    
    
    @Override
    public void enviarMensajeDeConfirmacion(Orden orden){

    }
    private static NotificarPorMail instance;

	private NotificarPorMail() {
	}

	public static NotificarPorMail getInstance() {
		if (instance == null) {
			instance = new NotificarPorMail();
		}
		return instance;
	}

	public List<Orden> ordenes = new ArrayList<Orden>();

	
    
}
