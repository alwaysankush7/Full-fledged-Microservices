class Student {
    private int rollNum;
    private String studName;
    private int mark1;
    private int mark2;
    private int mark3;
    private int totalMarks;

    public void setStudDetails(int rollNum, String studName, int mark1, int mark2, int mark3) {
        this.rollNum = rollNum;
        this.studName = studName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public void calculateTotal() {
        this.totalMarks = this.mark1 + this.mark2 + this.mark3;
    }

    public void displayStudDetails() {
        System.out.println("Roll Number: " + this.rollNum);
        System.out.println("Student Name: " + this.studName);
        System.out.println("Total Marks: " + this.totalMarks);
    }
}

class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudDetails(101, "John", 80, 85, 90);
        student.calculateTotal();
        student.displayStudDetails();
    }
}
