
package javadia8;


public class Partido {
    private String equipoLocal;
    private String equipoVisitante;
    private int cestasLocal;
    private int cestasVisitantes;
    private String finalizado;
    private String fecha;

    public Partido(String equipoLocal, String equipoVisitante,  String fecha) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.cestasLocal = 0;
        this.cestasVisitantes = 0;
        this.finalizado = "Jugando";
        this.fecha = fecha;
    }
    
    public void añadirPunLocal(int puntos){
        if(finalizado.equals("Jugando")){
            cestasLocal+=puntos;
        }
    }
    
    public void añadirPunVisitante(int puntos){
        if(finalizado.equals("Jugando")){
            cestasVisitantes+=puntos;
        }
    }
    
    public String ganador(){
        if(cestasLocal>cestasVisitantes){
            return equipoLocal;
        }else if(cestasVisitantes>cestasLocal){
            return equipoVisitante;
        }else{
            return "ha habido un empate";
        }
    }
    
    public void finalizarParti(){
        if (cestasLocal==cestasVisitantes){
            System.out.println("No se puede finalizar un partido en empate");
        }
        else{
            finalizado="Finalizado";
        }
    }

    
    public String obtenerInformacion() {
        return "Partido " + " equipoLocal= " + equipoLocal + " vs  equipoVisitante= " + equipoVisitante + 
                " \n Resultado= cestasLocal= " + cestasLocal + "  cestasVisitantes= " + cestasVisitantes + 
                "\n Estado= " + finalizado + "\n fecha= " + fecha
                +" Ganador= "+ ganador();
    }
    
    
    
    
    
}
