package com.easyqa.qa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {
    @FindBy(xpath = "//header[@id='head_menu']//a[@href='/user/edit']")
    public SelenideElement profileLink;

    public void checkUserAuthorized() {
        profileLink.shouldBe(Condition.visible);
    }


}
