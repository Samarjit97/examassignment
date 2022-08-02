import java.util.ArrayList;

public class Student
{
  private int studentNumber;
  private String name;
  private ArrayList<Course> courses;
  private ArrayList<Grade> grades;

  public Student(int studentNumber, String name){
    this.studentNumber = studentNumber;
    this.name =name;
    courses = new ArrayList<>();
    grades = new ArrayList<>();
  }

  public int getStudentNumber()
  {
    return studentNumber;
  }

  public String getName()
  {
    return name;
  }

  public void addCourse(Course course){
    courses.add(course);
  }

  public void addGrade(Grade grade){
    grades.add(grade);
  }

  public Grade[] getAllGrades(){
    return (Grade[]) grades.toArray();
  }

  public Course[] getAllCourses(){
    return (Course[]) courses.toArray();
  }
}
