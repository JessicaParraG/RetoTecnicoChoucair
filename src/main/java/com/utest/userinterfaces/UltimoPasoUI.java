package com.utest.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UltimoPasoUI {

    public static final Target TXT_CONTRASENA = Target.the("Contraseña").located(By.id("password"));
    public static final Target TXT_CONFIRMARCONTRASENA = Target.the("Confirmas contraseña").located(By.id("confirmPassword"));
    public static final Target CHK_TERMINOSYCONDICIONES = Target.the("Checkbox").located(By.xpath("(//span[@class='checkmark signup-consent__checkbox error'])[1]"));
    public static final Target CHK_POLITICASDESEGURIDAD = Target.the("Checkbox").located(By.xpath("(//a[text()='Privacy & Security Policy']//following::span)[1]"));
    public static final Target BTN_COMPLETE = Target.the("Complete setup").located(By.xpath("//span[text()='Complete Setup']"));
}
