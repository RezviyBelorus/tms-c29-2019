package tms.c29.lec_15.classwork.part_1;

import tms.c29.lec_15.entity.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StaxParserExample {
    public static void main(String[] args) {
        String fileName = "/Users/alexfomin/IdeaProjects/tms/tms-c29-2019/resources/lec_15/xml/employee.xml";
        List<Employee> empList = parseXML(fileName);
        for (Employee emp : empList) {
            System.out.println(emp.toString());
        }
    }

    private static List<Employee> parseXML(String fileName) {
        List<Employee> empList = new ArrayList<>();
        Employee emp = null;
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        try {
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(fileName));
            while (xmlEventReader.hasNext()) {
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();
                    if (startElement.getName().getLocalPart().equals("employee")) {
                        emp = new Employee();
                        //Get the 'id' attribute from Employee element
                        Attribute idAttr = startElement.getAttributeByName(new QName("id"));
                        if (idAttr != null) {
                            emp.setId(idAttr.getValue());
                        }
                    }
                    //set the other variables from xml elements
                    else {
                        String localPart = startElement.getName().getLocalPart();
                        switch (localPart) {
                            case "firstName":
                                xmlEvent = xmlEventReader.nextEvent();
                                emp.setFirstName(xmlEvent.asCharacters().getData());
                                break;
                            case "lastName":
                                xmlEvent = xmlEventReader.nextEvent();
                                emp.setLastName(xmlEvent.asCharacters().getData());
                                break;
                            case "location":
                                xmlEvent = xmlEventReader.nextEvent();
                                emp.setLocation(xmlEvent.asCharacters().getData());
                                break;
                        }
                    }
                }
                //if Employee end element is reached, add employee object to list
                if (xmlEvent.isEndElement()) {
                    EndElement endElement = xmlEvent.asEndElement();
                    if (endElement.getName().getLocalPart().equals("employee")) {
                        empList.add(emp);
                    }
                }
            }

        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
        return empList;
    }
}
