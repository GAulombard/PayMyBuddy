package com.openclassrooms.paymybuddy;

import com.openclassrooms.paymybuddy.model.User;
import com.openclassrooms.paymybuddy.repository.UserRepository;
import com.openclassrooms.paymybuddy.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * The type Pay my buddy application.
 */
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class PayMyBuddyApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        SpringApplication.run(PayMyBuddyApplication.class, args);

    }

   /*    TODO: page ne refresh pas après avoir ajouté/supprimé un compte
         TODO: ajouter les validations pour les formulaires
         TODO: list de contact ne fonctionne pas -->> bi-directionnel ?
         TODO: javadoc
         TODO: jacoco
         TODO: surefire
         TODO: gérer les exceptions
         TODO: boutons make admin-user
         TODO: changer le signin form
         TODO: voir pourquoi /login est appelé au début
         TODO: logout pas quand compte supprimé

   */


}
