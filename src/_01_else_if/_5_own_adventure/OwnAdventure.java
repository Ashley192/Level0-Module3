package _01_else_if._5_own_adventure;
import javax.swing.JOptionPane;


public class OwnAdventure {
public static void main(String[] args) {
String enterOrNot=JOptionPane.showInputDialog("Every October 31st, a haunted mansion appears on Ghost St., San Diego 92130. This year, you go trick or treating with your friends on Ghost St. and you see the mansion looming over you. Do you dare to enter?"); {
    
if (enterOrNot.equals ("no")){
    JOptionPane.showMessageDialog(null,"That's disappointing to hear.");
}
if (enterOrNot.equals ("yes")){
    String fightOrCry=JOptionPane.showInputDialog(null, "BOOM! You hear eerie voices and a dark figure slowly approaching you. Suddenly, there's a cackle of a witch and somebody grabs you and your friends from behind! Do you choose to fight back or cry?");

if (fightOrCry.equals("fight")){
JOptionPane.showMessageDialog(null,"Congratulations! You and your friends escaped! We suggest you to never enter a random stranger's house again.");
}
if (fightOrCry.equals("cry")){
JOptionPane.showMessageDialog(null,"You are now trapped in the haunted mansion.");}
}
}

}
}