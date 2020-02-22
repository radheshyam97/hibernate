package com.rit.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Emp  implements Serializable{
	
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	  private Long empno;
	  
	  @Column()
	  private String ename;
	  
	  @Column()
	  private String job;
	  
	  @Column()
	  private Long mgr;
	  
	  @Column()
	  private String hiredate;
	  
	  @Column()
	  private Double sal;
	  
	  @Column()
	  private Double comm;
	  
	  @Column()
	  private Integer deptno;

	public Long getEmpno() {
		return empno;
	}

	public void setEmpno(Long empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Long getMgr() {
		return mgr;
	}

	public void setMgr(Long mgr) {
		this.mgr = mgr;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public Double getComm() {
		return comm;
	}

	public void setComm(Double comm) {
		this.comm = comm;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hiredate=" + hiredate
				+ ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + "]";
	}

	 
}
