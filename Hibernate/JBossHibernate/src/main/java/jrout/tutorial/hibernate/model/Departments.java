package jrout.tutorial.hibernate.model;

// Generated Mar 15, 2015 6:09:27 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Departments generated by hbm2java
 */
@Entity
@Table(name = "DEPARTMENTS")
public class Departments implements java.io.Serializable {

	private short departmentId;
	private Employees employees;
	private Locations locations;
	private String departmentName;
	private Set<Employees> employeeses = new HashSet<Employees>(0);
	private Set<JobHistory> jobHistories = new HashSet<JobHistory>(0);

	public Departments() {
	}

	public Departments(short departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	public Departments(short departmentId, Employees employees,
			Locations locations, String departmentName,
			Set<Employees> employeeses, Set<JobHistory> jobHistories) {
		this.departmentId = departmentId;
		this.employees = employees;
		this.locations = locations;
		this.departmentName = departmentName;
		this.employeeses = employeeses;
		this.jobHistories = jobHistories;
	}

	@Id
	@Column(name = "DEPARTMENT_ID", unique = true, nullable = false, precision = 4, scale = 0)
	public short getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(short departmentId) {
		this.departmentId = departmentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MANAGER_ID")
	public Employees getEmployees() {
		return this.employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LOCATION_ID")
	public Locations getLocations() {
		return this.locations;
	}

	public void setLocations(Locations locations) {
		this.locations = locations;
	}

	@Column(name = "DEPARTMENT_NAME", nullable = false, length = 30)
	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "departments")
	public Set<Employees> getEmployeeses() {
		return this.employeeses;
	}

	public void setEmployeeses(Set<Employees> employeeses) {
		this.employeeses = employeeses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "departments")
	public Set<JobHistory> getJobHistories() {
		return this.jobHistories;
	}

	public void setJobHistories(Set<JobHistory> jobHistories) {
		this.jobHistories = jobHistories;
	}

}
