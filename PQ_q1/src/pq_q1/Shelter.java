package pq_q1;
import java.util.*; 


// Complete the class Shelter here

public class Shelter
{
   //instance variables
   private int currentWeek;
   private  List<Animal> animals;



   
   /**
    * Constructor for objects of class Shelter
    */
   public Shelter()
   {
      //complete the constructor
      animals = new ArrayList<>();
      currentWeek = 1;

   }
   
   //getter for animals
   public List<Animal> getAnimals(){
      return animals;
   }

   public int getCurrentWeek()
   {
       return currentWeek;
   }

   public void addAnimal(String aKind, String aName, String aDescription)
   {
       //complete this method
       getAnimals().add(new Animal(getCurrentWeek(), aKind, aName, aDescription));
       

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


   // Returns boolean if the animal has been at the shelter over 4 weeks

   public boolean inTheLastMonth(Animal anAnimal){
      int calWeeks = 52;
      int currentWeekVal = currentWeek;
      int animalWeekVal = anAnimal.getWeek();
      int weeksAtShelter;
      if (currentWeekVal < animalWeekVal){
         weeksAtShelter = calWeeks - (animalWeekVal - currentWeekVal);
      }
      else{
         weeksAtShelter = currentWeekVal - animalWeekVal;
      }
      return weeksAtShelter <= 4;

   }

   //returns data of animal brought in within the last month
   public void showRecentAnimals(){
      if (getAnimals().isEmpty()){
         System.out.println("No recent animals");
      }
      else{
         for (Animal anAnimal : animals){
            if(inTheLastMonth(anAnimal)){
               System.out.println(anAnimal.getKind()
                        .concat(" ").concat(anAnimal.getName())
                        .concat(":").concat(anAnimal.getDescription()));
            }
         }
      }
   }
   public boolean homed(int aWeek, String aKind, String aName){
      boolean matched = false;
      for (Animal theAnimal : animals) {
         if((theAnimal.getWeek() == aWeek) 
             && (theAnimal.getKind().equals(aKind))
             && (theAnimal.getName().equals(aName))){
               getAnimals().remove(theAnimal);
                return matched = true;
          }
       }
      return matched;
    }
}

