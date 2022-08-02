import java.util.ArrayList;
import java.util.Arrays;

public class Lesson
{
  private String topic;
  private Date date;
  private Time start;
  private Time end;
  private File[] resources;

  public Lesson(String topic, Date date, Time start, Time end, File[] res){
    this.topic = topic;
    this.date = date;
    this.start = start;
    this.end = end;
    this.resources = res;
  }

  public String getTopic(){
    return topic;
  }

  public Date getDate()
  {
    return date;
  }

  public File[] getResources()
  {
    return resources;
  }

  public ArrayList<File> getAllPDFs(){
    ArrayList<File> files = new ArrayList<>();
    for (File file : resources) {
      files.add(file);
    }
    return files;
  }

  public Time getDuration(){
    int startTime = start.converToSeconds();
    int endTime = end.converToSeconds();

    int duration = endTime - startTime;
    return new Time(duration);
  }

  public boolean hasValidTime(Time startTime, Time endTime){
    return (startTime.converToSeconds() > 30000 && endTime.converToSeconds() < 76500);
  }

  public String getDateTimeString(){
    return "Date = " + date.toString() + ", Time = " + getDuration().toString();
  }

  public String toString()
  {
    return "Lesson = " + topic + ", " + getDateTimeString() + ", Resources = " + Arrays.toString(resources);
  }
}
