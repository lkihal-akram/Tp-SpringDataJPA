package ma.emsi.springjpa;

import ma.emsi.springjpa.entities.Etudiant;
import ma.emsi.springjpa.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Tp1Application implements CommandLineRunner {
    @Autowired
    private EtudiantRepository etudiantRepository;

    public static void main(String[] args) {

        SpringApplication.run(Tp1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("************************ Insertion **************************");
          etudiantRepository.save(new Etudiant(null,"akram",new Date(),24566));
          etudiantRepository.save(new Etudiant(null,"ahmed",new Date(),24567));
          etudiantRepository.save(new Etudiant(null,"yasser",new Date(),24568));
          etudiantRepository.save(new Etudiant(null,"ilyass",new Date(),24569));
          etudiantRepository.save(new Etudiant(null,"yassine",new Date(),24565));
          System.out.println("************************ Inserted rows **************************");
          System.out.println("Count:" +etudiantRepository.count());
          System.out.println("************************ Display rows ***************************");
          List<Etudiant> etudiants= etudiantRepository.findAll();
          etudiants.forEach(etudiant -> {System.out.println(etudiant.toString());});
          System.out.println("************************ Update ***************************");
          Etudiant etudiant=etudiantRepository.findById(3).orElse(null);
          etudiant.setCne(44444);
          etudiantRepository.save(etudiant);
          System.out.println("************************ Delete ***************************");
          Etudiant etudiant1=etudiantRepository.findById(5).orElse(null);
          System.out.println("AVANT Count:" +etudiantRepository.count());
          etudiantRepository.delete(etudiant1);
          System.out.println("APRES Count:" +etudiantRepository.count());
//
//          System.out.println("************************ Mysql ***************************");
//          etudiantRepository.save(new Etudiant(null,"lkihal",new Date(),983467));
//          System.out.println("************************ Update ***************************");
//          Etudiant etudiant=etudiantRepository.findById(4).orElse(null);
//          etudiant.setName("amri");
//          etudiantRepository.save(etudiant);
//          System.out.println("************************ Delete ***************************");
//          Etudiant etudiant1=etudiantRepository.findById(1).orElse(null);
//          System.out.println("AVANT Count:" +etudiantRepository.count());
//          etudiantRepository.delete(etudiant1);
//          System.out.println("APRES Count:" +etudiantRepository.count());

    }
}
