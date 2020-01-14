package kt.crud.docker.mvn.repo;

import org.springframework.data.repository.CrudRepository;

import kt.crud.docker.mvn.entity.User;

public interface UserRepository extends  CrudRepository<User, Long> {

}
