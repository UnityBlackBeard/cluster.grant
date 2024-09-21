package ru.unity.cluster.grant.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "lecturer")
public class LecturerEntity {
    @Id
    private int id;

    private String lecturerName;
    private String lecturerBio;
   private String[] imagePath;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public String getLecturerBio() {
        return lecturerBio;
    }

    public void setLecturerBio(String lecturerBio) {
        this.lecturerBio = lecturerBio;
    }

    public String[] getImagePath() {
        return imagePath;
    }

    public void setImagePath(String[] imagePath) {
        this.imagePath = imagePath;
    }
}
