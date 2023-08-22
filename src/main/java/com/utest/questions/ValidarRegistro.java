package com.utest.questions;

import com.utest.userinterfaces.MensajeRegistroUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarRegistro implements Question {

    @Override
    public Object answeredBy(Actor actor) {

        return MensajeRegistroUI.IMG_REGISTRO.resolveFor(actor).isVisible();
    }

    public static Question validarMensaje(){ return new ValidarRegistro(); }
}
