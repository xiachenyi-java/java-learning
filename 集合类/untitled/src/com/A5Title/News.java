package com.A5Title;

/**
 * 夏辰义
 * 2026/7/122:34
 */
@SuppressWarnings("all")
public class News {
    private String Title;
    private String content;

    public News(String Title,String content){
        this.content = "";
        this.Title = Title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return Title;
    }
    @Override
    public String toString(){
        return Title;
    }
}
