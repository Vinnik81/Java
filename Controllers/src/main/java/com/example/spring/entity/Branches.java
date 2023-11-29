package com.example.spring.entity;


import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "Branches")
@DynamicInsert
@DynamicUpdate
public class Branches implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Column(name = "asan_center")
    private Boolean asanCenter;
    @Basic(optional = false)
    @Column(name = "name_for_ticket")
    private String nameForTicket;
    @Column(name = "moxa_ip")
    private String moxaIp;
    @Basic(optional = false)
    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    @Column(name = "is_operable")
    private Boolean isOperable;



    public Branches() {
    }


    public Branches(String id) {
        this.id = id;
    }

    public Branches(String id, String name) {
        this.id = id;
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameForTicket() {
        return nameForTicket;
    }

    public void setNameForTicket(String nameForTicket) {
        this.nameForTicket = nameForTicket;
    }

    public Boolean getAsanCenter() {
        return asanCenter;
    }

    public void setAsanCenter(Boolean asanCenter) {
        this.asanCenter = asanCenter;
    }

    public String getMoxaIp() {
        return moxaIp;
    }

    public void setMoxaIp(String moxaIp) {
        this.moxaIp = moxaIp;
    }

    public String getCreationDate() {
        if (creationDate != null)
            return creationDate.toString();
        return null;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Boolean getOperable() {
        return isOperable;
    }

    public void setOperable( Boolean operable ) {
        isOperable = operable;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Branches)) {
            return false;
        }
        Branches other = (Branches) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

}
