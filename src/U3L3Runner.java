import java.util.Scanner;

public class U3L3Runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("You are on an island surrounded by water.\nThere is a path to the woods to the north, the sea to the south, and a beach shack to the east. \nWhich way do you want to go (n,e,s,w)?");
        String command = scan.nextLine();

        if (command.equals("n")) {
            System.out.println("You enter the forest and hear some rustling.\nThere may be tigers here or maybe it's just monkeys. What do you do (stay,forward)?");
            Scanner scan1 = new Scanner(System.in);
            String command2 = scan1.nextLine();

            if (command2.equals("stay")) {
                System.out.println("You decide to stay in the jungle. A group of tigers decide that you are their next meal.\nGame Over.");
            } else if (command2.equals("forward")) {
                System.out.println("You decide to travel further into the jungle. You find a friendly hermit who you befriend.\nGame Over.");
            }
        }
        else if (command.equals("e")) {
            System.out.println("You enter an abandoned mineshaft.\nIn the dimly lit hall, you see a singular path leading into the darkness. What do you do (leave,forward)?");
            Scanner scan1 = new Scanner(System.in);
            String command2 = scan1.nextLine();

            if (command2.equals("leave")) {
                System.out.println("You decide to leave the mineshaft. You stay outside of the mineshaft for the night.\nGame Over.");
            } else if (command2.equals("forward")) {
                System.out.println("You decide to travel down the hall. You find a chest, inside of which is a device that will summon a ship to bring you home.\nGame Over.");
            }
        }
        else if (command.equals("s")) {
            System.out.println("You enter a beach and walk down to the shore.\nBeyond the shore, there is nothing but water as far as the eye can see. What do you do (stay,back)?");
            Scanner scan1 = new Scanner(System.in);
            String command2 = scan1.nextLine();

            if (command2.equals("stay")) {
                System.out.println("You decide to stay on the beach. You watch the sunset over the endless sea.\nGame Over.");
            } else if (command2.equals("back")) {
                System.out.println("You decide to travel back towards the island's center. You get ambushed by a group of bandits.\nGame Over.");
            }
        }
        else if (command.equals("w")) {
            System.out.println("You enter an empty meadow.\nIn the center, you see a golden sword and a red sword stuck in a tree trunk. What do you do (pull golden,pull red)?");
            Scanner scan1 = new Scanner(System.in);
            String command2 = scan1.nextLine();

            if (command2.equals("pull golden")) {
                System.out.println("You decide to pull on the golden sword. The sword chooses you to be its wielder and a beam of light teleports you to a golden city.\nGame Over.");
            } else if (command2.equals("pull red")) {
                System.out.println("You decide to pull on the red sword. The sword chooses you as its wielder and you feel a sinister presence behind you.\nGame Over.");
            }
        }
        else {
            System.out.println("You can't move in that direction.");
        }
    }
}
