package ma.emsi.springjpa.repositories;

import ma.emsi.springjpa.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {

}
