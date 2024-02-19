import java.util.List;

public class TeacherController implements UserController<Teacher> {
    private final TeacherGroupService teacherGroupService = new TeacherGroupService();
    private final TeacherView teacherView = new TeacherView();

    public void removeTeacherByFIO(String firstName, String lastName, String middleName) {
        teacherGroupService.removeTeacherByFIO(firstName, lastName, middleName);
    }

    public List<Teacher> getSortedTeacherList() {
        List<Teacher> teacherList = teacherGroupService.getSortedTeacherList();
        teacherView.sendOnConsole(teacherList);
        return teacherList;
    }

    public List<Teacher> getSortedTeacherByFIO() {
        List<Teacher> teacherList = teacherGroupService.getSortedTeacherByFIO();
        teacherView.sendOnConsole(teacherList);
        return teacherList;
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        teacherGroupService.createTeacher(firstName, lastName, middleName);
    }
}
