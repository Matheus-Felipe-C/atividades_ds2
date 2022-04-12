import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    List<Integer> list1 = Arrays.asList(1,3,5,7,9,11,13,15,17,19);
    List<Integer> list2 = Arrays.asList(2,4,6,8,10,12,14,16,18,20);
    List<Integer> list3 = Arrays.asList(21,22,23,24,25,26,27,28,29,30);
    List<Integer> finalList = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      finalList.add(list1.get(i));
      finalList.add(list2.get(i));
      finalList.add(list3.get(i));
    }
    System.out.println(finalList.toString());
  }
}