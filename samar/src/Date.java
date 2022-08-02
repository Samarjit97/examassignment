public class Date
{
  private int day;
  private int month;
  private int year;

  public Date(int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public Date copy(){
    return  new Date(day, month, year);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Date)){
      return false;
    }
    Date temp = (Date) obj;
    return day == temp.day && month == temp.month && year == temp.year;
  }
}
