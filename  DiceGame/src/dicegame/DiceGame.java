/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dicegame;


import javax.swing.JOptionPane;
import oop.ct1.dice.Dice;
public class DiceGame {

 
    public static void main(String[] args) {
        // TODO code application logic here
        
      
        
        int guess = Integer.parseInt(JOptionPane.showInputDialog("Enter a number form 1 to 16"));
        
        Dice di = new Dice();
        di.roll();
        if(di.getValue() == guess){
            JOptionPane.showMessageDialog(null, "You guessed correctly");
        }else if(di.getValue() < guess){
            JOptionPane.showMessageDialog(null, "Wrong, guess lower");
        }else if(di.getValue() >guess ){
            JOptionPane.showMessageDialog(null,"Wrong, guess higher");
        }
        JOptionPane.showMessageDialog(null, "the dice was "+di.getValue());
        
    }
    
}
