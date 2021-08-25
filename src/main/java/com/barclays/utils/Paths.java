package com.barclays.utils;

public class Paths {
    
    private Paths() {
        throw new IllegalStateException("Utility class");
    }
    
    public static final String REST_API = "/rest/api";
    public static final String ADMIN = "/admin";
    public static final String ADD = "/add";
    public static final String BOOKS = "/books";
    
    public static final String REST_API_BOOKS = REST_API+BOOKS;
    public static final String REST_API_ADMIN = REST_API +ADMIN;
    public static final String REST_API_ADMIN_BOOKS = REST_API_ADMIN +BOOKS;
      
    
    
    
}
