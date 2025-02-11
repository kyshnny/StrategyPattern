/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategypattern;

/**
 *
 * @author shaniamaeucag
 */
public class Character {
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;
    
    public Character(AttackStrategy attackStrategy, DefenseStrategy defenseStrategy){
        this.attackStrategy = attackStrategy;
        this.defenseStrategy = defenseStrategy;
    }
    
    public void attack(){
        attackStrategy.attack();
    }
    
    public void defend(){
        defenseStrategy.defend();
    }
    
}
