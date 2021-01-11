public class RoomOccupation {
    public static void main(String[] args) {

        // Room 1
        Room r1 = new Room();
        r1.roomNumber = 111;
        char[] occupation = {'O','C','C','U','P','I','E','D'};
        r1.occupation = occupation;

        // Room 2
        Room r2 = new Room();
        r2.roomNumber = 112;
        char[] occupation2 = {'O','C','C','U','P','I','E','D'};
        r2.occupation = occupation2;

        // Room 3
        Room r3 = new Room();
        r3.roomNumber = 113;
        char[] occupation3 = {'F','R','E','E'};
        r3.occupation = occupation3;

        // Room 4
        Room r4 = new Room();
        r4.roomNumber = 121;
        char[] occupation4 = {'O','C','C','U','P','I','E','D'};
        r4.occupation = occupation4;

        // Room 5
        Room r5 = new Room();
        r5.roomNumber = 122;
        char[] occupation5 = {'F','R','E','E'};
        r5.occupation = occupation5;

        // Room 6
        Room r6 = new Room();
        r6.roomNumber = 131;
        char[] occupation6 = {'F','R','E','E'};
        r6.occupation = occupation6;

        Room[] rooms = new Room[6];
        rooms[0] = r1;
        rooms[1] = r2;
        rooms[2] = r3;
        rooms[3] = r4;
        rooms[4] = r5;
        rooms[5] = r6;

        for (Room room : rooms){
            System.out.println("Room no.: "+room.roomNumber);
            System.out.print("Status: ");
            for (char  c : room.occupation){
                System.out.print(c);
            }
            System.out.println();
            System.out.println();
        }
    }
}
