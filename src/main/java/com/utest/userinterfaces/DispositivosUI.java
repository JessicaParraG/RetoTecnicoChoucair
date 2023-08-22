package com.utest.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DispositivosUI {

    public static Target BTN_SPAN_TIPO_LISTA(String option, int i) {
        return Target.the("Selecione de la Lista " + option).located(By.xpath("(//span[contains(text(),'" + option + "')])[" + i + "]"));
    }

    public static Target OPCION_DIV_LISTA_DESPLEGABLE(String label, String opcion) {
        return Target.the("opcion " + opcion).locatedBy("//div[*[normalize-space()='" + label + "']]//span[normalize-space()='" + opcion + "']");
    }

    public static final Target BTN_NEXTLAST = Target.the("Boton next last step").located(By.xpath("//span[text()='Next: Last Step']"));

}
