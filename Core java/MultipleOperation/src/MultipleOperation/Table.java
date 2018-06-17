

                        package MultipleOperation;

                        public class Table extends MultipleOperation

                        {

                        void tableprint()
                        {
                        long num,size;
                        String tabans;
                        do{
                        System.out.println(" enter the number to print the table of that number ");
                        num=s.nextLong();
                        System.out.println(" upto which time you want to print table");
                        System.out.println(" example-2*1-------2*10"+" here 2 table is upto 10 times ");
                        size=s.nextLong();

                        System.out.println(" the table is ");
                        for (int i=1;i<=size;i++)
                        {
                        System.out.println(num*i);
                        }


                        System.out.println(" do you want to print more table  y/ n ");
                        tabans=s.next();
                        }while(tabans.equals("y")|| (tabans.equals("Y")));
                        System.out.println("===THANK YOU===");
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
