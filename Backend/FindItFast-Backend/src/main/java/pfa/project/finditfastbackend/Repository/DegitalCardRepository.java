package pfa.project.finditfastbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pfa.project.finditfastbackend.Model.DigitalCard;

import java.util.Optional;

public interface DegitalCardRepository extends JpaRepository<DigitalCard, Long> {
    @Query("SELECT d FROM DigitalCard d WHERE d.id =:id")
    DigitalCard findById(long id);

    @Query("SELECT d FROM DigitalCard d WHERE d.name =:name")
    DigitalCard findByName(String name);
}


