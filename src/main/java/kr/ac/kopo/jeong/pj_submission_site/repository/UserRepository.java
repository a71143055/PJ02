package kr.ac.kopo.jeong.pj_submission_site.repository;

import kr.ac.kopo.jeong.pj_submission_site.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}

