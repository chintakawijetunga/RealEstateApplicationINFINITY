package Classes.UserLogin;

import Classes.RealEstate.*;
import java.io.File;
import javax.swing.JOptionPane;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;

public class UserLoginXML {

    private String path = "userlogindetails.xml";
    private static SortedList list = new SortedList();

    public void loadUserLoginXML() {
        
        ListUserLogin userLogin;

        try {

            File fXmlFile = new File(path);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("Login");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    userLogin = UserLoginFile.getNextUserLogin(nNode);
                    list.insertHouse(userLogin);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void saveToUserLoginXML() {

        int count = 0;

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;

        try {

            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
            //add elements to Document
            Element rootElement = doc.createElementNS("http://www.InfinityRealEstates.com/UserLogins", "UserLogins");

            //append root element to document
            doc.appendChild(rootElement);

            while (count < list.listLengthIs()) {
                ListUserLogin userLogin = (ListUserLogin) list.getNextItem(false);
                rootElement.appendChild(getUserLogin(doc, userLogin.userName(), userLogin.password()));
                count++;
            }

            //for output to file, console
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            //for pretty print
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);

            //write to console or file
            //StreamResult console = new StreamResult(System.out);
            StreamResult file = new StreamResult(new File(path));

            //write data
            //transformer.transform(source, console);
            transformer.transform(source, file);
            //JOptionPane.showMessageDialog(rootPane,"File saved!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private static Node getUserLogin(Document doc, String userName, String password) {
        
        Element login = doc.createElement("Login");

        login.setAttribute("UserName", userName);
        login.appendChild(getUserLoginElements(doc, "Password", password));

        return login;
    }

    private static Node getUserLoginElements(Document doc, String name, String value) {
        
        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));
        return node;
    }

    public ListUserLogin getUserLogin(String uName, String uPwd) {
        
        String userName;
        String password;

        userName = uName;
        password = uPwd;

        ListUserLogin userLogin = new ListUserLogin(userName, password);

        return userLogin;
    }

}
