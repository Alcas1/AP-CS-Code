/*
 CSE 17
 Jonathan Wu
 Jmw217
 Program #1 DEADLINE: September 24, 2013
 Program Description:
 
 */ 

//use /as seperator
//File myFile=new File("clients.txt"); relative file
//relative files are preferred \t is tab
//file.getAbsolutePath(); 
import java.io.File;

public class Song
{
  private String title;
  private String artist;
  private String album;
  private int year;
  private int time;
  
  /* **/
  public Song(String myTitle,String myArtist,String myAlbum,int myYear,int myTime)
  {
    title=myTitle;
    artist=myArtist;
    album=myAlbum;
    year=myYear;
    time=myTime;
  }
  /* **/
  public String getTitle()
  {
    return title;
  }
  
  public String getArtist()
  {
    return artist;
  }
  public String getAlbum()
  {
    return album;
  }
  public int getYear()
  {
    return year;
  }
  public int getTime()
  {
    return time;
  }
  public String getTimeAsFormattedString()
  {
    int minutes=time/60;
    int seconds=time-minutes*60;
    String sSeconds="";
    if(seconds<10)
    {
      sSeconds="0"+seconds;
    }
    else
    {
      sSeconds=Integer.toString(seconds);
    }
    return minutes+":"+sSeconds;
  }
  //    use delimiter \\t|[\\n\\r\\f]+
  /* This method will print the song title, artist, album, year and time**/
  public void printSongRow()
  {
    printPart(title,25);
    System.out.print("\t");
    printPart(artist,25);
    System.out.print("\t");
    printPart(album,30);
    System.out.print("\t");
    System.out.print(year);
    System.out.print("\t");
    System.out.print(getTimeAsFormattedString());
    
    
  }
  
  /* **/
  public void printPart(String field, int cap)
  {
    if(field.length()>=cap)
    {
      System.out.print(field.substring(0,cap));
    }
    else
    {
      int spaces=cap-field.length();
      while(spaces>0)
      {
        field+=" ";
        spaces--;
      }
      System.out.print(field);
    }
  }
  
  
  
  //hasNext()
  public static void main(String args[])
  {
    Song omg=new Song("Obama","vs","Romney",2016,129);
    omg.printSongRow();
    
  }
  
  
  
  
  
}