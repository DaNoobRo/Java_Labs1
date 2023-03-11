package Lab8.Ex4;


public class NoEvent extends Event{
    NoEvent() {
        super(EventType.NONE);
    }

    @Override
    public String toString() {
        return "NoEvent{}";
    }
}
