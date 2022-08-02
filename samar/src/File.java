public class File
{
  private String fileName;
  private String extension;

  public File(String fileName, String extension){
    this.fileName = fileName;
    this.extension = extension;
  }

  public boolean isPDF(){
    return (extension.equals("pdf"));
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof File)){
      return false;
    }
    File temp = (File) obj;
    return fileName.equals(temp.fileName) && extension.equals(temp.extension);
  }

  public String toString()
  {
    return "File - " + fileName + extension;
  }
}
