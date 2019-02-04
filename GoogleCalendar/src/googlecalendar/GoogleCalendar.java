/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlecalendar;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author gianlucanarducci
 */
public class GoogleCalendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List links = null;
        Parser dom = new Parser();
        try {
            links = dom.parseDocument("ConsigliDiClasse.xml");
        } catch (ParserConfigurationException | SAXException | IOException exception) {
            System.out.println("Errore!");
        }
        // iterazione della lista e visualizzazione degli oggetti
        System.out.println("Numero di link: " + links.size());
        Iterator iterator = links.iterator();
        int i=1;
        while (iterator.hasNext()) {
            System.out.println(i+iterator.next().toString());
            i++;
        }
    }
    
}
