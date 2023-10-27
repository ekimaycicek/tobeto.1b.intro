package workshop.workshop02.oopWithNLayeredApp;

import workshop.workshop02.oopWithNLayeredApp.business.ProductManager;
import workshop.workshop02.oopWithNLayeredApp.core.logging.DatabaseLogger;
import workshop.workshop02.oopWithNLayeredApp.core.logging.FileLogger;
import workshop.workshop02.oopWithNLayeredApp.core.logging.Logger;
import workshop.workshop02.oopWithNLayeredApp.core.logging.MailLogger;
import workshop.workshop02.oopWithNLayeredApp.dataAccess.HibernateProductDao;
import workshop.workshop02.oopWithNLayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1=new Product(1,"Iphone Xr",10000);
        Logger[] loggers={new DatabaseLogger(),new FileLogger(),new MailLogger()};

        ProductManager productManager= new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);


    }
}
