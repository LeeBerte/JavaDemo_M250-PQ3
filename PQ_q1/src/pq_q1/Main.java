package pq_q1;


/**
 *
 * @author lee
 */
public class Main {
    public static void main(String[] args) {
Shelter s = new Shelter();
s.populate();
System.out.println(s.getAnimals().size()); //4
System.out.println(s.homed(50,"cat","Billy")); // true
System.out.println(s.getAnimals().size()); //3
System.out.println(s.homed(51,"cat","Billy")); // false
System.out.println(s.getAnimals().size()); //3
System.out.println(s.homed(50,"dog","Billy")); // false
System.out.println(s.getAnimals().size()); //3
System.out.println(s.homed(50,"cat","Puss")); // false
System.out.println(s.getAnimals().size()); //3


    
    }
    
}
