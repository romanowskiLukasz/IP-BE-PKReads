package pk.group.cinemasbapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pk.group.cinemasbapp.model.Film;

@Repository
public interface FilmRepo extends JpaRepository<Film, Long> {

}
