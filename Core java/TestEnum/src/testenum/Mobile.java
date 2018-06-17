package testenum;

public class Mobile 
{
 Profile p=Profile.GENERAL;
 public void changeProfile(Profile p)
 {
  this.p=p;
  switch(this.p)
  {
   case FLIGHT:
    System.out.println("Mobile is in Flight mode");
    break;
    
   case GENERAL:
    System.out.println("Mobile is in General Mode");
    break;
    
   case MEETING:
    System.out.println("Mobile is in Meeting mode");
    break;
    
   case OUTDOOR:
    System.out.println("Mobile is in Outdoor mode");
    break;
    
   case SILENT:
    System.out.println("Mobile is in Silent mode");
  }
 }
}
