class CollegeStudent extends Student {
    private String myMajor;
    private int myYear;

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year) {
        super(name, age, gender, idNum, gpa);
        myMajor = major;
        myYear = year;
    }

    // getter methods

    public String getMajor() {
        return myMajor;
    }

    public int getYear() {
        return myYear;
    }

    //setter methods


    public void setMajor(String major) {
        this.myMajor = myMajor;
    }

    public void setYear(int year) {
        this.myYear = year;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", myMajor: '" + myMajor + '\'' +
                ", myYear: " + myYear;
    }
}
