package Lab8.Ex4;

public class TemperatureEvent extends Event{
    private int value;

    TemperatureEvent(int value) {
        super(EventType.TEMPERATURE, value);
        this.value = value;
    }

    int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "TemperatureEvent{" + "value=" + value + '}';
    }

}
