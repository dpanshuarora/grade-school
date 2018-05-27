public class Student {
  private String name;
  private Integer grade;

  Student(String name, int grade) {
    this.name = name;
    this.grade = grade;
  }

  public String getName() {
    return name;
  }

  public Integer getGrade() {
    return grade;
  }
}