/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq_q2;

/**
 *
 * @author lee
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shelter s = new Shelter();
        s.populate();
        s.showRecentAnimals();
        s.homed(50, "cat", "Zoe");
    }
}
