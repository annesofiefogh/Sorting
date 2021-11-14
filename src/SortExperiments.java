import java.util.Arrays;

public class SortExperiments {


    public void sort1() {
        int [] tal = {6,2,8,1,9,21,0,3};

        System.out.println("Før sortering: " + Arrays.toString(tal));
        Arrays.sort(tal);
        System.out.println("Efter sortering: " + Arrays.toString(tal));
    }

    public void sort2() {
        String[] ord = {"Bonde", "gård", "abe", "kat", "hund", "ko", "And" };

        System.out.println("Før sortering: " + Arrays.toString(ord));
        Arrays.sort(ord);
        System.out.println("Efter sortering: " + Arrays.toString(ord));
    }

    public void sort3() {
        int[] liste = {8, 5, 2, 7, 9, 2, 1, 0, 3};

        System.out.println("Unsorted: " + Arrays.toString(liste));
        QuickSortInteger.sort(liste);
        System.out.println("Sorted: " + Arrays.toString(liste));
    }

    public void sort4() {
        String[] words = {"bonde", "gård", "abe", "kat", "hund", "ko", "and" };

        System.out.println("Unsorted words " + Arrays.toString(words));
        QuickSortString.sort(words);
        System.out.println("Sorted words " + Arrays.toString(words));
    }

    public static void main(String[] args) {
        SortExperiments app = new SortExperiments();
        app.sort2();
    }
}
