package ListenerMENU;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomParser {
	public static int NbCouleur = 9 ;
	int NbTour = 5 ;
	public DomParser() {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder() ;
			Document doc = builder.parse("param.xml");
			NodeList node = doc.getChildNodes();
			int nbNode = node.getLength();
	        
			for (int i = 0; i<nbNode; i++) {
			    if(node.item(i).getNodeType() == Node.ELEMENT_NODE) {
			        final Element VoirLesReponses = (Element) node.item(i);
				System.out.println(VoirLesReponses.getNodeName());
				System.out.println("VoirRep : " + VoirLesReponses.getAttribute("VoirRep"));
			    }				
			}

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
