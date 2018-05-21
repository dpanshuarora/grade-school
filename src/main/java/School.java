import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
import java.io.*;

public class School {
  private ArrayList<Student> school = new ArrayList<Student>();

  void add(String name, int grade) {
  	Student student = new Student(name, grade);
    this.school.add(student);
  }
  
  ArrayList<Student> getSchool() {
  	return school;
  }

  class StudentCompare implements Comparator<Student> {
  	public int compare(Student one, Student two) {
      if(one.getGrade().compareTo(two.getGrade())==0) {
      	return one.getName().compareTo(two.getName());
      }
      else return one.getGrade().compareTo(two.getGrade());
  	}
  }

  ArrayList<Student> grade(int grade) {
    ArrayList<Integer> a = new ArrayList<Integer>();
    a.add(grade);
    System.out.println(a);
    school.retainAll(a);
    return school;
  }
  
  void studentsByGradeAlphabetical() {

    StudentCompare studentCompare = new StudentCompare();
    
    Collections.sort(school, studentCompare);
    
  }

  int numberOfStudents() {
    return school.size();
  }
}