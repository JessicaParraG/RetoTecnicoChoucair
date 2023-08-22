package com.utest.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class InformacionPersonalUI {

    public static final Target TXT_NOMBRE = Target.the("Ingresar nombre").located(By.id("firstName"));
    public static final Target TXT_APELLIDO = Target.the("Ingresar apellido").located(By.id("lastName"));
    public static final Target TXT_CORREO = Target.the("Ingresar correo").located(By.id("email"));
    public static final Target LST_MES = Target.the("Selecciona la lista mes").located(By.id("birthMonth"));
    public static final Target LIST_DIA = Target.the("Selecciona la lista dia").located(By.id("birthDay"));
    public static final Target LIST_ANHO = Target.the("Selecciona la lista año").located(By.id("birthYear"));
    public static final Target BTN_NEXTLOCATION = Target.the("Boton next location").located(By.xpath("//span[text()='Next: Location']"));
    public static final Target BTN_NEXTDEVICES = Target.the("Boton next devices").located(By.xpath("//span[text()='Next: Devices']"));
}
