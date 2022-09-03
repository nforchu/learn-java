public class Student {

    String firstname;
    String lastname;
    int age;
    boolean present;

    public float calculateScore() {
         Calculator calculator = new Calculator();
         return 0.0F;
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", present=" + present +
                '}';
    }
}
