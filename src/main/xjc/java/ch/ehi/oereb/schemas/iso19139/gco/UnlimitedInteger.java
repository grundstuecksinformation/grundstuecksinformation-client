//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.28 at 05:34:43 PM CEST 
//


package ch.ehi.oereb.schemas.iso19139.gco;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class UnlimitedInteger
    extends JAXBElement<UnlimitedIntegerType>
{

    protected final static QName NAME = new QName("http://www.isotc211.org/2005/gco", "UnlimitedInteger");

    public UnlimitedInteger(UnlimitedIntegerType value) {
        super(NAME, ((Class) UnlimitedIntegerType.class), null, value);
    }

    public UnlimitedInteger() {
        super(NAME, ((Class) UnlimitedIntegerType.class), null, null);
    }

}
