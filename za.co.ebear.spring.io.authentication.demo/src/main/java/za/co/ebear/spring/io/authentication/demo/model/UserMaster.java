package za.co.ebear.spring.io.authentication.demo.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import za.co.ebear.spring.io.authentication.demo.base.LogModel;
import za.co.ebear.spring.io.authentication.demo.base.LogRecord;

@Entity
@Table(name = "USER_MASTER", uniqueConstraints=@UniqueConstraint(columnNames={"USER_NAME"}))
public class UserMaster extends LogModel {

	@Id
    @Column(name = "USER_ID")
    @GeneratedValue
    private long id;

	@Column(name = "USER_NAME",columnDefinition = "VARCHAR(255) NOT NULL")
	private String userName;

	@Column(name = "PASSWORD",columnDefinition = "VARCHAR(60) NOT NULL")
	private String password;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private Set<UserGroup> groups;

	public UserMaster() {}
	
	public UserMaster(LogRecord log, String userName, String password) {
		super(log);
		this.userName = userName;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<UserGroup> getGroups() {
		return groups;
	}

	public void setGroups(Set<UserGroup> groups) {
		this.groups = groups;
	}

}
