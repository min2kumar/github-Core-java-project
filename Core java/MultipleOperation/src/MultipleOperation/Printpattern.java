
                        package MultipleOperation;


                        public class Printpattern extends MultipleOperation
                        {
                        private int start,row;
                        private String symbol,pattans;

                        void print()
                        { 
                        int choose;
                        System.out.println("===CHOOSE OPTION =====");
                        System.out.println("1)### do you want to print pattern with number");
                        System.out.println(" example-"
                         + '\n'+" 5 4 3 2 1");

                        System.out.println("2)###do you want to print pattern with any symbol");
                        System.out.println(" example-"     + '\n'+" * * * * *");


                        choose=s.nextInt();

                        switch(choose)
                        {
                        case 1:
                        System.out.println(" enter the size of row  for pattern");
                        row=s.nextInt();
                        System.out.println(" enter the starting number");
                        start=s.nextInt();
                        printnum();
                        break;
                        case 2 :
                        System.out.println(" enter the size of row  for pattern");
                        row=s.nextInt();
                        System.out.println(" enter the sign that you want to print");
                        symbol=s.next();
                        printsymbol();
                        break;
                        default:
                        System.out.println(" invalid key try again");
                        print();
                        break;



                        }
                        }
                        void printnum()

                        { int select;
                        System.out.println(" ===CHOOSE STYLE===");
                        System.out.println(" 1)===="+'\n'+"54321"+
                         '\n'+"4321"+
                         '\n'+"321" +
                          '\n'+"21"+ 
                         '\n'+"1");

                        System.out.println(" 2)===="+'\n'+"54321"+
                         '\n'+"5432"+
                         '\n'+"543" +
                          '\n'+"54"+ 
                         '\n'+"5");
                        select=s.nextInt();
                        System.out.println("----------------");
                        switch(select)
                        {
                        case 1:
                        print1();
                        break;
                        case 2:
                        print2();
                        break;
                        default:
                        System.out.println(" invalid entry try again");
                        printnum();
                        break;


                        }

                        }



                        void print1()
                        {
                        for(int i=1;i<=row;i++)
                        {
                        for(int j=start; j>=1;j--)
                        {
                        System.out.print(j);
                        }
                        System.out.println("");
                        start--;
                        }

                        confirm();

                        }

                        void print2()
                        {


                        for(int i= 1;i<=row;i++)
                        {
                        for(int j=start; j>=i;j--)
                        {
                        System.out.print(j);
                        }
                        System.out.println("");
                        }
                        confirm();

                        }

                        void printsymbol()
                        {
                        for (int i =1;i<=row;i++)
                        {
                        for(int j=row; j>=i; j--)
                        {
                        System.out.print(symbol);
                        }
                        System.out.println("");
                        }

                        confirm();


                        }


                        void confirm()
                        {
                        int main;
                        System.out.println("====CHOOSE OPTION");
                        System.out.println("1)+++ try again ");
                        System.out.println(" 2)+++ go to main programme ");
                        System.out.println("3)+++exit from here ");
                        main=s.nextInt();
                        switch(main)
                        {
                        case 1:
                        print();
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
