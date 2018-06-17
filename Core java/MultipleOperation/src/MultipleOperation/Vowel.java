                            package MultipleOperation;


                            public class Vowel extends MultipleOperation
                            {

                            void vdisplay()
                            {

                              char vowel;

                              System.out.println(" enter a single character ");
                              System.out.println(" notice------ if you type more than 1 character ");
                              System.out.println(" the first character of the  word is taken as parameter");
                              vowel=s.next().charAt(0);

                              switch(vowel)
                              { 
                                  case 'a':
                                  case 'e':
                                  case 'i':
                                  case 'o':
                                  case 'u':
                                  case 'A':
                                  case 'E':
                                  case 'I':
                                  case 'O':
                                  case 'U':
                                      System.out.println("it is vowel");
                                      break;
                                      default:
                                          System.out.println(" it is consonant");
                                          break;



                              }

                              confirm();


                            }




                            void confirm()
                            {       
                            int main;


                            System.out.println("====CHOOSE OPTION======");
                            System.out.println("1) to try again ");
                            System.out.println(" 2)+++ go to main programme ");
                            System.out.println("3)+++exit from here ");
                            main=s.nextInt();
                            switch(main)
                            {
                            case 1:
                            vdisplay();
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