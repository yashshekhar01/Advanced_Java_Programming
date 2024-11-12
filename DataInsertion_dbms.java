import java.sql.*;
import java.util.Scanner;

public class DataInsertion
{
public static void main(String[] args) throws Exception
{
Scanner sc=new Scanner(System.in);

//taking input from user
System.out.println("Enter Department Id:");
int id=Integer.parseInt(sc.nextInt());
System.out.println("Enter Department name:");
String name=sc.nextLine();
System.out.println("Enter location:");
String location=sc.nextLine();

//registering driver class
Class.forName("oracle.jdbc.driver.OracleDriver");

//Establishing conneection
Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");

//creatinh sql query
String sql="insert into department values(?,?,?);
PreparedStatement statement=connection.prepareStatement(sql);

//set the values
statement.setInt(1,id);
statement.setString(2,name);
statement.setString(3,location);

//executing the statement
statement.executeUpdate();
System.out.println("New Record inserted);

//closing the connection
connection.close();
}

}