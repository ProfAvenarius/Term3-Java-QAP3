class Student extends Person{
    protected String myIdNum;
    protected double myGPA;

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        myIdNum = idNum;
        myGPA =gpa;
    }

    //Getter Methods

    public String getIdNum() {
        return myIdNum;
    }

    public double getGPA() {
        return myGPA;
    }

    //Setter Methods


    public void setIdNum(String idNum) {
        this.myIdNum = myIdNum;
    }

    public void setGPA(double gpa) {
        this.myGPA = myGPA;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Student ID: '" + myIdNum + '\'' +
                ", GPA: " + myGPA + '\''
                ;
    }
}
