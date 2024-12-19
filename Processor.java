package Room;

import java.util.*;

public class Processor {

    public static void main(String[] args) {
        RoomList roomList = new RoomList();
        Scanner sc = new Scanner(System.in);

        System.out.println("====Menu====");
        System.out.println("1.Add a new meeting room"
                + "\n2.Add a new bedroom"
                + "\n3.Update Roomby id"
                + "\n4.Delete Roomby id"
                + "\n5.Find Room by id"
                + "\n6.Display all Rooms"
                + "\n7.Find the most expensive Room"
                + "\n8.Count the total number of meeting room and bedroom"
                + "\n9. Exit");

        while (true) {
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    MeetingRoom meetingRoom = new MeetingRoom(0, "", "", 0, new Date(), new Date());
                    meetingRoom.enterRoomInfo();
                    roomList.addRoom(meetingRoom);
                    break;
                case 2:
                    BedRoom bedRoom = new BedRoom(0, "", "", 0, new Date(), new Date());
                    bedRoom.enterRoomInfo();
                    roomList.addRoom(bedRoom);
                    break;
                case 3:
                    System.out.println("Enter ID to update: ");
                    String idToUpdate = sc.next();
                    roomList.updateRoomById(idToUpdate);
                    break;
                case 4:
                    System.out.println("Enter ID to delete: ");
                    String idToDelete = sc.next();
                    roomList.deleteRoomById(idToDelete);
                    break;
                case 5:
                    sc.nextLine();
                    System.out.println("Enter ID to find: ");
                    String idToFind = sc.nextLine();
                    roomList.findRoomById(idToFind);
                    break;
                case 6:
                    System.out.println("======");
                    roomList.displayAllRoom();
                    break;
                case 7:
                    System.out.println("Most Expensive Room: ");
                    roomList.findMostExpensiveRoom();
                    break;
                case 8:
                    roomList.countRoom();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}
