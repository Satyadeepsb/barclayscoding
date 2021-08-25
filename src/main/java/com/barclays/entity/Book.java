package com.barclays.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity(name = "books")
public class Book  extends AbstractEntity{
    /**
     * 
     */
    private static final long serialVersionUID = -2252607267410155723L;
    @Column(name = "name", length = 20)
    private String name;
    @Column(name = "author", length = 20)
    private String author;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book)obj;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    public Book(String name, String author) {
        super();
        this.name = name;
        this.author = author;
    }
    
}
