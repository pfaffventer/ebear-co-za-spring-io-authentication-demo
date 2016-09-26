package za.co.ebear.spring.io.authentication.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import za.co.ebear.spring.io.authentication.demo.model.GroupMaster;

public interface GroupRepository extends CrudRepository<GroupMaster,Long> {

	List<GroupMaster> findById(@Param("id") long id);

	List<GroupMaster> findByGroupName(@Param("groupName") String groupName);

}
