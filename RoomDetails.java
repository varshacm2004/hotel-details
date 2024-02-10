class Room {
    private int roomId;
    private int floor;

    public Room(int roomId, int floor) {
        this.roomId = roomId;
        this.floor = floor;
    }

    public int getRoomId() {
        return roomId;
    }

    public int getFloor() {
        return floor;
    }
}

public class RoomDetails {
    public static void main(String[] args) {
        // Creating room objects
        Room room1 = new Room(101, 1);
        Room room2 = new Room(102, 1);
        Room room3 = new Room(201, 2);

        // Displaying room details
        System.out.println("Room 1 Details:");
        System.out.println("Room ID: " + room1.getRoomId());
        System.out.println("Floor: " + room1.getFloor());
        System.out.println();

        System.out.println("Room 2 Details:");
        System.out.println("Room ID: " + room2.getRoomId());
        System.out.println("Floor: " + room2.getFloor());
        System.out.println();

        System.out.println("Room 3 Details:");
        System.out.println("Room ID: " + room3.getRoomId());
        System.out.println("Floor: " + room3.getFloor());
    }
}