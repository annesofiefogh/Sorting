import java.util.Arrays;

public class PersonSorter {

    public void start(){

        //Opret et array af Person objekter, med tre Persons i

        Person[] arr = new Person[3];
        arr[0] = new Person("Finn", "Fiddle");
        arr[1] = new Person("Donny", "Danger");
        arr[2] = new Person("Lizzy", "Large");

        System.out.println("Før sortering: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Efter sortering: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        PersonSorter app = new PersonSorter();
        app.start();
    }

}
