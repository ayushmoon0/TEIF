package com.jdbc.day1;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTransactions {
	public static void main(String[] args) {
		Connection con=null;
		String url="jdbc:mysql://localhost:3306/customers";
		String user="root";
		String pass="password";
		String sql1="Update accounts set balance=balance-500 where accountNo=103";
		String sql2="Update accounts set balance=balance+500 where accountNo=101";
		Statement pst=null;
		PreparedStatement pst2=null;
		Scanner sc=null;
		try {
			//Loading Driver
			Class.forName("com.mysql.cj.jdbc.Driver");	
			//Create Connection
			con=DriverManager.getConnection(url,user,pass);
			//Prepared Statement
			con.setAutoCommit(false);
			pst=con.createStatement();
			pst.addBatch(sql1);
			pst.addBatch(sql2);
			pst.executeBatch();
//			sc=new Scanner(System.in);
//			System.out.println("please eneter your accno ");
//			int u_acc=sc.nextInt();
//			System.out.println("please eneter reciever accno ");
//			int r_acc=sc.nextInt();
//			System.out.println("please eneter amount to sent ");
//			double s_amount=sc.nextDouble();
//			pst.setDouble(1, s_amount);
//			pst.setInt(2, u_acc);
//			pst.addBatch();		
//			pst=con.prepareStatement(sql2);
//			pst.setDouble(1, s_amount);
//			pst.setInt(2, r_acc);
//			pst.addBatch();
//			pst.executeBatch();
			con.commit();
			con.setAutoCommit(true);
			System.out.println("Payment succefull"+500);
			
		} catch (Exception e) {
		try {
			System.out.println("Error occured. Don't worry your money will be refunded within 24 hr");
			con.rollback();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		finally {
			
			try {
				sc.close();
				con.close();
				pst.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
		}
		

	}

}
