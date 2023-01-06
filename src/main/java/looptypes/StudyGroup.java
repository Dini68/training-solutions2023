package looptypes;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {

    private final List<String> studyGroup1 = new ArrayList<>();
    private final List<String> studyGroup2 = new ArrayList<>();

    public List<String> getStudyGroup1() {
        return studyGroup1;
    }

    public List<String> getStudyGroup2() {
        return studyGroup2;
    }

    public void printStudyGroups(List<String> students) {
        for (String s: students) {
            if (s.length() <= 10) {
                studyGroup1.add(s);
            } else {
                studyGroup2.add(s);
            }
        }
    }

    public static void main(String[] args) {

        List<String> students = new ArrayList<>();

        students.add("Kis Elemér");
        students.add("Varga Zoltán");
        students.add("Papp Ede");
        students.add("Simon Tünde");
        students.add("Kovács Miklós");

        StudyGroup sg = new StudyGroup();
        sg.printStudyGroups(students);

        System.out.println(sg.getStudyGroup1());
        System.out.println(sg.getStudyGroup2());
    }
}
