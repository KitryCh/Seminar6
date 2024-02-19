public class Student extends User implements Comparable<Student>{
    private Long studentID;

    public Student(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }
//    private String firstName;
//    private String lastName;
//    private String middleName;

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getMiddleName() {
//        return middleName;
//    }
//
//    public void setMiddleName(String middleName) {
//        this.middleName = middleName;
//    }

    @Override
    public int compareTo(Student o) {
        return this.studentID.compareTo(o.studentID);
    }
}
