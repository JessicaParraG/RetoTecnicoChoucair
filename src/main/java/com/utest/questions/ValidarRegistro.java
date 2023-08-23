package com.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarRegistro implements Question<String> {

    Target elemento;

    public ValidarRegistro(Target elemento) {
        this.elemento = elemento;
    }

    @Override
    public String answeredBy(Actor actor) {
        return elemento.resolveFor(actor).getText();
    }

    public static Question<String> validarMensaje(Target elemento){
        return new ValidarRegistro(elemento);
    }
}
