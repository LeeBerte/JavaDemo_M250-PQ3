import java.util.*; 

// Complete the classes Animal and Shelter here

public class Shelter
{
   private int currentWeek;
   private int currentId;

   /**
    * Constructor for objects of class Shelter
    */
   public Shelter()
   {
   }
   
    public int getCurrentId()
   {
       return currentId;
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
