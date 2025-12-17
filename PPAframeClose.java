import javax.swing.*;
class PPAframeClose {
    public static void main(String[] args) {
        JFrame Fobj=new JFrame("PPA");
        Fobj.setSize(300,300); //w,h 
        Fobj.setVisible(true);
        Fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
