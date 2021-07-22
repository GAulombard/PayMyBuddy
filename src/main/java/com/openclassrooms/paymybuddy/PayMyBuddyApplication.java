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

   /*    ----BackEnd/fonctionnement

         TODO: jacoco
         TODO: surefire
         TODO: test unitaire
         TODO: test integrations
         TODO: afficher transaction après validation transfer


         ---FrontEnd
         TODO: make admin menu responsive
         TODO: ajouter page profile contact
         TODO: ajouter total fees
         TODO: ajouter last transaction sur la page home et last message
         TODO: logo moins gros page d'acceuil
         TODO: plus de détail pour admin transaction et fee
         TODO: arrondir à 2 chiffres après la virgule

   */


}
