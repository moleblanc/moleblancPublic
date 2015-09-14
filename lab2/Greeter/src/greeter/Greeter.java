package greeter;


/**
   A class for producing simple greetings.
*/
public class Greeter
{     /**
         Constructs a Greeter object that can greet a person or entity.
         @param aName the name of the person or entity who should
         be addressed in the greetings.
      */

      public Greeter(String aName)
      {      name = aName;
      }
      /**
         Greet with a "Hello" message.
         @return a message containing "Hello" and the name of the greeted person or entity.
      */
      public String sayHello()
      {      return "Hello, " + name + "!";
      }
      /**
       * setName
       * Set field variable 'aName' in an instance of a greeter object
       * @param aName a string to set the field value name to
       * 
       */
      
      public void setName(String aName){
          name = aName;
      }
      
      public String getName(){
          return name;
      }
      /**
       * swapName 
       * swaps names of two greeter objects
       * @param greeter1 greeter object whose name field value is 
       * to be swapped with the current object's name field value
       */
      public void swapName(Greeter greeter1){
          String temporGreetername = name;
          name = greeter1.name;
          greeter1.name = temporGreetername;
      }
      private String name;
}
