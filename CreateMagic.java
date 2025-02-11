/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategypattern;

/**
 *
 * @author shaniamaeucag
 */
public class CreateMagic implements DefenseStrategy {
    
    @Override
    public void defend(){
        System.out.println("Creating a magic barrier for defense!");
    }
    
}
