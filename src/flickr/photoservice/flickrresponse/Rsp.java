//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.5-2 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2015.12.23 ʱ�� 03:58:12 PM CST 
//


package flickr.photoservice.flickrresponse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="items" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="activity">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="event" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="user" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="dateadded" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="primary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="comments" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="views" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="photos" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="more" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="notes" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="faves" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="commentsold" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="commentsnew" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="notesold" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="notesnew" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="perpage" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="blogs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="blog" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="needspassword" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="contacts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contact" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="iconserver" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="realname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="friend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="family" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="ignored" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="perpage" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="photos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="photo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ispublic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="isfriend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="isfamily" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="ownername" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="dateadded" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="lastupdate" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="perpage" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="category" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subcat" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="group" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="members" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="online" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="chatnsid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="inchat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pathids" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="group" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="members" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="privacy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="throttle" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="remaining" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="groupname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="iconserver" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ispoolmoderated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="groups" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="group" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="eighteenplus" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="admin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="photos" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="iconserver" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="privacy" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="perpage" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="per_page" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="prevphoto" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="nextphoto" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="user" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bandwidth" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="maxbytes" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="maxkb" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="usedbytes" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="usedkb" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="remainingbytes" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="remainingkb" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="filesize" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="maxbytes" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="maxkb" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="sets" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="created" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="remaining" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ispro" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="person" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="realname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="mbox_sha1sum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="photosurl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="profileurl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="photos" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="firstdate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="firstdatetaken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="isadmin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="ispro" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="iconserver" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="iconfarm" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="contact" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="friend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="family" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="revcontact" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="revfriend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="revfamily" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="content_type" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="geoperms" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="privacy" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="safety_level" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="set" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pool" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="photocounts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="photocount" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="fromdate" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="todate" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="photo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="exif" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="raw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="clean" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="tagspace" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="tagspaceid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="tag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="person" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="favedate" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="owner" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="realname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="visibility" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ispublic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="isfriend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="isfamily" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="dates" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="posted" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="taken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="takengranularity" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="lastupdate" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="permissions" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="permcomment" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="permaddmeta" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="editability" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="cancomment" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="canaddmeta" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="notes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="note" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="authorname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="x" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="y" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="w" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="h" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="tags" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tag" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="raw" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="authorname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="urls" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="url" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="location" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="accuracy" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="farm" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="perpage" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="isfavorite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="license" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="rotation" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="originalsecret" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="originalformat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="content_type" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="safety_level" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="perms" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ispublic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="isfriend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="isfamily" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="permcomment" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="permaddmeta" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="iscontact" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="sizes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="size" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="photoid" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="originalsecret" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="comment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="comments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="comment" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="authorname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="datecreate" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="permalink" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="date_create" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="photo_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="photoset_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="note" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="uploader" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ticket" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="complete" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="photoid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="invalid" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="photoset" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="photo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="isprimary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="primary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="photos" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="perpage" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="photosets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="photoset" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="primary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="photos" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="farm" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="cancreate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="places" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="place" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="place_type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="query" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="accuracy" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="location" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="locality">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="county">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="region">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="country">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="place_type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="hottags" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tag" type="{}tagType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="period" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tags" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tag" type="{}tagType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="who" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tags">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tag" type="{}tagType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="clusters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cluster" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tag" type="{}tagType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="method" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="response" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="explanation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="arguments">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="argument" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="errors">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="error" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="message" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="needslogin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="methods" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="err" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="msg" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="frob" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="auth" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="token">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="perms">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="none"/>
 *                         &lt;enumeration value="read"/>
 *                         &lt;enumeration value="write"/>
 *                         &lt;enumeration value="delete"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="user">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="fullname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="licenses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="license" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="stat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "items",
    "blogs",
    "contacts",
    "photos",
    "category",
    "group",
    "groups",
    "prevphoto",
    "nextphoto",
    "user",
    "person",
    "set",
    "pool",
    "photocounts",
    "photo",
    "perms",
    "sizes",
    "photoid",
    "comment",
    "comments",
    "note",
    "uploader",
    "photoset",
    "photosets",
    "places",
    "location",
    "hottags",
    "tags",
    "who",
    "clusters",
    "method",
    "methods",
    "err",
    "frob",
    "auth",
    "licenses"
})
@XmlRootElement(name = "rsp")
public class Rsp {

    protected Rsp.Items items;
    protected Rsp.Blogs blogs;
    protected Rsp.Contacts contacts;
    protected Rsp.Photos photos;
    protected Rsp.Category category;
    protected Rsp.Group group;
    protected Rsp.Groups groups;
    protected Rsp.Prevphoto prevphoto;
    protected Rsp.Nextphoto nextphoto;
    protected Rsp.User user;
    protected Rsp.Person person;
    protected Rsp.Set set;
    protected Rsp.Pool pool;
    protected Rsp.Photocounts photocounts;
    protected Rsp.Photo photo;
    protected Rsp.Perms perms;
    protected Rsp.Sizes sizes;
    protected Rsp.Photoid photoid;
    protected Rsp.Comment comment;
    protected Rsp.Comments comments;
    protected Rsp.Note note;
    protected Rsp.Uploader uploader;
    protected Rsp.Photoset photoset;
    protected Rsp.Photosets photosets;
    protected Rsp.Places places;
    protected Rsp.Location location;
    protected Rsp.Hottags hottags;
    protected Rsp.Tags tags;
    protected Rsp.Who who;
    protected Rsp.Clusters clusters;
    protected Rsp.Method method;
    protected Rsp.Methods methods;
    protected Rsp.Err err;
    protected String frob;
    protected Rsp.Auth auth;
    protected Rsp.Licenses licenses;
    @XmlAttribute(name = "stat")
    protected String stat;

    /**
     * ��ȡitems���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Items }
     *     
     */
    public Rsp.Items getItems() {
        return items;
    }

    /**
     * ����items���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Items }
     *     
     */
    public void setItems(Rsp.Items value) {
        this.items = value;
    }

    /**
     * ��ȡblogs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Blogs }
     *     
     */
    public Rsp.Blogs getBlogs() {
        return blogs;
    }

    /**
     * ����blogs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Blogs }
     *     
     */
    public void setBlogs(Rsp.Blogs value) {
        this.blogs = value;
    }

    /**
     * ��ȡcontacts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Contacts }
     *     
     */
    public Rsp.Contacts getContacts() {
        return contacts;
    }

    /**
     * ����contacts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Contacts }
     *     
     */
    public void setContacts(Rsp.Contacts value) {
        this.contacts = value;
    }

    /**
     * ��ȡphotos���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Photos }
     *     
     */
    public Rsp.Photos getPhotos() {
        return photos;
    }

    /**
     * ����photos���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Photos }
     *     
     */
    public void setPhotos(Rsp.Photos value) {
        this.photos = value;
    }

    /**
     * ��ȡcategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Category }
     *     
     */
    public Rsp.Category getCategory() {
        return category;
    }

    /**
     * ����category���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Category }
     *     
     */
    public void setCategory(Rsp.Category value) {
        this.category = value;
    }

    /**
     * ��ȡgroup���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Group }
     *     
     */
    public Rsp.Group getGroup() {
        return group;
    }

    /**
     * ����group���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Group }
     *     
     */
    public void setGroup(Rsp.Group value) {
        this.group = value;
    }

    /**
     * ��ȡgroups���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Groups }
     *     
     */
    public Rsp.Groups getGroups() {
        return groups;
    }

    /**
     * ����groups���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Groups }
     *     
     */
    public void setGroups(Rsp.Groups value) {
        this.groups = value;
    }

    /**
     * ��ȡprevphoto���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Prevphoto }
     *     
     */
    public Rsp.Prevphoto getPrevphoto() {
        return prevphoto;
    }

    /**
     * ����prevphoto���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Prevphoto }
     *     
     */
    public void setPrevphoto(Rsp.Prevphoto value) {
        this.prevphoto = value;
    }

    /**
     * ��ȡnextphoto���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Nextphoto }
     *     
     */
    public Rsp.Nextphoto getNextphoto() {
        return nextphoto;
    }

    /**
     * ����nextphoto���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Nextphoto }
     *     
     */
    public void setNextphoto(Rsp.Nextphoto value) {
        this.nextphoto = value;
    }

    /**
     * ��ȡuser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.User }
     *     
     */
    public Rsp.User getUser() {
        return user;
    }

    /**
     * ����user���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.User }
     *     
     */
    public void setUser(Rsp.User value) {
        this.user = value;
    }

    /**
     * ��ȡperson���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Person }
     *     
     */
    public Rsp.Person getPerson() {
        return person;
    }

    /**
     * ����person���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Person }
     *     
     */
    public void setPerson(Rsp.Person value) {
        this.person = value;
    }

    /**
     * ��ȡset���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Set }
     *     
     */
    public Rsp.Set getSet() {
        return set;
    }

    /**
     * ����set���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Set }
     *     
     */
    public void setSet(Rsp.Set value) {
        this.set = value;
    }

    /**
     * ��ȡpool���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Pool }
     *     
     */
    public Rsp.Pool getPool() {
        return pool;
    }

    /**
     * ����pool���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Pool }
     *     
     */
    public void setPool(Rsp.Pool value) {
        this.pool = value;
    }

    /**
     * ��ȡphotocounts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Photocounts }
     *     
     */
    public Rsp.Photocounts getPhotocounts() {
        return photocounts;
    }

    /**
     * ����photocounts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Photocounts }
     *     
     */
    public void setPhotocounts(Rsp.Photocounts value) {
        this.photocounts = value;
    }

    /**
     * ��ȡphoto���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Photo }
     *     
     */
    public Rsp.Photo getPhoto() {
        return photo;
    }

    /**
     * ����photo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Photo }
     *     
     */
    public void setPhoto(Rsp.Photo value) {
        this.photo = value;
    }

    /**
     * ��ȡperms���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Perms }
     *     
     */
    public Rsp.Perms getPerms() {
        return perms;
    }

    /**
     * ����perms���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Perms }
     *     
     */
    public void setPerms(Rsp.Perms value) {
        this.perms = value;
    }

    /**
     * ��ȡsizes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Sizes }
     *     
     */
    public Rsp.Sizes getSizes() {
        return sizes;
    }

    /**
     * ����sizes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Sizes }
     *     
     */
    public void setSizes(Rsp.Sizes value) {
        this.sizes = value;
    }

    /**
     * ��ȡphotoid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Photoid }
     *     
     */
    public Rsp.Photoid getPhotoid() {
        return photoid;
    }

    /**
     * ����photoid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Photoid }
     *     
     */
    public void setPhotoid(Rsp.Photoid value) {
        this.photoid = value;
    }

    /**
     * ��ȡcomment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Comment }
     *     
     */
    public Rsp.Comment getComment() {
        return comment;
    }

    /**
     * ����comment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Comment }
     *     
     */
    public void setComment(Rsp.Comment value) {
        this.comment = value;
    }

    /**
     * ��ȡcomments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Comments }
     *     
     */
    public Rsp.Comments getComments() {
        return comments;
    }

    /**
     * ����comments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Comments }
     *     
     */
    public void setComments(Rsp.Comments value) {
        this.comments = value;
    }

    /**
     * ��ȡnote���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Note }
     *     
     */
    public Rsp.Note getNote() {
        return note;
    }

    /**
     * ����note���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Note }
     *     
     */
    public void setNote(Rsp.Note value) {
        this.note = value;
    }

    /**
     * ��ȡuploader���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Uploader }
     *     
     */
    public Rsp.Uploader getUploader() {
        return uploader;
    }

    /**
     * ����uploader���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Uploader }
     *     
     */
    public void setUploader(Rsp.Uploader value) {
        this.uploader = value;
    }

    /**
     * ��ȡphotoset���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Photoset }
     *     
     */
    public Rsp.Photoset getPhotoset() {
        return photoset;
    }

    /**
     * ����photoset���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Photoset }
     *     
     */
    public void setPhotoset(Rsp.Photoset value) {
        this.photoset = value;
    }

    /**
     * ��ȡphotosets���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Photosets }
     *     
     */
    public Rsp.Photosets getPhotosets() {
        return photosets;
    }

    /**
     * ����photosets���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Photosets }
     *     
     */
    public void setPhotosets(Rsp.Photosets value) {
        this.photosets = value;
    }

    /**
     * ��ȡplaces���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Places }
     *     
     */
    public Rsp.Places getPlaces() {
        return places;
    }

    /**
     * ����places���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Places }
     *     
     */
    public void setPlaces(Rsp.Places value) {
        this.places = value;
    }

    /**
     * ��ȡlocation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Location }
     *     
     */
    public Rsp.Location getLocation() {
        return location;
    }

    /**
     * ����location���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Location }
     *     
     */
    public void setLocation(Rsp.Location value) {
        this.location = value;
    }

    /**
     * ��ȡhottags���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Hottags }
     *     
     */
    public Rsp.Hottags getHottags() {
        return hottags;
    }

    /**
     * ����hottags���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Hottags }
     *     
     */
    public void setHottags(Rsp.Hottags value) {
        this.hottags = value;
    }

    /**
     * ��ȡtags���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Tags }
     *     
     */
    public Rsp.Tags getTags() {
        return tags;
    }

    /**
     * ����tags���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Tags }
     *     
     */
    public void setTags(Rsp.Tags value) {
        this.tags = value;
    }

    /**
     * ��ȡwho���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Who }
     *     
     */
    public Rsp.Who getWho() {
        return who;
    }

    /**
     * ����who���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Who }
     *     
     */
    public void setWho(Rsp.Who value) {
        this.who = value;
    }

    /**
     * ��ȡclusters���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Clusters }
     *     
     */
    public Rsp.Clusters getClusters() {
        return clusters;
    }

    /**
     * ����clusters���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Clusters }
     *     
     */
    public void setClusters(Rsp.Clusters value) {
        this.clusters = value;
    }

