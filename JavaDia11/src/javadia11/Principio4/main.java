package javadia11.Principio4;

public class main {
    
    // Principio de segregación de interfaz
    
    
    /*
    interface Impresora {

        public abstract void imprimirDocumento();

        public abstract void imprimirFoto();

        public abstract void imprimirContrato();
    }

    class ImpresoraLaser implements Impresora {

        @Override
        public void imprimirDocumento() {
            // Lógica para imprimir un documento en una impresora láser 
        }

        @Override
        public void imprimirFoto() {
            // No aplicable para una empresora láser, implementación vacia 
        }

        @Override
        public void imprimirContrato() {
            // No aplicable para una empresora láser, implementación vacia 

        }

    }

    class ImpresoraInyeccionTinta implements Impresora {

        @Override
        public void imprimirDocumento() {
            // Lógica para imprimir un documento en una impresora de inyeccion de tinta 
        }

        @Override
        public void imprimirFoto() {
            // Lógica para imprimir una foto en una impresora de inyección de tinta 
        }

        @Override
        public void imprimirContrato() {
            // No aplicable para una empresora de inyeccion de tinta, implementación vacia 
        }
    }
    */

    //============================================================================
    interface ImpresoraDocumento {

        public abstract void imprimirDocumento();
    }

    interface ImpresoraFoto {

        public abstract void imprimirFoto();
    }

    class ImpresoraLaser implements ImpresoraDocumento {

        @Override
        public void imprimirDocumento() {
            // Lógica para imprimir un documento en una impresora láser 
        }
    }

    class ImpresoraInyeccionTinta implements ImpresoraDocumento, ImpresoraFoto {

        @Override
        public void imprimirDocumento() {
            // Lógica para imprimir un documento en una impresora de inyeccion de tinta 
        }

        @Override
        public void imprimirFoto() {
            // Lógica para imprimir una foto en una impresora de inyección de tinta 
        }

    }

}
