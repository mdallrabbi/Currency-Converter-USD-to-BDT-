/**
 * Project Name : USD to BDT Converter.
 * Doller Rate : 78.
 * github user name : mdallrabbi
 * Blog : http://mdallrabbi.blogspot.com/
 * Created by mdallrabbi on 5/8/16.
 */

//  Creates and displays the currency converter GUI.

import javax.swing.JFrame;

public class Usdoller {
    public static void main( String[] args)
    {

        JFrame frame = new JFrame("US Doller");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ConvertOparation ammount = new ConvertOparation();

        frame.getContentPane().add(ammount);
        frame.pack();
        frame.setVisible(true);
    }
}
