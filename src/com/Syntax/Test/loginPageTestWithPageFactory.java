package com.Syntax.Test;

import com.Syntax.Pages.loginPageWithPageFactory;
import com.Syntax.utils.CommonMethods;

public class loginPageTestWithPageFactory {
    public static void main(String[] args) {

        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22");
        loginPageWithPageFactory login =new loginPageWithPageFactory();
        login.usernamefield.sendKeys("Admin");
        login.passwordfield.sendKeys("Hum@nhrm123");
        login.loginbtn.click();
    }
}
