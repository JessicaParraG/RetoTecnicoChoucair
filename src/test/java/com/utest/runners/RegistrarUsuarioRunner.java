package com.utest.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.core.Serenity.getDriver;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registrarUsuario.feature",
        glue = "com.utest.stepsDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class RegistrarUsuarioRunner {
    @BeforeClass
    public static void clearCookies(){
        WebDriver driver = getDriver();
        driver.manage().deleteAllCookies();
    }
}
