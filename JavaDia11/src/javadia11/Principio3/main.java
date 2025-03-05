
package javadia11.Principio3;


public class main {
    public static void main(String[] args) {
        // TODO code application logic here
        Adulto adulto = new Adulto("pedro", "perez", "12345678A", "4050-5090");
        Niño niño = new Niño("ana", "sanchez", adulto);
        niño.getTutor().pagar();
        
    }
    
}
