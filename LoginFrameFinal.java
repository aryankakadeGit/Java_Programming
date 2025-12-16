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
        fobj.add(pobj);
        fobj.add(UserLable);
        fobj.add(PassLabel);
        fobj.add(ResultLabel);
       
        bobj.addActionListener(this);

        fobj.setLayout(null);
        fobj.setVisible(true);
        fobj.setSize(width,height);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //Username : Marvellous
    //password : Marvellous@123
    public void actionPerformed(ActionEvent aobj)
    {
        String uname=tobj.getText();
        String pass=pobj.getText();

        if((uname.equals("Marvellous"))&&(pass.equals("Marvellous@123")))
        {
            ResultLabel.setText("successful");
        }
        else
        {
            ResultLabel.setText("failed");
        }


    }

}
class LoginFrameFinal
{
    public static void main(String[] args) 
    {
        MarvellousLogin mobj=new MarvellousLogin("Login", 400 , 300);
    }
}
