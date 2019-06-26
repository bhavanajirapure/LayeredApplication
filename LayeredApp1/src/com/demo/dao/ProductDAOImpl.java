package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.demo.bo.ProductBO;

public class ProductDAOImpl implements ProductDAO {
	private static final String INSERT_PROD = "INSERT INTO PRODUCT VALUES(?,?,?,?)";
	private static final String GET_PROD_DETAILS = "SELECT PID,PNAME,COST,MFGDATE FROM PRODUCT WHERE ID=?";
	Connection con = null;
	PreparedStatement ps = null;

	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	@Override
	public int insertProduct(ProductBO bo) {
		int col = 0;
		try {
			con = getConnection();
			ps = con.prepareStatement(INSERT_PROD);
			ps.setInt(1, bo.getpId());
			ps.setString(2, bo.getpName());
			ps.setDouble(3, bo.getpCost());
			ps.setDate(4, bo.getMfgDate());

			col = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println("error while adding product: ");
			e.printStackTrace();
		}
		return col;

	}

	@Override
	public List<ProductBO> retriveProduct(ProductBO bo) {
		try {
			ResultSet rs = null;
			con = getConnection();
			ps.setInt(1, bo.getpId());
			rs = ps.executeQuery();
			while(rs!=null)
		} catch (Exception e) {

		}
		return null;
	}

}
