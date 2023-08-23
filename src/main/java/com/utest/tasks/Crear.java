package com.utest.tasks;

import com.utest.interactions.EsperaExplicita;
import com.utest.utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.utest.userinterfaces.UltimoPasoUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Crear implements Task {

    Datos datos = new Datos();

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(datos.getContrasena()).into(TXT_CONTRASENA),
                Enter.theValue(datos.getContrasena()).into(TXT_CONFIRMARCONTRASENA),
                Click.on(CHK_TERMINOSYCONDICIONES),
                WaitUntil.the(CHK_POLITICASDESEGURIDAD, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(CHK_POLITICASDESEGURIDAD),
                Click.on(BTN_COMPLETE),
                EsperaExplicita.esperar(20)
        );
    }

    public static Crear contrasena() {
        return instrumented(Crear.class);
    }
}
