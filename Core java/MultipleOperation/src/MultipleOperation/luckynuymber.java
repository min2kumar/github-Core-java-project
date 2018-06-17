                            package MultipleOperation;

                            public class luckynuymber extends MultipleOperation

                            {


                            void table()
                            {  

                            long mo,year;
                            String luckyname,luckyans;

                            long process;

                            do{

                            System.out.println("` enter your name");
                            System.out.println("==PLEASE DON'T GIVE SPACE IN NAME====IT WILL GIVE ERROR");
                            luckyname=s.next();
                            System.out.println(" enter first four digit of your mobile number");
                            mo=s.nextLong();
                            System.out.println(" enter your birth year");
                            year=s.nextLong();
                            process=(luckyname.length()+year+mo);
                            process=process/1458;
                            System.out.println(" your  LUCKY-LUCKY  number  is >->->->"+process);

                            System.out.println(" do you want to try again  y/n");
                            luckyans=s.next();
                            } while(luckyans.equals("y")|| (luckyans.equals("Y")));
                            System.out.println("== THANK YOU====");
                            confirm();
                            }

                            void confirm()
                            {
                            int main;


                            System.out.println(" 1)== go to main programme ");
                            System.out.println("2)exit from here ");
                            main=s.nextInt();
                            switch(main)
                            {
                            case 1:
                            choice();
                            break;
                            case 2:
                            System.out.println("== exiting......");
                            rating();
                            break;
                            default:
                            System.out.println("INVALID KEY TRY AGAIN ");
                            confirm();
                            break;


                            }
                            }
                            }


