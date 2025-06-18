import javax.swing.SwingUtilities;

public class main
{
    public static void main(String[]args)
    {
        SwingUtilities.invokeLater(()->
        {
            BankGUI bankApp = new BankGUI();
            bankApp.setVisible(true);
        });
    }
}