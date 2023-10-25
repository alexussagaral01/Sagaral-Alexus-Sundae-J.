import java.util.Scanner;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String birthday;
    private String address;

  
    public Person(String firstName, String middleName, String lastName, int age, String birthday, String address) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.birthday = birthday;
        this.address = address;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

 
        Person p = new Person("Alexus Sundae", "Jamilo", "Sagaral", 21, "11/08/2001", "Andres Abellana Guadalupe Cebu City");

        String firstName = p.getFirstName();
        System.out.println("First Name: " + firstName);

        String middleName = p.getMiddleName();
        System.out.println("Middle Name: " + middleName);

        String lastName = p.getLastName();
        System.out.println("Last Name: " + lastName);

        int age = p.getAge();
        System.out.println("Age: " + age);

        String birthday = p.getBirthday();
        System.out.println("Birthday: " + birthday);

        String address = p.getAddress();
        System.out.println("Address: " + address);
    }
}
