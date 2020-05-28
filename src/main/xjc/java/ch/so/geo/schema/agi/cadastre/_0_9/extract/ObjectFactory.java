//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.22 at 02:52:40 PM CEST 
//


package ch.so.geo.schema.agi.cadastre._0_9.extract;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.so.geo.schema.agi.cadastre._0_9.extract package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetEGRIDResponseEGRID_QNAME = new QName("http://geo.so.ch/schema/AGI/Cadastre/0.9/Extract", "EGRID");
    private final static QName _GetEGRIDResponsePlanned_QNAME = new QName("http://geo.so.ch/schema/AGI/Cadastre/0.9/Extract", "planned");
    private final static QName _GetEGRIDResponseLimit_QNAME = new QName("http://geo.so.ch/schema/AGI/Cadastre/0.9/Extract", "Limit");
    private final static QName _GetEGRIDResponseStateOf_QNAME = new QName("http://geo.so.ch/schema/AGI/Cadastre/0.9/Extract", "StateOf");
    private final static QName _GetEGRIDResponseType_QNAME = new QName("http://geo.so.ch/schema/AGI/Cadastre/0.9/Extract", "Type");
    private final static QName _GetEGRIDResponseIdentND_QNAME = new QName("http://geo.so.ch/schema/AGI/Cadastre/0.9/Extract", "IdentND");
    private final static QName _GetEGRIDResponseNumber_QNAME = new QName("http://geo.so.ch/schema/AGI/Cadastre/0.9/Extract", "Number");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.so.geo.schema.agi.cadastre._0_9.extract
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetExtractByIdResponse }
     * 
     */
    public GetExtractByIdResponse createGetExtractByIdResponse() {
        return new GetExtractByIdResponse();
    }

    /**
     * Create an instance of {@link Extract }
     * 
     */
    public Extract createExtract() {
        return new Extract();
    }

    /**
     * Create an instance of {@link GetEGRIDResponse }
     * 
     */
    public GetEGRIDResponse createGetEGRIDResponse() {
        return new GetEGRIDResponse();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link RealEstateDPR }
     * 
     */
    public RealEstateDPR createRealEstateDPR() {
        return new RealEstateDPR();
    }

    /**
     * Create an instance of {@link BuildingType }
     * 
     */
    public BuildingType createBuildingType() {
        return new BuildingType();
    }

    /**
     * Create an instance of {@link OrganisationType }
     * 
     */
    public OrganisationType createOrganisationType() {
        return new OrganisationType();
    }

    /**
     * Create an instance of {@link PersonAddressType }
     * 
     */
    public PersonAddressType createPersonAddressType() {
        return new PersonAddressType();
    }

    /**
     * Create an instance of {@link LandCoverShareType }
     * 
     */
    public LandCoverShareType createLandCoverShareType() {
        return new LandCoverShareType();
    }

    /**
     * Create an instance of {@link Map }
     * 
     */
    public Map createMap() {
        return new Map();
    }

    /**
     * Create an instance of {@link LocalNameType }
     * 
     */
    public LocalNameType createLocalNameType() {
        return new LocalNameType();
    }

    /**
     * Create an instance of {@link BuildingEntryType }
     * 
     */
    public BuildingEntryType createBuildingEntryType() {
        return new BuildingEntryType();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://geo.so.ch/schema/AGI/Cadastre/0.9/Extract", name = "EGRID", scope = GetEGRIDResponse.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGetEGRIDResponseEGRID(String value) {
        return new JAXBElement<String>(_GetEGRIDResponseEGRID_QNAME, String.class, GetEGRIDResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://geo.so.ch/schema/AGI/Cadastre/0.9/Extract", name = "planned", scope = GetEGRIDResponse.class)
    public JAXBElement<Boolean> createGetEGRIDResponsePlanned(Boolean value) {
        return new JAXBElement<Boolean>(_GetEGRIDResponsePlanned_QNAME, Boolean.class, GetEGRIDResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://geo.so.ch/schema/AGI/Cadastre/0.9/Extract", name = "Limit", scope = GetEGRIDResponse.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGetEGRIDResponseLimit(String value) {
        return new JAXBElement<String>(_GetEGRIDResponseLimit_QNAME, String.class, GetEGRIDResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://geo.so.ch/schema/AGI/Cadastre/0.9/Extract", name = "StateOf", scope = GetEGRIDResponse.class)
    public JAXBElement<XMLGregorianCalendar> createGetEGRIDResponseStateOf(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetEGRIDResponseStateOf_QNAME, XMLGregorianCalendar.class, GetEGRIDResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealEstateType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RealEstateType }{@code >}
     */
    @XmlElementDecl(namespace = "http://geo.so.ch/schema/AGI/Cadastre/0.9/Extract", name = "Type", scope = GetEGRIDResponse.class)
    public JAXBElement<RealEstateType> createGetEGRIDResponseType(RealEstateType value) {
        return new JAXBElement<RealEstateType>(_GetEGRIDResponseType_QNAME, RealEstateType.class, GetEGRIDResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://geo.so.ch/schema/AGI/Cadastre/0.9/Extract", name = "IdentND", scope = GetEGRIDResponse.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGetEGRIDResponseIdentND(String value) {
        return new JAXBElement<String>(_GetEGRIDResponseIdentND_QNAME, String.class, GetEGRIDResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://geo.so.ch/schema/AGI/Cadastre/0.9/Extract", name = "Number", scope = GetEGRIDResponse.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGetEGRIDResponseNumber(String value) {
        return new JAXBElement<String>(_GetEGRIDResponseNumber_QNAME, String.class, GetEGRIDResponse.class, value);
    }

}
