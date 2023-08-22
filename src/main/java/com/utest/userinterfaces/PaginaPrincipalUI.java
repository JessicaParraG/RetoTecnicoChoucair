package com.utest.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class PaginaPrincipalUI extends PageObject {

    public static final Target BTN_JOIN = Target.the("").located(By.xpath("(//a[text()='Join Today'])[1]"));

}
