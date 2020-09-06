package com.nirzhor.exceptions;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {

    public static void show() throws IOException {

      var account = new Account();

        try {
            account.withdraw(10);
        } catch (AccountException e) {
          ///  System.out.println(e.getMessage());
          ///  e.printStackTrace();
          var cause = e.getCause();
            System.out.println(cause.getMessage());
        }
//        catch (InsufficientFundsException e) {
//            System.out.println(e.getMessage());
//        }

//        try {
//            account.deposit(-1);
//        } catch (IOException e) {
//            /// e.printStackTrace();
//            System.out.println("Logging");
//            throw e;
//        }


        // Unchecked or runtime exceptions
        // sayHello(null);

        // Checked Exceptions
         //  var reader = new FileReader("file.txt");

        // FileReader reader = null;

        // try with resources
//        try (
//                var reader = new FileReader("file.txt");
//                var writer = new FileWriter("...");
//                ) {
//            // reader = new FileReader("file.txt");
//            var value = reader.read();
           // new SimpleDateFormat().parse("");

           }
//        catch ( IOException | ParseException e){
//            System.out.println("Could not read data.");
//        }

//        catch (FileNotFoundException e) {
//            // e.printStackTrace();
//            // System.out.println(e.getMessage());
//            System.out.println("File does not exist.");
//        }
//        catch (IOException e){
//            System.out.println("Could not read data.");
//        }
//        catch (ParseException e) {
//            e.printStackTrace();
//        }
        // finally
//        finally {
//            if( reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }



    }

//    public static void sayHello(String name) {
//
//        System.out.println(name.toUpperCase());
//    }
//}
