class Test
{
  public static void main(String[] args)
  {
    Time start = new Time(9, 0, 0);
    Time end = new Time(12, 30,0);

    Date date = new Date(18, 5, 20);
    Lesson lesson = new Lesson("samar", date, start, end, null);

    Course course = new Course("sdj");
    course.addLesson(lesson);

    System.out.println(course);
  }

}