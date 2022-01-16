package models;

import com.github.javafaker.Faker;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class AccountFactory {
    static Faker faker = new Faker();

    public static Account get (){
        log.info("created new random data using faker for created new accounts");
        return Account.builder()
                .accountName(faker.name().firstName())
                .webSite(faker.chuckNorris().fact())
                .phone(faker.phoneNumber().cellPhone())
                .fax(faker.number().digit())
                .employees(faker.chuckNorris().fact())
                .annualRevenue(faker.funnyName().name())
                .type("Analyst")
                .industry("Apparel")
                .billingStreet(faker.address().streetAddress())
                .shippingStreet(faker.address().streetName())
                .billingCity(faker.address().streetAddress())
                .billingStateProvince(faker.address().stateAbbr())
                .shippingCity(faker.address().cityName())
                .shippingStateProvince(faker.address().streetAddress())
                .billingZipPostalCode("222512")
                .billingCountry(faker.country().name())
                .shippingZipPostalCode(faker.address().buildingNumber())
                .shippingCountry(faker.address().country())
                .description(faker.chuckNorris().fact())
                .build();
    }

}
