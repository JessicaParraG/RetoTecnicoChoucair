package com.utest.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DispositivosUI {

    public static final Target BTN_SISTEMAOPERATIVOPC = Target.the("Sistema operativo").located(By.xpath("(//span[@aria-label='Select OS'])[1]"));
    public static final Target TXT_SISTEMAOPERATIVOPC = Target.the("Sistema operativo").located(By.xpath("(//input[@placeholder='Select OS'])[1]"));
    public static final Target BTN_VERSIONPC = Target.the("Version").located(By.xpath("//span[@aria-label='Select a Version']"));
    public static final Target TXT_VERSIONPC = Target.the("Version").located(By.xpath("//input[@placeholder='Select a Version']"));
    public static final Target BTN_LENGUAJE = Target.the("Lenguaje computador").located(By.xpath("//span[@aria-label='Select OS language']"));
    public static final Target TXT_LENGUAJE = Target.the("Lenguaje computador").located(By.xpath("//input[@placeholder='Select OS language']"));
    public static final Target BTN_MARCACELULAR = Target.the("Marca celular").located(By.xpath("//span[@aria-label='Select Brand']"));
    public static final Target TXT_MARCACELULAR = Target.the("Marca celular").located(By.xpath("//input[@placeholder='Select Brand']"));
    public static final Target BTN_MODELOCELULAR = Target.the("Modelo celular").located(By.xpath("//span[@aria-label='Select a Model']"));
    public static final Target TXT_MODELOCELULAR = Target.the("Modelo celular").located(By.xpath("//input[@placeholder='Select a Model']"));
    public static final Target BTN_SISTEMAOPERATIVOCELULAR = Target.the("Sistema operativo").located(By.xpath("(//span[@aria-label='Select OS'])[2]"));
    public static final Target TXT_SISTEMAOPERATIVOCELULAR = Target.the("Sistema operativo").located(By.xpath("(//input[@placeholder='Select OS'])[2]"));
    public static final Target BTN_NEXTLAST = Target.the("Boton next last step").located(By.xpath("//span[text()='Next: Last Step']"));

}
