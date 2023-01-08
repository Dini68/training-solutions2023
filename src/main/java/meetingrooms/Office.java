package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private final List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(String name,
                               int width, int length) {
        meetingRooms.add(new MeetingRoom(name, width, length));
    }

    public List<MeetingRoom> getMeetingRooms() {
        return meetingRooms;
    }

    public List<MeetingRoom> getMeetingRoomsInReverseOrder() {
        List<MeetingRoom> meetingRoomsInReverseOrder = new ArrayList<>();
        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            meetingRoomsInReverseOrder.add(meetingRooms.get(i));
        }
        return meetingRoomsInReverseOrder;
    }


    public List<MeetingRoom> getEverySecondMeetingRoom() {
        List<MeetingRoom> filtered = new ArrayList<>();
        for (int i = 1; i < meetingRooms.size(); i += 2) {
            filtered.add(meetingRooms.get(i));
        }
        return filtered;
    }

    public MeetingRoom getMeetingRoomWithGivenName(String name) {
        MeetingRoom result = null;
        for (MeetingRoom item : meetingRooms) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return result;
    }

    public List<MeetingRoom> getMeetingRoomsWithGivenNamePart(String partName) {
        List<MeetingRoom> filtered = new ArrayList<>();
        for (MeetingRoom item : meetingRooms) {
            if (item.getName().toLowerCase().contains(
                    partName.toLowerCase())) {
                filtered.add(item);
            }
        }
        return filtered;
    }

    public List<MeetingRoom> getMeetingRoomsWithAreaLargerThan(int area) {
        List<MeetingRoom> filtered = new ArrayList<>();
        for (MeetingRoom item : meetingRooms) {
            if (item.getArea() > area) {
                filtered.add(item);
            }
        }
        return filtered;
    }

}

