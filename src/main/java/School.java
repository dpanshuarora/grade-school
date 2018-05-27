import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.*;
import java.util.stream.*;

public class School {
  private ArrayList<Student> students = new ArrayList<>();

  public void add(String name, int grade) {
    Student student = new Student(name, grade);
    students.add(student);
  }

  public ArrayList<String> grade(int grade) {
    ArrayList<String> studentsByGrade = students.stream()
                .filter(student -> student.getGrade() == grade)
                .map(student -> student.getName())
                .collect(Collectors.toCollection(ArrayList::new));
    return studentsByGrade;
  }
  
  public HashMap<Integer, List<String>> studentsByGradeAlphabetical() {
    
    Set<Integer> uniqueGrades = getUniqueGrades();

    HashMap<Integer, List<String>> studentsByGradeAlphabetical = new HashMap<Integer, List<String>>();
    for(int grade : uniqueGrades) {
      List<String> students = this.grade(grade);
      Collections.sort(students);
      studentsByGradeAlphabetical.put(grade, students);
    }
    return studentsByGradeAlphabetical;
  }

  private Set<Integer> getUniqueGrades() {
    Set<Integer> uniqueGrades = students.stream()
                .map(student -> student.getGrade())
                .collect(Collectors.toCollection(HashSet::new));
    return uniqueGrades;
  }

  public int numberOfStudents() {
    return students.size();
  }
}