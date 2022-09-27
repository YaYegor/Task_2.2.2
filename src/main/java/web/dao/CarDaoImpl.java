package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{

    private static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Bebramobile", 2021, "Yegor"));
        cars.add(new Car("Coupris Kineema", 1001, "DuBois"));
        cars.add(new Car("AutoVAZ", 7, "Tequila"));
        cars.add(new Car("GAZ Volga", 290, "Kras"));
        cars.add(new Car("Batmobile", 134, "Batman"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return cars;
        }

        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
