package lt.techin.movie_studio_41.service;

import lt.techin.movie_studio_41.model.Actor;
import lt.techin.movie_studio_41.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {
  private final ActorRepository actorRepository;

  @Autowired
  public ActorService(ActorRepository actorRepository) {
    this.actorRepository = actorRepository;
  }

  public Actor saveActor(Actor actor) {
    return actorRepository.save(actor);
  }

  public List<Actor> getAllActors() {
    return actorRepository.findAll();
  }
}
