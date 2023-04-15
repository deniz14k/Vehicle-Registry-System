package isp.lab6.exercise2;
import org.junit.Test;
import java.util.HashSet;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;


public class TestExercise2 {

    //CarInfo carinfo;
    Registry vehicles=new Registry();
    HashSet<CarInfo> registry=new HashSet<CarInfo>();

@Test

    public void addVehicleTestForExistingVIN(){

        //CarInfo carinfo=new CarInfo(1,"MS21DNZ","BMW","320d",2013);
    vehicles.addVehicleWithParameters(1,"MS21DNZ","BMW","320d",2013,registry);
    vehicles.addVehicleWithParameters(1,"CJ33LLL","FORD","TRANSIT",2016,registry);

    int expected=1;             // nu ar trebuii sa il bage pe al doilea ca are acelasi VIN
    int actual=registry.size();
    assertEquals(expected,actual);

}

    @Test

    public void RemoveVehicleTest(){

        //CarInfo carinfo=new CarInfo(1,"MS21DNZ","BMW","320d",2013);
        vehicles.addVehicleWithParameters(1,"MS21DNZ","BMW","320d",2013,registry);
        vehicles.addVehicleWithParameters(2,"CJ33LLL","FORD","TRANSIT",2016,registry);
        vehicles.removeVehicleWithParameters(2,registry);
        int expected=1;             // ar trebuii sa fie 1 pt ca am sters al doilea vehicul
        int actual=registry.size();
        assertEquals(expected,actual);

    }

    @Test

    public void CheckVehicleTest(){
        boolean found=false;
        //CarInfo carinfo=new CarInfo(1,"MS21DNZ","BMW","320d",2013);
        vehicles.addVehicleWithParameters(1,"MS21DNZ","BMW","320d",2013,registry);
        vehicles.addVehicleWithParameters(2,"CJ33LLL","FORD","TRANSIT",2016,registry);
        boolean expected=true;
        boolean actual=vehicles.checkVehicleWithParameters(1,registry,found);
        assertEquals(expected,actual);

    }




}
