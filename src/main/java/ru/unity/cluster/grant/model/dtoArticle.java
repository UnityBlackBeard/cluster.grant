package ru.unity.cluster.grant.model;

import java.util.Date;

public class dtoArticle package ru.unity.cluster.grant.model;

import java.util.Date;

public class dtoArticle {

    private int id;
    private String name;
    private String text;
    private String spoiler;
    private String[] ImagePath;
    private String[] VideoPath;
    private String[] AddonPath;
    private Date articleDate;
    private Date lectionDate;
    private String[] hashTags;
    private String lecturerName;
    private String groupArticle;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
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

    public String getLecturerName() {
        return lecturerName;
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

    public void setText(String text) {
        this.text = text;
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

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }
    public void setGroupArticle(String groupArticle){
        this.groupArticle = groupArticle;
    }
}


