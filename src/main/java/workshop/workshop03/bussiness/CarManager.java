package workshop.workshop03.bussiness;

import workshop.workshop03.core.logging.Logger;
import workshop.workshop03.dataAccess.CarDao;
import workshop.workshop03.entities.Car;

public class CarManager {
    private CarDao carDao;
    private Logger[] loggers;

    public CarManager(CarDao carDao, Logger[] loggers ) {
        this.carDao = carDao;
        this.loggers=loggers;
    }


    public void add(Car car) throws Exception {

        if (car.getTotalKm() < 150000 && car.getModelYear()> 2017){
            System.out.println("Aracin Km 90000'den buyuk ve model yili 2017'den kucuk."); ;
        }
        carDao.add(car);

        for(Logger logger: loggers){
            logger.log(car.getName());
        }
    }
    public void delete(Car car) throws Exception{
        if(car.getModelYear() < 2010 && car.getTotalKm()>150000){
            throw new Exception("Bu ozelliklerdeki araclar kabul edilemez.");
        }
        carDao.delete(car);
        for(Logger logger: loggers){
            logger.log(car.getName());
        }


    }
}
