public class Student {
  String name;
  Integer grade;

  Student(String name, int grade) {
    this.name = name;
    this.grade = grade;
  }

  String getName() {
    return name;
  }

  Integer getGrade() {
    return grade;
  }

  void setName(String name) {
    name = name;
  }

  void setGrade(Integer grade) {
    grade = grade;
  }

  public String toString() {
    return name + " " + grade;
  }
}