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
@Table(name = "GROUP_MASTER", uniqueConstraints=@UniqueConstraint(columnNames={"GROUP_NAME"}))
public class GroupMaster extends LogModel {

	@Id
    @Column(name = "GROUP_ID")
    @GeneratedValue
    private long id;

	@Column(name = "GROUP_NAME",columnDefinition = "VARCHAR(255) NOT NULL")
	private String groupName;

	@Column(name = "GROUP_DESCRIPTION",columnDefinition = "VARCHAR(255) NOT NULL")
	private String groupDescription;

	@OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
	private Set<UserGroup> users;

	public GroupMaster() {}

	public GroupMaster(LogRecord log,String groupName, String groupDescription) {
		super(log);
		this.groupName = groupName;
		this.groupDescription = groupDescription;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupDescription() {
		return groupDescription;
	}

	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}

	public Set<UserGroup> getUsers() {
		return users;
	}

	public void setUsers(Set<UserGroup> users) {
		this.users = users;
	}

}
