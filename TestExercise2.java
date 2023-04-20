package isp.lab6.exercise2;
import org.junit.Test;
import java.util.HashSet;
import static org.junit.Assert.assertEquals;


public class TestExercise2 {

    CarInfo vehicle;
    Registry vehicles=new Registry();
    HashSet<CarInfo> registry=new HashSet<CarInfo>();

@Test

    public void addVehicleTestForExistingVIN(){
    vehicles.addVehicle(1,"MS21DNZ","BMW","320d",2013,registry);
    vehicles.addVehicle(1,"CJ33LLL","FORD","TRANSIT",2016,registry);
    int expected=1;             // nu ar trebuii sa il bage pe al doilea ca are acelasi VIN
    int actual=registry.size();
    assertEquals(expected,actual);

}

    @Test

    public void VehiclesWithSameVinTest(){
        vehicles.addVehicle(1,"MS21DNZ","BMW","320d",2013,registry);
        vehicles.addVehicle(1,"CJ33LLL","FORD","TRANSIT",2016,registry);
        CarInfo vehicle= vehicles.getVehicle(1,registry);
        assertEquals(vehicle.getMake(),"BMW");
        assertEquals(vehicle.getModel(),"320d");
        assertEquals(vehicle.getYear(),2013);
        assertEquals(vehicle.getLicensePlate(),"MS21DNZ");
    }



    @Test

    public void RemoveVehicleTest(){

        vehicles.addVehicle(1,"MS21DNZ","BMW","320d",2013,registry);
        vehicles.addVehicle(2,"CJ33LLL","FORD","TRANSIT",2016,registry);
        vehicles.removeVehicle(2,registry);
        int expected=1;             // ar trebuii sa fie 1 pt ca am sters al doilea vehicul
        int actual=registry.size();
        assertEquals(expected,actual);

    }

    @Test

    public void CheckVehicleTest(){

        vehicles.addVehicle(1,"MS21DNZ","BMW","320d",2013,registry);
        vehicles.addVehicle(2,"CJ33LLL","FORD","TRANSIT",2016,registry);
        boolean expected=true;
        boolean actual=vehicles.checkVehicle(1,registry);
        assertEquals(expected,actual);

    }




}
