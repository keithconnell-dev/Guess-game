//ch6expg234	Game-Zone Project
import javax.swing.JOptionPane;
public class RandomGuess {
public static void main(String[] args) {
		
final int LOW = 1;
final int HIGH = 10;
int userGuess, magicNumber;
int attempts = 1;
String msg; 
magicNumber = (int) (Math.random() * HIGH) + LOW;

userGuess = Integer.parseInt(JOptionPane.showInputDialog(
null, "Please enter a # between " + LOW + " and " + HIGH));

while (userGuess != magicNumber) {
	if (userGuess > magicNumber) {
	msg = "Sorry, too high!"; } 
	else { 
	msg = "Sorry, too low!"; } 

userGuess = Integer.parseInt(JOptionPane.showInputDialog(
null, msg+"\nPlease enter a # between " + LOW + " and " + HIGH));
++attempts;								}//while

JOptionPane.showMessageDialog(null, "YoU WiN!! \nThe magic number was: " + magicNumber + ".\nYou took " + attempts + " attempt(s).");


}} 