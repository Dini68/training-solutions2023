package conventions;

public class Car {

    private String carType;
    private String engineType;
    private int doors;
    private int persons;

    public Car(String carType, String engineType,
               int doors, int persons) {
        this.carType = carType;
        this.engineType = engineType;
        this.doors = doors;
        this.persons = persons;
    }

    public String getInfo() {
        return carType + " " + engineType + ", " +
                doors + " ajtós, " + persons + " személyes";
    }

    public String getEngineType() {
        return engineType;
    }

    public String getCarType() {
        return carType;
    }

    public int getDoors() {
        return doors;
    }

    public int getPersons() {
        return persons;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setPersonS(int persons) {
        this.persons = persons;
    }

    public void addModelName(String modelName) {
        this.carType = carType + " " + modelName;
    }
}

