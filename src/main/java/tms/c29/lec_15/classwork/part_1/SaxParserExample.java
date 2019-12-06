package tms.c29.lec_15.classwork.part_1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import tms.c29.lec_15.entity.Employee;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SaxParserExample {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        SAXParser parser = parserFactory.newSAXParser();

        SAXHandler handler = new SAXHandler();
        InputStream resource = ClassLoader.getSystemResourceAsStream("lec_15/xml/employee.xml");
        parser.parse(resource, handler);

        List<Employee> empList = handler.getEmpList();

        empList.forEach(employee -> System.out.println(employee));

    }
}

class SAXHandler extends DefaultHandler {
    private List<Employee> empList = new ArrayList<>();
    private Employee emp = null;
    private String content = null;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            //Create a new Employee object when the start tag is found
            case "employee":
                emp = new Employee();
                emp.setId(attributes.getValue("id"));
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            //Add the employee to list once end tag is found
            case "employee":
                empList.add(emp);
                break;
            //For all other end tags the employee has to be updated.
            case "firstName":
                emp.setFirstName(content);
                break;
            case "lastName":
                emp.setLastName(content);
                break;
            case "location":
                emp.setLocation(content);
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        content = String.copyValueOf(ch, start, length).trim();
    }

    public List<Employee> getEmpList() {
        return empList;
    }
}