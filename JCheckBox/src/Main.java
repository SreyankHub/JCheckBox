//imports
import javax.swing.*;
import java.awt.*;


public class Main  {

    public static void main(String[] args) {

        //checkbox objects and its configs
        JCheckBox box = new JCheckBox("Are You a Human?");
        box.setSize(new Dimension(100,100));
        box.setFont(new Font("Font",Font.BOLD,25));
        box.setFocusable(false);

        //button object and its configs
        JButton button = new JButton("Submit");
        button.setSize(150,150);
        button.setFocusable(false);
        button.addActionListener(x -> System.out.println(box.isSelected()));

        //JFrame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        frame.add(button);
        frame.add(box);

        frame.pack();
        frame.setVisible(true);






    }
}
