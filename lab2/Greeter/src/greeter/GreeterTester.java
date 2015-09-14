package greeter;

import greeter.Greeter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moleblanc
 */

public class GreeterTester
{
   public static void main(String[] args)
   {
      /**
       * Test greeter using main function
       *
       **/
      Greeter worldGreeter = new Greeter("World");
      String greeting = worldGreeter.sayHello(); 
      System.out.println(greeting);
      /**
       * Sets two object references to same object, then setName on the first 
       *    reference, and observe how the other object reference returns 
       *    the setName since both object references share the same object
       **/
     
      
      Greeter greeterI = new Greeter("originalName");
      Greeter greeterII = greeterI;
      greeterI.setName("newName");
      System.out.println("GreeterII's name is" + greeterII.getName());
      System.out.println("GreeterI's name is" + greeterI.getName());
      
      Greeter formerGreeter = new Greeter("formerName");
      Greeter latterGreeter = new Greeter("latterName");
      formerGreeter.swapName(latterGreeter);
      System.out.println("formerGreeter's name is" + formerGreeter.getName());
      System.out.println("latterGreeter's name is" + latterGreeter.getName());
      
   }
}