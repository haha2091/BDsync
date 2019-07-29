package com.sjzjs.DBsync.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sjzjs.DBsync.utils.GetSQL;

public class ConnectOracleDB {
	// 创建连接
	Connection con = null;
	// 创建预编译对象
	PreparedStatement pre = null;
	// 创建结果集对象
	ResultSet result = null;

	Logger logger = LogManager.getLogger(ConnectOracleDB.class);

	public void connectDB() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			logger.debug("开始尝试连接数据库！");
			String url = "jdbc:oracle:" + "thin:@127.0.0.1:1521:XE";// 127.0.0.1是本机地址，XE是精简版Oracle的默认数据库名
			String user = "system";// 用户名,系统默认的账户名
			String password = "147";// 你安装时选设置的密码
			con = DriverManager.getConnection(url, user, password);// 获取连接
			logger.debug("连接成功！");

//			String sql = "select * from student where name=?";// 预编译语句，“？”代表参数
			String sql = GetSQL.GetSQL("getPersonCount", logger);
			pre = con.prepareStatement(sql);// 实例化预编译语句
//			pre.setString(1, "小茗同学");// 设置参数，前面的1表示参数的索引，而不是表中列名的索引
			result = pre.executeQuery();// 执行查询，注意括号中不需要再加参数
			while (result.next()) {
				// 当结果集不为空时
//				System.out.println("学号:" + result.getInt("id") + "姓名:" + result.getString("name"));
				logger.debug("查询结果总数为："+result.getInt(0));
			}

		} catch (ClassNotFoundException | SQLException e) {
			logger.error(e.getMessage());
		} finally {
			try {
				// 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
				// 注意关闭的顺序，最后使用的最先关闭
				if (result != null)
					result.close();
				if (pre != null)
					pre.close();
				if (con != null)
					con.close();
				logger.debug("数据库连接已关闭！");
			} catch (Exception e) {
				logger.error(e.getMessage());
			}
		}

	}

	public void doQuery(String QueryName) {
		String sql = GetSQL.GetSQL(QueryName, logger);
		try {
			// 实例化预编译语句
			pre = con.prepareStatement(sql);
			result = pre.executeQuery();// 执行查询，注意括号中不需要再加参数
			while (result.next()) {
				// 当结果集不为空时
//			System.out.println("学号:" + result.getInt("id") + "姓名:" + result.getString("name"));
				logger.debug("查询结果总数为："+result.getInt(0));
				switch (QueryName) {
				case "":
					
					break;

				default:
					break;
				}
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
}
