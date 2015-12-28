//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.5-2 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2015.12.23 时间 03:58:12 PM CST 
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
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取items属性的值。
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
     * 设置items属性的值。
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
     * 获取blogs属性的值。
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
     * 设置blogs属性的值。
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
     * 获取contacts属性的值。
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
     * 设置contacts属性的值。
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
     * 获取photos属性的值。
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
     * 设置photos属性的值。
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
     * 获取category属性的值。
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
     * 设置category属性的值。
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
     * 获取group属性的值。
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
     * 设置group属性的值。
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
     * 获取groups属性的值。
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
     * 设置groups属性的值。
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
     * 获取prevphoto属性的值。
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
     * 设置prevphoto属性的值。
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
     * 获取nextphoto属性的值。
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
     * 设置nextphoto属性的值。
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
     * 获取user属性的值。
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
     * 设置user属性的值。
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
     * 获取person属性的值。
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
     * 设置person属性的值。
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
     * 获取set属性的值。
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
     * 设置set属性的值。
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
     * 获取pool属性的值。
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
     * 设置pool属性的值。
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
     * 获取photocounts属性的值。
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
     * 设置photocounts属性的值。
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
     * 获取photo属性的值。
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
     * 设置photo属性的值。
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
     * 获取perms属性的值。
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
     * 设置perms属性的值。
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
     * 获取sizes属性的值。
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
     * 设置sizes属性的值。
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
     * 获取photoid属性的值。
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
     * 设置photoid属性的值。
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
     * 获取comment属性的值。
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
     * 设置comment属性的值。
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
     * 获取comments属性的值。
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
     * 设置comments属性的值。
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
     * 获取note属性的值。
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
     * 设置note属性的值。
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
     * 获取uploader属性的值。
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
     * 设置uploader属性的值。
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
     * 获取photoset属性的值。
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
     * 设置photoset属性的值。
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
     * 获取photosets属性的值。
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
     * 设置photosets属性的值。
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
     * 获取places属性的值。
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
     * 设置places属性的值。
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
     * 获取location属性的值。
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
     * 设置location属性的值。
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
     * 获取hottags属性的值。
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
     * 设置hottags属性的值。
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
     * 获取tags属性的值。
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
     * 设置tags属性的值。
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
     * 获取who属性的值。
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
     * 设置who属性的值。
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
     * 获取clusters属性的值。
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
     * 设置clusters属性的值。
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
     * 获取method属性的值。
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
     * 设置method属性的值。
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
     * 获取methods属性的值。
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
     * 设置methods属性的值。
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
     * 获取err属性的值。
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
     * 设置err属性的值。
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
     * 获取frob属性的值。
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
     * 设置frob属性的值。
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
     * 获取auth属性的值。
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
     * 设置auth属性的值。
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
     * 获取licenses属性的值。
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
     * 设置licenses属性的值。
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
     * 获取stat属性的值。
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
     * 设置stat属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取token属性的值。
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
         * 设置token属性的值。
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
         * 获取perms属性的值。
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
         * 设置perms属性的值。
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
         * 获取user属性的值。
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
         * 设置user属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取nsid属性的值。
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
             * 设置nsid属性的值。
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
             * 获取username属性的值。
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
             * 设置username属性的值。
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
             * 获取fullname属性的值。
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
             * 设置fullname属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取id属性的值。
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
             * 设置id属性的值。
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
             * 获取name属性的值。
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
             * 设置name属性的值。
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
             * 获取needspassword属性的值。
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
             * 设置needspassword属性的值。
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
             * 获取url属性的值。
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
             * 设置url属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取name属性的值。
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
         * 设置name属性的值。
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
         * 获取path属性的值。
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
         * 设置path属性的值。
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
         * 获取pathids属性的值。
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
         * 设置pathids属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取nsid属性的值。
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
             * 设置nsid属性的值。
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
             * 获取name属性的值。
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
             * 设置name属性的值。
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
             * 获取members属性的值。
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
             * 设置members属性的值。
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
             * 获取online属性的值。
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
             * 设置online属性的值。
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
             * 获取chatnsid属性的值。
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
             * 设置chatnsid属性的值。
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
             * 获取inchat属性的值。
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
             * 设置inchat属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取id属性的值。
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
             * 设置id属性的值。
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
             * 获取name属性的值。
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
             * 设置name属性的值。
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
             * 获取count属性的值。
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
             * 设置count属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取source属性的值。
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
         * 设置source属性的值。
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
         * 获取total属性的值。
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
         * 设置total属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取total属性的值。
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
             * 设置total属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取id属性的值。
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
         * 设置id属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取photoId属性的值。
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
         * 设置photoId属性的值。
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
         * 获取photosetId属性的值。
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
         * 设置photosetId属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取value属性的值。
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
             * 设置value属性的值。
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
             * 获取id属性的值。
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
             * 设置id属性的值。
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
             * 获取author属性的值。
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
             * 设置author属性的值。
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
             * 获取authorname属性的值。
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
             * 设置authorname属性的值。
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
             * 获取datecreate属性的值。
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
             * 设置datecreate属性的值。
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
             * 获取permalink属性的值。
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
             * 设置permalink属性的值。
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
             * 获取dateCreate属性的值。
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
             * 设置dateCreate属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取page属性的值。
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
         * 设置page属性的值。
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
         * 获取pages属性的值。
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
         * 设置pages属性的值。
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
         * 获取perpage属性的值。
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
         * 设置perpage属性的值。
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
         * 获取total属性的值。
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
         * 设置total属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取nsid属性的值。
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
             * 设置nsid属性的值。
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
             * 获取username属性的值。
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
             * 设置username属性的值。
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
             * 获取iconserver属性的值。
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
             * 设置iconserver属性的值。
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
             * 获取realname属性的值。
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
             * 设置realname属性的值。
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
             * 获取friend属性的值。
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
             * 设置friend属性的值。
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
             * 获取family属性的值。
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
             * 设置family属性的值。
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
             * 获取ignored属性的值。
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
             * 设置ignored属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取code属性的值。
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
         * 设置code属性的值。
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
         * 获取msg属性的值。
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
         * 设置msg属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取name属性的值。
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
         * 设置name属性的值。
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
         * 获取description属性的值。
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
         * 设置description属性的值。
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
         * 获取members属性的值。
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
         * 设置members属性的值。
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
         * 获取privacy属性的值。
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
         * 设置privacy属性的值。
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
         * 获取throttle属性的值。
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
         * 设置throttle属性的值。
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
         * 获取groupname属性的值。
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
         * 设置groupname属性的值。
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
         * 获取id属性的值。
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
         * 设置id属性的值。
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
         * 获取iconserver属性的值。
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
         * 设置iconserver属性的值。
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
         * 获取lang属性的值。
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
         * 设置lang属性的值。
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
         * 获取ispoolmoderated属性的值。
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
         * 设置ispoolmoderated属性的值。
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
         * 获取nsid属性的值。
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
         * 设置nsid属性的值。
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
         * 获取url属性的值。
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
         * 设置url属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取count属性的值。
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
             * 设置count属性的值。
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
             * 获取mode属性的值。
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
             * 设置mode属性的值。
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
             * 获取remaining属性的值。
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
             * 设置remaining属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取page属性的值。
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
         * 设置page属性的值。
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
         * 获取pages属性的值。
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
         * 设置pages属性的值。
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
         * 获取perpage属性的值。
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
         * 设置perpage属性的值。
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
         * 获取total属性的值。
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
         * 设置total属性的值。
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
         * 获取perPage属性的值。
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
         * 设置perPage属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取nsid属性的值。
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
             * 设置nsid属性的值。
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
             * 获取name属性的值。
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
             * 设置name属性的值。
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
             * 获取eighteenplus属性的值。
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
             * 设置eighteenplus属性的值。
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
             * 获取admin属性的值。
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
             * 设置admin属性的值。
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
             * 获取photos属性的值。
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
             * 设置photos属性的值。
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
             * 获取iconserver属性的值。
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
             * 设置iconserver属性的值。
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
             * 获取privacy属性的值。
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
             * 设置privacy属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取period属性的值。
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
         * 设置period属性的值。
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
         * 获取count属性的值。
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
         * 设置count属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取page属性的值。
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
         * 设置page属性的值。
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
         * 获取pages属性的值。
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
         * 设置pages属性的值。
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
         * 获取perpage属性的值。
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
         * 设置perpage属性的值。
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
         * 获取total属性的值。
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
         * 设置total属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取title属性的值。
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
             * 设置title属性的值。
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
             * 获取activity属性的值。
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
             * 设置activity属性的值。
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
             * 获取type属性的值。
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
             * 设置type属性的值。
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
             * 获取id属性的值。
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
             * 设置id属性的值。
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
             * 获取owner属性的值。
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
             * 设置owner属性的值。
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
             * 获取primary属性的值。
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
             * 设置primary属性的值。
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
             * 获取secret属性的值。
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
             * 设置secret属性的值。
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
             * 获取server属性的值。
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
             * 设置server属性的值。
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
             * 获取comments属性的值。
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
             * 设置comments属性的值。
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
             * 获取views属性的值。
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
             * 设置views属性的值。
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
             * 获取photos属性的值。
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
             * 设置photos属性的值。
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
             * 获取more属性的值。
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
             * 设置more属性的值。
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
             * 获取notes属性的值。
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
             * 设置notes属性的值。
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
             * 获取faves属性的值。
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
             * 设置faves属性的值。
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
             * 获取commentsold属性的值。
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
             * 设置commentsold属性的值。
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
             * 获取commentsnew属性的值。
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
             * 设置commentsnew属性的值。
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
             * 获取notesold属性的值。
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
             * 设置notesold属性的值。
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
             * 获取notesnew属性的值。
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
             * 设置notesnew属性的值。
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
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
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
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
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
                     * 获取value属性的值。
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
                     * 设置value属性的值。
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
                     * 获取type属性的值。
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
                     * 设置type属性的值。
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
                     * 获取user属性的值。
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
                     * 设置user属性的值。
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
                     * 获取dateadded属性的值。
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
                     * 设置dateadded属性的值。
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
                     * 获取username属性的值。
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
                     * 设置username属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取value属性的值。
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
             * 设置value属性的值。
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
             * 获取id属性的值。
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
             * 设置id属性的值。
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
             * 获取name属性的值。
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
             * 设置name属性的值。
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
             * 获取url属性的值。
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
             * 设置url属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取locality属性的值。
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
         * 设置locality属性的值。
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
         * 获取county属性的值。
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
         * 设置county属性的值。
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
         * 获取region属性的值。
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
         * 设置region属性的值。
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
         * 获取country属性的值。
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
         * 设置country属性的值。
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
         * 获取name属性的值。
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
         * 设置name属性的值。
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
         * 获取placeId属性的值。
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
         * 设置placeId属性的值。
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
         * 获取placeUrl属性的值。
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
         * 设置placeUrl属性的值。
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
         * 获取woeid属性的值。
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
         * 设置woeid属性的值。
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
         * 获取latitude属性的值。
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
         * 设置latitude属性的值。
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
         * 获取longitude属性的值。
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
         * 设置longitude属性的值。
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
         * 获取placeType属性的值。
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
         * 设置placeType属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取value属性的值。
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
             * 设置value属性的值。
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
             * 获取placeId属性的值。
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
             * 设置placeId属性的值。
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
             * 获取woeid属性的值。
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
             * 设置woeid属性的值。
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
             * 获取latitude属性的值。
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
             * 设置latitude属性的值。
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
             * 获取longitude属性的值。
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
             * 设置longitude属性的值。
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
             * 获取placeUrl属性的值。
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
             * 设置placeUrl属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取value属性的值。
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
             * 设置value属性的值。
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
             * 获取placeId属性的值。
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
             * 设置placeId属性的值。
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
             * 获取woeid属性的值。
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
             * 设置woeid属性的值。
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
             * 获取latitude属性的值。
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
             * 设置latitude属性的值。
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
             * 获取longitude属性的值。
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
             * 设置longitude属性的值。
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
             * 获取placeUrl属性的值。
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
             * 设置placeUrl属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取value属性的值。
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
             * 设置value属性的值。
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
             * 获取placeId属性的值。
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
             * 设置placeId属性的值。
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
             * 获取woeid属性的值。
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
             * 设置woeid属性的值。
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
             * 获取latitude属性的值。
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
             * 设置latitude属性的值。
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
             * 获取longitude属性的值。
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
             * 设置longitude属性的值。
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
             * 获取placeUrl属性的值。
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
             * 设置placeUrl属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取value属性的值。
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
             * 设置value属性的值。
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
             * 获取placeId属性的值。
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
             * 设置placeId属性的值。
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
             * 获取woeid属性的值。
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
             * 设置woeid属性的值。
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
             * 获取latitude属性的值。
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
             * 设置latitude属性的值。
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
             * 获取longitude属性的值。
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
             * 设置longitude属性的值。
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
             * 获取placeUrl属性的值。
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
             * 设置placeUrl属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取description属性的值。
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
         * 设置description属性的值。
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
         * 获取response属性的值。
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
         * 设置response属性的值。
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
         * 获取explanation属性的值。
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
         * 设置explanation属性的值。
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
         * 获取arguments属性的值。
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
         * 设置arguments属性的值。
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
         * 获取errors属性的值。
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
         * 设置errors属性的值。
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
         * 获取name属性的值。
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
         * 设置name属性的值。
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
         * 获取needslogin属性的值。
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
         * 设置needslogin属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
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
                 * 获取value属性的值。
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
                 * 设置value属性的值。
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
                 * 获取name属性的值。
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
                 * 设置name属性的值。
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
                 * 获取optional属性的值。
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
                 * 设置optional属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
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
                 * 获取value属性的值。
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
                 * 设置value属性的值。
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
                 * 获取code属性的值。
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
                 * 设置code属性的值。
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
                 * 获取message属性的值。
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
                 * 设置message属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取id属性的值。
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
         * 设置id属性的值。
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
         * 获取secret属性的值。
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
         * 设置secret属性的值。
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
         * 获取title属性的值。
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
         * 设置title属性的值。
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
         * 获取url属性的值。
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
         * 设置url属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取id属性的值。
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
         * 设置id属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取id属性的值。
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
         * 设置id属性的值。
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
         * 获取ispublic属性的值。
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
         * 设置ispublic属性的值。
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
         * 获取isfriend属性的值。
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
         * 设置isfriend属性的值。
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
         * 获取isfamily属性的值。
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
         * 设置isfamily属性的值。
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
         * 获取permcomment属性的值。
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
         * 设置permcomment属性的值。
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
         * 获取permaddmeta属性的值。
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
         * 设置permaddmeta属性的值。
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
         * 获取iscontact属性的值。
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
         * 设置iscontact属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取username属性的值。
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
         * 设置username属性的值。
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
         * 获取realname属性的值。
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
         * 设置realname属性的值。
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
         * 获取mboxSha1Sum属性的值。
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
         * 设置mboxSha1Sum属性的值。
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
         * 获取location属性的值。
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
         * 设置location属性的值。
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
         * 获取photosurl属性的值。
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
         * 设置photosurl属性的值。
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
         * 获取profileurl属性的值。
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
         * 设置profileurl属性的值。
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
         * 获取photos属性的值。
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
         * 设置photos属性的值。
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
         * 获取nsid属性的值。
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
         * 设置nsid属性的值。
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
         * 获取isadmin属性的值。
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
         * 设置isadmin属性的值。
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
         * 获取ispro属性的值。
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
         * 设置ispro属性的值。
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
         * 获取iconserver属性的值。
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
         * 设置iconserver属性的值。
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
         * 获取iconfarm属性的值。
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
         * 设置iconfarm属性的值。
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
         * 获取contact属性的值。
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
         * 设置contact属性的值。
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
         * 获取friend属性的值。
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
         * 设置friend属性的值。
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
         * 获取family属性的值。
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
         * 设置family属性的值。
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
         * 获取revcontact属性的值。
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
         * 设置revcontact属性的值。
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
         * 获取revfriend属性的值。
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
         * 设置revfriend属性的值。
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
         * 获取revfamily属性的值。
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
         * 设置revfamily属性的值。
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
         * 获取contentType属性的值。
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
         * 设置contentType属性的值。
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
         * 获取geoperms属性的值。
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
         * 设置geoperms属性的值。
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
         * 获取hidden属性的值。
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
         * 设置hidden属性的值。
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
         * 获取privacy属性的值。
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
         * 设置privacy属性的值。
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
         * 获取safetyLevel属性的值。
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
         * 设置safetyLevel属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取firstdate属性的值。
             * 
             */
            public int getFirstdate() {
                return firstdate;
            }

            /**
             * 设置firstdate属性的值。
             * 
             */
            public void setFirstdate(int value) {
                this.firstdate = value;
            }

            /**
             * 获取firstdatetaken属性的值。
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
             * 设置firstdatetaken属性的值。
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
             * 获取count属性的值。
             * 
             */
            public int getCount() {
                return count;
            }

            /**
             * 设置count属性的值。
             * 
             */
            public void setCount(int value) {
                this.count = value;
            }

        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取owner属性的值。
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
         * 设置owner属性的值。
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
         * 获取title属性的值。
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
         * 设置title属性的值。
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
         * 获取description属性的值。
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
         * 设置description属性的值。
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
         * 获取visibility属性的值。
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
         * 设置visibility属性的值。
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
         * 获取dates属性的值。
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
         * 设置dates属性的值。
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
         * 获取permissions属性的值。
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
         * 设置permissions属性的值。
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
         * 获取editability属性的值。
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
         * 设置editability属性的值。
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
         * 获取comments属性的值。
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
         * 设置comments属性的值。
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
         * 获取notes属性的值。
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
         * 设置notes属性的值。
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
         * 获取tags属性的值。
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
         * 设置tags属性的值。
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
         * 获取urls属性的值。
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
         * 设置urls属性的值。
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
         * 获取location属性的值。
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
         * 设置location属性的值。
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
         * 获取id属性的值。
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
         * 设置id属性的值。
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
         * 获取secret属性的值。
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
         * 设置secret属性的值。
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
         * 获取server属性的值。
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
         * 设置server属性的值。
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
         * 获取farm属性的值。
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
         * 设置farm属性的值。
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
         * 获取page属性的值。
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
         * 设置page属性的值。
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
         * 获取pages属性的值。
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
         * 设置pages属性的值。
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
         * 获取perpage属性的值。
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
         * 设置perpage属性的值。
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
         * 获取total属性的值。
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
         * 设置total属性的值。
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
         * 获取isfavorite属性的值。
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
         * 设置isfavorite属性的值。
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
         * 获取license属性的值。
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
         * 设置license属性的值。
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
         * 获取rotation属性的值。
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
         * 设置rotation属性的值。
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
         * 获取originalsecret属性的值。
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
         * 设置originalsecret属性的值。
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
         * 获取originalformat属性的值。
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
         * 设置originalformat属性的值。
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
         * 获取contentType属性的值。
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
         * 设置contentType属性的值。
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
         * 获取safetyLevel属性的值。
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
         * 设置safetyLevel属性的值。
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
         * 获取hidden属性的值。
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
         * 设置hidden属性的值。
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
         * 获取username属性的值。
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
         * 设置username属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取posted属性的值。
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
             * 设置posted属性的值。
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
             * 获取taken属性的值。
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
             * 设置taken属性的值。
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
             * 获取takengranularity属性的值。
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
             * 设置takengranularity属性的值。
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
             * 获取lastupdate属性的值。
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
             * 设置lastupdate属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取cancomment属性的值。
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
             * 设置cancomment属性的值。
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
             * 获取canaddmeta属性的值。
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
             * 设置canaddmeta属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取raw属性的值。
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
             * 设置raw属性的值。
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
             * 获取clean属性的值。
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
             * 设置clean属性的值。
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
             * 获取tagspace属性的值。
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
             * 设置tagspace属性的值。
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
             * 获取tagspaceid属性的值。
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
             * 设置tagspaceid属性的值。
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
             * 获取tag属性的值。
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
             * 设置tag属性的值。
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
             * 获取label属性的值。
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
             * 设置label属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取latitude属性的值。
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
             * 设置latitude属性的值。
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
             * 获取longitude属性的值。
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
             * 设置longitude属性的值。
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
             * 获取accuracy属性的值。
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
             * 设置accuracy属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
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
                 * 获取value属性的值。
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
                 * 设置value属性的值。
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
                 * 获取id属性的值。
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
                 * 设置id属性的值。
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
                 * 获取author属性的值。
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
                 * 设置author属性的值。
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
                 * 获取authorname属性的值。
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
                 * 设置authorname属性的值。
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
                 * 获取x属性的值。
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
                 * 设置x属性的值。
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
                 * 获取y属性的值。
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
                 * 设置y属性的值。
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
                 * 获取w属性的值。
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
                 * 设置w属性的值。
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
                 * 获取h属性的值。
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
                 * 设置h属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取value属性的值。
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
             * 设置value属性的值。
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
             * 获取nsid属性的值。
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
             * 设置nsid属性的值。
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
             * 获取username属性的值。
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
             * 设置username属性的值。
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
             * 获取realname属性的值。
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
             * 设置realname属性的值。
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
             * 获取location属性的值。
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
             * 设置location属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取permcomment属性的值。
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
             * 设置permcomment属性的值。
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
             * 获取permaddmeta属性的值。
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
             * 设置permaddmeta属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取nsid属性的值。
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
             * 设置nsid属性的值。
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
             * 获取username属性的值。
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
             * 设置username属性的值。
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
             * 获取favedate属性的值。
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
             * 设置favedate属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
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
                 * 获取value属性的值。
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
                 * 设置value属性的值。
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
                 * 获取id属性的值。
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
                 * 设置id属性的值。
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
                 * 获取author属性的值。
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
                 * 设置author属性的值。
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
                 * 获取raw属性的值。
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
                 * 设置raw属性的值。
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
                 * 获取authorname属性的值。
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
                 * 设置authorname属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
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
                 * 获取value属性的值。
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
                 * 设置value属性的值。
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
                 * 获取type属性的值。
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
                 * 设置type属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取ispublic属性的值。
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
             * 设置ispublic属性的值。
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
             * 获取isfriend属性的值。
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
             * 设置isfriend属性的值。
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
             * 获取isfamily属性的值。
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
             * 设置isfamily属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取count属性的值。
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
             * 设置count属性的值。
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
             * 获取fromdate属性的值。
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
             * 设置fromdate属性的值。
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
             * 获取todate属性的值。
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
             * 设置todate属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取value属性的值。
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
         * 设置value属性的值。
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
         * 获取secret属性的值。
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
         * 设置secret属性的值。
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
         * 获取originalsecret属性的值。
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
         * 设置originalsecret属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取page属性的值。
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
         * 设置page属性的值。
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
         * 获取pages属性的值。
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
         * 设置pages属性的值。
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
         * 获取perpage属性的值。
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
         * 设置perpage属性的值。
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
         * 获取total属性的值。
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
         * 设置total属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取id属性的值。
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
             * 设置id属性的值。
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
             * 获取owner属性的值。
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
             * 设置owner属性的值。
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
             * 获取secret属性的值。
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
             * 设置secret属性的值。
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
             * 获取server属性的值。
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
             * 设置server属性的值。
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
             * 获取title属性的值。
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
             * 设置title属性的值。
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
             * 获取ispublic属性的值。
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
             * 设置ispublic属性的值。
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
             * 获取isfriend属性的值。
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
             * 设置isfriend属性的值。
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
             * 获取isfamily属性的值。
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
             * 设置isfamily属性的值。
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
             * 获取ownername属性的值。
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
             * 设置ownername属性的值。
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
             * 获取dateadded属性的值。
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
             * 设置dateadded属性的值。
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
             * 获取lastupdate属性的值。
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
             * 设置lastupdate属性的值。
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
             * 获取username属性的值。
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
             * 设置username属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取title属性的值。
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
         * 设置title属性的值。
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
         * 获取description属性的值。
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
         * 设置description属性的值。
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
         * 获取id属性的值。
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
         * 设置id属性的值。
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
         * 获取url属性的值。
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
         * 设置url属性的值。
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
         * 获取owner属性的值。
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
         * 设置owner属性的值。
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
         * 获取primary属性的值。
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
         * 设置primary属性的值。
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
         * 获取photos属性的值。
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
         * 设置photos属性的值。
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
         * 获取secret属性的值。
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
         * 设置secret属性的值。
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
         * 获取page属性的值。
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
         * 设置page属性的值。
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
         * 获取pages属性的值。
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
         * 设置pages属性的值。
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
         * 获取perpage属性的值。
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
         * 设置perpage属性的值。
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
         * 获取total属性的值。
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
         * 设置total属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取id属性的值。
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
             * 设置id属性的值。
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
             * 获取secret属性的值。
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
             * 设置secret属性的值。
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
             * 获取server属性的值。
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
             * 设置server属性的值。
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
             * 获取title属性的值。
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
             * 设置title属性的值。
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
             * 获取isprimary属性的值。
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
             * 设置isprimary属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取cancreate属性的值。
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
         * 设置cancreate属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取title属性的值。
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
             * 设置title属性的值。
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
             * 获取description属性的值。
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
             * 设置description属性的值。
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
             * 获取id属性的值。
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
             * 设置id属性的值。
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
             * 获取url属性的值。
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
             * 设置url属性的值。
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
             * 获取owner属性的值。
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
             * 设置owner属性的值。
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
             * 获取primary属性的值。
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
             * 设置primary属性的值。
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
             * 获取photos属性的值。
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
             * 设置photos属性的值。
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
             * 获取server属性的值。
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
             * 设置server属性的值。
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
             * 获取farm属性的值。
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
             * 设置farm属性的值。
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
             * 获取secret属性的值。
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
             * 设置secret属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取query属性的值。
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
         * 设置query属性的值。
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
         * 获取total属性的值。
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
         * 设置total属性的值。
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
         * 获取latitude属性的值。
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
         * 设置latitude属性的值。
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
         * 获取longitude属性的值。
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
         * 设置longitude属性的值。
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
         * 获取accuracy属性的值。
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
         * 设置accuracy属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取value属性的值。
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
             * 设置value属性的值。
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
             * 获取placeId属性的值。
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
             * 设置placeId属性的值。
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
             * 获取placeUrl属性的值。
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
             * 设置placeUrl属性的值。
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
             * 获取placeType属性的值。
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
             * 设置placeType属性的值。
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
             * 获取latitude属性的值。
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
             * 设置latitude属性的值。
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
             * 获取longitude属性的值。
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
             * 设置longitude属性的值。
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
             * 获取woeid属性的值。
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
             * 设置woeid属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取id属性的值。
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
         * 设置id属性的值。
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
         * 获取title属性的值。
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
         * 设置title属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取id属性的值。
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
         * 设置id属性的值。
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
         * 获取secret属性的值。
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
         * 设置secret属性的值。
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
         * 获取title属性的值。
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
         * 设置title属性的值。
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
         * 获取url属性的值。
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
         * 设置url属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取id属性的值。
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
         * 设置id属性的值。
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
         * 获取title属性的值。
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
         * 设置title属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取label属性的值。
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
             * 设置label属性的值。
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
             * 获取width属性的值。
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
             * 设置width属性的值。
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
             * 获取height属性的值。
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
             * 设置height属性的值。
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
             * 获取source属性的值。
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
             * 设置source属性的值。
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
             * 获取url属性的值。
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
             * 设置url属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取source属性的值。
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
         * 设置source属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取id属性的值。
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
             * 设置id属性的值。
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
             * 获取complete属性的值。
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
             * 设置complete属性的值。
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
             * 获取photoid属性的值。
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
             * 设置photoid属性的值。
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
             * 获取invalid属性的值。
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
             * 设置invalid属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取username属性的值。
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
         * 设置username属性的值。
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
         * 获取bandwidth属性的值。
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
         * 设置bandwidth属性的值。
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
         * 获取filesize属性的值。
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
         * 设置filesize属性的值。
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
         * 获取sets属性的值。
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
         * 设置sets属性的值。
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
         * 获取nsid属性的值。
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
         * 设置nsid属性的值。
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
         * 获取ispro属性的值。
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
         * 设置ispro属性的值。
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
         * 获取url属性的值。
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
         * 设置url属性的值。
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
         * 获取id属性的值。
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
         * 设置id属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取maxbytes属性的值。
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
             * 设置maxbytes属性的值。
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
             * 获取maxkb属性的值。
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
             * 设置maxkb属性的值。
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
             * 获取usedbytes属性的值。
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
             * 设置usedbytes属性的值。
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
             * 获取usedkb属性的值。
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
             * 设置usedkb属性的值。
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
             * 获取remainingbytes属性的值。
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
             * 设置remainingbytes属性的值。
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
             * 获取remainingkb属性的值。
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
             * 设置remainingkb属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取maxbytes属性的值。
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
             * 设置maxbytes属性的值。
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
             * 获取maxkb属性的值。
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
             * 设置maxkb属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取created属性的值。
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
             * 设置created属性的值。
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
             * 获取remaining属性的值。
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
             * 设置remaining属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取tags属性的值。
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
         * 设置tags属性的值。
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
         * 获取id属性的值。
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
         * 设置id属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取source属性的值。
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
             * 设置source属性的值。
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