    /**
     * ��ȡmethod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Method }
     *     
     */
    public Rsp.Method getMethod() {
        return method;
    }

    /**
     * ����method���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Method }
     *     
     */
    public void setMethod(Rsp.Method value) {
        this.method = value;
    }

    /**
     * ��ȡmethods���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Methods }
     *     
     */
    public Rsp.Methods getMethods() {
        return methods;
    }

    /**
     * ����methods���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Methods }
     *     
     */
    public void setMethods(Rsp.Methods value) {
        this.methods = value;
    }

    /**
     * ��ȡerr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Err }
     *     
     */
    public Rsp.Err getErr() {
        return err;
    }

    /**
     * ����err���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Err }
     *     
     */
    public void setErr(Rsp.Err value) {
        this.err = value;
    }

    /**
     * ��ȡfrob���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrob() {
        return frob;
    }

    /**
     * ����frob���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrob(String value) {
        this.frob = value;
    }

    /**
     * ��ȡauth���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Auth }
     *     
     */
    public Rsp.Auth getAuth() {
        return auth;
    }

    /**
     * ����auth���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Auth }
     *     
     */
    public void setAuth(Rsp.Auth value) {
        this.auth = value;
    }

    /**
     * ��ȡlicenses���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Licenses }
     *     
     */
    public Rsp.Licenses getLicenses() {
        return licenses;
    }

    /**
     * ����licenses���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Licenses }
     *     
     */
    public void setLicenses(Rsp.Licenses value) {
        this.licenses = value;
    }

    /**
     * ��ȡstat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStat() {
        return stat;
    }

    /**
     * ����stat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStat(String value) {
        this.stat = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="token">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="perms">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="none"/>
     *               &lt;enumeration value="read"/>
     *               &lt;enumeration value="write"/>
     *               &lt;enumeration value="delete"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="user">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="fullname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "token",
        "perms",
        "user"
    })
    public static class Auth {

        @XmlElement(required = true)
        protected String token;
        @XmlElement(required = true)
        protected String perms;
        @XmlElement(required = true)
        protected Rsp.Auth.User user;

        /**
         * ��ȡtoken���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getToken() {
            return token;
        }

        /**
         * ����token���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setToken(String value) {
            this.token = value;
        }

        /**
         * ��ȡperms���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPerms() {
            return perms;
        }

        /**
         * ����perms���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPerms(String value) {
            this.perms = value;
        }

        /**
         * ��ȡuser���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Auth.User }
         *     
         */
        public Rsp.Auth.User getUser() {
            return user;
        }

