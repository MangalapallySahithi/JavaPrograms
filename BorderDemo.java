import java.awt.*;
import java.awt.event.*;
public class BorderDemo{
public static void main(String[] args)
{
Frame f = new Frame("BorderLayout");
f.setLayout(new BorderLayout());
Button b1 = new Button("North_7339");
Button b2 = new Button("South_7339");
Button b3 = new Button("East_7339");
Button b4 = new Button("West_7339");
Button b5 = new Button("Center_7339");
f.add(b1, BorderLayout.NORTH);
f.add(b2, BorderLayout.SOUTH);
f.add(b3, BorderLayout.EAST);
f.add(b4, BorderLayout.WEST);
f.add(b5, BorderLayout.CENTER);
f.setSize(400,300);
f.setVisible(true);
}
}