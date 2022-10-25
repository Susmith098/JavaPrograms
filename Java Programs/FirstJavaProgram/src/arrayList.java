import java.util.*;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l2.add(12);
        l2.add(18);
        l2.add(16);

        l1.add(6);
        l1.add(2);
        l1.add(4);
        l1.add(7);
        l1.add(9);

        l1.addAll(l2);

        System.out.println(l1.contains(7));
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(7));
        System.out.println(l1.isEmpty());
        System.out.println(l1.lastIndexOf(l1));
        System.out.println(l1.remove(2));

        for (int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
