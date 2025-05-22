package dto;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.ZoneId;

public class User {
    private Faker faker = new Faker();

    private String name = faker.name().firstName();
    private String email = faker.internet().emailAddress();
    private String password = faker.internet().password();
    private LocalDate date = faker.date().birthday(16, 100).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    private int languageLevel = faker.number().numberBetween(1, 4);

    public Faker getFaker() {
        return faker;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getLanguageLevel() {
        return languageLevel;
    }
}
