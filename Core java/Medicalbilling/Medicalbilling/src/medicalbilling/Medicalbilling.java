
    package medicalbilling;

    import java.util.Scanner;


    public class Medicalbilling {
    Scanner sc = new Scanner(System.in);
    String name,add,temp,show="[";
    int medi,qt,ans,dis,total=0;
    double net;
    String pin,num,f,g;
    public static void main(String[] args)
    {
    Medicalbilling mb = new Medicalbilling();
    mb.take();
    mb.medname();
    mb.disp();




    }
    public  void medname()
    {

    String ch [] = new String[11];

    ch[0]="kerodon";
    ch[1]="fixs";
    ch[2]="niceneem";
    ch[3]="sparay";
    ch[4]="nasoclear";
    ch[5]="magrix";
    ch[6]="kelofof";
    ch[7]="fermandex";
    ch[8]="tionsd";
    ch[9]="tigersv";
    ch[10]="maintr";


    int p[]={25,87,54,544,52,544,58,745,369,4425,125};

    do
    {
    System.out.println(" enter  the number  of the medicine you want ");
    System.out.println("");
    System.out.println(" enter 1 for "+ch[0]);
    System.out.println(" enter 2 for "+ch[1]);
    System.out.println(" enter 3 for "+ch[2]);
    System.out.println(" enter 4 for "+ch[3]);
    System.out.println(" enter 5 for "+ch[4]);
    System.out.println(" enter 6 for "+ch[5]);
    System.out.println(" enter 7 for "+ch[6]);
    System.out.println(" enter 8 for "+ch[7]);
    System.out.println(" enter 9 for "+ch[8]);
    System.out.println(" enter 10 for "+ch[9]);
    System.out.println(" enter 11 for "+ch[10]);

    medi = sc.nextInt();


    switch(medi)
    {
    case 1:

    System.out.println(" medicine price is "+p[0]);
    System.out.println(" enter the quantity");
    qt=sc.nextInt();
    ans=p[0]*qt;
    temp=ch[0];
    break;
    case 2:

    System.out.println(" medicine price is "+p[1]);
    System.out.println(" enter the quantity");
    qt=sc.nextInt();
    ans=p[1]*qt;
    temp=ch[1];
    break;
    case 3:

    System.out.println(" medicine price is "+p[2]);
    System.out.println(" enter the quantity");
    qt=sc.nextInt();
    ans=p[2]*qt;
    temp=ch[2];
    break;
    case 4:

    System.out.println(" medicine price is "+p[3]);
    System.out.println(" enter the quantity");
    qt=sc.nextInt();
    ans=p[3]*qt;
    temp=ch[3];
    break;
    case 5:

    System.out.println(" medicine price is "+p[4]);
    System.out.println(" enter the quantity");
    qt=sc.nextInt();
    ans=p[4]*qt;
    temp=ch[4];
    break;
    case 6:

    System.out.println(" medicine price is "+p[5]);
    System.out.println(" enter the quantity");
    qt=sc.nextInt();
    ans=p[5]*qt;
    temp=ch[5];
    break;
    case 7:

    System.out.println(" medicine price is "+p[6]);
    System.out.println(" enter the quantity");
    qt=sc.nextInt();
    ans=p[6]*qt;
    temp=ch[6];
    break;
    case 8:

    System.out.println(" medicine price is "+p[7]);
    System.out.println(" enter the quantity");
    qt=sc.nextInt();
    ans=p[7]*qt;
    temp=ch[7];
    break;
    case 9:

    System.out.println(" medicine price is "+p[8]);
    System.out.println(" enter the quantity");
    qt=sc.nextInt();
    ans=p[8]*qt;
    temp=ch[8];
    break;
    case 10:

    System.out.println(" medicine price is "+p[9]);
    System.out.println(" enter the quantity");
    qt=sc.nextInt();
    ans=p[9]*qt;
    temp=ch[9];
    break;
    case 11:

    System.out.println(" medicine price is "+p[10]);
    System.out.println(" enter the quantity");
    qt=sc.nextInt();
    ans=p[10]*qt;
    temp=ch[10];
    break;

    default:
    System.out.println(" you are enter a wrong antry please enter right number");
    medname();
    break;


    }
    show=("["+show +"]    "  +  
            "     ["+ temp+"]");
    
    System.out.println(" do you have one more medicine y/n");
    f=sc.next();
    }
    while (f.equals("y"));
        System.out.println(" any discount avilable  y /n");
        g=sc.next();
        if(g.equals("y"))
        {
            System.out.println(" enter the discounted percentage");
            dis=sc.nextInt();

    }else{
            System.out.println(" dont worry you we get flat 10 % discount");
            dis=10;
            System.out.println("");
        }
        total=total+ans;
 net=total-(total*(dis/100));
    }
    void take()
    {

    System.out.println(" please enter your name ");
    name=sc.next();
    System.out.println(" enter your moobile number");
    num=sc.next();
    System.out.println(" enter your adress");
    add=sc.next();
    System.out.println(" enter your pincode which is 6 digit number");
    pin=sc.next();




    }
    void disp()
    {
    System.out.println(" Welcome   "+name);
    System.out.println(" \n your bill is ");
    System.out.println(" NAME ----"+name+"                        mobile number    "+num);
    
    System.out.println("ADD:   "+add+"                            pincode is "+pin);
     
    System.out.println(" medicine you buyed is");
    System.out.print("\n"+show);
    System.out.println(" \n                total amount you have to pay is >>>"+total);
    
        System.out.println("");
        System.out.println("thank you  visit again ");
    }


    }




