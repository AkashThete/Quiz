package com.quiz.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Login_1 extends Quiz  {
	int Userid;
	String Name;
	
	
		
		public void log() {
		    Scanner scan=new Scanner(System.in);
		    System.out.println("Enter Userid");
		    Userid=scan.nextInt();
		    System.out.println("enter the Name-");
		    Name=scan.next();
		    try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/example", "root", "AkashThete@1997");
				String s="insert into Quiz(Userid,Name,marks)values(?,?,?)";
				PreparedStatement ps=con.prepareStatement(s);
				ps.setInt(1, Userid);
				ps.setString(2, Name);
				ps.setInt(3, marks);
				ps.executeUpdate();
				int i=ps.executeUpdate();
				System.out.println(i);
				System.out.println("inserted value");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

}


}
