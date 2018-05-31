import java.util.ArrayList;
import java.util.HashMap; 
import java.util.Collections;
import java.util.*;

public class School {
  private Map<Integer, List<String>> students;

  School() {
    students = new HashMap<>();
  }

  public void add(String name, Integer grade) {
    students.computeIfAbsent(grade, namesOfStudents -> new ArrayList<>()).add(name);
  }

  public List<String> grade(Integer grade) {
    List<String> studentsByGrade;
    if(students.get(grade) == null) {
      studentsByGrade = new ArrayList<>();
    }
    else {
      studentsByGrade = students.get(grade);
    }
    return Collections.unmodifiableList(studentsByGrade);
  }

  public Map<Integer, List<String>> studentsByGradeAlphabetical() {
    for(int grade : students.keySet()) {
      Collections.sort(students.get(grade));
    }
    return Collections.unmodifiableMap(students);
  }

  public int numberOfStudents() {
    return students.size();
  }
}