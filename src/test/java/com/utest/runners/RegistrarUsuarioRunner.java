package com.utest.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registrarUsuario.feature",
        glue = "com.utest.stepsDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class RegistrarUsuarioRunner {

}
