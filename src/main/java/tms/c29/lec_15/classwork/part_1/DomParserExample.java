package tms.c29.lec_15.classwork.part_1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import tms.c29.lec_15.entity.Employee;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class DomParserExample {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        DocumentBuilder documentBuilder = factory.newDocumentBuilder();

        InputStream resource = ClassLoader.getSystemResourceAsStream("lec_15/xml/employee.xml");
        Document document = documentBuilder.parse(resource);

        List<Employee> employees = new ArrayList<>();
        NodeList nodeList = document.getDocumentElement().getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node instanceof Element) {
                Employee employee = new Employee();
                employee.setId(node.getAttributes().getNamedItem("id").getNodeValue());

                NodeList childNodes = node.getChildNodes();
                for (int j = 0; j < childNodes.getLength(); j++) {
                    Node cNode = childNodes.item(j);

                    //Identifying the child tag of employee encountered.
                    if (cNode instanceof Element) {
                        String content = cNode.getLastChild().
                            getTextContent().trim();
                        switch (cNode.getNodeName()) {
                            case "firstName":
                                employee.setFirstName(content);
                                break;
                            case "lastName":
                                employee.setLastName(content);
                                break;
                            case "location":
                                employee.setLocation(content);
                                break;
                        }
                    }
                }
                employees.add(employee);
            }
        }

        employees.forEach(employee -> System.out.println(employee));
    }
}
