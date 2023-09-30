package chap33;

import java.util.ArrayList;
import java.util.List;

public class StudentForEachSample {
    public static void main(String[] args) {
        StudentForEachSample sample = new StudentForEachSample();

        List<StudentDto> students = new ArrayList<>();
        students.add(new StudentDto("요다", 43, 99, 10));
        students.add(new StudentDto("만두", 30, 71, 85));
        students.add(new StudentDto("건빵", 32, 81, 75));

        sample.printStudentNames(students);
    }

    private void printStudentNames(List<StudentDto> students) {
        students.stream().forEach(student -> System.out.println(student.getName()));
    }
}
