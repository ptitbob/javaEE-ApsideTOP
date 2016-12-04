package fr.apside.formation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * @author François Robert
 */
@Entity
public class Address implements Serializable {

  private static final long serialVersionUID = -2396252454218059294L;

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "address_id")
  private Long id;

  @OneToOne
  @JoinColumn(name = "address_person_id")
  private Person person;

  @Column(name = "address_line", length = 100)
  private String line;

  @Column(name = "zip_code", length = 10)
  private String zipCode;

  @Column(name = "address_city", length = 100)
  private String city;

  public Address() {
  }

  public Address(String line, String zipCode, String city) {
    this.line = line;
    this.zipCode = zipCode;
    this.city = city;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public String getLine() {
    return line;
  }

  public void setLine(String line) {
    this.line = line;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }
}
