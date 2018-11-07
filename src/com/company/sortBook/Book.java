package com.company.sortBook;

public class Book implements Comparable<Book> {

    private String title;
    private int pages;
    private String price;
    private String size;

    public Book(String title, int pages, String price) {
        this.title = title;
        this.pages = pages;
        this.price = price;

    }

    public Book(String title, int pages, String price,String size) {
        this.title = title;
        this.pages = pages;
        this.price = price;
        this.size = size;
    }


    public int compareTo (Book o){

        int compareTitle = title.compareTo(o.title);
        return compareTitle;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", price='" + price + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}