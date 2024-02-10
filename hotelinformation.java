import java.util.*;

class Customer {
    private String name;
    private Date dateOfBirth;
    private int roomId;

    public Customer(String name, Date dateOfBirth, int roomId) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.roomId = roomId;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public int getRoomId() {
        return roomId;
    }
}

public class hotelinformation {
    public static void main(String[] args) {
        // Creating customer objects
        Customer customer1 = new Customer("Alice Smith", new Date(1995, 5, 15), 101);
        Customer customer2 = new Customer("Bob Johnson", new Date(1990, 8, 20), 102);

        // Displaying customer details
        System.out.println("Customer 1 Details:");
        System.out.println("Name: " + customer1.getName());
        System.out.println("Date of Birth: " + customer1.getDateOfBirth());
        System.out.println("Room ID: " + customer1.getRoomId());
        System.out.println();

        System.out.println("Customer 2 Details:");
        System.out.println("Name: " + customer2.getName());
        System.out.println("Date of Birth: " + customer2.getDateOfBirth());
        System.out.println("Room ID: " + customer2.getRoomId());
    }
}
