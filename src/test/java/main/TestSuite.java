package main;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import java.time.Duration;

public class TestSuite extends AbsBaseSuite{

    @Test
    public void checkRegistrationBtn() {
        logger.info("Run test checkRegistrationBtn");
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.open("");
        registrationPage.fillValues(user);
        registrationPage.checkSubmit(user);
        logger.info("Finish test checkInputTextLabel");
    }
}


//Для выполнения ДЗ перейдите по ссылке - https://otus.home.kartushin.su/form.html

//Заполнение формы: напишите скрипт для заполнения всех полей формы (имя пользователя, email, пароль, дата рождения, уровень знания языка).

//Проверка пароля: добавьте логику для проверки совпадения пароля и его подтверждения.

//Тестирование кнопки отправки: убедитесь, что после нажатия кнопки данные корректно выводятся на страницу.

