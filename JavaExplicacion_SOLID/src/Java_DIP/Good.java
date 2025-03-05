
package Java_DIP;


public class Good {
    // Las clases deben depender de abstracciones en lugar de depender directamente en clases concretas
    interface Database{
        void connect();
    }
    
    class MySQLDatabase implements Database{
        public void connect(){
            System.out.println("Conectando a MySQL");
        }
    }
    
    class PostgreSQLDatabase implements Database{
        public void connect(){
            System.out.println("Contando a PostgreSql");
        }
    }
    
    class DataManager{
        private Database database= new PostgreSQLDatabase();
        
        public DataManager(Database database){
            this.database=database;
        }
        
        public void connect(){
            database.connect();
        }
    }
    
}
