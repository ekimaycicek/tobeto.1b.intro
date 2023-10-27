package workshop.workshop02.oopWithNLayeredApp.business;

import workshop.workshop01.oop.Product;
import workshop.workshop02.oopWithNLayeredApp.core.logging.Logger;
import workshop.workshop02.oopWithNLayeredApp.dataAccess.ProductDao;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao,Logger[] loggers) {
        this.productDao = productDao;
        this.loggers=loggers;
    }

    public void add(Product product) throws Exception {

        if(product.getUnitPrice()<10){
            throw new Exception("Urun fiyati 10'dan kucuk olamaz");

        }

        productDao.add(product);
        for(Logger logger: loggers){
            logger.log(product.getName());
        }

    }
}
