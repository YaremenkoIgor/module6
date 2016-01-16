
public class CarException extends Exception {

    String value = "";

    int fuel = 0;

    public CarException( String value) {
        this.value = value;
    }

    public CarException( int fuel) {
        this.fuel = fuel;
    }



    public int getFuel() {
        return fuel;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "CarException{" +
                "value='" + value + '\'' +
                ", fuel=" + fuel +
                '}';
    }
}
