package meetingrooms;

public class MeetingRoom {

    private final String name;
    private final int width;
    private final int length;

    public MeetingRoom(String name, int width, int length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }

    public int getArea() {
        return width * length;
    }

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

}
