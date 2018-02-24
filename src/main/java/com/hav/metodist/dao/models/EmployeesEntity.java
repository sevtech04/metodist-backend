package com.hav.metodist.dao.models;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity(name = "employees")
public class EmployeesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "tabNumber")
    private Integer tabNumber;
    @Column(name = "firstName", nullable = false, length = 45)
    private String firstName;
    @Column(name = "lastName", nullable = false, length = 45)
    private String lastName;
    @Column(name = "middleName")
    private String middleName;
    @Temporal(TemporalType.DATE)
    @Column(name = "birthdate")
    private Date birthdate;
    @Column(name = "sex")
    private Boolean sex;
    @Column(name = "photo")
    private Integer photo;

    /*
        private Set<AttestationsEntity> attestations = new HashSet<>();
        private Set<EmployeesContactsEntity> contacts = new HashSet<>();

        @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
        public Set<AttestationsEntity> getAttestation() {
            return this.attestations;
        }
        public void setAttestation(Set<AttestationsEntity> attestation) {
            this.attestations = attestation;
        }

        @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
        public Set<EmployeesContactsEntity> getContacts() {
            return this.contacts;
        }
        public void setContacts(Set<EmployeesContactsEntity> contacts) {
            this.contacts = contacts;
        }
*/


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Integer getTabNumber() {
        return tabNumber;
    }
    public void setTabNumber(Integer tabNumber) {
        this.tabNumber = tabNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public Date getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    public Boolean getSex() {
        return sex;
    }
    public void setSex(Boolean sex) {
        this.sex = sex;
    }
    public Integer getPhoto() {
        return photo;
    }
    public void setPhoto(Integer photo) {
        this.photo = photo;
    }



}
