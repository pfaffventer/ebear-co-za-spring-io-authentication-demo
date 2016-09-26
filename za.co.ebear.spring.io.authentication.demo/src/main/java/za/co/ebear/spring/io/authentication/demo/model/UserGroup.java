package za.co.ebear.spring.io.authentication.demo.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import za.co.ebear.spring.io.authentication.demo.base.LogModel;
import za.co.ebear.spring.io.authentication.demo.base.LogRecord;

@Entity
@Table(name = "USER_GROUP")
public class UserGroup extends LogModel {
	
	@Id
    @Column(name = "USER_GROUP_ID")
    @GeneratedValue
    private long id;

	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private UserMaster user;

	@ManyToOne
	@JoinColumn(name = "GROUP_ID")
	private GroupMaster group;

	public UserGroup() {}
	
	public UserGroup(LogRecord log, UserMaster user, GroupMaster group) {
		super(log);
		this.user = user;
		this.group = group;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public UserMaster getUser() {
		return user;
	}

	public void setUser(UserMaster user) {
		this.user = user;
	}

	public GroupMaster getGroup() {
		return group;
	}

	public void setGroup(GroupMaster group) {
		this.group = group;
	}

}
