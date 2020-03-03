import java.util.Scanner;
import java.util.TreeMap;

public class Zoo {
   /*
      Maps are value pairs (Data Structure)
      put() : Sets a new key (needs a key and a value)
      remove() : Removes a key (just a key)
      get() : gets the value of a given key
      containsKey() : Checks if a key exists
      size() : 
      Map has 2 values; Key and Value
      In this example, animals are keys, amount of are value
      In java, 2 maps, HashMap and TreeMap
      HashMaps are fast, has behind the scenes math that 
         works around traditional linear scan.
         Constant Time Complexity, all N values have same time.
      TreeMap - Keys in Sorted Order
      O(Log(N)) Time Complexity
   */
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      int listSize = Integer.parseInt(in.nextLine());
      int listCount = 0;
      while (listSize != 0) {
         /* Start of the individual test case. */
         TreeMap<String,Integer> zooMap = new TreeMap<String,Integer>();
         
         for (int i = 0; i < listSize; i++) {
            String input = in.nextLine();
            String[] inputSplit = input.split(" ");
            String animal = inputSplit[inputSplit.length - 1].toLowerCase();
            if (zooMap.containsKey(animal)) {
               int oldValue = zooMap.get(animal);
               zooMap.put(animal, oldValue + 1);
            }
            else {
               zooMap.put(animal, 1);
            }
         }
         listCount++;
         System.out.println("List " + listCount + ":");
         for (String animalType : zooMap.keySet()) {
            System.out.println(animalType + " | " + zooMap.get(animalType));
         }
         listSize = Integer.parseInt(in.nextLine());
      }
   } 
}