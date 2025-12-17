import java.sql.*;
class MarvellousJDBC {
    public static void main(String[] args) {
        try
        {
            //step 1 : Load the Database Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //step 2 : Connect Driver with Database
            Connection cobj=DriverManager.getConnection("jdbc:mysql://localhost:3307/ppa53","root","");

            //step 3 : create statement class object
            Statement sobj = cobj.createStatement();

            //step 4 : Execute the Query
            ResultSet robj=sobj.executeQuery("Select * from student");

            //step 5 : Display the Result
            while(robj.next())
            {
                System.out.println("Roll no : "+robj.getInt("Rno"));
                System.out.println("name : "+robj.getString("name"));
                System.out.println("city : "+robj.getString("city"));
                System.out.println("marks : "+robj.getInt("marks"));

            }
            robj.close();
            sobj.close();
            cobj.close();
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occured"+eobj);
        }
    }    
}
