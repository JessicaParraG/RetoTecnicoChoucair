package com.utest.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UbicacionUI {

    public static final Target BTN_PAIS = Target.the("Pais").located(By.xpath("//span[@aria-label='Select a country']"));
    public static final Target TXT_PAIS = Target.the("Pais").located(By.xpath("//input[@placeholder='Select a country']"));
    public static final Target TXT_CIUDAD = Target.the("Ciudad").located(By.id("city"));
    public static final Target TXT_ZIP = Target.the("ZIP").located(By.id("zip"));
}
