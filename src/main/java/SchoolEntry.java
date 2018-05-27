import java.util.Map;
import java.util.List;

public class SchoolEntry {
  
  public static void main(String[] args) {
    School school = new School();
    school.add("Bilal", 6);
    school.add("Akshay", 6);
    school.add("Neha", 3);
    school.add("Jenny", 1);
    school.add("Karan", 3);
    school.add("Chris", 3);
    school.add("Kyle", 6);

    Map<Integer, List<String>> schoolStudents = school.studentsByGradeAlphabetical();
    System.out.println(schoolStudents);
    System.out.println(school.numberOfStudents());
  }
}