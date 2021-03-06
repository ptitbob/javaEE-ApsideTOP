package fr.apside.formation.jaxb.model.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

/**
 * Donateur
 */
@XmlRootElement(name = "donnateur")
@XmlAccessorType(XmlAccessType.FIELD)
public class Donor extends Person {

    /**
     * Montant de la donnation
     */
    @XmlElement(name = "donnation")
    private int donationAmount;

    @XmlAttribute(name = "type")
    private DonorType donorType;

    public Donor() {
    }

    public Donor(Long id, String name, String surname, int donationAmount, DonorType donorType) {
        this(id, name, surname, donationAmount, donorType, null);
    }

    public Donor(Long id, String name, String surname, int donationAmount, DonorType donorType, Address address) {
        super(id, name, surname, address);
        setDonationAmount(donationAmount);
        setDonorType(donorType);
    }

    public int getDonationAmount() {
        return donationAmount;
    }

    public void setDonationAmount(int donationAmount) {
        this.donationAmount = donationAmount;
    }

    public DonorType getDonorType() {
        return donorType;
    }

    public void setDonorType(DonorType donorType) {
        this.donorType = donorType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Donor)) return false;
        if (!super.equals(o)) return false;
        Donor donor = (Donor) o;
        return Objects.equals(getDonationAmount(), donor.getDonationAmount()) &&
                Objects.equals(getDonorType(), donor.getDonorType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDonorType());
    }

    @Override
    public String toString() {
        return "Donor{" +
                "donationAmount=" + donationAmount +
                ", donorType=" + donorType +
                "} " + super.toString();
    }
}
