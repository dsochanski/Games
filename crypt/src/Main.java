import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by tadeuszx on 3/30/2018.
 */
public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Warrior warrior = new Warrior("Conan", 100, 20, 15);
        Goblin goblin = new Goblin("Goblin Warrior", 50, 8, 5);


        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You are standing in front of a CRYPT... enter and begin your adventure"));
        locations.put(1, new Location(1, "You Enter the crypt your journey starts here, get ritch or die trying..."));
        locations.put(2, new Location(2, "You are in next room nr 2"));
        locations.put(3, new Location(3, "You are in next room nr 3 you can go to lover level of the Crypt"));
        locations.put(4, new Location(4, "You are in next room nr 4"));
        locations.put(5, new Location(5, "You are in next room nr 5"));
        locations.put(6, new Location(6, "You are in next room nr 6"));
        locations.put(7, new Location(7, "You are in next room nr 7 the second level of the crypt find dragon"));
        locations.put(8, new Location(8, "You are in next room nr 8"));
        locations.put(9, new Location(9, "You are in next room nr 9"));
        locations.put(10, new Location(10, "You are in next room nr 10"));
        locations.put(11, new Location(11, "You are in next room nr 11"));
        locations.put(12, new Location(12, "You are in next room nr 12"));
        locations.put(13, new Location(13, "You are in the dragon lair, prepare to final FIGHT"));

//I level of the crypt
        locations.get(0).addExit("N", 1);
        locations.get(1).addExit("N", 4);
        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 5);

        locations.get(2).addExit("N", 3);
        locations.get(1).addExit("E", 1);

        locations.get(5).addExit("N", 4);

        locations.get(4).addExit("S", 1);
        locations.get(4).addExit("E", 6);

        locations.get(6).addExit("S", 4);
        locations.get(6).addExit("W", 3);

// Go to level 2
        locations.get(3).addExit("N", 7);

//II level of the crypt " Dragon Lair"
        locations.get(7).addExit("E", 11);
        locations.get(7).addExit("W", 8);
        locations.get(8).addExit("W", 9);
        locations.get(8).addExit("N", 10);
        locations.get(9).addExit("E", 8);
        locations.get(10).addExit("S", 8);
        locations.get(11).addExit("W", 7);
        locations.get(11).addExit("N", 13);
        locations.get(11).addExit("E", 12);
        locations.get(12).addExit("W", 11);


        Map<String, String> vocabulary = new HashMap<String, String>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");


        int loc =0;
        while(true) {
           // System.out.println(locations.get(loc).getExits());


            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println(locations.get(loc).getDescription());
            System.out.println("=======================================================================================");
            System.out.println("Available exits are ");

            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if(direction.length() > 0){
                String[] words = direction.split(" ");
                for(String word: words){
                    if(vocabulary.containsKey(word)){
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }

            if(exits.containsKey(direction)){
                loc = exits.get(direction);
            }else {
                System.out.println("You cannot go in that direction");
            }

            if(loc == 2){
                System.out.println(warrior.getName()+ " meets " + goblin.getName()+" prepare to fight");
                warrior.atack();
            }


        }
    }
}
