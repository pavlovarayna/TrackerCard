package com.mystique.springdrivercard.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * <h1>Picture model</h1>
 *
 * <b>Description: </b> This is a POJO class which acts as a model. It defines the fields/properties
 * of the Picture object. It includes relevant constructors, getters, and setters.
 *
 * @author  Mystique Team
 * @version 1.0
 * @since   2018-11-12
 */
@Entity
@Table(name = "pictures")
public class Picture {

    @Id
 //   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PictureID", nullable = false)
    private int pictureId;

    @Lob
    @Column(name = "Picture", columnDefinition = "BLOB", nullable = false)
    private byte[] picture;

    @Column(name = "LastSetID", nullable = false)
    @NotNull
    private String lastSetID;

    public Picture() {
    }

    public Picture(byte[] picture){
        this.picture = picture;
    }

    public Picture(int pictureId, String lastSetID) {
        this.pictureId = pictureId;
        this.lastSetID = lastSetID;
    }

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }


    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public String getLastSetID() {
        return lastSetID;
    }

    public void setLastSetID(String lastSetID) {
        this.lastSetID = lastSetID;
    }
}
