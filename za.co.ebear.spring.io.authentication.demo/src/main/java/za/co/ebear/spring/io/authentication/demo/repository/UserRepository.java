package za.co.ebear.spring.io.authentication.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import za.co.ebear.spring.io.authentication.demo.model.UserMaster;

public interface UserRepository extends CrudRepository<UserMaster,Long> {

	List<UserMaster> findById(@Param("id") long id);

	List<UserMaster> findByUserName(@Param("userName") String userName);

}
