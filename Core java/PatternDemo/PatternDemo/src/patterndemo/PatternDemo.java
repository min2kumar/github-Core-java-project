
                    package patterndemo;

                    import java.util.Scanner;


                    public class PatternDemo {

                          int a,c;
                          static int b;

                    public static void main(String[] args) 

                    {
                       
                    PatternDemo p = new PatternDemo();
                    p.process();
                    
                    }

                        
                    void process()
                    {
                    
                    String ans;
                    Scanner s= new Scanner(System.in);
                      do
                      {
                    System.out.println(" enter the row size ");
                    a=s.nextInt();
                    System.out.println(" enter the starting number ");
                    b=s.nextInt();

                    System.out.println(" choose your print style");
                          System.out.println("");
                    System.out.println("1)54321\n" +
                                         "4321\n" +
                                         "321\n" +
                                         "21\n" +
                                         "1");
                          System.out.println("");
                    System.out.println("2)54321\n" +
                                          "5432\n" +
                                          "543\n" +
                                          "54\n" +
                                          "5");
                          System.out.println("");
                    c=s.nextInt();
                          System.out.println("");
                    switch(c)
                    {
                    case 1:
                   print1();
                    break;
                    case 2:
                    print();
                    break;
                    default:
                    System.out.println(" please enter a valid key and try again");
                    process();
                    }
                          System.out.println(" do you want to try again y/n");
                          ans= s.next();}
                    while(ans.equals("y"));
                        System.out.println("----- THANK YOU-------");
                      
                      }

                        
                    
                    


                    void print()
                    {
                    for (int i =1;i<=a;i++)
                    {
                    for(int j=b; j>=i; j--)
                    {
                    System.out.print(j);
                    }
                    System.out.println("");
                    }


                    }
                    void print1()
                    {


                    for (int i =a;i>=1;i--)
                    {
                    for(int j=b; j>=1; j--)
                    {
                    System.out.print(j);
                    
                    }
                    b--;
                    System.out.println("");
                    }
                    }
                    }
                    
                    

                    
                    
                    





