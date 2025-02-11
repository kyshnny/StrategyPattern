/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategypattern;

/**
 *
 * @author shaniamaeucag
 */
public class StrategyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Character knightShield = new Knight(new Shield());
        knightShield.attack();
        knightShield.defend();
        
        System.out.println();
        
        Character knightCreateMagic = new Knight(new CreateMagic());
        knightCreateMagic.attack();
        knightCreateMagic.defend();
        
        System.out.println();
        
        Character knightDodge = new Knight(new Dodge());
        knightDodge.attack();
        knightDodge.defend();
        
        System.out.println();
        
        Character wizard = new Wizard();
        wizard.attack();
        wizard.defend();
        
        System.out.println();
        
        Character archer = new Archer();
        archer.attack();
        archer.defend();
        
    }
    
}
