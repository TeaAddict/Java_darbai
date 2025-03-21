package lt.techin.movie_studio_71.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lt.techin.movie_studio_71.model.Actor;
import lt.techin.movie_studio_71.model.Screening;

import java.util.List;

public record MovieDTO(
        @NotNull
        @Size(min = 2, max = 50)
        String name,

        @Pattern(regexp = "^[A-Z][a-z]*$")
        String director,

        String description,
        List<Screening> screenings,
        List<Actor> actors
) {

  @Override
  public String name() {
    return name;
  }

  @Override
  public String director() {
    return director;
  }

  @Override
  public String description() {
    return description;
  }

  @Override
  public List<Screening> screenings() {
    return screenings;
  }

  @Override
  public List<Actor> actors() {
    return actors;
  }
}
