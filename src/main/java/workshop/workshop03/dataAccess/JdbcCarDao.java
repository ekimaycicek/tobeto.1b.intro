package workshop.workshop03.dataAccess;

import workshop.workshop03.entities.Car;

public class JdbcCarDao  implements CarDao{
    @Override
    public void add(Car car) {
        System.out.println("Jdbc ile "+ car.getName() + " eklendi.");
    }

    @Override
    public void delete(Car car) {
        System.out.println("Jdbc ile "+ car.getName() + " silindi.");
    }

}
