/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategypattern;

/**
 *
 * @author shaniamaeucag
 */
public class SwingSword implements AttackStrategy {
    
    @Override
    public void attack(){
        System.out.println("Knight attacks with a sword!");
    }
    
}
