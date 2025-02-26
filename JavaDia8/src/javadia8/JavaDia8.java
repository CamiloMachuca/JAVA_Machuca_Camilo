
package javadia8;

import java.util.Scanner;


public class JavaDia8 {

 
    public static void main(String[] args) {
        
        Scanner teclado= new Scanner(System.in);
        
        boolean buclePrincipal=true;
        Partido partido=null;
        while (buclePrincipal==true){
            System.out.println("=======================");
            System.out.println("========= Menu =========");
            System.out.println("=======================");
            System.out.println("1. Añadir partido de liga");
            System.out.println("2. Añadir partido de playOffs");
            System.out.println("3. Añadir puntos");
            System.out.println("4. Finalizar partidos");
            System.out.println("5. Ver los partidos");
            System.out.println("6. Finalizar programa");
            String opcion=teclado.nextLine();
            
            switch (opcion){
                case "1":
                    System.out.println("Ingrese los datos de los equipos:");
                    System.out.println("Ingrese el nombre del aquipo local:");
                    String nueLocalLiga=teclado.nextLine();
                    System.out.println("ingrese el nombre del equipo visitante:");
                    String nueVisitanteLIga=teclado.nextLine();
                    System.out.println("Ingrese la fecha: ");
                    String nuefechaLiga=teclado.nextLine();
                    System.out.println("Ingrese la jornada:");
                    int nueJornada=teclado.nextInt();
                    teclado.nextLine();
                    partido= new PartidosLiga(nueJornada, nueLocalLiga, nueVisitanteLIga, nuefechaLiga);
                    break;
                    
                case "2":
                    System.out.println("Ingrese los datos de los equipos:");
                    System.out.println("Ingrese el nombre del aquipo local:");
                    String nuevLocal=teclado.nextLine();
                    System.out.println("ingrese el nombre del equipo visitante:");
                    String nuevVisitante=teclado.nextLine();
                    System.out.println("Ingrese la fecha: ");
                    String nuevfecha=teclado.nextLine();
                    System.out.println("Ingrese la Ronda (octavos, cuartos, final):");
                    String nuevRonda=teclado.nextLine();
                  
                    partido= new PartidosPlayOffs(nuevRonda, nuevLocal, nuevVisitante, nuevfecha);
                    break;
                    
                case "3":
                    System.out.println("Ingrese los puntos del equipo local:");
                    int puntosLocal=teclado.nextInt();
                    partido.añadirPunLocal(puntosLocal);
                    System.out.println("Ingrese los puntos para el equipo visitante:");
                    int puntosVisitantes=teclado.nextInt();
                    teclado.nextLine();
                    partido.añadirPunVisitante(puntosVisitantes);
                    System.out.println("Se añadieron correctamente los puntos");
                    break;
                    
                case "4":
                        System.out.println("Se finalizo el partido");
                        partido.finalizarParti();
                        break;
                        
                        
                case "5":
                    System.out.println("ver partido");
                    System.out.println(partido.obtenerInformacion());
                    break;
                        
                case "6":
                    System.out.println("Se finalizo el programa");
                    buclePrincipal=false;
                    break;
                    
                    
            }
        }
    }
    
}
