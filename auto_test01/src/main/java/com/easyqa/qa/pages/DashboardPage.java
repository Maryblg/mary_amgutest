package com.easyqa.qa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {
    public void checkUserAuthorized() {
                $(UIMap.profileLink).shouldBe(Condition.visible);
    }
}
