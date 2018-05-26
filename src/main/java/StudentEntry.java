import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class StudentEntry {
  
  public static void main(String[] args) {
  	School school = new School();
    school.add("Kyle", 4);
    school.add("Zed", 4);
    school.add("Adam", 4);
    school.add("Jennifer", 4);
    school.add("Kareem", 6);
    school.add("Christopher", 4);
    school.add("Kylie", 3);

    HashMap<Integer, List<String>> schoolStudents = school.studentsByGradeAlphabetical();
    System.out.println(schoolStudents);

  }
}