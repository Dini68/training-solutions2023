package enumtype.university;

public enum University {

    BME("Budapesti Műszaki Egyetem"),
    ELTE("Eötvös Lóránd Tudományegyetem");

    private String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
