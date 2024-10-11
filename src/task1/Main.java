package task1;

import task1.model.Tigress;
import task1.util.EventProducer;

public class Main {
    public static void main(String[] args) {
        Tigress tigress = new Tigress();
        EventProducer eventProducer = new EventProducer();
        eventProducer.activateEvent(tigress);
    }
}
