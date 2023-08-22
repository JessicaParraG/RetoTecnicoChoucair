package com.utest.tasks;

import com.utest.utils.DatosExcel;
import com.utest.utils.EsperaImplicita;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

import static com.utest.userinterfaces.PaginaPrincipalUI.BTN_JOIN;
import static com.utest.userinterfaces.InformacionPersonalUI.*;
import static com.utest.userinterfaces.DispositivosUI.*;
import static com.utest.userinterfaces.UbicacionUI.*;
import static com.utest.userinterfaces.UltimoPasoUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class RegistrarUsuario implements Task {

    EsperaImplicita esperaImplicita;
    DatosExcel datos = new DatosExcel();

    @Override
    public <T extends Actor> void performAs(T actor) {
        String ruta = "DatosUTest.xlsx";
        String hoja = "Registro";
        int numeroMes = ThreadLocalRandom.current().nextInt(1, 13);
        String mes = "number:" + numeroMes;

        try {
            actor.attemptsTo(
                    Click.on(BTN_JOIN),
                    Enter.theValue(datos.leerDatosExcel(ruta, hoja, 1, 0)).into(TXT_NOMBRE),
                    Enter.theValue(datos.leerDatosExcel(ruta, hoja, 1, 1)).into(TXT_APELLIDO),
                    Enter.theValue(datos.leerDatosExcel(ruta, hoja, 1, 2)).into(TXT_CORREO),
                    SelectFromOptions.byValue(mes).from(LST_MES),
                    SelectFromOptions.byVisibleText("14").from(LIST_DIA),
                    SelectFromOptions.byVisibleText("1998").from(LIST_ANHO),
                    Click.on(BTN_NEXTLOCATION)
            );

            actor.attemptsTo(
                    WaitUntil.the(TXT_CIUDAD, isCurrentlyEnabled()).forNoMoreThan(20).seconds(),
                    Clear.field(TXT_CIUDAD),
                    Enter.theValue(datos.leerDatosExcel(ruta, hoja, 1, 6)).into(TXT_CIUDAD),
                    Clear.field(TXT_ZIP),
                    Enter.theValue(datos.leerDatosExcel(ruta, hoja, 1 , 7)).into(TXT_ZIP),
                    Click.on(BTN_NEXTDEVICES)
            );

            actor.attemptsTo(
                    WaitUntil.the(BTN_SPAN_TIPO_LISTA("Windows", 1), isClickable()).forNoMoreThan(20).seconds(),
                    Click.on(BTN_SPAN_TIPO_LISTA("Windows", 1)),
                    Click.on(OPCION_DIV_LISTA_DESPLEGABLE("macOS", "macOS")),
                    Click.on(BTN_SPAN_TIPO_LISTA("Select a Version", 1)),
                    Click.on(OPCION_DIV_LISTA_DESPLEGABLE("OS X 10.11.5", "OS X 10.11.5")),
                    Click.on(BTN_SPAN_TIPO_LISTA("Select OS language", 1)),
                    Click.on(OPCION_DIV_LISTA_DESPLEGABLE("Spanish", "Spanish")),
                    WaitUntil.the(BTN_SPAN_TIPO_LISTA("Select Brand", 1), isClickable()).forNoMoreThan(20).seconds(),
                    Click.on(BTN_SPAN_TIPO_LISTA("Select Brand", 1)),
                    Click.on(OPCION_DIV_LISTA_DESPLEGABLE("Apple", "Apple")),
                    WaitUntil.the(BTN_SPAN_TIPO_LISTA("Select a Model", 1), isClickable()).forNoMoreThan(10).seconds(),
                    Click.on(BTN_SPAN_TIPO_LISTA("Select a Model", 1)),
                    Click.on(OPCION_DIV_LISTA_DESPLEGABLE("iPhone 13", "iPhone 13")),
                    Click.on(BTN_SPAN_TIPO_LISTA("Select OS", 3)),
                    Click.on(OPCION_DIV_LISTA_DESPLEGABLE("iOS 16.6", "iOS 16.6")),
                    Click.on(BTN_NEXTLAST)
            );

            actor.attemptsTo(
                    Enter.theValue(datos.leerDatosExcel(ruta, hoja, 1, 8)).into(TXT_CONTRASENA),
                    Enter.theValue(datos.leerDatosExcel(ruta, hoja, 1, 8)).into(TXT_CONFIRMARCONTRASENA),
                    Click.on(CHK_TERMINOSYCONDICIONES),
                    WaitUntil.the(CHK_POLITICASDESEGURIDAD, isClickable()).forNoMoreThan(10).seconds(),
                    Click.on(CHK_POLITICASDESEGURIDAD),
                    Click.on(BTN_COMPLETE)
            );
            esperaImplicita.esperar(30000);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static RegistrarUsuario nuevo() {
        return instrumented(RegistrarUsuario.class);
    }
}
