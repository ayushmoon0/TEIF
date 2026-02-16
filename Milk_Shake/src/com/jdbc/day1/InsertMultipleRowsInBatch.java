package com.jdbc.day1;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertMultipleRowsInBatch {

	public static void main(String[] args) {
		Connection con=null;
		String url="jdbc:mysql://localhost:3306/customers";
		String user="root";
		String pass="password";
		String sql="INSERT INTO ACCOUNTS VALUES(?,?,?,?)";
		PreparedStatement pst=null;
		Scanner sc=null;
	try {
		//Loading Driver
		Class.forName("com.mysql.cj.jdbc.Driver");	
		//Create Connection
		con=DriverManager.getConnection(url,user,pass);
		
		//Prepared Statement
		sc=new Scanner(System.in);
		System.out.println("how many row you want to insert");
		int a=sc.nextInt();
		pst=con.prepareStatement(sql);
for(int i=0;i<a;i++) {

	System.out.println("please eneter your accno ");
	int u_acc=sc.nextInt();
	System.out.println("please eneter account holder name");
	sc.nextLine();
	String u_name=sc.nextLine();
	System.out.println("please eneter amount");
	double s_amount=sc.nextDouble();
	System.out.println("please eneter account holder password");
	String u_pass=sc.next();
	pst.setInt(1, u_acc);
	pst.setString(2, u_name);
	pst.setDouble(3, s_amount);
	pst.setString(4, u_pass);
	pst.addBatch();

}
	int arr[]=pst.executeBatch();
System.out.println(arr.length+" rows Affected");
	}catch (Exception e) {
		
	}
	}
}
