package com.cyberark.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="bh_addresssource")
public class BH_AddressSource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long addressSourceID;
    @Column(name = "source")
    private long source;
    @Column(name = "XPKAddressSource")
    private long XPKAddressSource;

    public BH_AddressSource() {
    }

    @Override
    public String toString() {
        return "BH_AddressSource{" +
                "addressSourceID=" + addressSourceID +
                ", source=" + source +
                ", XPKAddressSource=" + XPKAddressSource +
                '}';
    }
}
