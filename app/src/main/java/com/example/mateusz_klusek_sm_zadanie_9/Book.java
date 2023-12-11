package com.example.mateusz_klusek_sm_zadanie_9;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Book {
    @SerializedName("title")
    private String title;
    @SerializedName("author_name")
    private List<String> authors;
    @SerializedName("cover_i")
    private String cover;
    @SerializedName("number_of_pages_median")
    private String numberOfPages;
    @SerializedName("ebook_access")
    private String ebookAccess;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getNumberOfPages() {
        return this.numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getEbookAccess() {
        return this.ebookAccess;
    }

    public void setEbookAccess(String ebookAccess) {
        this.ebookAccess = ebookAccess;
    }
}
