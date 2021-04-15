package pq_q1;

/**
 * description of class Animal.
 * 
 * @author M250 module team 
 * @version v1.0
 */
public class Animal
{
   // instance variables
   private int week; // a number from 1 to 52
   private String kind;
   private String name;
   private String description;
   
   /**
    * Constructor for objects of class Animal
    */
   public Animal(int aWeek, String aKind, String aName, String aDescription)
   {
      week = aWeek;
      kind = aKind;
      name = aName;
      description = aDescription;
   }

   /**
    * getter for week
    */
   public int getWeek()
   {
      return week;
   }
   
   /**
    * getter for type
    */
   public String getKind()
   {
      return kind;
   }
   
   /**
    * getter for name
    */
   public String getName()
   {
      return name;
   }
   
   /**
    * getter for description
    */
   public String getDescription()
   {
      return description;
   }
   
   /**
    * setter for description
    * Note - concatenates new description to end of existing one
    */
   public void setDescription(String moreDescription)
   {
      description = description + " " + moreDescription;
   }
   
   /**
     * A simple equals method
     */
    @Override
    public boolean equals(Object o)
    {
        Animal a = (Animal) o;
        return getKind().equals(a.getKind())
                && getWeek() == a.getWeek()
                && getName().equals(a.getName());
    }

    /**
     * hashCode
     */
    @Override
    public int hashCode()
    {
        return getName().length();
    }
}
