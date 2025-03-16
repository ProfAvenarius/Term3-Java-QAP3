
    class Teacher extends Person {
        private String mySubject;
        private double mySalary;

        public Teacher(String name, int age, String gender, String subject, double salary) {
            super(name, age, gender);
            mySubject = subject;
            mySalary = salary;
        }

        // Getter methods


        public String getSubject() {
            return mySubject;
        }

        public double getSalary() {
            return mySalary;
        }

        // Setting methods


        public void setSubject(String subject) {
            this.mySubject = mySubject;
        }

        public void setSalary(double salary) {
            this.mySalary = mySalary;
        }

        @Override
        public String toString() {
            return super.toString() +
                    ", Subject: " + mySubject + '\'' +
                    ", Salary: $" + mySalary;
        }
    }

