public class Student {

    final String DATE_OF_BIRTH = "09/09/2000";

    public String firstname;
    String lastname;
    int age;
    boolean present;

    public void showStudentName() {
        this.firstname = "jones";
        System.out.println(String.format("%s %s ", firstname, lastname));
    }


   /* @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", present=" + present +
                '}';
    }*/
}
