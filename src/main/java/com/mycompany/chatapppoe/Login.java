/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapppoe;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Student
 */
class Login {
    
    // Creating an account
    String UserName;
    String Password;
    String CellPhoneNumber;
    String FirstName;
    String LastName;
        //Creating a non-void method to check UserName validation
    boolean checkUserName(String UserName){
        //LETI_
        //if contains '_' end if.
        // conditional statement
        
    
        if(UserName.contains("_")&& UserName.length()<=5){
        return true;
    } else {
            System.out.println("Please ensure that your email contains an underscore and is  not more than five characters long");
            return false;
            }
        // Creating a non void method to check  password validation
    }
    boolean checkPassword(String Password){
        /**/
        // Ch&&sec@ke99!
        // if  password is atleast eight characters long
        // if password contains capital letter
        // if password contains special letter
        // if password contains a number
        
       if (Password .length ()>=8){
                   System.out.println("password successfully captured");

        return true;
    } else {
      System.out.println("password is not correctly formatted;Please ensure that your password contaist eight characters,a capital letter,a number, and a special character");
                             return false;
       }

    } 

           // creating a return method to check cellphone number
          public boolean checkCellPhoneNumber(String CellPhoneNumber){
              
              //declaring a variable to store the phone number pattern
              String regex = "^(\\+27|0)[6-8][0-9]{8}$";
              
              //pattern object to compile the regex pattern
              Pattern pattern = Pattern.compile(regex);
              
              //matcher object to compare the phone number to the pattern
              Matcher matcher = pattern.matcher(CellPhoneNumber);
              
              //return true if pattern matches the phone number
              return matcher.matches();
         }
    
    

       
    
    // Creating a void method
    void registeruser(){
    
                       Scanner input =new Scanner(System.in);

        System.out.println("\n======REGISTER======");
        /**/
        //nextInt is used to read an integer from the scanner object
        //nextDouble() is used to read a double from the Scanner object
        //nextLine is used  for string
        
        System.out.println("Enter UserName:");
        UserName= input.nextLine();
        
                
        System.out.println("Enter Password:");
        Password =input.nextLine();
        
        System.out.println("Enter CellPhoneNumber:");
        CellPhoneNumber = input.nextLine();

        
        
        while(!checkCellPhoneNumber(CellPhoneNumber)){
            System.out.println("CellPhone Number incorectly formatted or does not contain international code");
            System.out.println("Re-enter CellPhoneNumber");
            CellPhoneNumber=input.nextLine();
        }
            // proceed if registration is succesful
          
        if(UserName == null){
            System.out.println("no User registerd yet");
            return;
        }
        int attempts=3;
        boolean success=false;
        
        System.out.println("\n====LOGIN====");
        
        while(attempts>0 && !success){
            
            System.out.println("Enter UserName");
            String UserName =input.nextLine();
            
            System.out.println("Enter Password");
            String Password = input.nextLine();
            
            System.out.println("Enter CellPhone Number ");
            String CellPhoneNumber =input.nextLine();
             
            if(UserName.equals(UserName)&& Password.equals(Password)&& CellPhoneNumber.equals(CellPhoneNumber)){
                success = true;
            }else{
                attempts--;
                System.out.println("Login failed.attempts left:"+attempts);
            }
        
             
        
    }
    
        
    
            if(!success){
                System.out.println("Account locked ");
            }
    }
   
            
    }
    

