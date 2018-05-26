import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
import java.io.*;
import java.util.Collection;
import java.util.stream.*;
import java.util.HashMap;

public class School {
  private ArrayList<Student> students = new ArrayList<Student>();

  public void add(String name, int grade) throws UnsupportedOperationException {
  	Student student = new Student(name, grade);
    students.add(student);
  }

  public ArrayList<String> grade(int grade) {
    ArrayList<String> studentsByGrade = students.stream()
                .filter(p -> p.getGrade() == grade)
                .map(object -> Objects.toString(object, null))
                .collect(Collectors.toCollection(ArrayList::new));
    return studentsByGrade;
  }
  
  public HashMap<Integer, List<String>> studentsByGradeAlphabetical() throws UnsupportedOperationException{
    
    Set<Integer> uniqueGrades = new HashSet();
    for (Student student : students) {
      uniqueGrades.add(student.getGrade());
    }

    HashMap<Integer, List<String>> studentsByGradeAlphabetical = new HashMap<Integer, List<String>>();
    for(int grade : uniqueGrades) {
      List students = this.grade(grade);
      Collections.sort(students);
      studentsByGradeAlphabetical.put(grade, students);
    }
    return studentsByGradeAlphabetical;
  }

  public int numberOfStudents() {
    return students.size();
  }
}