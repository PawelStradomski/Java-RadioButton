
package radiobutton;
/**
 * @author pawelstradomski
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
        
public class RadioButton extends JFrame
{
    RadioButton()
    {
        super("Przelacznik RadioButton");
        this.setBounds(600, 300, 400, 400);
        initComponent();
        this.setDefaultCloseOperation(3);
    }
    public void initComponent()
    {
        this.getContentPane().add(panel, BorderLayout.NORTH);
        this.getContentPane().add(panel2, BorderLayout.CENTER);
        panel2.add(etykieta);
        
        JRadioButton malyPrzelacznik = new JRadioButton("Maly", false);//true/false - zaznaczony/odznaczony
        JRadioButton sredniPrzelacznik = new JRadioButton("Sredni");
        JRadioButton duzyPrzelacznik = new JRadioButton("Duzy");
        
        groupSize.add(malyPrzelacznik);
        groupSize.add(sredniPrzelacznik);
        groupSize.add(duzyPrzelacznik);
        
        panel.add(malyPrzelacznik);
        panel.add(sredniPrzelacznik);
        panel.add(duzyPrzelacznik);
        
        malyPrzelacznik.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
               etykieta.setFont(new Font("Serif", Font.ITALIC, 20));
            }
        });
        
       
        
    }
    JLabel etykieta = new JLabel("TestCzcionki");
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    ButtonGroup groupSize = new ButtonGroup();

    
    public static void main(String[] args) {
        new RadioButton().setVisible(true);
    }
    
}
