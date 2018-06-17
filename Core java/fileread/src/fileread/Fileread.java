
package fileread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Fileread
 {

    public static void main(String[] args) 
    {   
     
        
        java.util.Date  d= new java.util.Date();
        System.out.println(d);
    }
//{        Scanner sc= new Scanner(System.in); 
//      
//   
//                 System.out.println("ENTER DRIVE NAME WHERE IT IS SAVED");
//        String drive=sc.next();
//        System.out.println(" enter the file name");
//        String file=sc.next();
//        String path="";
//        path=drive+":\\"+file+".txt";
//        
//        File f= new File(path);
//      try(BufferedReader br= new BufferedReader(new FileReader(path));)
//            { 
//               
//         
//
//                String temp;
//                int r=0;
//               int count=0;
//                r=  br.readLine().length();
//                String [] store= new String[r];
//                System.out.println("the lenth of the file is"+r);
//                String s="";
//                System.out.println("fournnnnnn");
//                while((s=br.readLine())!=null)
//                {  count=0;
//                for(int i=count;i<=count;i++)
//                {
//                     System.out.println("reading");
//                     String [] info=s.split("----");
//                   
//                    
//                    store[count] = info[1];
//                    
//                    System.out.println(store[count]);
//                   
//                } 
//                 count++;
//                }
//                
//    
//    
//    
//    
//  }
//      catch(IOException e)
//      {
//          System.out.println(" file not copied");
//      }
//}

}
