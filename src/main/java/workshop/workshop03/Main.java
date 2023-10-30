package workshop.workshop03;

import workshop.workshop03.bussiness.CarManager;
import workshop.workshop03.core.logging.DatabaseLogger;
import workshop.workshop03.core.logging.FileLogger;
import workshop.workshop03.core.logging.Logger;
import workshop.workshop03.core.logging.MailLogger;
import workshop.workshop03.dataAccess.HibernateCarDao;
import workshop.workshop03.dataAccess.JdbcCarDao;
import workshop.workshop03.entities.Car;

public class Main {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car(1, "Ford", "Fiesta", "Grey", 30000, 2022, 850.000);
        Car car2 = new Car(2, "Fiat", "Egea", "White", 16000, 2021, 680.000);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        CarManager carManager = new CarManager(new HibernateCarDao(), loggers);
        carManager.add(car1);
        carManager.delete(car2);

    }
    }
