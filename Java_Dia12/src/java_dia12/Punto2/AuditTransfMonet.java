
package java_dia12.Punto2;


public class AuditTransfMonet{
    
    private  notificacionnn notificador;

    public AuditTransfMonet(notificacionnn notificador) {
        this.notificador = notificador;
    }
    public void transferenciaRealizada(Transferencia transferencia){
        if(this.esTransferenciaImportante(transferencia)){
            notificador.enviarNotificacion(transferencia);
        }
        
    }
     private boolean esTransferenciaImportante(Transferencia transferencia) {
       return transferencia.importe()>50000;
    }
    
    
}
