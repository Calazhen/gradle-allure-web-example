import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


public class CareersForm {

    final String driverPath = "C:\\Users\\calaz\\geckodriver.exe";
    private WebDriver driver;

    @BeforeEach
    public void inicialize() {
        System.setProperty("webdriver.gecko.driver", driverPath);
        driver = new FirefoxDriver();
        driver.get("https://www.visualmix.com.br/trabalhe-conosco");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    String nameField = "#input-0-b8b875ec-d0d5-453d-81a4-d9faa1acbf5e-error";
    String emailField = "#input-1-b8b875ec-d0d5-453d-81a4-d9faa1acbf5e-error";
    String phoneNumberField = "#input-2-b8b875ec-d0d5-453d-81a4-d9faa1acbf5e-error";
    String resumesContentField = "#textarea-3-b8b875ec-d0d5-453d-81a4-d9faa1acbf5e-error";


    @Test
    @DisplayName("Dado a pagina de Trabalhe Conosco da Visualmix, quando tentar enviar o Formulario sem preencher nenhum campo, entao deve mostrar os campos obrigatorios")
    public void sendEmptyForm_To_AssertMandatoryFields() {

        // Clica no botão "Enviar"
        driver.findElement(By.cssSelector(".cs-button")).click();

        // Verifica mensagem de erro no campo de "Nome"
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        assertThat(driver.findElement(By.cssSelector(nameField)).getText(), containsString("Ops!"));

        // Verifica mensagem de erro no campo de "E-mail"
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        assertThat(driver.findElement(By.cssSelector(emailField)).getText(), containsString("Ops!"));

        // Verifica mensagem de erro no campo de "Telefone"
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        assertThat(driver.findElement(By.cssSelector(phoneNumberField)).getText(), containsString("Ops!"));

        // Verifica mensagem de erro no campo de "Conteúdo do Cúrriculo"
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        assertThat(driver.findElement(By.cssSelector(resumesContentField)).getText(), containsString("Ops!"));

    }
}
