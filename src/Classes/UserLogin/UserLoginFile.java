package Classes.UserLogin;

import java.io.IOException;
import org.w3c.dom.*;

public class UserLoginFile {

    public static ListUserLogin getNextUserLogin(Node nNode) throws IOException {
        
        String userName = "xxxxx";
        String password = "xxxxx";
        Element eElement = (Element) nNode;

        userName = eElement.getAttribute("UserName");
        password = eElement.getElementsByTagName("Password").item(0).getTextContent();

        ListUserLogin userLogin = new ListUserLogin(userName, password);

        return userLogin;
    }
}
