import java.util.Collections;

public class StudentEntry {
  public static void main(String[] args) {
  	School school = new School();
  	school.add("a", 1);
  	school.add("b",0);
  	school.add("an", 1);
  	school.add("z",0);
  	school.add("as",1);
  	school.studentsByGradeAlphabetical();
  	System.out.println(school.getSchool());
    System.out.println(school.grade(1));
  }
}