package ru.unity.cluster.grant.model;


@Entity
@Table(name = "lecturers")
public class LecturerEntity {
//    @id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String lecturerName;
    private String lecturerBio;
    private String [] imagePath;

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
