package lt.techin.movie_studio_41.repository;

import lt.techin.movie_studio_41.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Long> {
}
