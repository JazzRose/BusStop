import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("St Andrews",30);
        person = new Person();
        busStop = new BusStop("Easter Road");
        busStop.addPerson(person);

    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0,bus.busCount());
    }

    @Test
    public void addPassenger(){
        bus.pickUp(busStop);
        assertEquals(1,bus.busCount());
    }

    @Test
    public void addTooManyPassengers(){
        Bus tinyBus = new Bus("My House", 2);
        tinyBus.pickUp(busStop);
        tinyBus.pickUp(busStop);
        tinyBus.pickUp(busStop);
        tinyBus.pickUp(busStop);
        assertEquals(2, tinyBus.busCount());
    }

    @Test public void removePassengerFromBus(){
        bus.pickUp(busStop);
        bus.pickUp(busStop);
        bus.remove();
        assertEquals(1,bus.busCount());
    }

    @Test public void pickUpFromStopAddToBus(){
        BusStop dukeStreet = new BusStop("Duke Street");
        dukeStreet.addPerson(person);
        dukeStreet.addPerson(person);
        bus.pickUp(dukeStreet);
        assertEquals(1,bus.busCount());
        assertEquals(1,dukeStreet.passengerCount());

    }
}
