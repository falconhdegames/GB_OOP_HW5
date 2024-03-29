package HW_5;

public class Controller {
    public StudyGroupService sgc;

    public Student getStudent(int id) {
        for (Student student : sgc.sg.students) {
            if (student.id == id) {
                return student;
            }
        }
    }

    public Teacher getTeacher(int id) {
        return sgc.sg.teacher;
    }
}
