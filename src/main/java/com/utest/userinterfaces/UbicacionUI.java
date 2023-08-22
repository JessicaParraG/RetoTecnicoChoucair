package com.utest.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UbicacionUI {

    public static final Target TXT_CIUDAD = Target.the("Ciudad").located(By.id("city"));
    public static final Target TXT_ZIP = Target.the("ZIP").located(By.id("zip"));
}
