package com.nirzhor;

import com.nirzhor.exceptions.ExceptionsDemo;
import com.nirzhor.generics.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

//        var list = new List();
//        list.add(Integer.valueOf(1));
//        list.add("1");
//        list.add(new User());
//
//        int number = (int)list.get(1);


	// write Exception
//        try {
//            ExceptionsDemo.show();
//        } catch (Throwable e) {
//           // e.printStackTrace();
//            System.out.println("An unexpected error occured.");
//        }


//        var list = new GenericList<Integer>();
//        list.add(1);
//        int number = list.get(0);


        // int -> Integer
        // float -> Float
        // boolean -> Boolean


        /// var list = new GenericList<Integer>();
//        GenericList<Integer> numbers = new GenericList<>();
//        numbers.add(1); // Boxing
//        int number = numbers.get(0); // Unboxing

      //  new GenericList<Integer>();


//       var user1 = new User(10);
//       var user2 = new User(20);
//
//       if ( user1.compareTo(user2) < 0 )
//           System.out.println("user1 < user2");
//       else if ( user1.compareTo(user2) == 0)
//           System.out.println("user1 == user2");
//       else
//           System.out.println("user1 > user2");


//        var max = Utils.max( 1 , 3 );
//        System.out.println(max);
//
//        var max2 = Utils.max(new User(20),new User(10));
//        System.out.println(max2);

        // Utils.print(1 ,"15");

//        User user = new Instructor(10);
//        Utils.printUser(new Instructor(10));

        var instructor = new GenericList<Instructor>();
        var users = new GenericList<User>();
      //  Utils.printUsers(instructor);
       // Utils.printUsers(new GenericList<String>());

    }
}
