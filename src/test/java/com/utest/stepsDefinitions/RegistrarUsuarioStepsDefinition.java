package com.utest.stepsDefinitions;

import com.utest.questions.ValidarRegistro;
import com.utest.tasks.Crear;
import com.utest.tasks.Registrar;
import com.utest.tasks.RegistrarLos;
import com.utest.tasks.RegistrarUsuario;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static com.utest.userinterfaces.MensajeRegistroUI.TXT_REGISTRO;
import static com.utest.utils.Constantes.ACTOR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegistrarUsuarioStepsDefinition {
    @Before
    public void configuracion() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario ingresa a la pagina de (.*)$")
    public void queElUsuarioIngresaALaPaginaDe(String url) {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(url));
    }

    @Cuando("^el usuario se quiera registrar para crear una cuenta$")
    public void elUsuarioSeQuieraRegistrarParaCrearUnaCuenta() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RegistrarUsuario.nuevo(),
                Registrar.localizacion(),
                RegistrarLos.dispositivos(),
                Crear.contrasena()
        );
    }

    @Entonces("^el visualizara un mensaje de (.*)$")
    public void elVisualizaraUnMensajeDe(String texto) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidarRegistro.validarMensaje(TXT_REGISTRO), Matchers.containsString(texto)));
    }
}
