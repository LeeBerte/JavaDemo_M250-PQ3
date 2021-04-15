package pq_q2;
import java.util.*;

// Complete the classes Animal and Shelter here
public class Shelter {

    private int currentWeek;
    private int currentId;

    // add a new variable to reference an Animal Obj as map
    private Map<Integer, Animal> animals;

    /**
     * Constructor for objects of class Shelter
     */
    public Shelter() {
        animals = new HashMap<>();
        currentWeek = 1;
        currentId = 0;
    }

    // getter for animals
    public Map<Integer, Animal> getAnimals() {
        return animals;
    }

    public int getCurrentId() {
        return currentId;
    }

    public int getCurrentWeek() {
        return currentWeek;
    }

    /**
     * create a new instance of animal
     */
    public void addAnimal(String aKind, String aName, String aDescription) {
        // complete this method
        currentId++;
        getAnimals().put(currentId, new Animal(getCurrentWeek(), aKind, aName, aDescription));

    }

    /**
     * populate
     */
    public void populate() {
        currentWeek = 50;
        addAnimal("cat", "Billy", "Black diabetic");
        addAnimal("cat", "Zoe", "Black and white");
        currentWeek = 51;
        addAnimal("dog", "Rover", "mongrel");
        currentWeek = 52;
        addAnimal("tortoise", "Speedy", "Horsefield");
        currentWeek = 3;
    }

    /**
     *   Returns Boolean if the animal has been at the shelter over 4 weeks
     */
    public boolean inTheLastMonth(Animal anAnimal) {
        int calWeeks = 52;
        int currentWeekVal = currentWeek;
        int animalWeekVal = anAnimal.getWeek();
        int weeksAtShelter;
        if (currentWeekVal < animalWeekVal) {
            weeksAtShelter = calWeeks - (animalWeekVal - currentWeekVal);
        } else {
            weeksAtShelter = currentWeekVal - animalWeekVal;
        }
        return weeksAtShelter <= 4;

    }

    // returns data of animal brought in within the last month
    public void showRecentAnimals() {
        if (getAnimals().isEmpty()) {
            System.out.println("No recent animals");
        } else {
            for (Animal anAnimal : animals.values()) {
                if (inTheLastMonth(anAnimal)) {
                    System.out.println(anAnimal.getKind().concat(" ").concat(anAnimal.getName()).concat(":")
                            .concat(anAnimal.getDescription()));
                }
            }
        }
    }

    /**
     * remove data if animal matches arguments
     *
     * @param aWeek
     * @param aKind
     * @param aName
     * @return
     */
    public boolean homed(int aWeek, String aKind, String aName) {
        boolean matched = false;
        for (Integer anID : getAnimals().keySet()) {
            if ((animals.get(anID).getWeek() == aWeek) && (animals.get(anID).getKind().equals(aKind))
                    && (animals.get(anID).getName().equals(aName))) {
                getAnimals().remove(anID);
                return matched = true;
            }
        }
        return matched;
    }
}
