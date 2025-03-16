public class Student extends Person{
    protected String myIdNum;
    protected double myGPA;

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        myIdNum = idNum;
        myGPA =gpa;
    }

    //Getter Methods

    public String getMyIdNum() {
        return myIdNum;
    }

    public double getMyGPA() {
        return myGPA;
    }

    //Setter Methods


    public void setMyIdNum(String myIdNum) {
        this.myIdNum = myIdNum;
    }

    public void setMyGPA(double myGPA) {
        this.myGPA = myGPA;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Student ID: '" + myIdNum + '\'' +
                ", GPA: " + myGPA;
    }
}
