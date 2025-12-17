import javax.swing.*;
class PPAframeComponents {
    public static void main(String[] args) {
        JFrame Fobj=new JFrame("PPA");
        JButton Bobj=new JButton("OK");
        Fobj.add(Bobj);
        Fobj.setSize(300,300); //w,h 
        Fobj.setVisible(true);
        Fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
