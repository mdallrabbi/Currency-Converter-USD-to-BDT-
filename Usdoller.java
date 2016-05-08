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
