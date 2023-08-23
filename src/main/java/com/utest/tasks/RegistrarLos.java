package com.utest.tasks;

import com.utest.utils.DatosExcel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.io.IOException;

import static com.utest.userinterfaces.DispositivosUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class RegistrarLos implements Task {

    DatosExcel datosExcel = new DatosExcel();
    String ruta = "src/test/resources/dataDriven/DatosUTest.xlsx";
    String hoja = "Dispositivos";

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    WaitUntil.the(BTN_SISTEMAOPERATIVOPC, isClickable()).forNoMoreThan(20).seconds(),
                    Click.on(BTN_SISTEMAOPERATIVOPC),
                    Enter.theValue(datosExcel.leerDatosExcel(ruta, hoja, 1, 0)).into(TXT_SISTEMAOPERATIVOPC),
                    Enter.keyValues(Keys.ENTER).into(TXT_SISTEMAOPERATIVOPC),
                    Click.on(BTN_VERSIONPC),
                    Enter.theValue(datosExcel.leerDatosExcel(ruta, hoja, 1, 1)).into(TXT_VERSIONPC),
                    Enter.keyValues(Keys.ENTER).into(TXT_VERSIONPC),
                    Click.on(BTN_LENGUAJE),
                    Enter.theValue(datosExcel.leerDatosExcel(ruta, hoja, 1, 2)).into(TXT_LENGUAJE),
                    Enter.keyValues(Keys.ENTER).into(TXT_LENGUAJE),
                    Click.on(BTN_MARCACELULAR),
                    Enter.theValue(datosExcel.leerDatosExcel(ruta, hoja, 1, 3)).into(TXT_MARCACELULAR),
                    Enter.keyValues(Keys.ENTER).into(TXT_MARCACELULAR),
                    Click.on(BTN_MODELOCELULAR),
                    Enter.theValue(datosExcel.leerDatosExcel(ruta, hoja, 1,4)).into(TXT_MODELOCELULAR),
                    Enter.keyValues(Keys.ENTER).into(TXT_MODELOCELULAR),
                    Click.on(BTN_SISTEMAOPERATIVOCELULAR),
                    Enter.theValue(datosExcel.leerDatosExcel(ruta, hoja, 1, 5)).into(TXT_SISTEMAOPERATIVOCELULAR),
                    Enter.keyValues(Keys.ENTER).into(TXT_SISTEMAOPERATIVOCELULAR),
                    Click.on(BTN_NEXTLAST)
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static RegistrarLos dispositivos() {
        return instrumented(RegistrarLos.class);
    }
}
