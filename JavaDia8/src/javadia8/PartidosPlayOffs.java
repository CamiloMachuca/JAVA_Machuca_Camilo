
package javadia8;


public class PartidosPlayOffs extends Partido {
    private String ronda;

    public PartidosPlayOffs(String ronda, String equipoLocal, String equipoVisitante, String fecha) {
        super(equipoLocal, equipoVisitante, fecha);
        this.ronda = ronda;
    }
    
    @Override
    public String obtenerInformacion(){
        return super.obtenerInformacion()+
                "\n Ronda= "+ ronda;
    }
    
}
