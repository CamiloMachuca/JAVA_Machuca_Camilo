
package java_punto5;


public class Ioad {
    
    public interface crear{
        void Insert(Object entity);
        void Update(Object id, Object entity);
        void Delete(Object id);
    }
    
    public interface mostrar{
        Object[] GetAll();
        Object GetById(Object id);
    }
    
    public abstract class  FacturaOadDatosReadOnly implements crear{
         public Object[] GetAll() {
        // Obtener todas las facturas
            return null;
        }
        public Object GetById(Object id) {
            // Obtener factura por ID
            return null;
        }
        
    }
    
    
    
}
