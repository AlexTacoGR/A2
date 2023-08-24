//this is the new version of the AlexTecSystem
//designed to be as a kind of privet network
//inspired by the terminals of Fallout 4
package a2;

//imports of A1:
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.*;       //this is the import for the GUI creation
import java.awt.*; //this is for the gui to have a kind of list
import java.io.*; 

//imports of A2
import java.io.IOException;  // Import the IOException class to handle errors

public class A2 {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        float sv = 1.2f;
        
        System.out.println("======AlexTecSystems======");
        System.out.println("system version: " + sv);
        System.out.print("enter acount password: ");
        
        Scanner sinput = new Scanner(System.in);
        String userinput = sinput.nextLine();          //asking the user to input there account's code
        
        if (userinput.equals("user1")) {
            while (true) {
                String user = "user1"; //CHANGE BASED ON USER
                System.out.println("======AlexTecSystems======");//users interface ***
                //logo
                File logo = new File("C:\\Users\\Metaxa Fashion\\Desktop\\netbeans JAVA projects\\A2\\AlexTeclogo.txt.txt");
                        Scanner scner = new Scanner(logo); //Creating Scanner instance to read File in Java
                        int lineNumberoflogo = 1;
                        while(scner.hasNextLine()){
                            String line = scner.nextLine();
                            System.out.println(line);
                            lineNumberoflogo++;
                        }      
                        System.out.println(" ");
                        System.out.println(" ");
                //end of logo
                System.out.println("system version: " + sv);
                System.out.println(" ");
                System.out.println("[send T-mesege] type: st");
                System.out.println("[read T-meseges] type: rm");
                System.out.println(" ");
                System.out.print("> ");
                Scanner sinput2 = new Scanner(System.in);
                String userinputc = sinput2.nextLine();          //asking the user to input there account's code
                if (userinputc.equals("st")) {             //SENDING MESEGES COMAND
                    System.out.println("T-meseges ");
                    System.out.println("to who do you wish to send a T-mesege?");
                    System.out.println("user1");
                    System.out.println("user2");
                    System.out.print("> ");
                    try {
                        Scanner sinput3 = new Scanner(System.in);
                        String userinputcc = sinput3.nextLine();          //asking the user to input there account's code
                        FileWriter myWriter = new FileWriter(userinputcc + ".txt");
                        System.out.println(" type the T-mesege's contents: ");
                        String userinputccc = sinput3.nextLine();          //asking the user to input there account's code
                        myWriter.write("FROM: " + user + "\n" + userinputccc);
                        System.out.println(" ");
                        System.out.println("T-messege was succesfuly writen");
                        System.out.println("reminder: if you type the name of the user you wish \n to send the T-mesege to wrong, you misgt \n send it to someone else or to the void");
                        System.out.println("thanks for useing AlexTec :) ");
                        myWriter.close();
                        
                    } catch (Exception e) {
                        System.out.println("ERROR: error on file typing on T-mesege sending");
                    }
                }
                if (userinputc.equals("rm")) {              //reading meseges
                    System.out.println("loading meseges...");
                    File text = new File("C:\\Users\\Metaxa Fashion\\Desktop\\netbeans JAVA projects\\A2\\" + user +".txt");//#CHANGE BASED ON THE USER
                        Scanner scnr = new Scanner(text); //Creating Scanner instance to read File in Java
                        int lineNumber = 1;
                        while(scnr.hasNextLine()){   //TEST
                            String line = scnr.nextLine();
                            System.out.println("line " + lineNumber + " :" + line);
                            lineNumber++;
                        }      
                        System.out.println(" ");
                        System.out.println(" ");
                }
            }
            
        } else {
            if (userinput.equals("user2")) {
                while (true) {
                String user = "user2"; //CHANGE BASED ON USER 
                System.out.println("======AlexTecSystems======");//users interface ***
                //logo
                File logo = new File("C:\\Users\\Metaxa Fashion\\Desktop\\netbeans JAVA projects\\A2\\AlexTeclogo.txt.txt");
                        Scanner scner = new Scanner(logo); //Creating Scanner instance to read File in Java
                        int lineNumberoflogo = 1;
                        while(scner.hasNextLine()){
                            String line = scner.nextLine();
                            System.out.println(line);
                            lineNumberoflogo++;
                        }      
                        System.out.println(" ");
                        System.out.println(" ");
                //end of logo
                System.out.println("system version: " + sv);
                System.out.println(" ");
                System.out.println("[send T-mesege] type: st");
                System.out.println("[read T-meseges] type: rm");
                System.out.println(" ");
                System.out.print("> ");
                Scanner sinput2 = new Scanner(System.in);
                String userinputc = sinput2.nextLine();          //asking the user to input there account's code
                if (userinputc.equals("st")) {             //SENDING MESEGES COMAND
                    System.out.println("T-meseges ");
                    System.out.println("to who do you wish to send a T-mesege?");
                    System.out.println("user1");
                    System.out.println("user2");
                    System.out.print("> ");
                    try {
                        Scanner sinput3 = new Scanner(System.in);
                        String userinputcc = sinput3.nextLine();          //asking the user to input there account's code
                        FileWriter myWriter = new FileWriter(userinputcc + ".txt");
                        System.out.println(" type the T-mesege's contents: ");
                        String userinputccc = sinput3.nextLine();          //asking the user to input there account's code
                        myWriter.write("FROM: " + user + "\n" + userinputccc);
                        System.out.println(" ");
                        System.out.println("T-messege was succesfuly writen");
                        System.out.println("reminder: if you type the name of the user you wish \n to send the T-mesege to wrong, you misgt \n send it to someone else or to the void");
                        System.out.println("thanks for useing AlexTec :) ");
                        myWriter.close();
                        
                    } catch (Exception e) {
                        System.out.println("ERROR: error on file typing on T-mesege sending");
                    }
                }
                if (userinputc.equals("rm")) {              //reading meseges
                    System.out.println("loading meseges...");
                    File text = new File("C:\\Users\\Metaxa Fashion\\Desktop\\netbeans JAVA projects\\A2\\" + user +".txt");//#CHANGE BASED ON THE USER
                        Scanner scnr = new Scanner(text); //Creating Scanner instance to read File in Java
                        int lineNumber = 1;
                        while(scnr.hasNextLine()){   //TEST
                            String line = scnr.nextLine();
                            System.out.println("line " + lineNumber + " :" + line);
                            lineNumber++;
                        }      
                        System.out.println(" ");
                        System.out.println(" ");
                }
            }
                
            } else {
            }
        }
    }
    
}
