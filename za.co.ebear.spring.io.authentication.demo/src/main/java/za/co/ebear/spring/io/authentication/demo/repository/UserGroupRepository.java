package za.co.ebear.spring.io.authentication.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import za.co.ebear.spring.io.authentication.demo.model.GroupMaster;
import za.co.ebear.spring.io.authentication.demo.model.UserGroup;
import za.co.ebear.spring.io.authentication.demo.model.UserMaster;

public interface UserGroupRepository extends CrudRepository<UserGroup,Long> {
	
	List<UserGroup> findById(@Param("id") long id);

	List<UserGroup> findByUser(@Param("user") UserMaster user);
	
	List<UserGroup> findByGroup(@Param("group") GroupMaster group);

}
