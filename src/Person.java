public class Person implements Comparable {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return firstName + " " + lastName;
    }

    public int compareTo(Object other) {
        //returner -1 hvis vores person kommer FØR andenPerson
        Person andenPerson = (Person) other;

        String voresFornavn = firstName;
        String andetFornavn = andenPerson.firstName;
        if(voresFornavn.compareTo(andetFornavn) <= 0){
        return -1;
        } else {
            return 1;
        }
    }
}
