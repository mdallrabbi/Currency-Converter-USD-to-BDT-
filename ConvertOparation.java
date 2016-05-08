import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ConvertOparation extends JPanel{

    private JLabel inputValue, outputValue, convertedResult;
    private JTextField usdoller;


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

        setPreferredSize(new Dimension(500, 50));
        setBackground(Color.ORANGE);
    }


    private class TempListener implements ActionListener
    {

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


