package repeatedCharCoounter;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Main {
  public static void main(String[] args) {

    String text = "Ala is student. Ala is an intern.";
    String word = "Ala";
    Integer count = RepeatedCharCoounter(text, word);

    System.out.println("Number of occurence of " + word +  " is: " + count);

  }

  public static Integer RepeatedCharCoounter(String text, String word) {
    List<String> list = Arrays.asList(text.split(" "));
    Integer occ = Collections.frequency(list, word);
    return occ;
  }
}