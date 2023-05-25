package src.xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class XmlParse {
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new FileInputStream("src/xml/student.xml"));
        Element rootElement = document.getRootElement();
        List<Element> elements = rootElement.elements("student");

        for (Element studentElement : elements) {
            Attribute attribute =studentElement.attribute("id");
            String id = attribute.getValue();

            Element nameElements = studentElement.element("name");
            String name = nameElements.getText();

            Element ageElements = studentElement.element("age");
            String age = ageElements.getText();
            System.out.println(id + name + age);
        }
    }
}