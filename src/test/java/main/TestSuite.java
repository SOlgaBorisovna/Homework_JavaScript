package main;

import org.junit.jupiter.api.Test;

public class TestSuite extends AbsBaseSuite{

    @Test
    public void checkRegistrationForm() {
        RegistrationForm registrationForm = new RegistrationForm (driver);
        registrationForm.open();
        registrationForm.checkSubmit(this.user);
    }
}


//Для выполнения ДЗ перейдите по ссылке - https://otus.home.kartushin.su/form.html

//Заполнение формы: напишите скрипт для заполнения всех полей формы (имя пользователя, email, пароль, дата рождения, уровень знания языка).

//Проверка пароля: добавьте логику для проверки совпадения пароля и его подтверждения.

//Тестирование кнопки отправки: убедитесь, что после нажатия кнопки данные корректно выводятся на страницу.

