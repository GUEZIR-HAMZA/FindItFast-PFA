package pfa.project.finditfastbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import pfa.project.finditfastbackend.Model.User;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select u from User u where u.email =: email")
    Optional<User> findByEmail(String email);
    @Query("select u from User u where u.mobile =: mobile")
    Optional<User> findByMobile(String mobile);

    @Query("select u from User u where u.email =: username and u.password =: password")
    User findByUsernameAndPassword(String username, String password);



}
