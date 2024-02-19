public class Teacher extends User implements Comparable<Teacher> {
    private Long teacherID;

    public Teacher(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }

    public Long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Long teacherID) {
        this.teacherID = teacherID;
    }
    @Override
    public int compareTo(Teacher otherTeacher) {
        // Реализация метода сравнения для сортировки учителей
        // Например, можно сравнивать по ФИО
        int lastNameComparison = this.getLastName().compareTo(otherTeacher.getLastName());
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }

        int firstNameComparison = this.getFirstName().compareTo(otherTeacher.getFirstName());
        if (firstNameComparison != 0) {
            return firstNameComparison;
        }

        return this.getMiddleName().compareTo(otherTeacher.getMiddleName());
    }
}
