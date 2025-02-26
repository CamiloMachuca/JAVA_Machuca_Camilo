
package javadia8;

public class PartidosLiga extends Partido {
    
    private int jornada;

    public PartidosLiga(int jornada, String equipoLocal, String equipoVisitante, String fecha) {
        super(equipoLocal, equipoVisitante, fecha);
        this.jornada = jornada;
    }
    
    @Override
    public String obtenerInformacion(){
        return super.obtenerInformacion()+
                "\n Jornada= "+ jornada;
    }
    
}
