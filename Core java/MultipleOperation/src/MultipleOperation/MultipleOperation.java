


                    package MultipleOperation;
                    import java.util.Scanner;
                    public class MultipleOperation 
                    {
                    private long ans=0,multi=1,multi1=1,ans2=0;
                    private double average,average2,grand;
                    private long count,count1,password,erro=0;
                    private long large2=0,large=0,small=0,small2=0;
                    private String name,name2;
                    private String username;
                    private int g=0;
                    private int c=0;
                    private String a;
                    private String l,feed;
                    private long star;

                    private int mintu;
                    private int kumar;
                    private long total;
                    private long mobile,mobile2;
                    private int choosing; 
                    private int forgot,forgot2;


                    Scanner s= new Scanner(System.in);

                    public static void main(String[] args)
                    {


                    MultipleOperation sd= new MultipleOperation();

                    sd.defau();
                    sd.login();


                    }
                    void defau()
                    {
                    System.out.println(" hello sir enter your name ");
                    name= s.next();
                    count1=name.length()*name.length()+2879-12*2;
                    System.out.println("\n");
                    System.out.println(" default username is "+name);
                    System.out.println("default password is "+count1);
                    mobile=name.length()+865547875;
                    System.out.println("   default mobile number is"+mobile);

                    }


                    public void login()
                    { 





                    System.out.println(" ======WRITE ONLY IN LOWER CASE======");
                    System.out.println(" ==CHOOSE OPTION =====");
                    System.out.println("1)   registered  user--required  name &  password");
                    System.out.println("2)   guest user -- limited functionality(addition only)");
                    System.out.println("3)   create new accoount");
                    kumar=0;
                    count = s.nextLong();
                    switch((int)count)
                    {case 1:
                    do{
                    System.out.println(" ---USER NAME  -----");
                    username= s.next();

                    System.out.println("--- PASSWORD--- ");
                    password= s.nextLong();

                    mintu=0;
                    if(name.equals(username) && count1==password)
                    { mintu++;
                    System.out.println(" WELCOME>>>>>"+  name);
                    System.out.println("");
                    choice();
                    }
                    else
                    {
                    System.out.println("-------id and passowrd not matched try again-------");
                    kumar++;
                    if(kumar>=3)
                    {
                    System.out.println("=====TOO MANY TRY======");
                    System.out.println(" ====CHOOSE FROM BELOW======");
                    System.out.println("1)<><>< FORGOT USERNAME <><><>");
                    System.out.println("2)<><>< FORGOT PASSWORD <><><>");
                    System.out.println("3)<><>< FORGOT USERNAME AND PASSWORD<><><>");
                    forgot2=s.nextInt();
                    switch(forgot2)
                    {case 1:
                    forgot=0;
                    do{
                    System.out.println(" enter  your mobile number");
                    mobile2=s.nextLong();
                    if(mobile2==mobile)
                    {  forgot=4;
                    System.out.println(" the username is ->->->\n"+name);
                    }
                    else
                    { forgot++;
                    System.out.println(" mobile number not match");
                    System.out.println(" --try again----");

                    }
                    }while(forgot<3);

                    System.out.println("====going to main page=====");
                    login();
                    break;
                    case 2:
                    forgot=0;
                    do{
                    System.out.println(" enter user name");
                    name2=s.next();
                    if(name2.equals(name))
                    {  forgot=4;
                    System.out.println("password is ->->->\n"+count1);
                    }else
                    { forgot++;
                    System.out.println(" user name is not matching");
                    System.out.println(" --try again----");
                    }
                    }while(forgot<=3);

                    System.out.println("====going to main page=====");
                    login();
                    break;
                    case 3:
                    forgot=0;
                    do{
                    System.out.println(" enter  your mobile number");
                    mobile2=s.nextLong();
                    if(mobile2==mobile)
                    {  forgot=4;
                    System.out.println(" the username is->->\n "+name);
                    System.out.println(" password is->->\n"+count1);
                    }else
                    { forgot++;
                    System.out.println(" mobile number not match");
                    System.out.println(" --try again----");
                    }
                    }while(forgot<=3);

                    System.out.println("====going to main page=====");
                    login();
                    break;
                    default:
                    System.out.println("===please select  right optiion=====");
                    break;

                    }




                    }
                    }

                    }while(mintu==0);


                    break;
                    case 2:
                    accept();
                    break;
                    case 3:
                    System.out.println(" enter user name");
                    name=s.next();
                    System.out.println(" enter password(ONLY IN NUMBERS)");
                    count1=s.nextInt();
                    System.out.println("---MOBILE NUMBER---(only 10 digits or less than)");
                    mobile=s.nextLong();
                    System.out.println(" registered succesfully");
                    login();
                    break;
                    default:
                    System.out.println(" INVALID OPTIOIN TRY AGAIN");
                    login();
                    break;
                    }
                    }
                    void  choice ()
                    { 

                    PrimeDemo p= new PrimeDemo();
                    Vowel v = new Vowel();
                    Printpattern d= new Printpattern();
                    Table t= new Table();
                    luckynuymber lk= new luckynuymber();

                    System.out.println("<><><>< CHOOSE OPTION BELOW<><><<><");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("1)*** GO FOR (+..-..*...>.....<) OPERATION ");
                    System.out.println("2)***print pattern");
                    System.out.println("3)***print a table of any number");
                    System.out.println("4)***check prime number ");
                    System.out.println("5)***check vowel or consonant");
                    System.out.println("6)***check your lucky number ");
                    System.out.println(" ");
                    choosing=s.nextInt();
                    switch(choosing)
                    {
                    case 1:
                    accept();
                    break;
                    case 2:
                    d.print();
                    break;
                    case 3:
                    t.tableprint();
                    break;
                    case 4:
                    p.take();
                    break;
                    case 5:
                    v.vdisplay();
                    break;
                    case 6:
                    lk.table();
                    break;
                    default:
                    System.out.println(" INVALID NUMBER YOU ENTERED TRY AGAIN");
                    choice();


                    }


                    }

                    public void accept()
                    {



                    MultipleOperation sc= new MultipleOperation();


                    System.out.println(" how many number you want to enter ");
                    c=s.nextInt();

                    long [] b= new long[c];

                    for(int j=0;j<c;j++)
                    {
                    System.out.println(" enter the--- "+(j+1)+"---number ");
                    b[j]=s.nextLong();



                    }
                    System.out.println(" ----the number you entered is --- ");

                    for( long w:b)
                    {


                    ans= ans+w;
                    multi=multi*w;


                    System.out.println(w);

                    }




                    large= b[0];
                    small= b[0];


                    for(int h=0;h<c;h++)
                    {
                    if(b[h]>=large)
                    {
                    large=b[h];
                    }
                    else
                    {
                    large=b[0];

                    }
                    }
                    for(int h=0;h<c;h++)
                    {
                    if(b[h]<small)
                    {    small=b[h];

                    }else
                    {
                    small=b[0];

                    }   
                    }

                    more();


                    }



                    public void  more()
                    {


                    String y;

                    System.out.println(" do you want to add more number  ");
                    y=s.next();
                    if(y.equals("y"))
                    {


                    System.out.println(" how many number do you want to enter");
                    g=s.nextInt();


                    long [] k= new long[g];

                    for(int f=0;f<g;f++)
                    { System.out.println(" enter the -----"+(f+1)+"-----number");
                    k[f]=s.nextLong(); 

                    }
                    System.out.println(" the number is ");
                    for(long r:k)
                    {
                    ans2= ans2+r;
                    multi1=multi1*r;
                    System.out.println(r);

                    }

                    large2= k[0];
                    small2 = k[0];
                    for(int t= 0; t<g;t++)
                    {
                    if(k[t]>large2)
                    {
                    large2=k[t];
                    }
                    else 
                    {
                    large2=k[0];
                    }
                    if (k[t]<small2)
                    {
                    small2 = k[t];

                    }else
                    {
                    small2=k[0];
                    }




                    }
                    operation();
                    }
                    else
                    {
                    System.out.println();
                    operation();
                    }



                    }


                    void operation()
                    {
                    int get;

                    System.out.println("---choiose option -----");
                    System.out.println("--1) go for operation part");
                    System.out.println("--2) start from begining");
                    get=s.nextInt();
                    switch(get)
                    {
                    case 1:
                    display();
                    break;

                    case 2:
                    accept();
                    break;
                    default:
                    System.out.println(" INVALID OPTION TRY AGAIN");
                    operation();
                    break;


                    }
                    }


                    void display()
                    {
                    int d;
                    if(count==2)
                    {
                    add();
                    rating();
                    }else
                    {




                    String u;
                    do{
                    System.out.println(" tell me what you want to do with this number ");
                    System.out.println("--1---- addition");
                    System.out.println("--2---- multiplication");
                    System.out.println("--3---- averages");
                    System.out.println("--4---- largest among this");
                    System.out.println("--5---- smallest among this");
                    d=s.nextInt();

                    switch(d)
                    {
                    case 1:

                    add();
                    break;
                    case 2:
                    multiplication();
                    break;
                    case 3:
                    averages();
                    break;

                    case 4:
                    largest();
                    break;
                    case 5:
                    smallest();
                    break;
                    default:
                    System.out.println(" invalid option please try again");
                    display();
                    break;
                    }

                    System.out.println(" do you want do more operation ");
                    u=s.next();
                    } while(u.equals("y"));  
                    System.out.println("===== thank you ======");
                    mainconfirm();

                    }
                    }

                    public  void  add()
                    {   total=ans+ans2;

                    System.out.println(" the sum of this number is -------"+total);
                    }

                    void multiplication()
                    {
                    total=multi*multi1;
                    System.out.println(" the ans after multiplication is------"+total);
                    }
                    void averages()
                    {
                    average=ans+ans2;
                    average2=c+g;
                    grand=average/average2;
                    System.out.println(" averages is------- "+grand);


                    }
                    void largest()
                    {

                    if(large>large2)
                    {
                    System.out.println(" largest number is ------"+large);
                    }
                    else
                    {
                    System.out.println(" largest number is ------"+large2);   
                    }
                    }
                    void smallest()
                    {

                    if(small==0)
                    {

                    System.out.println(" smallest number is ------"+small2);
                    }else
                    {
                    if(small2==0)
                    {
                    System.out.println(" smallest number is -------"+small);   
                    }
                    else
                    {
                    if(small<small2)
                    {
                    System.out.println(" smallestt number is -----"+small);
                    }else
                    {
                    System.out.println("smallest number ----- is-----"+small2);
                    }

                    }
                    }
                    }


                    void mainconfirm()
                    {
                    int main;
                    System.out.println(" 1)== GO TO MAIN PROGRAMME  ");
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
                    mainconfirm();
                    break;

                    }
                    }

                    void rating()
                    {


                    System.out.println(" ------ finding usefull please rate------ ");
                    System.out.println(name+"--- do  you like to give us rating  y /n");
                    l= s.next();
                    if (l.equals("y")||(l.equals("Y")))
                    {
                    do{
                    erro++;
                    if(erro>=2)
                    {System.out.println(" you are entered wrong number try again");
                    }
                    System.out.println(" === PLEASE RATE ==== ");
                    System.out.println(" 1)>>excellent");
                    System.out.println(" 2)>>good");
                    System.out.println(" 3)>>average ");
                    System.out.println(" 4)>>satisfactory");
                    System.out.println(" 5)>>needs hard  work");
                    star= s.nextInt();
                    }while(star>5  );
                    System.out.println(" feedback submitted ");
                    System.out.println(" ==== thank you ====");


                    }

                    else 
                    {
                    System.out.println(name+" ---- it's look like you are not satisfied "  );
                    System.out.println(" we apologies for it ");
                    System.out.println(" please write problem faced in application we will solve it out shortly ");
                    feed= s. next();
                    System.out.println(" feedback submitted");
                    System.out.println(" ======thank you for feedback =======");
                    System.out.println(" solution will be provided shortly");
                    }

                    }


                    }  













