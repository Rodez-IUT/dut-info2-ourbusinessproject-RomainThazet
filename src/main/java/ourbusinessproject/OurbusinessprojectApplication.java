package ourbusinessproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OurbusinessprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(OurbusinessprojectApplication.class, args);
    }

    //Trois requêtes:
    //Une requête qui fait un select sur tout les projets
    // Et deux autres requêtes en double (select entreprise0.id ..etc)
    //
    //Elles sont quand même présentes car lorsqu'un projet possède une entreprise, on cherche cette entreprise-là.

}
