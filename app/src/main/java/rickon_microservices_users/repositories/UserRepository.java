package rickon_microservices_users.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rickon_microservices_users.dtos.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

}
