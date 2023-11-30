package com.example.bookms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Book {

    @Id
    @Column
    private int bookId;

    @Column
    private String title;

    @Column
    private String publishedDate;

    @Column
    private int totalCopies;

    @Column
    private int issuedCopies;

    @Column
    private String author;


    public int getId() {
        return bookId;
    }
    public void setId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return publishedDate;
    }
    public void setDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public int getCopies() {
        return totalCopies;
    }
    public void setCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }

    public int getCopy() {
        return issuedCopies;
    }
    public void setTitle(int issuedCopies) {
        this.issuedCopies = issuedCopies;
    }


    public String getAuth() {
        return author;
    }
    public void setAuth(String author) {
        this.author = author;
    }

}
