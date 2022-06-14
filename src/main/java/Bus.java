import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList <Person> passengers;

    public Bus (String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int busCount() {
        return this.passengers.size();
    }

    public void pickUp(BusStop busStop) {
        if (this.passengers.size()<this.capacity){
        Person person = busStop.removePerson();
        this.passengers.add(person);
        }
    }

    public Person remove() {
        return this.passengers.remove(0);
    }
}
