package com.utest.tasks;

import com.utest.interactions.EsperaExplicita;
import com.utest.utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;


import static com.utest.userinterfaces.InformacionPersonalUI.BTN_NEXTDEVICES;
import static com.utest.userinterfaces.UbicacionUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class Registrar implements Task {

    Datos datos = new Datos();

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_PAIS, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(BTN_PAIS),
                Enter.theValue(datos.getPais()).into(TXT_PAIS),
                Enter.keyValues(Keys.ENTER).into(TXT_PAIS),
                WaitUntil.the(TXT_CIUDAD, isCurrentlyEnabled()).forNoMoreThan(20).seconds(),
                Enter.theValue("A").into(TXT_CIUDAD),
                EsperaExplicita.esperar(3),
                Enter.keyValues(Keys.ARROW_DOWN).into(TXT_CIUDAD),
                Enter.keyValues(Keys.ENTER).into(TXT_CIUDAD),
                Enter.theValue(datos.getCodigoZip()).into(TXT_ZIP),
                Click.on(BTN_NEXTDEVICES)
        );
    }

    public static Registrar ubicacion() {
        return instrumented(Registrar.class);
    }
}
