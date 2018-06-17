package bankingproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bankoperationimpl {

    Bank bank;
    long account;
    long balance;
    long interest;
    String pass;
    int a;
    int count = 0;
    int c = 0;
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    
    Scanner sc = new Scanner(System.in);

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Statement st = null;

    public void databaseconnect() throws ClassNotFoundException, SQLException {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/mintu", "mintu", "mintu");
    }

    void menu() throws SQLException, ClassNotFoundException {

        int choose;
        System.out.println(">>>>loading>>>>>>");

        System.out.println("====WELCOME TO BANK OF BARODA====");
        System.out.println(" ====CHOOSE MENU======");
        System.out.println("1) Create new account");
        System.out.println("2) Already have an account account");
        System.out.println("3) import the account data");
        System.out.println("4) Exit");
        choose = sc.nextInt();
        switch (choose) {
            case 1:
                create();
                break;
            case 2:

                authentiaccoun();
                break;
            case 3:
                importfile();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.err.println(" invalid key please try Again");
                menu();
                break;

        }
    }

    void authentiaccoun() throws ClassNotFoundException, SQLException {
        databaseconnect();

        st = con.createStatement();
        rs = st.executeQuery("select accountno from bank ");
        while (rs.next()) {
            count4++;
        }
        if (count4 > 0) {
            Bank b = new Bank();
            System.out.println("ENTER YOUR ACCOUNT NO");
            b.setAccountno(sc.nextLong());
            System.out.println("===>>>>>>>>>");

            ps = con.prepareStatement("select accountno from bank where accountno=?");
            ps.setLong(1, b.getAccountno());
            rs = ps.executeQuery();
            int temp = 0;
            while (rs.next()) {
                temp++;
            }
            if (temp > 0) {

                authenpass(b);

            } else {
                count++;
                if (count < 4) {
                    System.out.println("ACCOUNT NOT MATCH---TRY AGAIN");
                    authentiaccoun();
                } else {
                    System.out.println("TOO MANY ATTEMPT");
                    menu();
                }
            }
        } else {
            System.out.println("THIS IS NEW BNANK");
            System.out.println("NO ACCOUNT IS OPENED HERE ");
            System.out.println("BE FIRST ACCOUNT HOLDER OF THIS BANK");
            System.out.println("PLEASE CREATE ACCOUNT FIRST");
            System.out.println(" FIRST ACCOUNT HOLDER GET AN EXTRA 10000 DEPOSITED IN THEIR ACCOUNT");
        }

        menu();
    }

    void authenpass(Bank b) throws ClassNotFoundException, SQLException {

        databaseconnect();
        System.out.println(" Enter Password ");
        b.setPassword(sc.next());
        ps = con.prepareStatement("select PASSWORD from bank where accountno=?");
        ps.setLong(1, b.getAccountno());
        rs = ps.executeQuery();
        String tem = "";
        while (rs.next()) {
            tem = rs.getString(1);
        }

        if (tem.equals(b.getPassword())) {
            alreadyaccount(b);
        } else {

            count1++;
            if (count1 < 2) {
                System.err.println("PASSWORD IS INCORRECT");
                authenpass(b);
            } else {
                authentiaccoun();
            }
        }

    }

    void alreadyaccount(Bank b) throws ClassNotFoundException, SQLException {
        int choose;

        System.out.println("1) OPerate Account");
        System.out.println("2) Update Account");
        System.out.println("3) Delete Account");
        System.out.println("4) export data   ");
        System.out.println("5) help  option ");
        System.out.println("6) Go to Main Menu");
        System.out.println("7) exit");
        choose = sc.nextInt();
        switch (choose) {
            case 1:
                operate(b);
                break;
            case 2:
                updateaccount(b);
            case 3:
                deleteaccoutn(b);
                break;
            case 4:
                exportfile(b);
                break;
            
            case 5:
                help();
                break;
            case 6:
                menu();
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println(" Please enter a valid key please");
                alreadyaccount(b);
                break;
        }
    }

    void create() throws ClassNotFoundException, SQLException {
        Bank b = new Bank();
        int choice1;
        c++;
        int d = 1;
        System.out.println("==CHOOSE OPTION=====");
        System.out.println("1.. for opening a Current Account");
        System.out.println("1.. for opening a  Saving Account");
        choice1 = sc.nextInt();
        switch (choice1) {
            case 1:
                createaccount(b, d);
                break;
            case 2:
                d = 2;
                createaccount(b, d);
                break;

            default:
                if (c < 2) {
                    System.out.println(" choose Wrong option please try again");
                    create();
                } else {
                    System.err.println("TOO MANY ATTEMPT");
                    menu();

                }

                break;

        }

    }

    public void createaccount(Bank b, int d) {

        this.a = d;

        System.out.println("=>> PLEASE FILL THIS===");
        System.out.println("=>> ALL FILEEED IS MANDATORY===");
        System.out.println("=================================");
        System.out.println(" enter your first name");
        b.setFname(sc.next());
        System.out.println("========================");
        System.out.println(" Enter your Last name");
        b.setLname(sc.next());
        System.out.println("enter  email id");
        b.setEmail(sc.next());
        System.out.println("==================");
        System.out.println(" enter date of birth");
        b.setDateofbirth(sc.next());
        System.out.println("==============");
        System.out.println("enter Address");
        b.setAddress(sc.next());
        System.out.println("===============");
        System.out.println(" enter  pan no");
        b.setPanno(sc.next());
        System.out.println("==================");
        System.out.println(" enter addharid");
        b.setAadhar(sc.next());
        System.out.println("===================");
        System.out.println("Enter mobile number ");
        b.setMobile(sc.next());
        System.out.println("=====================");
        System.out.println("===================================");
        if (count4 == 0) {
            balance = 500 + 10000;
        } else {
            balance = 500;
        }
        b.setBalance(balance);
        interest = balance * 10 / 100;
        b.setInterest(interest);
        account = b.getFname().length() * 154212;
        pass = "pass" + b.getFname();
        long overdraft = 0;
        if (a == 2) {
            overdraft = balance * 20 / 100;

            b.setOverdraft(overdraft);
        } else {
            b.setOverdraft(overdraft);
        }

        password(b);
    }

    void password(Bank b) {

        System.out.println("Your Default password is ");
        System.out.println(pass);
        System.out.println("do you want to change a password");
        String choice = sc.next();
        if (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")) {

            String pas;
            System.out.println("Enter  new password(BELOW 8 CHARATER)");
            pas = sc.next();
            b.setPassword(pas);
        } else {
            System.out.println(" thank you use your default password");
            b.setPassword(pass);
            System.out.println(pass);
        }

        try {
            submit(b);
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(" all work proper till submit() method");
            Logger.getLogger(Bankoperationimpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void submit(Bank b) throws ClassNotFoundException, SQLException {

        databaseconnect();
        st = con.createStatement();
        rs = st.executeQuery("select MAX(ACCOUNTNO) from bank");
        long tempacc1 = 0;
        while (rs.next()) {
            tempacc1 = rs.getLong(1);
        }
        account = tempacc1 + 1 + b.getFname().length() * 12635;
        b.setAccountno(account);

        System.out.println("=====================");
        ps = con.prepareStatement("insert into BANK values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setLong(1, b.getAccountno());
        ps.setString(2, b.getPassword());
        ps.setString(3, b.getFname());
        ps.setString(4, b.getLname());
        ps.setString(5, b.getEmail());
        ps.setString(6, b.getAddress());
        ps.setString(7, b.getAadhar());
        ps.setString(8, b.getPanno());
        ps.setString(9, b.getDateofbirth());
        ps.setString(10, b.getMobile());
        ps.setLong(11, b.getBalance());
        ps.setLong(12, b.getInterest());
        ps.setLong(13, b.getOverdraft());

        int r = ps.executeUpdate();

        if (r > 0) {
            System.out.println(" CONGRATULATIONS");
            System.out.println("Account opened Successfully");
            System.out.println("=================================");
            System.out.println("====>>>>======>>>>>>>");
            System.out.println("YOUR ACCOUNT NO IS");
            System.out.println(account);
            System.out.println("=====================");
            System.out.println("YOUR PASSWORD IS");
            System.out.println(b.getPassword());
        } else {
            System.out.println(" account not opened");
        }
        menu();
    }

    void operate(Bank b) throws ClassNotFoundException, SQLException {
        count3++;

        int d = 1;
        int choose;
        System.out.println("== HOW DO YOU LIKE TO OPERATRE ACCOUNT==");
        System.out.println("1) for depossiting money");
        System.out.println("2) for withdrawing money");
        System.out.println("3) show Account information ");
        System.out.println("4) Print passbook ");
        System.out.println("5) know your balance");
        System.out.println("6) know your interest");
        System.out.println("7) overdraft allowed");
        System.out.println("8) previous menu");
        System.out.println("9) for help");
        choose = sc.nextInt();

        switch (choose) {
            case 1:
                deposit(b);
                break;
            case 2:
                withdraw(b);
                break;
            case 3:
                showaccount(b);
                break;
            case 4:
                printpassbook(b);
                break;
            case 5:
                balance(b, d);
                break;
            case 6:
                d = 2;
                balance(b, d);
                break;
            case 7:
                d = 3;
                balance(b, d);
                break;
            case 8:
                alreadyaccount(b);
                break;
            case 9:
                help();
            default:
                System.out.println(" p[lease enter valid input key");
                operate(b);
                break;

        }
    }

    void balance(Bank b, int a) throws ClassNotFoundException, SQLException {
        this.a = a;
        databaseconnect();

        ResultSet bs;

        if (a == 1) {

            ps = con.prepareStatement("select balance from bank where accountno=?");
            ps.setLong(1, b.getAccountno());
            bs = ps.executeQuery();
            long r = 0;
            while (bs.next()) {
                r = bs.getLong(1);
            }
            System.out.println(" Your Balance is ");
            System.out.println(r);
            System.out.println("===================");

        } else {
            if (a == 2) {
                ps = con.prepareStatement("select interest from bank where accountno=?");
                ps.setLong(1, b.getAccountno());
                bs = ps.executeQuery();
                long r = 0;
                while (bs.next()) {
                    r = bs.getLong(1);
                }

                System.out.println(" Your Interest is ");
                System.out.println(r);
                System.out.println("===================");
            } else {
                ps = con.prepareStatement("select overdraft from bank where accountno=?", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ps.setLong(1, b.getAccountno());
                bs = ps.executeQuery();
                long r = 0;
                while (bs.next()) {
                    r = bs.getLong(1);
                }
                if (r == 0) {
                    System.out.println(" Your Acccount is saving account  ");
                    System.out.println(" overdraft available for current account  ");

                    System.out.println("===================");
                } else {
                    while (bs.next()) {
                        r = bs.getLong(1);
                    }

                    System.out.println("overdraft allowed is");
                    System.out.println(r);
                }

            }
        }

        operate(b);
    }

    public void updateaccount(Bank b) throws ClassNotFoundException, SQLException {
        count2++;
        int choose;
        databaseconnect();

        System.out.println(" what do you want to update choose");
        System.out.println("1.mobile number");
        System.out.println("2.Address");
        System.out.println("3.email id");
        System.out.println("4.password");
        System.out.println("5.date of birth");
        System.out.println("6.go to main menu");
        choose = sc.nextInt();
        switch (choose) {
            case 1:
                System.out.println(" enter new mobile number");
                b.setMobile(sc.next());
                ps = con.prepareStatement("update bank set MOBILE=? where accountno=?");
                ps.setString(1, b.getMobile());
                ps.setLong(2, b.getAccountno());
                System.out.println(" updated succesfully");
                break;
            case 2:
                System.out.println(" enter new address");
                b.setAddress(sc.next());
                ps = con.prepareStatement("update bank set ADDRESS=? where accountno=?");
                ps.setString(1, b.getAddress());
                ps.setLong(2, b.getAccountno());
                System.out.println(" updated succesfully");
                break;
            case 3:
                System.out.println(" entyer new email address");
                b.setEmail(sc.next());
                ps = con.prepareStatement("update bank set EMAIL=? where accountno=?");
                ps.setString(1, b.getEmail());
                ps.setLong(2, b.getAccountno());
                System.out.println(" updated succesfully");
                break;
            case 4:
                System.out.println(" enter new password [");
                b.setPassword(sc.next());
                ps = con.prepareStatement("update bank set PASSWORD=? where accountno=?");
                ps.setString(1, b.getPassword());
                ps.setLong(2, b.getAccountno());
                System.out.println(" updated succesfully");
                break;
            case 5:
                System.out.println(" enter corrected  date of birth");
                b.setDateofbirth(sc.next());
                ps = con.prepareStatement("update bank set DATEOFBIRTH=? where accountno=?");
                ps.setString(1, b.getDateofbirth());
                ps.setLong(2, b.getAccountno());
                System.out.println(" updated succesfully");
                break;
            case 6:
                menu();
                break;
            default:
                System.out.println(" invalid key try again");
                if (count2 < 2) {
                    updateaccount(b);
                }

                break;

        }

        int r = ps.executeUpdate();
        if (r > 0) {
            System.out.println(" updated succesfully");

        } else {
            System.out.println(" NOT UPDATED  TRY AGAIN");
        }
        updateaccount(b);

    }

    public void deleteaccoutn(Bank b) throws SQLException, ClassNotFoundException {

        try {
            databaseconnect();
            ps = con.prepareStatement("delete from bank where accountno=?");
            ps.setLong(1, b.getAccountno());
            int z = ps.executeUpdate();
            System.out.println("<>><<><Deleting please wait");
            for (int i = 0; i < 8; i++) {
                System.out.print("Deleting......`");
            }
            System.out.println(" Account Deleted Succesfully");
            System.out.println(">>>>><<><>>>>>>>>><>>>>>>>>>>><>>>>>>>>>>");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bankoperationimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        menu();
    }

    public void showaccount(Bank b) throws ClassNotFoundException, SQLException {
        databaseconnect();
        ps = con.prepareStatement(" select * from bank where accountno=?");
        ps.setLong(1, b.getAccountno());
        rs = ps.executeQuery();
        String fn, ln, em, add, pan, aad, dob, mob;
        fn = ln = em = add = pan = aad = dob = mob = "";
        long in = 0, bal = 0, over = 0, acc = 0;
        while (rs.next()) {
            acc = rs.getLong(1);
            fn = rs.getString(3);
            ln = rs.getString(4);
            em = rs.getString(5);
            add = rs.getString(6);
            pan = rs.getString(7);
            aad = rs.getString(8);
            dob = rs.getString(9);
            mob = rs.getString(10);
            in = rs.getLong(12);
            bal = rs.getLong(11);
            over = rs.getLong(13);
        }
        System.out.println("ACCOUNT NO-----" + acc);
        System.out.println("FIRST NAME--- " + fn);
        System.out.println("LAST NAME-------" + ln);
        System.out.println("EMAIL----------" + em);
        System.out.println("ADDRESS-------" + add);
        System.out.println("AADHAR-------" + aad);
        System.out.println("PAN NO------" + pan);
        System.out.println("DATE OF BIRTH--" + dob);
        System.out.println("MOBILE------" + mob);
        System.out.println("BALANCE-----" + bal);
        System.out.println("INTEREST----" + in);
        System.out.println("OVERDRAFT--" + over);
        operate(b);
    }

    public void printpassbook(Bank b) throws ClassNotFoundException, SQLException {
        System.out.println(" creating new file ");
        String filename = "";
        String Drivename = "";
        
  java.util.Date d = new java.util.Date();
        System.out.println(" enter a drive name here");
        Drivename = sc.next();
        filename = Drivename + ":\\" + b.getAccountno() +"[M.KUMAR BANK]"+ ".txt";

        File f = new File(filename);
        System.out.println("Your print will saved in" + filename);
        databaseconnect();
        ps = con.prepareStatement(" select * from bank where accountno=?");
        ps.setLong(1, b.getAccountno());
        rs = ps.executeQuery();
        //  ResultSetMetaData rsmd = rs.getMetaData();
        // int co = rsmd.getColumnCount();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f, true))) {

            while (rs.next()) {
                bw.newLine();
                bw.newLine();
                bw.append("  ACCOUNT NO----" + rs.getLong(1));
                bw.newLine();
                bw.append("  FIRSTNAME------" + rs.getString(3));
                bw.newLine();
                bw.append("  LASTNAME-------" + rs.getString(4));
                bw.newLine();
                bw.append("  EMAILID-------" + rs.getString(5));
                bw.newLine();
                bw.append("  ADDRESS--------" + rs.getString(6));
                bw.newLine();
                bw.append("  AADHAR NO------" + rs.getString(7));
                bw.newLine();
                bw.append("  PAN NO --------" + rs.getString(8));
                bw.newLine();
                bw.append("  DATE OF BIRTH--" + rs.getString(9));
                bw.newLine();
                bw.append("  MOBILE NUMBER---" + rs.getString(10));
                bw.newLine();
                bw.append("  BALANCE---------" + rs.getLong(11));
                bw.newLine();
                bw.append(" INTEREST amount--" + rs.getLong(12));
                bw.newLine();
                bw.append(" OVERDRAFT allow----" + rs.getLong(13));
                bw.newLine();
                bw.newLine();
                bw.write(" last printed on----" + d);
                bw.newLine();
                bw.write("`===========================================");
                bw.write("NOTE:: PASSWORD IS NOT SHOW AS A POLICY OF THE BANK");
                bw.write("`==========================================================================");
            }

            System.out.println(" PASSBOOK PRINTED SUCCESFULLY");
            System.out.println(" YOU FILE NAME WILL BE     " + b.getAccountno() + ".TXT");

        } catch (IOException ex) {
            System.err.println(" some problem occurred");
            System.err.println(" drive not found ");
            System.err.println(" file not copied ");
        }
        operate(b);
    }

    public void deposit(Bank b) {

        try {

            databaseconnect();
            ps = con.prepareStatement(" select balance from bank where accountno=?");
            ps.setLong(1, b.getAccountno());
            rs = ps.executeQuery();

            long bal = 0;
            long overdr = 0;
            long total = 0;
            long interest = 0;
            while (rs.next()) {
                bal = rs.getLong(1);

            }

            System.out.println("  Enter the amount that you want to deposits   ");
            long amt = sc.nextLong();

            total = bal + amt;

            b.setBalance(total);
            overdr = total * 20 / 100;
            b.setOverdraft(overdr);
            interest = total * 10 / 100;
            b.setInterest(interest);
            ps = con.prepareStatement("update bank set balance=?,overdraft=? ,interest=? where accountno=?");
            ps.setLong(1, b.getBalance());
            ps.setLong(2, b.getOverdraft());
            ps.setLong(3, b.getInterest());
            ps.setLong(4, b.getAccountno());
            int r = ps.executeUpdate();
            if (r > 0) {
                System.out.println(" BALANCE DEPOSITED  >>>>>");
                System.out.println(" your current balance is");
                System.out.println(b.getBalance());
                System.out.println("===================================");
            } else {
                System.out.println(" Amount not deposited");
            }
            operate(b);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Bankoperationimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void withdraw(Bank b) {

        try {
            long bal = 0;
            long overdr = 0;
            long total;
            long total1;
            long inte;
            long totaly = 0;
            long remove;
            long grand;
            System.out.println("  Enter the amount that you want to Withdraw  ");
            remove = sc.nextLong();
            databaseconnect();
            ps = con.prepareStatement(" select BALANCE ,OVERDRAFT from bank where ACCOUNTNO=?");
            ps.setLong(1, b.getAccountno());
            rs = ps.executeQuery();
            while (rs.next()) {
                bal = rs.getLong(1);
                overdr = rs.getLong(2);
            }

            total = bal;
            total1 = overdr;
            grand = total + total1;
            if (remove <= total) {

                totaly = total - remove;
                b.setBalance(totaly);

                System.out.println(" remainingn balance is");
                System.out.println(b.getBalance());
                inte = totaly * 10 / 100;
                b.setInterest(inte);
                System.out.println(b.getInterest());
                if (overdr < 1) {
                    b.setOverdraft(overdr);
                    System.out.println(b.getOverdraft());
                } else {

                    overdr = totaly * 20 / 100;

                    b.setOverdraft(overdr);
                    System.out.println(b.getOverdraft());
                }

                ps = con.prepareStatement("update bank set balance=?,overdraft=? ,interest=? where accountno=?");
                ps.setLong(1, b.getBalance());
                ps.setLong(2, b.getOverdraft());
                ps.setLong(3, b.getInterest());
                ps.setLong(4, b.getAccountno());
                int r = ps.executeUpdate();
                if (r > 0) {
                    System.out.println(" WITHDRAWAL SUCCESSFULL >>>>>");
                    System.out.println("===================================");
                    System.out.println(" your current balance is");
                    System.out.println(b.getBalance());
                    System.out.println("===================================");
                } else {
                    System.out.println("==============================");
                    System.out.println("TRANSACTION FAILED ");
                    System.out.println("==============================");
                }

            } else {
                System.out.println(" insufficient amount");
                System.out.println(" do you want use overdraft facility");
                String choos = sc.next();
                if (choos.equalsIgnoreCase("yes") || choos.equalsIgnoreCase("y")) {
                    System.out.println(" your overdraft amount is >>>>" + overdr);

                    if (overdr > 0) {
                        System.out.println(" enter the amount that you want to withdraw");
                        long with = sc.nextLong();

                        if (overdr >= with) {

                            long tota = overdr - with;
                            b.setOverdraft(tota);

                            ps = con.prepareStatement("update bank set overdraft=? where accountno=?");

                            ps.setLong(1, b.getOverdraft());

                            ps.setLong(2, b.getAccountno());
                            int r = ps.executeUpdate();
                            if (r > 0) {
                                System.out.println(" TRANSACTION SUCCESFULL >>>>>");
                                System.out.println("=======================================================");
                                System.out.println("YOU OVERDRAFT BALANCE REMAINING IS -" + b.getOverdraft());
                                System.out.println("=======================================================");
                            } else {
                                System.out.println("==============================");
                                System.out.println("TRANSACTION FAILED ");
                                System.out.println("==============================");
                            }

                        } else {
                            System.out.println(" your are withdrawing more than balance ");
                            System.out.println("pplease withdraw below RS  " + overdr);
                        }

                    } else {
                        System.out.println(" you dont have acces to overdraft now");
                        System.out.println(" may be low balance or your account is saving acc");
                    }
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Bankoperationimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            operate(b);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Bankoperationimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void help() {
        System.out.println(" ===THIS IS A HELP MENU====");
        System.out.println("=============================");
        System.out.println("please operate account if you have ");
        System.out.println(" if you dont have account first create it");
        System.out.println(" dont give fake info");
        System.out.println("kindly note your passwod and account no at the time of creating account");
        System.out.println("if any error occured restart the application ");
        System.out.println(" read carefully what type of data required fill in that format only");
        System.out.println(" EXAMPLE====== IF MOBILE NUMBER IS REQUIRED SO INSERT VALUE USING NUMBERIC KEY");
        System.out.println(" ELSE IT WILL GIVE ERROR");
        System.out.println("==================================================================");

        System.out.println("aNY FURTHER HELP CONTACT BRANCH MANAGER");
        System.out.println("                   Mr. Mintukumar B Chauhan");
        System.out.println("8655387871");
        System.out.println("           email--mintuc64@gmail.com                          ");

    }

    void exportfile(Bank b) throws ClassNotFoundException, SQLException {
        System.out.println(" export file to disk for if you requires than you  can just import it");
        System.out.println(" yopu dont need to create accoutn every time if you have this file");

        System.out.println(" creating new file ");
        String filename = "";
        String Drivename = "";

        System.out.println(" enter a drive name here");
        Drivename = sc.next();
        filename = Drivename + ":\\export"+ b.getAccountno()+".txt";

        File f = new File(filename);
        System.out.println("Your print will saved in" + filename);
        databaseconnect();
        ps = con.prepareStatement(" select * from bank where accountno=?");
        ps.setLong(1, b.getAccountno());
        rs = ps.executeQuery();
        //    ResultSetMetaData rsmd = rs.getMetaData();
        //  int co = rsmd.getColumnCount();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f, true)))
        {

            while (rs.next()) {

                bw.append(rs.getLong(1) + "-" + rs.getString(2) + "-" + rs.getString(3) + "-" + rs.getString(4) + "-" + rs.getString(5) + "-" + rs.getString(6) + "-" + rs.getString(7) + "-" + rs.getString(8) + "-" + rs.getString(9) + "-" + rs.getString(10) + "-" + rs.getLong(11) + "-" + rs.getLong(12) + "-" + rs.getLong(13));
            
            }

            System.out.println(" FILE EXPORTED SUCCESFULLY");
            System.out.println(" YOU FILE NAME WILL BE     " + filename);

       
        } catch (IOException ex) {
            Logger.getLogger(Bankoperationimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        operate(b);

    }

    void importfile() throws ClassNotFoundException,SQLException
    {
        databaseconnect();
            Bank b = new Bank();
            System.out.println(" please import the file if you have previously exported it ");
            System.out.println("ENTER DRIVE NAME WHERE IT IS SAVED");
            String drive = sc.next();
            System.out.println(" enter the file name");
            String file = sc.next();
            String path = "";
            path = drive + ":\\"+ file+".txt";
            
            File f = new File(path);
            
            
            st = con.createStatement();
            rs = st.executeQuery("select MAX(ACCOUNTNO) from bank");
            long tempacc = 0;
            long newacc = 0;
            while (rs.next()) {
                tempacc = rs.getLong(1);
            }
            
            if (f.exists()) {
                
                System.out.println(" file found");
                System.out.println("importing the data");
                
                try (BufferedReader br = new BufferedReader(new FileReader(f));) {
                    
                    String temp;
                    long ac = 0;
                    long bala = 0;
                    long in = 0;
                    long od = 0;
                    int count = 0;
                    //  r=  br.readLine().length();
                    
                    //  System.out.println("the lenth of the file is"+r);
                    String s = "";
                    System.out.println("FETCHING INTO DATABSE");
                    while ((s = br.readLine()) != null) {
                        
                        System.out.println("reading");
                        String[] info = s.split("-");
                        ac = Long.parseLong(info[0]);
                        bala = Long.parseLong(info[10]);
                        in = Long.parseLong(info[11]);
                        od = Long.parseLong(info[12]);
                        newacc = tempacc + 1;
                        b.setAccountno(newacc);
                        b.setPassword(info[1]);
                        b.setFname(info[2]);
                        b.setLname(info[3]);
                        b.setEmail(info[4]);
                        b.setAddress(info[5]);
                        b.setAadhar(info[6]);
                        b.setPanno(info[7]);
                        b.setDateofbirth(info[8]);
                        b.setMobile(info[9]);
                        b.setBalance(bala);
                        b.setInterest(in);
                        b.setOverdraft(od);
                    }
                    
                    ps = con.prepareStatement("insert into bank values(?,?,?,?,?,?,?,?,?,?,?,?,? )");
                    
                    ps.setLong(1, b.getAccountno());
                    ps.setString(2, b.getPassword());
                    ps.setString(3, b.getFname());
                    ps.setString(4, b.getLname());
                    ps.setString(5, b.getEmail());
                    ps.setString(6, b.getAddress());
                    ps.setString(7, b.getAadhar());
                    ps.setString(8, b.getPanno());
                    ps.setString(9, b.getDateofbirth());
                    ps.setString(10, b.getMobile());
                    ps.setLong(11, b.getBalance());
                    ps.setLong(12, b.getInterest());
                    ps.setLong(13, b.getOverdraft());
                    
                    int ret = ps.executeUpdate();
                    if (ret > 0) {
                        System.out.println(" data fetch into databse SUCCESFULLY");
                        System.out.println("============================================");
                        System.out.println(" YOUR ACCOUNT NO HAS BEEN CHANGED AS PER POLICY");
                        System.out.println("=================================================");
                        System.out.println("YOUOR NEW ACCOUNT NO IS------ " + b.getAccountno());
                        System.out.println("==========================================================");
                        System.out.println("  THE PASSWORD IS----------- " + b.getPassword());
                    } else {
                        System.out.println(" data not copied/imported");
                    }
                } catch (IOException e) {
                    System.err.println("file not imported");
                }
                
            } else {
                System.out.println(" file NOT FOUND");
            }
       

    }

}
