package com.sjzjs.DBsync.bean;

import java.util.Date;

public class StudentInfo {
	private String SalaryNo;// 个人编码
	private String Name;// 姓名
	private String Sex;// 性别
	private Date InDatetime;// 人事信息生成时间（即导入时间）
	private String DeptName;// 多级部门名称，上级部门与下级部门用分隔符“\”隔开。
	private String Status;// 身份名称

	private int Cardid;// 交易卡号
	/**
	 * 该字段保存的是10进制卡片物理序列号。
	 * 在读写器读到的是4字节16进制卡片物理序列号，按高位在前直接转换成10进制整型数，转换成10进制后不足10位前补0。
	 */
	private String CardSerial;//
	/**
	 * 卡片状态代码 0-在用； 1-有卡注销； 2-挂失未补； 3-坏卡未补； 4-挂失已补； 5-坏卡已补； 6-挂失注销； 7-坏卡注销； 11-帐户冻结；
	 * 其中只有0是有效卡，其它都是无效卡
	 */
	private String EndCode;//
	private Date ChangeDate;//卡片状态变动时间
	private float LastMoney;//卡片余额（元）
	private Date LastDatetime;//卡片最后交易时间

	private long blacklistInvoiceno;//primary key   版本，从1开始

	private String Smt_SalaryNo;//个人编码
	private String Smt_MachineID;//终端ID
	private Date Smt_DealDatetime;//交易时间
	public String getSalaryNo() {
		return SalaryNo;
	}
	public void setSalaryNo(String salaryNo) {
		SalaryNo = salaryNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public Date getInDatetime() {
		return InDatetime;
	}
	public void setInDatetime(Date inDatetime) {
		InDatetime = inDatetime;
	}
	public String getDeptName() {
		return DeptName;
	}
	public void setDeptName(String deptName) {
		DeptName = deptName;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public int getCardid() {
		return Cardid;
	}
	public void setCardid(int cardid) {
		Cardid = cardid;
	}
	public String getCardSerial() {
		return CardSerial;
	}
	public void setCardSerial(String cardSerial) {
		CardSerial = cardSerial;
	}
	public String getEndCode() {
		return EndCode;
	}
	public void setEndCode(String endCode) {
		EndCode = endCode;
	}
	public Date getChangeDate() {
		return ChangeDate;
	}
	public void setChangeDate(Date changeDate) {
		ChangeDate = changeDate;
	}
	public float getLastMoney() {
		return LastMoney;
	}
	public void setLastMoney(float lastMoney) {
		LastMoney = lastMoney;
	}
	public Date getLastDatetime() {
		return LastDatetime;
	}
	public void setLastDatetime(Date lastDatetime) {
		LastDatetime = lastDatetime;
	}
	public long getBlacklistInvoiceno() {
		return blacklistInvoiceno;
	}
	public void setBlacklistInvoiceno(long blacklistInvoiceno) {
		this.blacklistInvoiceno = blacklistInvoiceno;
	}
	public String getSmt_SalaryNo() {
		return Smt_SalaryNo;
	}
	public void setSmt_SalaryNo(String smt_SalaryNo) {
		Smt_SalaryNo = smt_SalaryNo;
	}
	public String getSmt_MachineID() {
		return Smt_MachineID;
	}
	public void setSmt_MachineID(String smt_MachineID) {
		Smt_MachineID = smt_MachineID;
	}
	public Date getSmt_DealDatetime() {
		return Smt_DealDatetime;
	}
	public void setSmt_DealDatetime(Date smt_DealDatetime) {
		Smt_DealDatetime = smt_DealDatetime;
	}

}
