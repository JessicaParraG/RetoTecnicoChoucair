package com.utest.stepsDefinitions;

import com.utest.questions.ValidarRegistro;
import com.utest.tasks.RegistrarUsuario;
import com.utest.userinterfaces.PaginaPrincipalUI;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegistrarUsuarioStepsDefinition {

    @Managed(driver = "Chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("actor");
    PaginaPrincipalUI paginaPrincipalUI = new PaginaPrincipalUI();

    @Before
    public void configuracion() {
        actor.can(BrowseTheWeb.with(navegador));
    }

    @Dado("que el usuario ingresa a la pagina de Utest")
    public void queElUsuarioIngresaALaPaginaDeUtest() {
        actor.wasAbleTo(Open.browserOn(paginaPrincipalUI));
    }

    @Cuando("el usuario se quiera registrar para crear una cuenta")
    public void elUsuarioSeQuieraRegistrarParaCrearUnaCuenta() {
        actor.attemptsTo(RegistrarUsuario.nuevo());
    }

    @Entonces("el visualizara un mensaje de bienvenido")
    public void elVisualizaraUnMensajeDeBienvenido() {
        actor.should(seeThat("El actor puede ver", ValidarRegistro.validarMensaje(), Matchers.equalTo(true)));
    }
}
