import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("Easter Road");
        person = new Person();

    }

    @Test
    public void  checkQueueIsEmpty(){
        assertEquals(0,busStop.passengerCount());
    }

    @Test
    public void  canAddPersonToQueue(){
        busStop.addPerson(person);
        assertEquals(1,busStop.passengerCount());
    }

    @Test
    public void canRemoveAPersonFromQueue(){
        busStop.addPerson(person);
        busStop.removePerson();
        assertEquals(0,busStop.passengerCount());

    }
}
