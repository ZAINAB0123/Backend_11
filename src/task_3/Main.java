package task_3;

import task_3.model.Tigress;
import task_3.util.EventProducer;

public class Main {
    public static void main(String[] args) {
        Tigress tigress = new Tigress();
        EventProducer eventProducer = new EventProducer();
        eventProducer.activateEvent(tigress);
    }
}
