package ru.unity.cluster.grant.model;

import jakarta.persistence.*;


import java.util.Date;
@Entity
@Table(name = "article")
public class ArticleEntity {
    @Id
    private int id;

    private String name;
    private String mainText;
    private String spoiler;
    private String[] ImagePath;
    private String[] VideoPath;
    private String[] AddonPath;
    private Date articleDate;
    private Date lectionDate;
    private String[] hashTags;
    @ManyToOne(fetch= FetchType.LAZY, cascade = CascadeType.ALL)
    private LecturerEntity lecturer;
    private String groupArticle;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getmainText() {
        return mainText;
    }

    public String getSpoiler() {
        return spoiler;
    }

    public String[] getImagePath() {
        return ImagePath;
    }

    public String[] getVideoPath() {
        return VideoPath;
    }

    public String[] getAddonPath() {
        return AddonPath;
    }

    public Date getArticleDate() {
        return articleDate;
    }

    public Date getLectionDate() {
        return lectionDate;
    }

    public String[] getHashTags() {
        return hashTags;
    }

    public LecturerEntity getLecturer() {
        return lecturer;
    }

    public String getGroupArticle(){
        return groupArticle;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setText(String mainText) {
        this.mainText = mainText;
    }

    public void setSpoiler(String spoiler) {
        this.spoiler = spoiler;
    }

    public void setImagePath(String [] imagePath) {
        ImagePath = imagePath;
    }

    public void setVideoPath(String[] videoPath) {
        VideoPath = videoPath;
    }

    public void setAddonPath(String[] addonPath) {
        AddonPath = addonPath;
    }

    public void setArticleDate(Date articleDate) {
        this.articleDate = articleDate;
    }

    public void setLectionDate(Date lectionDate) {
        this.lectionDate = lectionDate;
    }

    public void setHashTags(String[] hashTags) {
        this.hashTags = hashTags;
    }

    public void setLecturer(LecturerEntity lecturer) {
        this.lecturer = lecturer;
    }
    public void setGroupArticle(String groupArticle){
        this.groupArticle = groupArticle;
    }
}
