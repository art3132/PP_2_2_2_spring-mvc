 package web.dao;

 import org.springframework.stereotype.Repository;
 import web.model.Car;

 import java.util.ArrayList;
 import java.util.List;
 import java.util.stream.Collectors;

 @Repository
 public class CarDaoImpl implements CarDao {

     private static final List<Car> listCars = new ArrayList<>();

     static {
         listCars.add(new Car("Acura","NSX", 2015));
         listCars.add(new Car("BMW", "i8", 2017));
         listCars.add(new Car("Cadillac", "De Ville", 1976));
         listCars.add(new Car("Chevrolet", "Corvette", 2013));
         listCars.add(new Car("Ferrari", "F8", 2019));
     }
     @Override
     public List<Car> getCars(int count) {
         if (count == 0) {
             return listCars;
         }
         return listCars.stream().limit(count).collect(Collectors.toList());
     }
 }
