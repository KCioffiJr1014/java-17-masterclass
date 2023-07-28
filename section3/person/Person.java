package section3.person;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public void setAge(int number) {
        if ( (number > 100) || (number < 0) ) {
            this.age = 0;
        } else {
            this.age = number;
        }
    }

    public boolean isTeen() {
        if (this.age > 12 && this.age < 20) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {
        if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return "";
        }
        if (this.lastName.isEmpty()) {
            return this.firstName;
        }
        if (this.firstName.isEmpty()) {
            return this.lastName;
        }
        return this.firstName + " " + this.lastName;
    }
}
