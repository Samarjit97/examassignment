public class SkypeLesson extends OnlineLesson
{
  String inviteLink;

  public SkypeLesson(String topic, Date date, Time start, Time end, File[] res, boolean screenShare, String link){
    super(topic, date, start, end, res, screenShare);
    this.inviteLink = link;
  }

  public String getInviteLink()
  {
    return inviteLink;
  }

  public String nameOfSoftware()
  {
    return "Skype";
  }

  public String toString()
  {
    return super.toString() + "\n Invite link = " + inviteLink;
  }
}
