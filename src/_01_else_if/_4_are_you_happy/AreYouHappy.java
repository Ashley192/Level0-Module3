package _01_else_if._4_are_you_happy;
import javax.swing.JOptionPane;

public class AreYouHappy {
    public static void main(String[] args) {
String areyouhappy=JOptionPane.showInputDialog("Are you happy?");{

if (areyouhappy.equals("yes")){
JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
}
if (areyouhappy.equals("no")){
    String noOrYes=JOptionPane.showInputDialog( "Do you want to be happy?");

    if (noOrYes.equals("no")){
        JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
    }
    if (noOrYes.equals("yes")){
        JOptionPane.showMessageDialog(null, "Change something.");
    }


    }}
}
}