        /**
         * ����user���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Auth.User }
         *     
         */
        public void setUser(Rsp.Auth.User value) {
            this.user = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="fullname" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class User {

            @XmlAttribute(name = "nsid")
            protected String nsid;
            @XmlAttribute(name = "username")
            protected String username;
            @XmlAttribute(name = "fullname")
            protected String fullname;

            /**
             * ��ȡnsid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNsid() {
                return nsid;
            }

            /**
             * ����nsid���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNsid(String value) {
                this.nsid = value;
            }

            /**
             * ��ȡusername���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsername() {
                return username;
            }

            /**
             * ����username���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsername(String value) {
                this.username = value;
            }

            /**
             * ��ȡfullname���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFullname() {
                return fullname;
            }

            /**
             * ����fullname���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFullname(String value) {
                this.fullname = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="blog" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="needspassword" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "blog"
    })
    public static class Blogs {

        protected List<Rsp.Blogs.Blog> blog;

        /**
         * Gets the value of the blog property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the blog property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBlog().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Blogs.Blog }
         * 
         * 
         */
        public List<Rsp.Blogs.Blog> getBlog() {
            if (blog == null) {
                blog = new ArrayList<Rsp.Blogs.Blog>();
            }
            return this.blog;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="needspassword" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Blog {

            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "needspassword")
            protected Boolean needspassword;
            @XmlAttribute(name = "url")
            protected String url;

            /**
             * ��ȡid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * ����id���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * ��ȡname���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * ����name���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * ��ȡneedspassword���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isNeedspassword() {
                return needspassword;
            }

            /**
             * ����needspassword���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setNeedspassword(Boolean value) {
                this.needspassword = value;
            }

            /**
             * ��ȡurl���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUrl() {
                return url;
            }

            /**
             * ����url���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUrl(String value) {
                this.url = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="subcat" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="group" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="members" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="online" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="chatnsid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="inchat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pathids" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subcat",
        "group"
    })
    public static class Category {

        protected List<Rsp.Category.Subcat> subcat;
        protected List<Rsp.Category.Group> group;
        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "path")
        protected String path;
        @XmlAttribute(name = "pathids")
        protected String pathids;

        /**
         * Gets the value of the subcat property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subcat property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubcat().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Category.Subcat }
         * 
         * 
         */
        public List<Rsp.Category.Subcat> getSubcat() {
            if (subcat == null) {
                subcat = new ArrayList<Rsp.Category.Subcat>();
            }
            return this.subcat;
        }

        /**
         * Gets the value of the group property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the group property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Category.Group }
         * 
         * 
         */
        public List<Rsp.Category.Group> getGroup() {
            if (group == null) {
                group = new ArrayList<Rsp.Category.Group>();
            }
            return this.group;
        }

        /**
         * ��ȡname���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * ����name���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * ��ȡpath���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPath() {
            return path;
        }

        /**
         * ����path���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPath(String value) {
            this.path = value;
        }

        /**
         * ��ȡpathids���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPathids() {
            return pathids;
        }

        /**
         * ����pathids���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPathids(String value) {
            this.pathids = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="members" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="online" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="chatnsid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="inchat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Group {

            @XmlAttribute(name = "nsid")
            protected String nsid;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "members")
            protected Integer members;
            @XmlAttribute(name = "online")
            protected Boolean online;
            @XmlAttribute(name = "chatnsid")
            protected String chatnsid;
            @XmlAttribute(name = "inchat")
            protected Boolean inchat;

            /**
             * ��ȡnsid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNsid() {
                return nsid;
            }

            /**
             * ����nsid���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNsid(String value) {
                this.nsid = value;
            }

            /**
             * ��ȡname���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * ����name���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * ��ȡmembers���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMembers() {
                return members;
            }

            /**
             * ����members���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMembers(Integer value) {
                this.members = value;
            }

            /**
             * ��ȡonline���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isOnline() {
                return online;
            }

            /**
             * ����online���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setOnline(Boolean value) {
                this.online = value;
            }

            /**
             * ��ȡchatnsid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChatnsid() {
                return chatnsid;
            }

            /**
             * ����chatnsid���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChatnsid(String value) {
                this.chatnsid = value;
            }

            /**
             * ��ȡinchat���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isInchat() {
                return inchat;
            }

            /**
             * ����inchat���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setInchat(Boolean value) {
                this.inchat = value;
            }

        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Subcat {

            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "count")
            protected Integer count;

            /**
             * ��ȡid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * ����id���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * ��ȡname���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * ����name���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * ��ȡcount���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCount() {
                return count;
            }

            /**
             * ����count���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCount(Integer value) {
                this.count = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="cluster" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tag" type="{}tagType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cluster"
    })
    public static class Clusters {

        protected List<Rsp.Clusters.Cluster> cluster;
        @XmlAttribute(name = "source")
        protected String source;
        @XmlAttribute(name = "total")
        protected Integer total;

        /**
         * Gets the value of the cluster property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cluster property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCluster().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Clusters.Cluster }
         * 
         * 
         */
        public List<Rsp.Clusters.Cluster> getCluster() {
            if (cluster == null) {
                cluster = new ArrayList<Rsp.Clusters.Cluster>();
            }
            return this.cluster;
        }

        /**
         * ��ȡsource���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * ����source���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

        /**
         * ��ȡtotal���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal() {
            return total;
        }

        /**
         * ����total���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal(Integer value) {
            this.total = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="tag" type="{}tagType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tag"
        })
        public static class Cluster {

            protected List<TagType> tag;
            @XmlAttribute(name = "total")
            protected Integer total;

            /**
             * Gets the value of the tag property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tag property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTag().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TagType }
             * 
             * 
             */
            public List<TagType> getTag() {
                if (tag == null) {
                    tag = new ArrayList<TagType>();
                }
                return this.tag;
            }

            /**
             * ��ȡtotal���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTotal() {
                return total;
            }

            /**
             * ����total���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTotal(Integer value) {
                this.total = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Comment {

        @XmlAttribute(name = "id")
        protected String id;

        /**
         * ��ȡid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * ����id���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="comment" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="authorname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="datecreate" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="permalink" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="date_create" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="photo_id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="photoset_id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "comment"
    })
    public static class Comments {

        protected List<Rsp.Comments.Comment> comment;
        @XmlAttribute(name = "photo_id")
        protected String photoId;
        @XmlAttribute(name = "photoset_id")
        protected String photosetId;

        /**
         * Gets the value of the comment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the comment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Comments.Comment }
         * 
         * 
         */
        public List<Rsp.Comments.Comment> getComment() {
            if (comment == null) {
                comment = new ArrayList<Rsp.Comments.Comment>();
            }
            return this.comment;
        }

        /**
         * ��ȡphotoId���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhotoId() {
            return photoId;
        }

        /**
         * ����photoId���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhotoId(String value) {
            this.photoId = value;
        }

        /**
         * ��ȡphotosetId���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhotosetId() {
            return photosetId;
        }

        /**
         * ����photosetId���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhotosetId(String value) {
            this.photosetId = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="authorname" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="datecreate" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="permalink" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="date_create" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Comment {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "author")
            protected String author;
            @XmlAttribute(name = "authorname")
            protected String authorname;
            @XmlAttribute(name = "datecreate")
            protected Integer datecreate;
            @XmlAttribute(name = "permalink")
            protected String permalink;
            @XmlAttribute(name = "date_create")
            protected Integer dateCreate;

            /**
             * ��ȡvalue���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * ����value���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * ��ȡid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * ����id���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * ��ȡauthor���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAuthor() {
                return author;
            }

            /**
             * ����author���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAuthor(String value) {
                this.author = value;
            }

            /**
             * ��ȡauthorname���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAuthorname() {
                return authorname;
            }

            /**
             * ����authorname���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAuthorname(String value) {
                this.authorname = value;
            }

            /**
             * ��ȡdatecreate���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getDatecreate() {
                return datecreate;
            }

            /**
             * ����datecreate���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setDatecreate(Integer value) {
                this.datecreate = value;
            }

            /**
             * ��ȡpermalink���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPermalink() {
                return permalink;
            }

            /**
             * ����permalink���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPermalink(String value) {
                this.permalink = value;
            }

            /**
             * ��ȡdateCreate���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getDateCreate() {
                return dateCreate;
            }

            /**
             * ����dateCreate���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setDateCreate(Integer value) {
                this.dateCreate = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="contact" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="iconserver" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="realname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="friend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="family" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="ignored" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="perpage" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "contact"
    })
    public static class Contacts {

        protected List<Rsp.Contacts.Contact> contact;
        @XmlAttribute(name = "page")
        protected Integer page;
        @XmlAttribute(name = "pages")
        protected Integer pages;
        @XmlAttribute(name = "perpage")
        protected Integer perpage;
        @XmlAttribute(name = "total")
        protected Integer total;

        /**
         * Gets the value of the contact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContact().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Contacts.Contact }
         * 
         * 
         */
        public List<Rsp.Contacts.Contact> getContact() {
            if (contact == null) {
                contact = new ArrayList<Rsp.Contacts.Contact>();
            }
            return this.contact;
        }

        /**
         * ��ȡpage���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPage() {
            return page;
        }

        /**
         * ����page���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPage(Integer value) {
            this.page = value;
        }

        /**
         * ��ȡpages���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPages() {
            return pages;
        }

        /**
         * ����pages���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPages(Integer value) {
            this.pages = value;
        }

        /**
         * ��ȡperpage���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPerpage() {
            return perpage;
        }

        /**
         * ����perpage���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPerpage(Integer value) {
            this.perpage = value;
        }

        /**
         * ��ȡtotal���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal() {
            return total;
        }

        /**
         * ����total���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal(Integer value) {
            this.total = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="iconserver" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="realname" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="friend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="family" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="ignored" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Contact {

            @XmlAttribute(name = "nsid")
            protected String nsid;
            @XmlAttribute(name = "username")
            protected String username;
            @XmlAttribute(name = "iconserver")
            protected Integer iconserver;
            @XmlAttribute(name = "realname")
            protected String realname;
            @XmlAttribute(name = "friend")
            protected Boolean friend;
            @XmlAttribute(name = "family")
            protected Boolean family;
            @XmlAttribute(name = "ignored")
            protected Boolean ignored;

            /**
             * ��ȡnsid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNsid() {
                return nsid;
            }

            /**
             * ����nsid���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNsid(String value) {
                this.nsid = value;
            }

            /**
             * ��ȡusername���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsername() {
                return username;
            }

            /**
             * ����username���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsername(String value) {
                this.username = value;
            }

            /**
             * ��ȡiconserver���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getIconserver() {
                return iconserver;
            }

            /**
             * ����iconserver���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setIconserver(Integer value) {
                this.iconserver = value;
            }

            /**
             * ��ȡrealname���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRealname() {
                return realname;
            }

            /**
             * ����realname���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRealname(String value) {
                this.realname = value;
            }

            /**
             * ��ȡfriend���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isFriend() {
                return friend;
            }

            /**
             * ����friend���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setFriend(Boolean value) {
                this.friend = value;
            }

            /**
             * ��ȡfamily���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isFamily() {
                return family;
            }

            /**
             * ����family���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setFamily(Boolean value) {
                this.family = value;
            }

            /**
             * ��ȡignored���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIgnored() {
                return ignored;
            }

            /**
             * ����ignored���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIgnored(Boolean value) {
                this.ignored = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="msg" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Err {

        @XmlAttribute(name = "code")
        protected Integer code;
        @XmlAttribute(name = "msg")
        protected String msg;

        /**
         * ��ȡcode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCode() {
            return code;
        }

        /**
         * ����code���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCode(Integer value) {
            this.code = value;
        }

        /**
         * ��ȡmsg���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMsg() {
            return msg;
        }

        /**
         * ����msg���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMsg(String value) {
            this.msg = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="members" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="privacy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="throttle" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="remaining" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="groupname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="iconserver" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ispoolmoderated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "description",
        "members",
        "privacy",
        "throttle",
        "groupname"
    })
    public static class Group {

        protected String name;
        protected String description;
        protected Integer members;
        protected Integer privacy;
        protected Rsp.Group.Throttle throttle;
        protected String groupname;
        @XmlAttribute(name = "id")
        protected String id;
        @XmlAttribute(name = "iconserver")
        protected Integer iconserver;
        @XmlAttribute(name = "lang")
        protected String lang;
        @XmlAttribute(name = "ispoolmoderated")
        protected Boolean ispoolmoderated;
        @XmlAttribute(name = "nsid")
        protected String nsid;
        @XmlAttribute(name = "url")
        protected String url;

        /**
         * ��ȡname���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * ����name���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * ��ȡdescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * ����description���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * ��ȡmembers���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMembers() {
            return members;
        }

        /**
         * ����members���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMembers(Integer value) {
            this.members = value;
        }

        /**
         * ��ȡprivacy���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPrivacy() {
            return privacy;
        }

        /**
         * ����privacy���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPrivacy(Integer value) {
            this.privacy = value;
        }

        /**
         * ��ȡthrottle���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Group.Throttle }
         *     
         */
        public Rsp.Group.Throttle getThrottle() {
            return throttle;
        }

        /**
         * ����throttle���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Group.Throttle }
         *     
         */
        public void setThrottle(Rsp.Group.Throttle value) {
            this.throttle = value;
        }

        /**
         * ��ȡgroupname���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupname() {
            return groupname;
        }

        /**
         * ����groupname���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupname(String value) {
            this.groupname = value;
        }

        /**
         * ��ȡid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * ����id���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * ��ȡiconserver���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getIconserver() {
            return iconserver;
        }

        /**
         * ����iconserver���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setIconserver(Integer value) {
            this.iconserver = value;
        }

        /**
         * ��ȡlang���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLang() {
            return lang;
        }

        /**
         * ����lang���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLang(String value) {
            this.lang = value;
        }

        /**
         * ��ȡispoolmoderated���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIspoolmoderated() {
            return ispoolmoderated;
        }

        /**
         * ����ispoolmoderated���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIspoolmoderated(Boolean value) {
            this.ispoolmoderated = value;
        }

        /**
         * ��ȡnsid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNsid() {
            return nsid;
        }

        /**
         * ����nsid���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNsid(String value) {
            this.nsid = value;
        }

        /**
         * ��ȡurl���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * ����url���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="remaining" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Throttle {

            @XmlAttribute(name = "count")
            protected Integer count;
            @XmlAttribute(name = "mode")
            protected String mode;
            @XmlAttribute(name = "remaining")
            protected Integer remaining;

            /**
             * ��ȡcount���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCount() {
                return count;
            }

            /**
             * ����count���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCount(Integer value) {
                this.count = value;
            }

            /**
             * ��ȡmode���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMode() {
                return mode;
            }

            /**
             * ����mode���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMode(String value) {
                this.mode = value;
            }

            /**
             * ��ȡremaining���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getRemaining() {
                return remaining;
            }

            /**
             * ����remaining���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setRemaining(Integer value) {
                this.remaining = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="group" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="eighteenplus" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="admin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="photos" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="iconserver" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="privacy" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="perpage" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="per_page" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "group"
    })
    public static class Groups {

        protected List<Rsp.Groups.Group> group;
        @XmlAttribute(name = "page")
        protected Integer page;
        @XmlAttribute(name = "pages")
        protected Integer pages;
        @XmlAttribute(name = "perpage")
        protected Integer perpage;
        @XmlAttribute(name = "total")
        protected Integer total;
        @XmlAttribute(name = "per_page")
        protected Integer perPage;

        /**
         * Gets the value of the group property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the group property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Groups.Group }
         * 
         * 
         */
        public List<Rsp.Groups.Group> getGroup() {
            if (group == null) {
                group = new ArrayList<Rsp.Groups.Group>();
            }
            return this.group;
        }

        /**
         * ��ȡpage���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPage() {
            return page;
        }

        /**
         * ����page���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPage(Integer value) {
            this.page = value;
        }

        /**
         * ��ȡpages���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPages() {
            return pages;
        }

        /**
         * ����pages���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPages(Integer value) {
            this.pages = value;
        }

        /**
         * ��ȡperpage���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPerpage() {
            return perpage;
        }

        /**
         * ����perpage���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPerpage(Integer value) {
            this.perpage = value;
        }

        /**
         * ��ȡtotal���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal() {
            return total;
        }

        /**
         * ����total���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal(Integer value) {
            this.total = value;
        }

        /**
         * ��ȡperPage���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPerPage() {
            return perPage;
        }

        /**
         * ����perPage���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPerPage(Integer value) {
            this.perPage = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="eighteenplus" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="admin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="photos" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="iconserver" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="privacy" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Group {

            @XmlAttribute(name = "nsid")
            protected String nsid;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "eighteenplus")
            protected Boolean eighteenplus;
            @XmlAttribute(name = "admin")
            protected Boolean admin;
            @XmlAttribute(name = "photos")
            protected Integer photos;
            @XmlAttribute(name = "iconserver")
            protected Integer iconserver;
            @XmlAttribute(name = "privacy")
            protected Integer privacy;

            /**
             * ��ȡnsid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNsid() {
                return nsid;
            }

            /**
             * ����nsid���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNsid(String value) {
                this.nsid = value;
            }

            /**
             * ��ȡname���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * ����name���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * ��ȡeighteenplus���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isEighteenplus() {
                return eighteenplus;
            }

            /**
             * ����eighteenplus���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setEighteenplus(Boolean value) {
                this.eighteenplus = value;
            }

            /**
             * ��ȡadmin���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAdmin() {
                return admin;
            }

            /**
             * ����admin���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAdmin(Boolean value) {
                this.admin = value;
            }

            /**
             * ��ȡphotos���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPhotos() {
                return photos;
            }

            /**
             * ����photos���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPhotos(Integer value) {
                this.photos = value;
            }

            /**
             * ��ȡiconserver���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getIconserver() {
                return iconserver;
            }

            /**
             * ����iconserver���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setIconserver(Integer value) {
                this.iconserver = value;
            }

            /**
             * ��ȡprivacy���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPrivacy() {
                return privacy;
            }

            /**
             * ����privacy���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPrivacy(Integer value) {
                this.privacy = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="tag" type="{}tagType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="period" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tag"
    })
    public static class Hottags {

        protected List<TagType> tag;
        @XmlAttribute(name = "period")
        protected String period;
        @XmlAttribute(name = "count")
        protected Integer count;

        /**
         * Gets the value of the tag property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tag property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTag().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TagType }
         * 
         * 
         */
        public List<TagType> getTag() {
            if (tag == null) {
                tag = new ArrayList<TagType>();
            }
            return this.tag;
        }

        /**
         * ��ȡperiod���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPeriod() {
            return period;
        }

        /**
         * ����period���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPeriod(String value) {
            this.period = value;
        }

        /**
         * ��ȡcount���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCount() {
            return count;
        }

        /**
         * ����count���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCount(Integer value) {
            this.count = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="activity">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="event" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="user" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="dateadded" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="primary" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="comments" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="views" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="photos" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="more" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="notes" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="faves" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="commentsold" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="commentsnew" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="notesold" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="notesnew" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="perpage" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class Items {

        protected List<Rsp.Items.Item> item;
        @XmlAttribute(name = "page")
        protected Integer page;
        @XmlAttribute(name = "pages")
        protected Integer pages;
        @XmlAttribute(name = "perpage")
        protected Integer perpage;
        @XmlAttribute(name = "total")
        protected Integer total;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Items.Item }
         * 
         * 
         */
        public List<Rsp.Items.Item> getItem() {
            if (item == null) {
                item = new ArrayList<Rsp.Items.Item>();
            }
            return this.item;
        }

        /**
         * ��ȡpage���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPage() {
            return page;
        }

        /**
         * ����page���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPage(Integer value) {
            this.page = value;
        }

        /**
         * ��ȡpages���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPages() {
            return pages;
        }

        /**
         * ����pages���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPages(Integer value) {
            this.pages = value;
        }

        /**
         * ��ȡperpage���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPerpage() {
            return perpage;
        }

        /**
         * ����perpage���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPerpage(Integer value) {
            this.perpage = value;
        }

        /**
         * ��ȡtotal���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal() {
            return total;
        }

        /**
         * ����total���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal(Integer value) {
            this.total = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="activity">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="event" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="user" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="dateadded" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="primary" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="comments" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="views" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="photos" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="more" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="notes" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="faves" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="commentsold" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="commentsnew" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="notesold" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="notesnew" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "title",
            "activity"
        })
        public static class Item {

            @XmlElement(required = true)
            protected String title;
            @XmlElement(required = true)
            protected Rsp.Items.Item.Activity activity;
            @XmlAttribute(name = "type")
            protected String type;
            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "owner")
            protected String owner;
            @XmlAttribute(name = "primary")
            protected String primary;
            @XmlAttribute(name = "secret")
            protected String secret;
            @XmlAttribute(name = "server")
            protected Integer server;
            @XmlAttribute(name = "comments")
            protected Integer comments;
            @XmlAttribute(name = "views")
            protected Integer views;
            @XmlAttribute(name = "photos")
            protected Integer photos;
            @XmlAttribute(name = "more")
            protected Boolean more;
            @XmlAttribute(name = "notes")
            protected Integer notes;
            @XmlAttribute(name = "faves")
            protected Integer faves;
            @XmlAttribute(name = "commentsold")
            protected Integer commentsold;
            @XmlAttribute(name = "commentsnew")
            protected Integer commentsnew;
            @XmlAttribute(name = "notesold")
            protected Integer notesold;
            @XmlAttribute(name = "notesnew")
            protected Integer notesnew;

            /**
             * ��ȡtitle���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * ����title���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

            /**
             * ��ȡactivity���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Rsp.Items.Item.Activity }
             *     
             */
            public Rsp.Items.Item.Activity getActivity() {
                return activity;
            }

            /**
             * ����activity���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Rsp.Items.Item.Activity }
             *     
             */
            public void setActivity(Rsp.Items.Item.Activity value) {
                this.activity = value;
            }

            /**
             * ��ȡtype���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * ����type���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * ��ȡid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * ����id���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * ��ȡowner���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwner() {
                return owner;
            }

            /**
             * ����owner���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwner(String value) {
                this.owner = value;
            }

            /**
             * ��ȡprimary���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrimary() {
                return primary;
            }

            /**
             * ����primary���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrimary(String value) {
                this.primary = value;
            }

            /**
             * ��ȡsecret���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecret() {
                return secret;
            }

            /**
             * ����secret���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSecret(String value) {
                this.secret = value;
            }

            /**
             * ��ȡserver���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getServer() {
                return server;
            }

            /**
             * ����server���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setServer(Integer value) {
                this.server = value;
            }

            /**
             * ��ȡcomments���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getComments() {
                return comments;
            }

            /**
             * ����comments���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setComments(Integer value) {
                this.comments = value;
            }

            /**
             * ��ȡviews���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getViews() {
                return views;
            }

            /**
             * ����views���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setViews(Integer value) {
                this.views = value;
            }

            /**
             * ��ȡphotos���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPhotos() {
                return photos;
            }

            /**
             * ����photos���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPhotos(Integer value) {
                this.photos = value;
            }

            /**
             * ��ȡmore���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isMore() {
                return more;
            }

            /**
             * ����more���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setMore(Boolean value) {
                this.more = value;
            }

            /**
             * ��ȡnotes���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNotes() {
                return notes;
            }

            /**
             * ����notes���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNotes(Integer value) {
                this.notes = value;
            }

            /**
             * ��ȡfaves���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getFaves() {
                return faves;
            }

            /**
             * ����faves���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setFaves(Integer value) {
                this.faves = value;
            }

            /**
             * ��ȡcommentsold���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCommentsold() {
                return commentsold;
            }

            /**
             * ����commentsold���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCommentsold(Integer value) {
                this.commentsold = value;
            }

            /**
             * ��ȡcommentsnew���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCommentsnew() {
                return commentsnew;
            }

            /**
             * ����commentsnew���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCommentsnew(Integer value) {
                this.commentsnew = value;
            }

            /**
             * ��ȡnotesold���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNotesold() {
                return notesold;
            }

            /**
             * ����notesold���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNotesold(Integer value) {
                this.notesold = value;
            }

            /**
             * ��ȡnotesnew���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNotesnew() {
                return notesnew;
            }

            /**
             * ����notesnew���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNotesnew(Integer value) {
                this.notesnew = value;
            }


            /**
             * <p>anonymous complex type�� Java �ࡣ
             * 
             * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="event" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="user" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="dateadded" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "event"
            })
            public static class Activity {

                protected List<Rsp.Items.Item.Activity.Event> event;

                /**
                 * Gets the value of the event property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the event property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getEvent().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Rsp.Items.Item.Activity.Event }
                 * 
                 * 
                 */
                public List<Rsp.Items.Item.Activity.Event> getEvent() {
                    if (event == null) {
                        event = new ArrayList<Rsp.Items.Item.Activity.Event>();
                    }
                    return this.event;
                }


                /**
                 * <p>anonymous complex type�� Java �ࡣ
                 * 
                 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="user" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="dateadded" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Event {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "type")
                    protected String type;
                    @XmlAttribute(name = "user")
                    protected String user;
                    @XmlAttribute(name = "dateadded")
                    protected String dateadded;
                    @XmlAttribute(name = "username")
                    protected String username;

                    /**
                     * ��ȡvalue���Ե�ֵ��
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * ����value���Ե�ֵ��
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * ��ȡtype���Ե�ֵ��
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getType() {
                        return type;
                    }

                    /**
                     * ����type���Ե�ֵ��
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                    /**
                     * ��ȡuser���Ե�ֵ��
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUser() {
                        return user;
                    }

                    /**
                     * ����user���Ե�ֵ��
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUser(String value) {
                        this.user = value;
                    }

                    /**
                     * ��ȡdateadded���Ե�ֵ��
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDateadded() {
                        return dateadded;
                    }

                    /**
                     * ����dateadded���Ե�ֵ��
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDateadded(String value) {
                        this.dateadded = value;
                    }

                    /**
                     * ��ȡusername���Ե�ֵ��
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUsername() {
                        return username;
                    }

                    /**
                     * ����username���Ե�ֵ��
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUsername(String value) {
                        this.username = value;
                    }

                }

            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="license" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "license"
    })
    public static class Licenses {

        protected List<Rsp.Licenses.License> license;

        /**
         * Gets the value of the license property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the license property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLicense().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Licenses.License }
         * 
         * 
         */
        public List<Rsp.Licenses.License> getLicense() {
            if (license == null) {
                license = new ArrayList<Rsp.Licenses.License>();
            }
            return this.license;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class License {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "url")
            protected String url;

            /**
             * ��ȡvalue���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * ����value���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * ��ȡid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * ����id���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * ��ȡname���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * ����name���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * ��ȡurl���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUrl() {
                return url;
            }

            /**
             * ����url���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUrl(String value) {
                this.url = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="locality">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="county">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="region">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="country">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="place_type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "locality",
        "county",
        "region",
        "country"
    })
    public static class Location {

        @XmlElement(required = true)
        protected Rsp.Location.Locality locality;
        @XmlElement(required = true)
        protected Rsp.Location.County county;
        @XmlElement(required = true)
        protected Rsp.Location.Region region;
        @XmlElement(required = true)
        protected Rsp.Location.Country country;
        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "place_id")
        protected String placeId;
        @XmlAttribute(name = "place_url")
        protected String placeUrl;
        @XmlAttribute(name = "woeid")
        protected String woeid;
        @XmlAttribute(name = "latitude")
        protected Float latitude;
        @XmlAttribute(name = "longitude")
        protected Float longitude;
        @XmlAttribute(name = "place_type")
        protected String placeType;

        /**
         * ��ȡlocality���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Location.Locality }
         *     
         */
        public Rsp.Location.Locality getLocality() {
            return locality;
        }

        /**
         * ����locality���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Location.Locality }
         *     
         */
        public void setLocality(Rsp.Location.Locality value) {
            this.locality = value;
        }

        /**
         * ��ȡcounty���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Location.County }
         *     
         */
        public Rsp.Location.County getCounty() {
            return county;
        }

        /**
         * ����county���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Location.County }
         *     
         */
        public void setCounty(Rsp.Location.County value) {
            this.county = value;
        }

        /**
         * ��ȡregion���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Location.Region }
         *     
         */
        public Rsp.Location.Region getRegion() {
            return region;
        }

        /**
         * ����region���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Location.Region }
         *     
         */
        public void setRegion(Rsp.Location.Region value) {
            this.region = value;
        }

        /**
         * ��ȡcountry���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Location.Country }
         *     
         */
        public Rsp.Location.Country getCountry() {
            return country;
        }

        /**
         * ����country���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Location.Country }
         *     
         */
        public void setCountry(Rsp.Location.Country value) {
            this.country = value;
        }

        /**
         * ��ȡname���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * ����name���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * ��ȡplaceId���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlaceId() {
            return placeId;
        }

        /**
         * ����placeId���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlaceId(String value) {
            this.placeId = value;
        }

        /**
         * ��ȡplaceUrl���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlaceUrl() {
            return placeUrl;
        }

        /**
         * ����placeUrl���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlaceUrl(String value) {
            this.placeUrl = value;
        }

        /**
         * ��ȡwoeid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWoeid() {
            return woeid;
        }

        /**
         * ����woeid���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWoeid(String value) {
            this.woeid = value;
        }

        /**
         * ��ȡlatitude���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getLatitude() {
            return latitude;
        }

        /**
         * ����latitude���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setLatitude(Float value) {
            this.latitude = value;
        }

        /**
         * ��ȡlongitude���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getLongitude() {
            return longitude;
        }

        /**
         * ����longitude���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setLongitude(Float value) {
            this.longitude = value;
        }

        /**
         * ��ȡplaceType���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlaceType() {
            return placeType;
        }

        /**
         * ����placeType���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlaceType(String value) {
            this.placeType = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Country {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "place_id")
            protected String placeId;
            @XmlAttribute(name = "woeid")
            protected String woeid;
            @XmlAttribute(name = "latitude")
            protected Float latitude;
            @XmlAttribute(name = "longitude")
            protected Float longitude;
            @XmlAttribute(name = "place_url")
            protected String placeUrl;

            /**
             * ��ȡvalue���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * ����value���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * ��ȡplaceId���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceId() {
                return placeId;
            }

            /**
             * ����placeId���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceId(String value) {
                this.placeId = value;
            }

            /**
             * ��ȡwoeid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWoeid() {
                return woeid;
            }

            /**
             * ����woeid���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWoeid(String value) {
                this.woeid = value;
            }

            /**
             * ��ȡlatitude���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLatitude() {
                return latitude;
            }

            /**
             * ����latitude���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLatitude(Float value) {
                this.latitude = value;
            }

            /**
             * ��ȡlongitude���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLongitude() {
                return longitude;
            }

            /**
             * ����longitude���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLongitude(Float value) {
                this.longitude = value;
            }

            /**
             * ��ȡplaceUrl���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceUrl() {
                return placeUrl;
            }

            /**
             * ����placeUrl���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceUrl(String value) {
                this.placeUrl = value;
            }

        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class County {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "place_id")
            protected String placeId;
            @XmlAttribute(name = "woeid")
            protected String woeid;
            @XmlAttribute(name = "latitude")
            protected Float latitude;
            @XmlAttribute(name = "longitude")
            protected Float longitude;
            @XmlAttribute(name = "place_url")
            protected String placeUrl;

            /**
             * ��ȡvalue���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * ����value���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * ��ȡplaceId���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceId() {
                return placeId;
            }

            /**
             * ����placeId���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceId(String value) {
                this.placeId = value;
            }

            /**
             * ��ȡwoeid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWoeid() {
                return woeid;
            }

            /**
             * ����woeid���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWoeid(String value) {
                this.woeid = value;
            }

            /**
             * ��ȡlatitude���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLatitude() {
                return latitude;
            }

            /**
             * ����latitude���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLatitude(Float value) {
                this.latitude = value;
            }

            /**
             * ��ȡlongitude���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLongitude() {
                return longitude;
            }

            /**
             * ����longitude���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLongitude(Float value) {
                this.longitude = value;
            }

            /**
             * ��ȡplaceUrl���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceUrl() {
                return placeUrl;
            }

            /**
             * ����placeUrl���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceUrl(String value) {
                this.placeUrl = value;
            }

        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Locality {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "place_id")
            protected String placeId;
            @XmlAttribute(name = "woeid")
            protected String woeid;
            @XmlAttribute(name = "latitude")
            protected Float latitude;
            @XmlAttribute(name = "longitude")
            protected Float longitude;
            @XmlAttribute(name = "place_url")
            protected String placeUrl;

            /**
             * ��ȡvalue���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * ����value���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * ��ȡplaceId���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceId() {
                return placeId;
            }

            /**
             * ����placeId���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceId(String value) {
                this.placeId = value;
            }

            /**
             * ��ȡwoeid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWoeid() {
                return woeid;
            }

            /**
             * ����woeid���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWoeid(String value) {
                this.woeid = value;
            }

            /**
             * ��ȡlatitude���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLatitude() {
                return latitude;
            }

            /**
             * ����latitude���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLatitude(Float value) {
                this.latitude = value;
            }

            /**
             * ��ȡlongitude���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLongitude() {
                return longitude;
            }

            /**
             * ����longitude���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLongitude(Float value) {
                this.longitude = value;
            }

            /**
             * ��ȡplaceUrl���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceUrl() {
                return placeUrl;
            }

            /**
             * ����placeUrl���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceUrl(String value) {
                this.placeUrl = value;
            }

        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Region {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "place_id")
            protected String placeId;
            @XmlAttribute(name = "woeid")
            protected String woeid;
            @XmlAttribute(name = "latitude")
            protected Float latitude;
            @XmlAttribute(name = "longitude")
            protected Float longitude;
            @XmlAttribute(name = "place_url")
            protected String placeUrl;

            /**
             * ��ȡvalue���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * ����value���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * ��ȡplaceId���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceId() {
                return placeId;
            }

            /**
             * ����placeId���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceId(String value) {
                this.placeId = value;
            }

            /**
             * ��ȡwoeid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWoeid() {
                return woeid;
            }

            /**
             * ����woeid���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWoeid(String value) {
                this.woeid = value;
            }

            /**
             * ��ȡlatitude���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLatitude() {
                return latitude;
            }

            /**
             * ����latitude���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLatitude(Float value) {
                this.latitude = value;
            }

            /**
             * ��ȡlongitude���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLongitude() {
                return longitude;
            }

            /**
             * ����longitude���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLongitude(Float value) {
                this.longitude = value;
            }

            /**
             * ��ȡplaceUrl���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceUrl() {
                return placeUrl;
            }

            /**
             * ����placeUrl���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceUrl(String value) {
                this.placeUrl = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="response" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="explanation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="arguments">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="argument" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="errors">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="error" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="message" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="needslogin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description",
        "response",
        "explanation",
        "arguments",
        "errors"
    })
    public static class Method {

        @XmlElement(required = true)
        protected String description;
        @XmlElement(required = true)
        protected String response;
        @XmlElement(required = true)
        protected String explanation;
        @XmlElement(required = true)
        protected Rsp.Method.Arguments arguments;
        @XmlElement(required = true)
        protected Rsp.Method.Errors errors;
        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "needslogin")
        protected Boolean needslogin;

        /**
         * ��ȡdescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * ����description���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * ��ȡresponse���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResponse() {
            return response;
        }

        /**
         * ����response���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResponse(String value) {
            this.response = value;
        }

        /**
         * ��ȡexplanation���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExplanation() {
            return explanation;
        }

        /**
         * ����explanation���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExplanation(String value) {
            this.explanation = value;
        }

        /**
         * ��ȡarguments���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Method.Arguments }
         *     
         */
        public Rsp.Method.Arguments getArguments() {
            return arguments;
        }

        /**
         * ����arguments���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Method.Arguments }
         *     
         */
        public void setArguments(Rsp.Method.Arguments value) {
            this.arguments = value;
        }

        /**
         * ��ȡerrors���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Method.Errors }
         *     
         */
        public Rsp.Method.Errors getErrors() {
            return errors;
        }

        /**
         * ����errors���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Method.Errors }
         *     
         */
        public void setErrors(Rsp.Method.Errors value) {
            this.errors = value;
        }

        /**
         * ��ȡname���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * ����name���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * ��ȡneedslogin���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNeedslogin() {
            return needslogin;
        }

        /**
         * ����needslogin���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNeedslogin(Boolean value) {
            this.needslogin = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="argument" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "argument"
        })
        public static class Arguments {

            protected List<Rsp.Method.Arguments.Argument> argument;

            /**
             * Gets the value of the argument property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the argument property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getArgument().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Rsp.Method.Arguments.Argument }
             * 
             * 
             */
            public List<Rsp.Method.Arguments.Argument> getArgument() {
                if (argument == null) {
                    argument = new ArrayList<Rsp.Method.Arguments.Argument>();
                }
                return this.argument;
            }


            /**
             * <p>anonymous complex type�� Java �ࡣ
             * 
             * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Argument {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "name")
                protected String name;
                @XmlAttribute(name = "optional")
                protected Boolean optional;

                /**
                 * ��ȡvalue���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * ����value���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * ��ȡname���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * ����name���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * ��ȡoptional���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isOptional() {
                    return optional;
                }

                /**
                 * ����optional���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setOptional(Boolean value) {
                    this.optional = value;
                }

            }

        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="error" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="message" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "error"
        })
        public static class Errors {

            protected List<Rsp.Method.Errors.Error> error;

            /**
             * Gets the value of the error property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the error property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getError().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Rsp.Method.Errors.Error }
             * 
             * 
             */
            public List<Rsp.Method.Errors.Error> getError() {
                if (error == null) {
                    error = new ArrayList<Rsp.Method.Errors.Error>();
                }
                return this.error;
            }


            /**
             * <p>anonymous complex type�� Java �ࡣ
             * 
             * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="message" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Error {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "code")
                protected Integer code;
                @XmlAttribute(name = "message")
                protected String message;

                /**
                 * ��ȡvalue���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * ����value���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * ��ȡcode���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getCode() {
                    return code;
                }

                /**
                 * ����code���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setCode(Integer value) {
                    this.code = value;
                }

                /**
                 * ��ȡmessage���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMessage() {
                    return message;
                }

                /**
                 * ����message���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMessage(String value) {
                    this.message = value;
                }

            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "method"
    })
    public static class Methods {

        protected List<String> method;

        /**
         * Gets the value of the method property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the method property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMethod().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMethod() {
            if (method == null) {
                method = new ArrayList<String>();
            }
            return this.method;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Nextphoto {

        @XmlAttribute(name = "id")
        protected String id;
        @XmlAttribute(name = "secret")
        protected String secret;
        @XmlAttribute(name = "title")
        protected String title;
        @XmlAttribute(name = "url")
        protected String url;

        /**
         * ��ȡid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * ����id���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * ��ȡsecret���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecret() {
            return secret;
        }

        /**
         * ����secret���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecret(String value) {
            this.secret = value;
        }

        /**
         * ��ȡtitle���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * ����title���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * ��ȡurl���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * ����url���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Note {

        @XmlAttribute(name = "id")
        protected String id;

        /**
         * ��ȡid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * ����id���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ispublic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="isfriend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="isfamily" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="permcomment" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="permaddmeta" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="iscontact" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Perms {

        @XmlAttribute(name = "id")
        protected String id;
        @XmlAttribute(name = "ispublic")
        protected Boolean ispublic;
        @XmlAttribute(name = "isfriend")
        protected Boolean isfriend;
        @XmlAttribute(name = "isfamily")
        protected Boolean isfamily;
        @XmlAttribute(name = "permcomment")
        protected Integer permcomment;
        @XmlAttribute(name = "permaddmeta")
        protected Integer permaddmeta;
        @XmlAttribute(name = "iscontact")
        protected Boolean iscontact;

        /**
         * ��ȡid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * ����id���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * ��ȡispublic���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIspublic() {
            return ispublic;
        }

        /**
         * ����ispublic���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIspublic(Boolean value) {
            this.ispublic = value;
        }

        /**
         * ��ȡisfriend���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsfriend() {
            return isfriend;
        }

        /**
         * ����isfriend���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsfriend(Boolean value) {
            this.isfriend = value;
        }

        /**
         * ��ȡisfamily���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsfamily() {
            return isfamily;
        }

        /**
         * ����isfamily���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsfamily(Boolean value) {
            this.isfamily = value;
        }

        /**
         * ��ȡpermcomment���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPermcomment() {
            return permcomment;
        }

        /**
         * ����permcomment���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPermcomment(Integer value) {
            this.permcomment = value;
        }

        /**
         * ��ȡpermaddmeta���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPermaddmeta() {
            return permaddmeta;
        }

        /**
         * ����permaddmeta���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPermaddmeta(Integer value) {
            this.permaddmeta = value;
        }

        /**
         * ��ȡiscontact���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIscontact() {
            return iscontact;
        }

        /**
         * ����iscontact���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIscontact(Boolean value) {
            this.iscontact = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="realname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="mbox_sha1sum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="photosurl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="profileurl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="photos" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="firstdate" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="firstdatetaken" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="isadmin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ispro" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="iconserver" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="iconfarm" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="contact" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="friend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="family" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="revcontact" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="revfriend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="revfamily" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="content_type" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="geoperms" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="privacy" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="safety_level" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "username",
        "realname",
        "mboxSha1Sum",
        "location",
        "photosurl",
        "profileurl",
        "photos"
    })
    public static class Person {

        protected String username;
        protected String realname;
        @XmlElement(name = "mbox_sha1sum")
        protected String mboxSha1Sum;
        protected String location;
        protected String photosurl;
        protected String profileurl;
        protected Rsp.Person.Photos photos;
        @XmlAttribute(name = "nsid")
        protected String nsid;
        @XmlAttribute(name = "isadmin")
        protected Boolean isadmin;
        @XmlAttribute(name = "ispro")
        protected Boolean ispro;
        @XmlAttribute(name = "iconserver")
        protected Integer iconserver;
        @XmlAttribute(name = "iconfarm")
        protected Integer iconfarm;
        @XmlAttribute(name = "contact")
        protected Boolean contact;
        @XmlAttribute(name = "friend")
        protected Boolean friend;
        @XmlAttribute(name = "family")
        protected Boolean family;
        @XmlAttribute(name = "revcontact")
        protected Boolean revcontact;
        @XmlAttribute(name = "revfriend")
        protected Boolean revfriend;
        @XmlAttribute(name = "revfamily")
        protected Boolean revfamily;
        @XmlAttribute(name = "content_type")
        protected Integer contentType;
        @XmlAttribute(name = "geoperms")
        protected Integer geoperms;
        @XmlAttribute(name = "hidden")
        protected Boolean hidden;
        @XmlAttribute(name = "privacy")
        protected Integer privacy;
        @XmlAttribute(name = "safety_level")
        protected Integer safetyLevel;

        /**
         * ��ȡusername���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsername() {
            return username;
        }

        /**
         * ����username���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsername(String value) {
            this.username = value;
        }

        /**
         * ��ȡrealname���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRealname() {
            return realname;
        }

        /**
         * ����realname���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRealname(String value) {
            this.realname = value;
        }

        /**
         * ��ȡmboxSha1Sum���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMboxSha1Sum() {
            return mboxSha1Sum;
        }

        /**
         * ����mboxSha1Sum���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMboxSha1Sum(String value) {
            this.mboxSha1Sum = value;
        }

        /**
         * ��ȡlocation���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocation() {
            return location;
        }

        /**
         * ����location���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocation(String value) {
            this.location = value;
        }

        /**
         * ��ȡphotosurl���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhotosurl() {
            return photosurl;
        }

        /**
         * ����photosurl���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhotosurl(String value) {
            this.photosurl = value;
        }

        /**
         * ��ȡprofileurl���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfileurl() {
            return profileurl;
        }

        /**
         * ����profileurl���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfileurl(String value) {
            this.profileurl = value;
        }

        /**
         * ��ȡphotos���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Person.Photos }
         *     
         */
        public Rsp.Person.Photos getPhotos() {
            return photos;
        }

        /**
         * ����photos���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Person.Photos }
         *     
         */
        public void setPhotos(Rsp.Person.Photos value) {
            this.photos = value;
        }

        /**
         * ��ȡnsid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNsid() {
            return nsid;
        }

        /**
         * ����nsid���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNsid(String value) {
            this.nsid = value;
        }

        /**
         * ��ȡisadmin���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsadmin() {
            return isadmin;
        }

        /**
         * ����isadmin���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsadmin(Boolean value) {
            this.isadmin = value;
        }

        /**
         * ��ȡispro���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIspro() {
            return ispro;
        }

        /**
         * ����ispro���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIspro(Boolean value) {
            this.ispro = value;
        }

        /**
         * ��ȡiconserver���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getIconserver() {
            return iconserver;
        }

        /**
         * ����iconserver���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setIconserver(Integer value) {
            this.iconserver = value;
        }

        /**
         * ��ȡiconfarm���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getIconfarm() {
            return iconfarm;
        }

        /**
         * ����iconfarm���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setIconfarm(Integer value) {
            this.iconfarm = value;
        }

        /**
         * ��ȡcontact���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isContact() {
            return contact;
        }

        /**
         * ����contact���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setContact(Boolean value) {
            this.contact = value;
        }

        /**
         * ��ȡfriend���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFriend() {
            return friend;
        }

        /**
         * ����friend���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFriend(Boolean value) {
            this.friend = value;
        }

        /**
         * ��ȡfamily���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFamily() {
            return family;
        }

        /**
         * ����family���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFamily(Boolean value) {
            this.family = value;
        }

        /**
         * ��ȡrevcontact���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRevcontact() {
            return revcontact;
        }

        /**
         * ����revcontact���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRevcontact(Boolean value) {
            this.revcontact = value;
        }

        /**
         * ��ȡrevfriend���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRevfriend() {
            return revfriend;
        }

        /**
         * ����revfriend���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRevfriend(Boolean value) {
            this.revfriend = value;
        }

        /**
         * ��ȡrevfamily���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRevfamily() {
            return revfamily;
        }

        /**
         * ����revfamily���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRevfamily(Boolean value) {
            this.revfamily = value;
        }

        /**
         * ��ȡcontentType���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getContentType() {
            return contentType;
        }

        /**
         * ����contentType���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setContentType(Integer value) {
            this.contentType = value;
        }

        /**
         * ��ȡgeoperms���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getGeoperms() {
            return geoperms;
        }

        /**
         * ����geoperms���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setGeoperms(Integer value) {
            this.geoperms = value;
        }

        /**
         * ��ȡhidden���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHidden() {
            return hidden;
        }

        /**
         * ����hidden���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHidden(Boolean value) {
            this.hidden = value;
        }

        /**
         * ��ȡprivacy���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPrivacy() {
            return privacy;
        }

        /**
         * ����privacy���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPrivacy(Integer value) {
            this.privacy = value;
        }

        /**
         * ��ȡsafetyLevel���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSafetyLevel() {
            return safetyLevel;
        }

        /**
         * ����safetyLevel���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSafetyLevel(Integer value) {
            this.safetyLevel = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="firstdate" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="firstdatetaken" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "firstdate",
            "firstdatetaken",
            "count"
        })
        public static class Photos {

            protected int firstdate;
            @XmlElement(required = true)
            protected String firstdatetaken;
            protected int count;

            /**
             * ��ȡfirstdate���Ե�ֵ��
             * 
             */
            public int getFirstdate() {
                return firstdate;
            }

            /**
             * ����firstdate���Ե�ֵ��
             * 
             */
            public void setFirstdate(int value) {
                this.firstdate = value;
            }

            /**
             * ��ȡfirstdatetaken���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirstdatetaken() {
                return firstdatetaken;
            }

            /**
             * ����firstdatetaken���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirstdatetaken(String value) {
                this.firstdatetaken = value;
            }

            /**
             * ��ȡcount���Ե�ֵ��
             * 
             */
            public int getCount() {
                return count;
            }

            /**
             * ����count���Ե�ֵ��
             * 
             */
            public void setCount(int value) {
                this.count = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="exif" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="raw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="clean" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="tagspace" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="tagspaceid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="tag" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="person" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="favedate" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="owner" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="realname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="visibility" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ispublic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="isfriend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="isfamily" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="dates" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="posted" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="taken" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="takengranularity" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="lastupdate" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="permissions" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="permcomment" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="permaddmeta" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="editability" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="cancomment" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="canaddmeta" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="notes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="note" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="authorname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="x" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="y" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="w" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="h" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="tags" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tag" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="raw" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="authorname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="urls" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="url" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="location" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="accuracy" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="farm" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="perpage" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="isfavorite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="license" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="rotation" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="originalsecret" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="originalformat" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="content_type" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="safety_level" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "exif",
        "person",
        "owner",
        "title",
        "description",
        "visibility",
        "dates",
        "permissions",
        "editability",
        "comments",
        "notes",
        "tags",
        "urls",
        "location"
    })
    public static class Photo {

        protected List<Rsp.Photo.Exif> exif;
        protected List<Rsp.Photo.Person> person;
        protected Rsp.Photo.Owner owner;
        protected String title;
        protected String description;
        protected Rsp.Photo.Visibility visibility;
        protected Rsp.Photo.Dates dates;
        protected Rsp.Photo.Permissions permissions;
        protected Rsp.Photo.Editability editability;
        protected Integer comments;
        protected Rsp.Photo.Notes notes;
        protected Rsp.Photo.Tags tags;
        protected Rsp.Photo.Urls urls;
        protected Rsp.Photo.Location location;
        @XmlAttribute(name = "id")
        protected String id;
        @XmlAttribute(name = "secret")
        protected String secret;
        @XmlAttribute(name = "server")
        protected Integer server;
        @XmlAttribute(name = "farm")
        protected Integer farm;
        @XmlAttribute(name = "page")
        protected Integer page;
        @XmlAttribute(name = "pages")
        protected Integer pages;
        @XmlAttribute(name = "perpage")
        protected Integer perpage;
        @XmlAttribute(name = "total")
        protected Integer total;
        @XmlAttribute(name = "isfavorite")
        protected Boolean isfavorite;
        @XmlAttribute(name = "license")
        protected String license;
        @XmlAttribute(name = "rotation")
        protected Integer rotation;
        @XmlAttribute(name = "originalsecret")
        protected String originalsecret;
        @XmlAttribute(name = "originalformat")
        protected String originalformat;
        @XmlAttribute(name = "content_type")
        protected Integer contentType;
        @XmlAttribute(name = "safety_level")
        protected Integer safetyLevel;
        @XmlAttribute(name = "hidden")
        protected Boolean hidden;
        @XmlAttribute(name = "username")
        protected String username;

        /**
         * Gets the value of the exif property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the exif property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExif().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Photo.Exif }
         * 
         * 
         */
        public List<Rsp.Photo.Exif> getExif() {
            if (exif == null) {
                exif = new ArrayList<Rsp.Photo.Exif>();
            }
            return this.exif;
        }

        /**
         * Gets the value of the person property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the person property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPerson().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Photo.Person }
         * 
         * 
         */
        public List<Rsp.Photo.Person> getPerson() {
            if (person == null) {
                person = new ArrayList<Rsp.Photo.Person>();
            }
            return this.person;
        }

        /**
         * ��ȡowner���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Photo.Owner }
         *     
         */
        public Rsp.Photo.Owner getOwner() {
            return owner;
        }

        /**
         * ����owner���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Photo.Owner }
         *     
         */
        public void setOwner(Rsp.Photo.Owner value) {
            this.owner = value;
        }

        /**
         * ��ȡtitle���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * ����title���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * ��ȡdescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * ����description���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * ��ȡvisibility���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Photo.Visibility }
         *     
         */
        public Rsp.Photo.Visibility getVisibility() {
            return visibility;
        }

        /**
         * ����visibility���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Photo.Visibility }
         *     
         */
        public void setVisibility(Rsp.Photo.Visibility value) {
            this.visibility = value;
        }

        /**
         * ��ȡdates���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Photo.Dates }
         *     
         */
        public Rsp.Photo.Dates getDates() {
            return dates;
        }

        /**
         * ����dates���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Photo.Dates }
         *     
         */
        public void setDates(Rsp.Photo.Dates value) {
            this.dates = value;
        }

        /**
         * ��ȡpermissions���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Photo.Permissions }
         *     
         */
        public Rsp.Photo.Permissions getPermissions() {
            return permissions;
        }

        /**
         * ����permissions���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Photo.Permissions }
         *     
         */
        public void setPermissions(Rsp.Photo.Permissions value) {
            this.permissions = value;
        }

        /**
         * ��ȡeditability���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Photo.Editability }
         *     
         */
        public Rsp.Photo.Editability getEditability() {
            return editability;
        }

        /**
         * ����editability���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Photo.Editability }
         *     
         */
        public void setEditability(Rsp.Photo.Editability value) {
            this.editability = value;
        }

        /**
         * ��ȡcomments���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getComments() {
            return comments;
        }

        /**
         * ����comments���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setComments(Integer value) {
            this.comments = value;
        }

        /**
         * ��ȡnotes���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Photo.Notes }
         *     
         */
        public Rsp.Photo.Notes getNotes() {
            return notes;
        }

        /**
         * ����notes���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Photo.Notes }
         *     
         */
        public void setNotes(Rsp.Photo.Notes value) {
            this.notes = value;
        }

        /**
         * ��ȡtags���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Photo.Tags }
         *     
         */
        public Rsp.Photo.Tags getTags() {
            return tags;
        }

        /**
         * ����tags���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Photo.Tags }
         *     
         */
        public void setTags(Rsp.Photo.Tags value) {
            this.tags = value;
        }

        /**
         * ��ȡurls���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Photo.Urls }
         *     
         */
        public Rsp.Photo.Urls getUrls() {
            return urls;
        }

        /**
         * ����urls���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Photo.Urls }
         *     
         */
        public void setUrls(Rsp.Photo.Urls value) {
            this.urls = value;
        }

        /**
         * ��ȡlocation���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Photo.Location }
         *     
         */
        public Rsp.Photo.Location getLocation() {
            return location;
        }

        /**
         * ����location���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Photo.Location }
         *     
         */
        public void setLocation(Rsp.Photo.Location value) {
            this.location = value;
        }

        /**
         * ��ȡid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * ����id���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * ��ȡsecret���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecret() {
            return secret;
        }

        /**
         * ����secret���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecret(String value) {
            this.secret = value;
        }

        /**
         * ��ȡserver���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getServer() {
            return server;
        }

        /**
         * ����server���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setServer(Integer value) {
            this.server = value;
        }

        /**
         * ��ȡfarm���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getFarm() {
            return farm;
        }

        /**
         * ����farm���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setFarm(Integer value) {
            this.farm = value;
        }

        /**
         * ��ȡpage���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPage() {
            return page;
        }

        /**
         * ����page���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPage(Integer value) {
            this.page = value;
        }

        /**
         * ��ȡpages���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPages() {
            return pages;
        }

        /**
         * ����pages���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPages(Integer value) {
            this.pages = value;
        }

        /**
         * ��ȡperpage���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPerpage() {
            return perpage;
        }

        /**
         * ����perpage���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPerpage(Integer value) {
            this.perpage = value;
        }

        /**
         * ��ȡtotal���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal() {
            return total;
        }

        /**
         * ����total���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal(Integer value) {
            this.total = value;
        }

        /**
         * ��ȡisfavorite���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsfavorite() {
            return isfavorite;
        }

        /**
         * ����isfavorite���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsfavorite(Boolean value) {
            this.isfavorite = value;
        }

        /**
         * ��ȡlicense���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicense() {
            return license;
        }

        /**
         * ����license���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicense(String value) {
            this.license = value;
        }

        /**
         * ��ȡrotation���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getRotation() {
            return rotation;
        }

        /**
         * ����rotation���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRotation(Integer value) {
            this.rotation = value;
        }

        /**
         * ��ȡoriginalsecret���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalsecret() {
            return originalsecret;
        }

        /**
         * ����originalsecret���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalsecret(String value) {
            this.originalsecret = value;
        }

        /**
         * ��ȡoriginalformat���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalformat() {
            return originalformat;
        }

        /**
         * ����originalformat���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalformat(String value) {
            this.originalformat = value;
        }

        /**
         * ��ȡcontentType���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getContentType() {
            return contentType;
        }

        /**
         * ����contentType���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setContentType(Integer value) {
            this.contentType = value;
        }

        /**
         * ��ȡsafetyLevel���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSafetyLevel() {
            return safetyLevel;
        }

        /**
         * ����safetyLevel���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSafetyLevel(Integer value) {
            this.safetyLevel = value;
        }

        /**
         * ��ȡhidden���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHidden() {
            return hidden;
        }

        /**
         * ����hidden���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHidden(Boolean value) {
            this.hidden = value;
        }

        /**
         * ��ȡusername���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsername() {
            return username;
        }

        /**
         * ����username���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsername(String value) {
            this.username = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="posted" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="taken" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="takengranularity" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="lastupdate" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Dates {

            @XmlAttribute(name = "posted")
            protected Integer posted;
            @XmlAttribute(name = "taken")
            protected String taken;
            @XmlAttribute(name = "takengranularity")
            protected Integer takengranularity;
            @XmlAttribute(name = "lastupdate")
            protected Integer lastupdate;

            /**
             * ��ȡposted���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPosted() {
                return posted;
            }

            /**
             * ����posted���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPosted(Integer value) {
                this.posted = value;
            }

            /**
             * ��ȡtaken���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaken() {
                return taken;
            }

            /**
             * ����taken���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaken(String value) {
                this.taken = value;
            }

            /**
             * ��ȡtakengranularity���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTakengranularity() {
                return takengranularity;
            }

            /**
             * ����takengranularity���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTakengranularity(Integer value) {
                this.takengranularity = value;
            }

            /**
             * ��ȡlastupdate���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getLastupdate() {
                return lastupdate;
            }

            /**
             * ����lastupdate���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setLastupdate(Integer value) {
                this.lastupdate = value;
            }

        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="cancomment" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="canaddmeta" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Editability {

            @XmlAttribute(name = "cancomment")
            protected Boolean cancomment;
            @XmlAttribute(name = "canaddmeta")
            protected Boolean canaddmeta;

            /**
             * ��ȡcancomment���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCancomment() {
                return cancomment;
            }

            /**
             * ����cancomment���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCancomment(Boolean value) {
                this.cancomment = value;
            }

            /**
             * ��ȡcanaddmeta���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCanaddmeta() {
                return canaddmeta;
            }

            /**
             * ����canaddmeta���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCanaddmeta(Boolean value) {
                this.canaddmeta = value;
            }

        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="raw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="clean" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="tagspace" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="tagspaceid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="tag" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "raw",
            "clean"
        })
        public static class Exif {

            protected String raw;
            protected String clean;
            @XmlAttribute(name = "tagspace")
            protected String tagspace;
            @XmlAttribute(name = "tagspaceid")
            protected String tagspaceid;
            @XmlAttribute(name = "tag")
            protected String tag;
            @XmlAttribute(name = "label")
            protected String label;

            /**
             * ��ȡraw���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRaw() {
                return raw;
            }

            /**
             * ����raw���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRaw(String value) {
                this.raw = value;
            }

            /**
             * ��ȡclean���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClean() {
                return clean;
            }

            /**
             * ����clean���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClean(String value) {
                this.clean = value;
            }

            /**
             * ��ȡtagspace���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTagspace() {
                return tagspace;
            }

            /**
             * ����tagspace���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTagspace(String value) {
                this.tagspace = value;
            }

            /**
             * ��ȡtagspaceid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTagspaceid() {
                return tagspaceid;
            }

            /**
             * ����tagspaceid���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTagspaceid(String value) {
                this.tagspaceid = value;
            }

            /**
             * ��ȡtag���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTag() {
                return tag;
            }

            /**
             * ����tag���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTag(String value) {
                this.tag = value;
            }

            /**
             * ��ȡlabel���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLabel() {
                return label;
            }

            /**
             * ����label���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLabel(String value) {
                this.label = value;
            }

        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="accuracy" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Location {

            @XmlAttribute(name = "latitude")
            protected Float latitude;
            @XmlAttribute(name = "longitude")
            protected Float longitude;
            @XmlAttribute(name = "accuracy")
            protected Integer accuracy;

            /**
             * ��ȡlatitude���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLatitude() {
                return latitude;
            }

            /**
             * ����latitude���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLatitude(Float value) {
                this.latitude = value;
            }

            /**
             * ��ȡlongitude���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLongitude() {
                return longitude;
            }

            /**
             * ����longitude���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLongitude(Float value) {
                this.longitude = value;
            }

            /**
             * ��ȡaccuracy���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getAccuracy() {
                return accuracy;
            }

            /**
             * ����accuracy���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setAccuracy(Integer value) {
                this.accuracy = value;
            }

        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="note" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="authorname" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="x" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="y" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="w" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="h" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "note"
        })
        public static class Notes {

            protected List<Rsp.Photo.Notes.Note> note;

            /**
             * Gets the value of the note property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the note property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNote().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Rsp.Photo.Notes.Note }
             * 
             * 
             */
            public List<Rsp.Photo.Notes.Note> getNote() {
                if (note == null) {
                    note = new ArrayList<Rsp.Photo.Notes.Note>();
                }
                return this.note;
            }


            /**
             * <p>anonymous complex type�� Java �ࡣ
             * 
             * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="authorname" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="x" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="y" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="w" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="h" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Note {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "id")
                protected String id;
                @XmlAttribute(name = "author")
                protected String author;
                @XmlAttribute(name = "authorname")
                protected String authorname;
                @XmlAttribute(name = "x")
                protected Integer x;
                @XmlAttribute(name = "y")
                protected Integer y;
                @XmlAttribute(name = "w")
                protected Integer w;
                @XmlAttribute(name = "h")
                protected Integer h;

                /**
                 * ��ȡvalue���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * ����value���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * ��ȡid���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * ����id���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
                }

                /**
                 * ��ȡauthor���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAuthor() {
                    return author;
                }

                /**
                 * ����author���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAuthor(String value) {
                    this.author = value;
                }

                /**
                 * ��ȡauthorname���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAuthorname() {
                    return authorname;
                }

                /**
                 * ����authorname���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAuthorname(String value) {
                    this.authorname = value;
                }

                /**
                 * ��ȡx���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getX() {
                    return x;
                }

                /**
                 * ����x���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setX(Integer value) {
                    this.x = value;
                }

                /**
                 * ��ȡy���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getY() {
                    return y;
                }

                /**
                 * ����y���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setY(Integer value) {
                    this.y = value;
                }

                /**
                 * ��ȡw���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getW() {
                    return w;
                }

                /**
                 * ����w���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setW(Integer value) {
                    this.w = value;
                }

                /**
                 * ��ȡh���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getH() {
                    return h;
                }

                /**
                 * ����h���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setH(Integer value) {
                    this.h = value;
                }

            }

        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="realname" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Owner {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "nsid")
            protected String nsid;
            @XmlAttribute(name = "username")
            protected String username;
            @XmlAttribute(name = "realname")
            protected String realname;
            @XmlAttribute(name = "location")
            protected String location;

            /**
             * ��ȡvalue���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * ����value���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * ��ȡnsid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNsid() {
                return nsid;
            }

            /**
             * ����nsid���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNsid(String value) {
                this.nsid = value;
            }

            /**
             * ��ȡusername���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsername() {
                return username;
            }

            /**
             * ����username���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsername(String value) {
                this.username = value;
            }

            /**
             * ��ȡrealname���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRealname() {
                return realname;
            }

            /**
             * ����realname���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRealname(String value) {
                this.realname = value;
            }

            /**
             * ��ȡlocation���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocation() {
                return location;
            }

            /**
             * ����location���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocation(String value) {
                this.location = value;
            }

        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="permcomment" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="permaddmeta" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Permissions {

            @XmlAttribute(name = "permcomment")
            protected Integer permcomment;
            @XmlAttribute(name = "permaddmeta")
            protected Integer permaddmeta;

            /**
             * ��ȡpermcomment���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPermcomment() {
                return permcomment;
            }

            /**
             * ����permcomment���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPermcomment(Integer value) {
                this.permcomment = value;
            }

            /**
             * ��ȡpermaddmeta���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPermaddmeta() {
                return permaddmeta;
            }

            /**
             * ����permaddmeta���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPermaddmeta(Integer value) {
                this.permaddmeta = value;
            }

        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="favedate" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Person {

            @XmlAttribute(name = "nsid")
            protected String nsid;
            @XmlAttribute(name = "username")
            protected String username;
            @XmlAttribute(name = "favedate")
            protected Integer favedate;

            /**
             * ��ȡnsid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNsid() {
                return nsid;
            }

            /**
             * ����nsid���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNsid(String value) {
                this.nsid = value;
            }

            /**
             * ��ȡusername���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsername() {
                return username;
            }

            /**
             * ����username���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsername(String value) {
                this.username = value;
            }

            /**
             * ��ȡfavedate���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getFavedate() {
                return favedate;
            }

            /**
             * ����favedate���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setFavedate(Integer value) {
                this.favedate = value;
            }

        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="tag" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="raw" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="authorname" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tag"
        })
        public static class Tags {

            protected List<Rsp.Photo.Tags.Tag> tag;

            /**
             * Gets the value of the tag property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tag property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTag().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Rsp.Photo.Tags.Tag }
             * 
             * 
             */
            public List<Rsp.Photo.Tags.Tag> getTag() {
                if (tag == null) {
                    tag = new ArrayList<Rsp.Photo.Tags.Tag>();
                }
                return this.tag;
            }


            /**
             * <p>anonymous complex type�� Java �ࡣ
             * 
             * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="raw" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="authorname" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Tag {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "id")
                protected String id;
                @XmlAttribute(name = "author")
                protected String author;
                @XmlAttribute(name = "raw")
                protected String raw;
                @XmlAttribute(name = "authorname")
                protected String authorname;

                /**
                 * ��ȡvalue���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * ����value���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * ��ȡid���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * ����id���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
                }

                /**
                 * ��ȡauthor���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAuthor() {
                    return author;
                }

                /**
                 * ����author���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAuthor(String value) {
                    this.author = value;
                }

                /**
                 * ��ȡraw���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRaw() {
                    return raw;
                }

                /**
                 * ����raw���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRaw(String value) {
                    this.raw = value;
                }

                /**
                 * ��ȡauthorname���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAuthorname() {
                    return authorname;
                }

                /**
                 * ����authorname���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAuthorname(String value) {
                    this.authorname = value;
                }

            }

        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="url" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "url"
        })
        public static class Urls {

            protected List<Rsp.Photo.Urls.Url> url;

            /**
             * Gets the value of the url property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the url property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getUrl().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Rsp.Photo.Urls.Url }
             * 
             * 
             */
            public List<Rsp.Photo.Urls.Url> getUrl() {
                if (url == null) {
                    url = new ArrayList<Rsp.Photo.Urls.Url>();
                }
                return this.url;
            }


            /**
             * <p>anonymous complex type�� Java �ࡣ
             * 
             * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Url {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "type")
                protected String type;

                /**
                 * ��ȡvalue���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * ����value���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * ��ȡtype���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * ����type���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

            }

        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="ispublic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="isfriend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="isfamily" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Visibility {

            @XmlAttribute(name = "ispublic")
            protected Boolean ispublic;
            @XmlAttribute(name = "isfriend")
            protected Boolean isfriend;
            @XmlAttribute(name = "isfamily")
            protected Boolean isfamily;

            /**
             * ��ȡispublic���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIspublic() {
                return ispublic;
            }

            /**
             * ����ispublic���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIspublic(Boolean value) {
                this.ispublic = value;
            }

            /**
             * ��ȡisfriend���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsfriend() {
                return isfriend;
            }

            /**
             * ����isfriend���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsfriend(Boolean value) {
                this.isfriend = value;
            }

            /**
             * ��ȡisfamily���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsfamily() {
                return isfamily;
            }

            /**
             * ����isfamily���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsfamily(Boolean value) {
                this.isfamily = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="photocount" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="fromdate" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="todate" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "photocount"
    })
    public static class Photocounts {

        protected List<Rsp.Photocounts.Photocount> photocount;

        /**
         * Gets the value of the photocount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the photocount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhotocount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Photocounts.Photocount }
         * 
         * 
         */
        public List<Rsp.Photocounts.Photocount> getPhotocount() {
            if (photocount == null) {
                photocount = new ArrayList<Rsp.Photocounts.Photocount>();
            }
            return this.photocount;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="fromdate" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="todate" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Photocount {

            @XmlAttribute(name = "count")
            protected Integer count;
            @XmlAttribute(name = "fromdate")
            protected Integer fromdate;
            @XmlAttribute(name = "todate")
            protected Integer todate;

            /**
             * ��ȡcount���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCount() {
                return count;
            }

            /**
             * ����count���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCount(Integer value) {
                this.count = value;
            }

            /**
             * ��ȡfromdate���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getFromdate() {
                return fromdate;
            }

            /**
             * ����fromdate���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setFromdate(Integer value) {
                this.fromdate = value;
            }

            /**
             * ��ȡtodate���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTodate() {
                return todate;
            }

            /**
             * ����todate���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTodate(Integer value) {
                this.todate = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="originalsecret" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Photoid {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "secret")
        protected String secret;
        @XmlAttribute(name = "originalsecret")
        protected String originalsecret;

        /**
         * ��ȡvalue���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * ����value���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * ��ȡsecret���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecret() {
            return secret;
        }

        /**
         * ����secret���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecret(String value) {
            this.secret = value;
        }

        /**
         * ��ȡoriginalsecret���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalsecret() {
            return originalsecret;
        }

        /**
         * ����originalsecret���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalsecret(String value) {
            this.originalsecret = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="photo" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ispublic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="isfriend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="isfamily" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="ownername" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="dateadded" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="lastupdate" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="perpage" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "photo"
    })
    public static class Photos {

        protected List<Rsp.Photos.Photo> photo;
        @XmlAttribute(name = "page")
        protected Integer page;
        @XmlAttribute(name = "pages")
        protected Integer pages;
        @XmlAttribute(name = "perpage")
        protected Integer perpage;
        @XmlAttribute(name = "total")
        protected Integer total;

        /**
         * Gets the value of the photo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the photo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhoto().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Photos.Photo }
         * 
         * 
         */
        public List<Rsp.Photos.Photo> getPhoto() {
            if (photo == null) {
                photo = new ArrayList<Rsp.Photos.Photo>();
            }
            return this.photo;
        }

        /**
         * ��ȡpage���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPage() {
            return page;
        }

        /**
         * ����page���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPage(Integer value) {
            this.page = value;
        }

        /**
         * ��ȡpages���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPages() {
            return pages;
        }

        /**
         * ����pages���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPages(Integer value) {
            this.pages = value;
        }

        /**
         * ��ȡperpage���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPerpage() {
            return perpage;
        }

        /**
         * ����perpage���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPerpage(Integer value) {
            this.perpage = value;
        }

        /**
         * ��ȡtotal���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal() {
            return total;
        }

        /**
         * ����total���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal(Integer value) {
            this.total = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ispublic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="isfriend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="isfamily" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="ownername" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="dateadded" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="lastupdate" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Photo {

            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "owner")
            protected String owner;
            @XmlAttribute(name = "secret")
            protected String secret;
            @XmlAttribute(name = "server")
            protected Integer server;
            @XmlAttribute(name = "title")
            protected String title;
            @XmlAttribute(name = "ispublic")
            protected Boolean ispublic;
            @XmlAttribute(name = "isfriend")
            protected Boolean isfriend;
            @XmlAttribute(name = "isfamily")
            protected Boolean isfamily;
            @XmlAttribute(name = "ownername")
            protected String ownername;
            @XmlAttribute(name = "dateadded")
            protected Integer dateadded;
            @XmlAttribute(name = "lastupdate")
            protected Integer lastupdate;
            @XmlAttribute(name = "username")
            protected String username;

            /**
             * ��ȡid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * ����id���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * ��ȡowner���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwner() {
                return owner;
            }

            /**
             * ����owner���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwner(String value) {
                this.owner = value;
            }

            /**
             * ��ȡsecret���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecret() {
                return secret;
            }

            /**
             * ����secret���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSecret(String value) {
                this.secret = value;
            }

            /**
             * ��ȡserver���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getServer() {
                return server;
            }

            /**
             * ����server���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setServer(Integer value) {
                this.server = value;
            }

            /**
             * ��ȡtitle���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * ����title���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

            /**
             * ��ȡispublic���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIspublic() {
                return ispublic;
            }

            /**
             * ����ispublic���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIspublic(Boolean value) {
                this.ispublic = value;
            }

            /**
             * ��ȡisfriend���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsfriend() {
                return isfriend;
            }

            /**
             * ����isfriend���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsfriend(Boolean value) {
                this.isfriend = value;
            }

            /**
             * ��ȡisfamily���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsfamily() {
                return isfamily;
            }

            /**
             * ����isfamily���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsfamily(Boolean value) {
                this.isfamily = value;
            }

            /**
             * ��ȡownername���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwnername() {
                return ownername;
            }

            /**
             * ����ownername���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwnername(String value) {
                this.ownername = value;
            }

            /**
             * ��ȡdateadded���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getDateadded() {
                return dateadded;
            }

            /**
             * ����dateadded���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setDateadded(Integer value) {
                this.dateadded = value;
            }

            /**
             * ��ȡlastupdate���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getLastupdate() {
                return lastupdate;
            }

            /**
             * ����lastupdate���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setLastupdate(Integer value) {
                this.lastupdate = value;
            }

            /**
             * ��ȡusername���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsername() {
                return username;
            }

            /**
             * ����username���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsername(String value) {
                this.username = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="photo" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="isprimary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="primary" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="photos" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="perpage" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "title",
        "description",
        "photo"
    })
    public static class Photoset {

        protected String title;
        protected String description;
        protected List<Rsp.Photoset.Photo> photo;
        @XmlAttribute(name = "id")
        protected String id;
        @XmlAttribute(name = "url")
        protected String url;
        @XmlAttribute(name = "owner")
        protected String owner;
        @XmlAttribute(name = "primary")
        protected String primary;
        @XmlAttribute(name = "photos")
        protected Integer photos;
        @XmlAttribute(name = "secret")
        protected String secret;
        @XmlAttribute(name = "page")
        protected Integer page;
        @XmlAttribute(name = "pages")
        protected Integer pages;
        @XmlAttribute(name = "perpage")
        protected Integer perpage;
        @XmlAttribute(name = "total")
        protected Integer total;

        /**
         * ��ȡtitle���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * ����title���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * ��ȡdescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * ����description���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the photo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the photo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhoto().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Photoset.Photo }
         * 
         * 
         */
        public List<Rsp.Photoset.Photo> getPhoto() {
            if (photo == null) {
                photo = new ArrayList<Rsp.Photoset.Photo>();
            }
            return this.photo;
        }

        /**
         * ��ȡid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * ����id���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * ��ȡurl���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * ����url���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
        }

        /**
         * ��ȡowner���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwner() {
            return owner;
        }

        /**
         * ����owner���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwner(String value) {
            this.owner = value;
        }

        /**
         * ��ȡprimary���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimary() {
            return primary;
        }

        /**
         * ����primary���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimary(String value) {
            this.primary = value;
        }

        /**
         * ��ȡphotos���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPhotos() {
            return photos;
        }

        /**
         * ����photos���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPhotos(Integer value) {
            this.photos = value;
        }

        /**
         * ��ȡsecret���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecret() {
            return secret;
        }

        /**
         * ����secret���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecret(String value) {
            this.secret = value;
        }

        /**
         * ��ȡpage���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPage() {
            return page;
        }

        /**
         * ����page���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPage(Integer value) {
            this.page = value;
        }

        /**
         * ��ȡpages���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPages() {
            return pages;
        }

        /**
         * ����pages���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPages(Integer value) {
            this.pages = value;
        }

        /**
         * ��ȡperpage���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPerpage() {
            return perpage;
        }

        /**
         * ����perpage���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPerpage(Integer value) {
            this.perpage = value;
        }

        /**
         * ��ȡtotal���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal() {
            return total;
        }

        /**
         * ����total���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal(Integer value) {
            this.total = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="isprimary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Photo {

            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "secret")
            protected String secret;
            @XmlAttribute(name = "server")
            protected String server;
            @XmlAttribute(name = "title")
            protected String title;
            @XmlAttribute(name = "isprimary")
            protected Boolean isprimary;

            /**
             * ��ȡid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * ����id���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * ��ȡsecret���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecret() {
                return secret;
            }

            /**
             * ����secret���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSecret(String value) {
                this.secret = value;
            }

            /**
             * ��ȡserver���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServer() {
                return server;
            }

            /**
             * ����server���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServer(String value) {
                this.server = value;
            }

            /**
             * ��ȡtitle���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * ����title���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

            /**
             * ��ȡisprimary���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsprimary() {
                return isprimary;
            }

            /**
             * ����isprimary���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsprimary(Boolean value) {
                this.isprimary = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="photoset" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="primary" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="photos" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="farm" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="cancreate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "photoset"
    })
    public static class Photosets {

        protected List<Rsp.Photosets.Photoset> photoset;
        @XmlAttribute(name = "cancreate")
        protected Boolean cancreate;

        /**
         * Gets the value of the photoset property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the photoset property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhotoset().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Photosets.Photoset }
         * 
         * 
         */
        public List<Rsp.Photosets.Photoset> getPhotoset() {
            if (photoset == null) {
                photoset = new ArrayList<Rsp.Photosets.Photoset>();
            }
            return this.photoset;
        }

        /**
         * ��ȡcancreate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCancreate() {
            return cancreate;
        }

        /**
         * ����cancreate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCancreate(Boolean value) {
            this.cancreate = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="primary" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="photos" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="farm" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "title",
            "description"
        })
        public static class Photoset {

            protected String title;
            protected String description;
            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "url")
            protected String url;
            @XmlAttribute(name = "owner")
            protected String owner;
            @XmlAttribute(name = "primary")
            protected String primary;
            @XmlAttribute(name = "photos")
            protected Integer photos;
            @XmlAttribute(name = "server")
            protected Integer server;
            @XmlAttribute(name = "farm")
            protected Integer farm;
            @XmlAttribute(name = "secret")
            protected String secret;

            /**
             * ��ȡtitle���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * ����title���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

            /**
             * ��ȡdescription���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * ����description���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * ��ȡid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * ����id���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * ��ȡurl���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUrl() {
                return url;
            }

            /**
             * ����url���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUrl(String value) {
                this.url = value;
            }

            /**
             * ��ȡowner���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwner() {
                return owner;
            }

            /**
             * ����owner���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwner(String value) {
                this.owner = value;
            }

            /**
             * ��ȡprimary���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrimary() {
                return primary;
            }

            /**
             * ����primary���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrimary(String value) {
                this.primary = value;
            }

            /**
             * ��ȡphotos���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPhotos() {
                return photos;
            }

            /**
             * ����photos���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPhotos(Integer value) {
                this.photos = value;
            }

            /**
             * ��ȡserver���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getServer() {
                return server;
            }

            /**
             * ����server���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setServer(Integer value) {
                this.server = value;
            }

            /**
             * ��ȡfarm���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getFarm() {
                return farm;
            }

            /**
             * ����farm���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setFarm(Integer value) {
                this.farm = value;
            }

            /**
             * ��ȡsecret���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecret() {
                return secret;
            }

            /**
             * ����secret���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSecret(String value) {
                this.secret = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="place" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="place_type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="query" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="accuracy" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "place"
    })
    public static class Places {

        protected List<Rsp.Places.Place> place;
        @XmlAttribute(name = "query")
        protected String query;
        @XmlAttribute(name = "total")
        protected Integer total;
        @XmlAttribute(name = "latitude")
        protected Float latitude;
        @XmlAttribute(name = "longitude")
        protected Float longitude;
        @XmlAttribute(name = "accuracy")
        protected Integer accuracy;

        /**
         * Gets the value of the place property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the place property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPlace().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Places.Place }
         * 
         * 
         */
        public List<Rsp.Places.Place> getPlace() {
            if (place == null) {
                place = new ArrayList<Rsp.Places.Place>();
            }
            return this.place;
        }

        /**
         * ��ȡquery���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuery() {
            return query;
        }

        /**
         * ����query���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuery(String value) {
            this.query = value;
        }

        /**
         * ��ȡtotal���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal() {
            return total;
        }

        /**
         * ����total���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal(Integer value) {
            this.total = value;
        }

        /**
         * ��ȡlatitude���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getLatitude() {
            return latitude;
        }

        /**
         * ����latitude���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setLatitude(Float value) {
            this.latitude = value;
        }

        /**
         * ��ȡlongitude���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getLongitude() {
            return longitude;
        }

        /**
         * ����longitude���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setLongitude(Float value) {
            this.longitude = value;
        }

        /**
         * ��ȡaccuracy���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAccuracy() {
            return accuracy;
        }

        /**
         * ����accuracy���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAccuracy(Integer value) {
            this.accuracy = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="place_type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Place {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "place_id")
            protected String placeId;
            @XmlAttribute(name = "place_url")
            protected String placeUrl;
            @XmlAttribute(name = "place_type")
            protected String placeType;
            @XmlAttribute(name = "latitude")
            protected Float latitude;
            @XmlAttribute(name = "longitude")
            protected Float longitude;
            @XmlAttribute(name = "woeid")
            protected String woeid;

            /**
             * ��ȡvalue���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * ����value���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * ��ȡplaceId���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceId() {
                return placeId;
            }

            /**
             * ����placeId���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceId(String value) {
                this.placeId = value;
            }

            /**
             * ��ȡplaceUrl���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceUrl() {
                return placeUrl;
            }

            /**
             * ����placeUrl���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceUrl(String value) {
                this.placeUrl = value;
            }

            /**
             * ��ȡplaceType���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceType() {
                return placeType;
            }

            /**
             * ����placeType���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceType(String value) {
                this.placeType = value;
            }

            /**
             * ��ȡlatitude���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLatitude() {
                return latitude;
            }

            /**
             * ����latitude���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLatitude(Float value) {
                this.latitude = value;
            }

            /**
             * ��ȡlongitude���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLongitude() {
                return longitude;
            }

            /**
             * ����longitude���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLongitude(Float value) {
                this.longitude = value;
            }

            /**
             * ��ȡwoeid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWoeid() {
                return woeid;
            }

            /**
             * ����woeid���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWoeid(String value) {
                this.woeid = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Pool {

        @XmlAttribute(name = "id")
        protected String id;
        @XmlAttribute(name = "title")
        protected String title;

        /**
         * ��ȡid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * ����id���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * ��ȡtitle���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * ����title���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Prevphoto {

        @XmlAttribute(name = "id")
        protected String id;
        @XmlAttribute(name = "secret")
        protected String secret;
        @XmlAttribute(name = "title")
        protected String title;
        @XmlAttribute(name = "url")
        protected String url;

        /**
         * ��ȡid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * ����id���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * ��ȡsecret���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecret() {
            return secret;
        }

        /**
         * ����secret���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecret(String value) {
            this.secret = value;
        }

        /**
         * ��ȡtitle���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * ����title���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * ��ȡurl���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * ����url���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Set {

        @XmlAttribute(name = "id")
        protected String id;
        @XmlAttribute(name = "title")
        protected String title;

        /**
         * ��ȡid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * ����id���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * ��ȡtitle���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * ����title���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="size" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "size"
    })
    public static class Sizes {

        protected List<Rsp.Sizes.Size> size;

        /**
         * Gets the value of the size property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the size property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSize().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Sizes.Size }
         * 
         * 
         */
        public List<Rsp.Sizes.Size> getSize() {
            if (size == null) {
                size = new ArrayList<Rsp.Sizes.Size>();
            }
            return this.size;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Size {

            @XmlAttribute(name = "label")
            protected String label;
            @XmlAttribute(name = "width")
            protected Integer width;
            @XmlAttribute(name = "height")
            protected Integer height;
            @XmlAttribute(name = "source")
            protected String source;
            @XmlAttribute(name = "url")
            protected String url;

            /**
             * ��ȡlabel���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLabel() {
                return label;
            }

            /**
             * ����label���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLabel(String value) {
                this.label = value;
            }

            /**
             * ��ȡwidth���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getWidth() {
                return width;
            }

            /**
             * ����width���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setWidth(Integer value) {
                this.width = value;
            }

            /**
             * ��ȡheight���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getHeight() {
                return height;
            }

            /**
             * ����height���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setHeight(Integer value) {
                this.height = value;
            }

            /**
             * ��ȡsource���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSource() {
                return source;
            }

            /**
             * ����source���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSource(String value) {
                this.source = value;
            }

            /**
             * ��ȡurl���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUrl() {
                return url;
            }

            /**
             * ����url���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUrl(String value) {
                this.url = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="tag" type="{}tagType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tag"
    })
    public static class Tags {

        protected List<TagType> tag;
        @XmlAttribute(name = "source")
        protected String source;

        /**
         * Gets the value of the tag property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tag property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTag().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TagType }
         * 
         * 
         */
        public List<TagType> getTag() {
            if (tag == null) {
                tag = new ArrayList<TagType>();
            }
            return this.tag;
        }

        /**
         * ��ȡsource���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * ����source���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ticket" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="complete" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="photoid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="invalid" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ticket"
    })
    public static class Uploader {

        protected List<Rsp.Uploader.Ticket> ticket;

        /**
         * Gets the value of the ticket property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ticket property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTicket().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Uploader.Ticket }
         * 
         * 
         */
        public List<Rsp.Uploader.Ticket> getTicket() {
            if (ticket == null) {
                ticket = new ArrayList<Rsp.Uploader.Ticket>();
            }
            return this.ticket;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="complete" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="photoid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="invalid" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Ticket {

            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "complete")
            protected Integer complete;
            @XmlAttribute(name = "photoid")
            protected String photoid;
            @XmlAttribute(name = "invalid")
            protected Boolean invalid;

            /**
             * ��ȡid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * ����id���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * ��ȡcomplete���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getComplete() {
                return complete;
            }

            /**
             * ����complete���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setComplete(Integer value) {
                this.complete = value;
            }

            /**
             * ��ȡphotoid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPhotoid() {
                return photoid;
            }

            /**
             * ����photoid���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPhotoid(String value) {
                this.photoid = value;
            }

            /**
             * ��ȡinvalid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isInvalid() {
                return invalid;
            }

            /**
             * ����invalid���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setInvalid(Boolean value) {
                this.invalid = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bandwidth" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="maxbytes" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                 &lt;attribute name="maxkb" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="usedbytes" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="usedkb" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="remainingbytes" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="remainingkb" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="filesize" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="maxbytes" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="maxkb" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="sets" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="created" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="remaining" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ispro" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "username",
        "bandwidth",
        "filesize",
        "sets"
    })
    public static class User {

        protected String username;
        protected Rsp.User.Bandwidth bandwidth;
        protected Rsp.User.Filesize filesize;
        protected Rsp.User.Sets sets;
        @XmlAttribute(name = "nsid")
        protected String nsid;
        @XmlAttribute(name = "ispro")
        protected String ispro;
        @XmlAttribute(name = "url")
        protected String url;
        @XmlAttribute(name = "id")
        protected String id;

        /**
         * ��ȡusername���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsername() {
            return username;
        }

        /**
         * ����username���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsername(String value) {
            this.username = value;
        }

        /**
         * ��ȡbandwidth���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Rsp.User.Bandwidth }
         *     
         */
        public Rsp.User.Bandwidth getBandwidth() {
            return bandwidth;
        }

        /**
         * ����bandwidth���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.User.Bandwidth }
         *     
         */
        public void setBandwidth(Rsp.User.Bandwidth value) {
            this.bandwidth = value;
        }

        /**
         * ��ȡfilesize���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Rsp.User.Filesize }
         *     
         */
        public Rsp.User.Filesize getFilesize() {
            return filesize;
        }

        /**
         * ����filesize���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.User.Filesize }
         *     
         */
        public void setFilesize(Rsp.User.Filesize value) {
            this.filesize = value;
        }

        /**
         * ��ȡsets���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Rsp.User.Sets }
         *     
         */
        public Rsp.User.Sets getSets() {
            return sets;
        }

        /**
         * ����sets���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.User.Sets }
         *     
         */
        public void setSets(Rsp.User.Sets value) {
            this.sets = value;
        }

        /**
         * ��ȡnsid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNsid() {
            return nsid;
        }

        /**
         * ����nsid���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNsid(String value) {
            this.nsid = value;
        }

        /**
         * ��ȡispro���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIspro() {
            return ispro;
        }

        /**
         * ����ispro���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIspro(String value) {
            this.ispro = value;
        }

        /**
         * ��ȡurl���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * ����url���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
        }

        /**
         * ��ȡid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * ����id���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="maxbytes" type="{http://www.w3.org/2001/XMLSchema}double" />
         *       &lt;attribute name="maxkb" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="usedbytes" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="usedkb" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="remainingbytes" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="remainingkb" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Bandwidth {

            @XmlAttribute(name = "maxbytes")
            protected Double maxbytes;
            @XmlAttribute(name = "maxkb")
            protected Integer maxkb;
            @XmlAttribute(name = "usedbytes")
            protected Integer usedbytes;
            @XmlAttribute(name = "usedkb")
            protected Integer usedkb;
            @XmlAttribute(name = "remainingbytes")
            protected Integer remainingbytes;
            @XmlAttribute(name = "remainingkb")
            protected Integer remainingkb;

            /**
             * ��ȡmaxbytes���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getMaxbytes() {
                return maxbytes;
            }

            /**
             * ����maxbytes���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setMaxbytes(Double value) {
                this.maxbytes = value;
            }

            /**
             * ��ȡmaxkb���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaxkb() {
                return maxkb;
            }

            /**
             * ����maxkb���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaxkb(Integer value) {
                this.maxkb = value;
            }

            /**
             * ��ȡusedbytes���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getUsedbytes() {
                return usedbytes;
            }

            /**
             * ����usedbytes���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setUsedbytes(Integer value) {
                this.usedbytes = value;
            }

            /**
             * ��ȡusedkb���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getUsedkb() {
                return usedkb;
            }

            /**
             * ����usedkb���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setUsedkb(Integer value) {
                this.usedkb = value;
            }

            /**
             * ��ȡremainingbytes���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getRemainingbytes() {
                return remainingbytes;
            }

            /**
             * ����remainingbytes���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setRemainingbytes(Integer value) {
                this.remainingbytes = value;
            }

            /**
             * ��ȡremainingkb���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getRemainingkb() {
                return remainingkb;
            }

            /**
             * ����remainingkb���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setRemainingkb(Integer value) {
                this.remainingkb = value;
            }

        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="maxbytes" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="maxkb" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Filesize {

            @XmlAttribute(name = "maxbytes")
            protected Integer maxbytes;
            @XmlAttribute(name = "maxkb")
            protected Integer maxkb;

            /**
             * ��ȡmaxbytes���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaxbytes() {
                return maxbytes;
            }

            /**
             * ����maxbytes���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaxbytes(Integer value) {
                this.maxbytes = value;
            }

            /**
             * ��ȡmaxkb���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaxkb() {
                return maxkb;
            }

            /**
             * ����maxkb���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaxkb(Integer value) {
                this.maxkb = value;
            }

        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="created" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="remaining" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Sets {

            @XmlAttribute(name = "created")
            protected Integer created;
            @XmlAttribute(name = "remaining")
            protected String remaining;

            /**
             * ��ȡcreated���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCreated() {
                return created;
            }

            /**
             * ����created���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCreated(Integer value) {
                this.created = value;
            }

            /**
             * ��ȡremaining���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRemaining() {
                return remaining;
            }

            /**
             * ����remaining���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRemaining(String value) {
                this.remaining = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="tags">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tag" type="{}tagType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tags"
    })
    public static class Who {

        @XmlElement(required = true)
        protected Rsp.Who.Tags tags;
        @XmlAttribute(name = "id")
        protected String id;

        /**
         * ��ȡtags���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Who.Tags }
         *     
         */
        public Rsp.Who.Tags getTags() {
            return tags;
        }

        /**
         * ����tags���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Who.Tags }
         *     
         */
        public void setTags(Rsp.Who.Tags value) {
            this.tags = value;
        }

        /**
         * ��ȡid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * ����id���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="tag" type="{}tagType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tag"
        })
        public static class Tags {

            protected List<TagType> tag;
            @XmlAttribute(name = "source")
            protected String source;

            /**
             * Gets the value of the tag property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tag property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTag().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TagType }
             * 
             * 
             */
            public List<TagType> getTag() {
                if (tag == null) {
                    tag = new ArrayList<TagType>();
                }
                return this.tag;
            }

            /**
             * ��ȡsource���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSource() {
                return source;
            }

            /**
             * ����source���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSource(String value) {
                this.source = value;
            }

        }

    }

}
