public class Person {
    protected String myName;
    protected int myAge;
    protected String myGender;

    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    // Getter methods

    public String getMyName() {
        return myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public String getMyGender() {
        return myGender;
    }

    // Setter methods


    public void setMyName(String myName) {
        this.myName = myName;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }

    @Override
    public String toString() {
        return "Name: '" + myName + '\'' +
                ", myAge: " + myAge +
                ", myGender: '" + myGender + '\'';
    }
}
