import javax.swing.*;
import java.awt.event.*;
class MarvellousListener implements ActionListener
{
    public void actionPerformed(ActionEvent aobj)
                {
                    JOptionPane.showMessageDialog(null, "ButtonCLicked..");
                }        
}
class EventHandlongSeparateClassXX
{
    public static void main(String[] args) {
        
        JFrame Fobj=new JFrame("PPA");
        JButton Bobj=new JButton("OK");
        MarvellousListener mobj=new MarvellousListener();
        Bobj.addActionListener(mobj);
       
        Fobj.add(Bobj);
        Fobj.setSize(400,300); //w,h 
        Fobj.setLayout(null);
        Fobj.setVisible(true);
        Fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
