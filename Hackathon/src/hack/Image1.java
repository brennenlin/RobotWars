package hack;


import java.awt.*;
import javax.swing.*;

public class Image1 extends JFrame{
    private ImageIcon image1;
    private JLabel label1;
   

    Image1(){
        setLayout(new FlowLayout());
        image1=new ImageIcon(getClass().getResource("title.gif"));
        label1 = new JLabel(image1);
        add(label1);

    }
    
    
    
    
    
}