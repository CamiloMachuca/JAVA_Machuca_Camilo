package javadia11.Principio5;

public class main {
    
    // Principio de inversion de dependencia

    public interface CanalNotificacion {

        void enviarNotificacion(String mensaje);
    }

    static class Email implements CanalNotificacion {

        @Override
        public void enviarNotificacion(String mensaje) {
            // Lógica para enviar notificación por correo electrónico 
            System.out.println(mensaje);
        }
    }

    static class SMS implements CanalNotificacion {

        @Override
        public void enviarNotificacion(String mensaje) {
            // Lógica para enviar notificación por SMS 
            System.out.println(mensaje);
        }
    }

    // =========================================
    static public class Usuario {

        private CanalNotificacion canal;

        public Usuario(CanalNotificacion canal) {
            this.canal = canal;
        }

        public void enviarNotificacion(String mensaje) {
            canal.enviarNotificacion(mensaje);
        }
    }
    
    public static void main(String [] args){
        CanalNotificacion email =new Email();
        Usuario usuario=new Usuario(email);
        usuario.enviarNotificacion("notificacion por email");
        
        CanalNotificacion sms=new SMS();
        Usuario usuario2=new Usuario(sms);
        usuario2.enviarNotificacion("notificacion por sms");
    }
}
