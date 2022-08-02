import java.time.LocalTime;

public class Time
{
  private int hour;
  private int minute;
  private int second;

  public Time(int h, int m, int s){
    this.hour = h;
    this.minute = m;
    this.second = s;
  }

  public Time(int totalTimeInSeconds){
    int h = totalTimeInSeconds/3600;
    int m = (totalTimeInSeconds - (h * 3600)) / 60;
    int s = (totalTimeInSeconds - (h * 60)) / 60;
  }

  public void tic(){
    if (second < 59) {
      second++;
    }
    else {
      second = 0;
      minute++;
    }
  }

  public int converToSeconds(){
    return (hour * 60) + (minute * 60) + second;
  }

  public Time timeTo(Time time2){
    int seconds = LocalTime.now().toSecondOfDay();
    int t = (time2.converToSeconds() - seconds);
    Time t2 = new Time(t);
    return t2;
  }

  public Time copy(){
    return new Time(hour, minute, second);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Time)){
      return false;
    }else {
      Time temp = (Time)obj;
      return hour == temp.hour && minute == temp.minute && second == temp.second;
    }
  }

  public String toString()
  {
    return hour + "." + minute + "." + second;
  }
}
