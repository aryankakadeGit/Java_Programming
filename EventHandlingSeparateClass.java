import javax.swing.*;
import java.awt.event.*;
class MarvellousListener implements ActionListener
{
    public void actionPerformed(ActionEvent aobj)
                {
                    System.out.println("Button Clicked....\n");
                }        
}
class EventHandlingSeparateClass
{
    public static void main(String[] args) {
        JFrame Fobj=new JFrame("PPA");
        JButton Bobj=new JButton("OK");
        Bobj.setBounds(100,100,150,50);//x,y,w,h
        Bobj.addActionListener(new MarvellousListener());

        Bobj.addActionListener( new ActionListener() {});
        Fobj.add(Bobj);
        Fobj.setSize(400,300); //w,h 
        Fobj.setLayout(null);
        Fobj.setVisible(true);
        Fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
