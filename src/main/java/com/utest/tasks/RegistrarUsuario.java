package com.utest.tasks;

import com.utest.utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.concurrent.ThreadLocalRandom;

import static com.utest.userinterfaces.PaginaPrincipalUI.BTN_JOIN;
import static com.utest.userinterfaces.InformacionPersonalUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegistrarUsuario implements Task {

    Datos datos = new Datos();

    @Override
    public <T extends Actor> void performAs(T actor) {
        int numeroMes = ThreadLocalRandom.current().nextInt(1, 13);
        String mes = "number:" + numeroMes;
        int dia = ThreadLocalRandom.current().nextInt(1, 28);
        int anho = ThreadLocalRandom.current().nextInt(1990, 2004);
        String ano = anho +"";

        actor.attemptsTo(
                Click.on(BTN_JOIN),
                Enter.theValue(datos.getNombre()).into(TXT_NOMBRE),
                Enter.theValue(datos.getApellido()).into(TXT_APELLIDO),
                Enter.theValue(datos.getCorreo()).into(TXT_CORREO),
                SelectFromOptions.byValue(mes).from(LST_MES),
                SelectFromOptions.byIndex(dia).from(LIST_DIA),
                SelectFromOptions.byVisibleText(ano).from(LIST_ANHO),
                Click.on(BTN_NEXTLOCATION)
        );
    }

    public static RegistrarUsuario nuevo() {
        return instrumented(RegistrarUsuario.class);
    }
}
