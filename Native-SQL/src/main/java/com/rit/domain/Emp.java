package com.rit.domain;

public class Emp {

	private Long empNo;
	private String ename;
	private String job;
	private Long mgr;
	private String hiredate;
	private Double sal;
	private Double comm;
	private Integer deptNo;
	public Long getEmpNo() {
		return empNo;
	}
	public String getEname() {
		return ename;
	}
	public String getJob() {
		return job;
	}
	public Long getMgr() {
		return mgr;
	}
	public String getHiredate() {
		return hiredate;
	}
	public Double getSal() {
		return sal;
	}
	public Double getComm() {
		return comm;
	}
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setEmpNo(Long empNo) {
		this.empNo = empNo;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setMgr(Long mgr) {
		this.mgr = mgr;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public void setComm(Double comm) {
		this.comm = comm;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hiredate=" + hiredate
				+ ", sal=" + sal + ", comm=" + comm + ", deptNo=" + deptNo + "]";
	}

}
