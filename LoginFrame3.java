import java.awt.event.*;

import javax.swing.*;
class MarvellousLogin implements ActionListener
{
    JFrame fobj;
    JButton bobj;
    JTextField tobj;
    JPasswordField pobj;
    JLabel UserLable,PassLabel,ResultLabel;
    public MarvellousLogin(String Title , int width , int height)
    {
        
        fobj=new JFrame(Title);
        

        UserLable = new JLabel("User name");
        UserLable.setBounds(50,50,100,30);

        tobj=new JTextField();
        tobj.setBounds(150,50,150,30);

        PassLabel=new JLabel("Password");
        PassLabel.setBounds(50,100,100,30);

        pobj=new JPasswordField();
        pobj.setBounds( 150,100,150,30);

        bobj=new JButton("Submit");
        bobj.setBounds(150,150,100,30);

        ResultLabel = new JLabel();
        ResultLabel.setBounds(150,200,250,30);
        
        fobj.add(bobj);
        fobj.add(tobj);
        fobj.add(UserLable);
        fobj.add(PassLabel);
        fobj.add(ResultLabel);
       
        bobj.addActionListener(this);

        fobj.setLayout(null);
        fobj.setVisible(true);
        fobj.setSize(width,height);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent aobj)
    {
        ResultLabel.setText("Button Clicked");
    }

}
class LoginFrame3 {
    public static void main(String[] args) 
    {
        MarvellousLogin mobj=new MarvellousLogin("Login", 400 , 300);
    }
}
