import java.awt.*;
import java.awt.event.*;
public class KeyDemo extends Frame implements KeyListener
{
String msg = " ";
KeyDemo()
{
addKeyListener(this);
setSize(400,300);
setTitle("Keyboard Events");
addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e)
{
dispose();
}
});
setVisible(true);
}
public void paint(Graphics g)
{
g.drawString(msg,150,150);
}
public static void main(String[] args)
{
new KeyDemo();
}
public void keyPressed(KeyEvent e)
{
msg = "Key Pressed: ";
repaint();
}
public void keyReleased(KeyEvent e){
msg = "Key Released: ";
repaint();
}
public void keyTyped(KeyEvent e)
{
msg = "Key Typed: ";
repaint();
}
}