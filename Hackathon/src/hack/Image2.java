package hack;


import java.awt.*;
import javax.swing.*;

public class Image2 extends JFrame{
  
    private ImageIcon image2;
    private JLabel label2;

    Image2(){
        setLayout(new FlowLayout());
        image2=new ImageIcon(getClass().getResource("letter copy 2.jpg"));
        label2 = new JLabel(image2);
        add(label2);

    }
}
