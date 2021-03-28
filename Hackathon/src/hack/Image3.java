package hack;


import java.awt.*;
import javax.swing.*;

public class Image3 extends JFrame{
  
    private ImageIcon image3;
    private JLabel label3;

    Image3(){
        setLayout(new FlowLayout());
        image3=new ImageIcon(getClass().getResource("PT.png"));
        label3 = new JLabel(image3);
        add(label3);

    }
}
