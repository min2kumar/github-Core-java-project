
                package MultipleOperation;

                public class PrimeDemo extends MultipleOperation
                {

                private int pans,pno;

                private int how;

                private String pan;

                void take()
                {
                System.out.println(" 1)<><>do you want to check single number by entering it");
                System.out.println(" 2)<><>do you want to give range (LIKE 1 TO  50 )");
                System.out.println(" 3)<><>do you like to enter own multiple number");

                pans=s.nextInt();
                switch(pans)
                {
                case 1:
                prime();
                break;
                case 2:
                prime2();
                break;
                case 3:
                prime3();
                break;

                default:
                System.out.println(" invalid option try again");
                take();

                }
                }

                void prime ()
                {  long puser;

                do{
                System.out.println(" enter a number ");
                puser= s.nextLong();

                if( puser==0)
                {
                System.out.println(" this  is not prime number");
                }

                else 

                {   


                int prcount;
                prcount = 0;
                for( int i=1;i<=puser;i++)
                {

                if(puser%i==0)
                {
                    prcount++;
                }
                }
                if(prcount==2)
                {
                    System.out.println(puser+"--- is prime number");
                }else{
                    System.out.println(puser+"--this is not prime number");
                }

                }System.out.println(" try one more number  y/ n");
                pan=s.next();
                }while(pan.equals("y")|| (pan.equals("Y")));


                confirm();

                }



                void  prime2()
                {   
                long starting,ending;
                do{
                System.out.println(" please enter starting number ");
                starting = s.nextLong();
                System.out.println(" please enter last number");
                ending=s.nextLong();
                System.out.println("");
                if(starting==0)
                {
                starting=1;
                }  
                for (long i=starting; i<= ending; i++)
                {
                int nocount=0;
                for(int j= 1; j<=i;j++)
                { 
                if(i%j==0)
                {
                nocount++;   
                }
                }

                if(nocount==2)
                {  
                System.out.println("prime number is "+i);
                }

                }
                System.out.println(" one more try y/ n");
                pan=s.next();

                }while(pan.equals("y") || (pan.equals("Y")));


                confirm();



                }



                     void prime3()
                     { 
                         do{
                         System.out.println(" how many number you want to enter ");
                         how=s.nextInt();
                         long tem []= new long[how];
                         for(int i=0;i<how;i++)
                         {
                         System.out.println(" enter  the"+(i+1)+" number ");
                         tem[i]=s.nextLong();

                         }

                for (int i=0; i<how; i++)
                { 
                int nocount=0;
                for(int j= 1; j<=tem[i];j++)
                { 
                if(tem[i]%j==0)
                {
                nocount++;   
                }
                }

                if(nocount==2)
                {  
                System.out.println("prime number is "+tem[i]);
                }

                }









                System.out.println(" one more try y/n");
                pan=s.next();
                }while(pan.equals("y")||(pan.equals("Y")));
                         confirm();

                }



                void confirm()

                { 
                int main;
                System.out.println(" ==CHOOSE OPTION==");
                System.out.println("1) to start from begining ");
                System.out.println(" 2)+++ go to main programme ");
                System.out.println("3)+++exit from here ");
                main=s.nextInt();
                switch(main)
                {
                case 1:
                take();
                break;
                case 2:

                choice();
                break;
                case 3:
                System.out.println("== exiting......");
                rating();
                break;
                default:
                System.out.println("INVALID KEY  TRY AGAIN ");
                confirm();
                break;


                }


                }
                }
