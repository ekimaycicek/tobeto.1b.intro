package workshop.workshop02.oopWithNLayeredApp.dataAccess;


import workshop.workshop02.oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
    public void add(Product product){

        System.out.println("JDBC ile veritabanina eklendi.");
    }
}
