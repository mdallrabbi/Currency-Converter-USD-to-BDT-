/**
 * Project Name : USD to BDT Converter.
 * Doller Rate : 78.
 * github user name : mdallrabbi
 * Blog : http://mdallrabbi.blogspot.com/
 * Created by mdallrabbi on 5/8/16.
 */

// Importing Java Classes
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ConvertOparation extends JPanel{

    private JLabel inputValue, outputValue, convertedResult;
    private JTextField usdoller;

    //  Constructor: Sets up the main GUI components.

    public ConvertOparation(){

        inputValue = new JLabel("Enter The Ammount In Doller:");
        outputValue = new JLabel("The Ammount In Doller Is:");
        convertedResult =new JLabel("[    ]");

        usdoller = new JTextField(5);
        usdoller.addActionListener( new TempListener());

        add(inputValue);
        add(usdoller);
        add(outputValue);
        add(convertedResult);

        setPreferredSize(new Dimension(600, 420));
        setBackground(Color.ORANGE);
    }


    //  Represents an action listener for the Doller Input.

    private class TempListener implements ActionListener
    {

        //  Performs the conversion when the enter key is pressed in
        //  the text field.

        public void actionPerformed ( ActionEvent event)
        {

            int USD, BDT;
            String text = usdoller.getText();

            USD = Integer.parseInt (text);
            BDT = (USD * 78);

            convertedResult.setText(Integer.toString(BDT));
        }
    }


    public static void main (String[] args)
    {
        JFrame frame = new JFrame("USD to BDT Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ConvertOparation ammount= new ConvertOparation();

        frame.getContentPane().add(ammount);
        frame.pack();
        frame.setVisible(true);
    }


}
