import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App {
    public static void main(String[] args){
      JLabel label = new JLabel();
      label.setText("Hi");
      label.setVerticalAlignment(JLabel.BOTTOM);
      label.setHorizontalAlignment(JLabel.RIGHT);
      label.setVisible(true);
      label.setLayout(null);
      label.setBounds(0, 0, 75, 75);
       JPanel redpanel = new JPanel();
       redpanel.setBackground(Color.red);
    redpanel.setBounds(0, 0, 250, 250);

    JPanel bluepanel = new JPanel();
       bluepanel.setBackground(Color.blue);
    bluepanel.setBounds(250, 0, 250, 250);

    JPanel greenpanel = new JPanel();
       greenpanel.setBackground(Color.green);
    greenpanel.setBounds(0, 250, 250, 250);
       
    JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLayout(null);
       frame.setSize(750, 750);
       frame.setVisible(true);
       frame.add(redpanel);
       frame.add(bluepanel);
       frame.add(greenpanel);
       redpanel.add(label);
    }
}
