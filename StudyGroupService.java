package HW_5;

import java.util.ArrayList;
import java.util.Random;

public class StudyGroupService {
    public StudyGroup sg;
    public ArrayList<Integer> ids;

    public int generateId() {
        while (true) {
            int id = new Random().nextInt(1000);
            if (!ids.contains(id)) {
                ids.add(id);
                return id;
            }
        }
    }

    public StudyGroup returnGroup(String teacher, ArrayList<String> students) {
        sg.teacher = new Teacher(generateId(), teacher);
        sg.students = new ArrayList<>();
        var studetns_iter = students.iterator();
        while (studetns_iter.hasNext()) {
            sg.students.add(new Student(generateId(), studetns_iter.next()));
        }
        return sg;
    }
}
