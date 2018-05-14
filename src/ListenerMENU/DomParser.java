package ListenerMENU;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import javax.swing.text.html.HTMLEditorKit.Parser;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.ParserFactory;

public class DomParser {
	public static int VoirRep ;
	public static int NbCouleur = 9 ;
	public static int NbTour = 5 ;
	public DomParser() {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setIgnoringElementContentWhitespace(true);
		
		try {

			File stocks = new File("param.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(stocks);
			doc.getDocumentElement().normalize();

			System.out.println("root of xml file" + doc.getDocumentElement().getNodeName());
			NodeList nodes = doc.getElementsByTagName("All");
			System.out.println("==========================");

			for (int i = 0; i < nodes.getLength(); i++) {
			Node node = nodes.item(i);

			if (node.getNodeType() == Node.ELEMENT_NODE) {
			Element element = (Element) node;
			System.out.println("VoirRep: " + getValue("VoirRep", element));
			String n = getValue("VoirRep", element);
			int nn = Integer.parseInt(n);
			VoirRep = nn;
			System.out.println("NombreTour: " + getValue("NombreTour", element));
			String m = getValue("NombreTour", element);
			int mm= Integer.parseInt(m);
			NbTour = mm;
			System.out.println("nombreCouleurs : " + getValue("nombreCouleurs", element));
			String p = getValue("nombreCouleurs", element);
			int pp= Integer.parseInt(p);
			NbCouleur = pp;
			}
			}
			} catch (Exception ex) {
			ex.printStackTrace();
			}
	}
	private static String getValue(String tag, Element element) {
		NodeList nodes = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodes.item(0);
		return node.getNodeValue();
		}
}