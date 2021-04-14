package pq_q1;
import java.util.*; 

// Complete the class Shelter here

public class Shelter
{
   //instance variables
   private int currentWeek;

   /**
    * Constructor for objects of class Shelter
    */
   public Shelter()
   {
      //complete the constructor
   }
   
   public int getCurrentWeek()
   {
       return currentWeek;
   }

   public void addAnimal(String aKind, String aName, String aDescription)
   {
       //complete this method
   }
   
    /**
    * populate
    */
   public void populate()
   {
      currentWeek = 50;
      addAnimal("cat","Billy","Black diabetic");
      addAnimal("cat","Zoe","Black and white");
      currentWeek = 51;
      addAnimal("dog","Rover","mongrel");
      currentWeek =52;
      addAnimal("tortoise","Speedy","Horsefield");
      currentWeek = 3;
   }
}

