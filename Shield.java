/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategypattern;

/**
 *
 * @author shaniamaeucag
 */
public class Shield implements DefenseStrategy {
    
    @Override
    public void defend(){
        System.out.println("Using a shield to defend!");
    }
    
}
