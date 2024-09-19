package ru.unity.cluster.grant.model;

import java.util.Date;

public class ArticleDto {

    private  int id;
    private  String name;
    private  String text;
    private  String spoiler;
    private  String[] ImagePath;
    private  String[] VideoPath;
    private  String[] AddonPath;
    private  Date articleDate;
    private  Date lectionDate;
    private  String[] hashTags;
    private  LecturerDto lecturer;
    private  String groupArticle;

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

    public LecturerDto getLecturer() {
        return lecturer;
    }

    public String getGroupArticle(){
        return groupArticle;
    }


}


