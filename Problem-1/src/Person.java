class Person {
    protected String myName;
    protected int myAge;
    protected String myGender;

    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    // Getter methods

    public String getName() {
        return myName;
    }

    public int getAge() {
        return myAge;
    }

    public String getGender() {
        return myGender;
    }

    // Setter methods


    public void setName(String name) {
        this.myName = myName;
    }

    public void setAge(int age) {
        this.myAge = myAge;
    }

    public void setGender(String gender) {
        this.myGender = myGender;
    }

    @Override
    public String toString() {
        return "Name: '" + myName + '\'' +
                ", Age: " + myAge +
                ", Gender: '" + myGender + '\'';
    }
}
