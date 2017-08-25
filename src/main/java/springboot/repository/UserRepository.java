package springboot.repository;


import org.springframework.data.repository.CrudRepository;

import springboot.model.AppUser;

public interface UserRepository extends CrudRepository<AppUser, Long> {
	
}