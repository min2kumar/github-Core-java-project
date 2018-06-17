package demo;

public class Computer 
{
 Mode m=Mode.SHUTDOWN;
 public void changeMode(Mode m)
 {
  this.m=m;
  switch(this.m)
  {
   case RESTART:
    System.out.println("Computer is in Restart mode");
    break;
    
   case SHUTDOWN:
    System.out.println("Computer is in Shutdown mode");
    break;
    
   case SIGNOUT:
    System.out.println("Computer is in Signout mode");
    break;
    
    case SLEEP:
     System.out.println("Computer is in Sleep mode");
     break;
     
   case STARTUP:
    System.out.println("Computer is in Startup mode");
    break;
    
   default:
    System.out.println("No such mode");
  }
 }
}
