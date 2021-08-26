import java.util.*;

public class AddingWords {

   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in); 
   
      HashMap<String, Integer> wordToInt = new HashMap<String, Integer>();
      HashMap<Integer, String> intToWord = new HashMap<Integer, String>();
      
      
      while (in.hasNext()) {
         String[] command = in.nextLine().split(" ");
         if (command[0].equals("clear")) {
            wordToInt.clear();
            intToWord.clear();
         } else if (command[0].equals("def")) {
            //System.out.println(in.nextLine());
            int value = Integer.parseInt(command[2]);
            if (wordToInt.containsKey(command[1])) {
               intToWord.remove(wordToInt.get(command[1]));
               wordToInt.remove(command[1]);
            }
            intToWord.put(value, command[1]);
            wordToInt.put(command[1], value);
         } else if (command[0].equals("calc")) {
            int total = 0;
            boolean unknown = false;
            if (wordToInt.containsKey(command[1])) {
               total = wordToInt.get(command[1]);
            }
            else {
               unknown = true;
            }
            for (int i = 2; i < command.length - 2; i+= 2) {
               if (wordToInt.containsKey(command[i + 1])) {
                  if (command[i].equals("-")) {
                     total -= wordToInt.get(command[i+1]);
                  }
                  else {
                     total += wordToInt.get(command[i+1]);
                  }
               }
               else {
                  unknown = true;
               }
            }
            for (int b = 1; b < command.length; b++){
               System.out.print(command[b] + " ");
            }
            if (intToWord.containsKey(total)) {
               if (unknown) {
                  System.out.println("unknown");
               }
               else {
                  System.out.println(intToWord.get(total));
               }
            }
            else {
               System.out.println("unknown");
            }
         }
      }
   }
}