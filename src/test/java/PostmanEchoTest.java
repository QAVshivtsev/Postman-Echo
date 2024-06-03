import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;


public class PostmanEchoTest {

    @Test
    void shouldCheckoutPostmanEcho() {

        // Given - When - Then

        // Предусловия

        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Сегодня выходной день") // отправляемые данные (заголовки и query можно выставлять аналогично)

                // Выполняемые действия

                .when()
                .post("/post")

                // Проверки

                .then()
                .statusCode(200)
                .body("data", equalTo("Сегодня выходной день"));

    }


}
