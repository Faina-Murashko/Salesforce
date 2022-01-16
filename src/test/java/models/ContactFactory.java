package models;

import com.github.javafaker.Faker;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ContactFactory {
static Faker faker = new Faker();

public static Contacts get () {
    log.info("created new random dara using faker for created new contacts");
        return Contacts.builder()
                    .salutation("Ms.")
                    .firstName(faker.name().firstName())
                    .lastName(faker.name().lastName())
                    .accountName("F.WOOD.ECO")
                    .title(faker.chuckNorris().fact())
                    .phone(faker.phoneNumber().phoneNumber())
                    .mobile(faker.phoneNumber().phoneNumber())
                    .email("fbgjksitg@gmail.com")
                    .mailingStreet(faker.address().streetName())
                    .mailingCity(faker.address().city())
                    .mailingStateProvince(faker.address().country())
                    .mailingZipPostalCode(faker.address().zipCode())
                    .mailingCountry(faker.address().country())
                    .homePhone(faker.phoneNumber().phoneNumber())
                    .otherPhone(faker.phoneNumber().phoneNumber())
                    .department(faker.pokemon().name())
                    .birthdate("06/05/1994")
                    .description(faker.chuckNorris().fact())
                    .build();

    }
}