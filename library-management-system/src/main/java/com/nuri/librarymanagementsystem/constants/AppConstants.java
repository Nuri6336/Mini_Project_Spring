package com.nuri.librarymanagementsystem.constants;

public class AppConstants {

    public static final String TOKEN_SECRET = "ThisIsAbuTalebNuriWithTheProjectOfSecurityInSpringBootJpaApplication";
    public static final long EXPIRATION_TIME = 259200000; //3 days
    public static final String SIGN_IN = "/users/login";
    public static final String SIGN_UP = "/users/register";
    public static final String HEADER_STRING = "Authorization";
    public static final String TOKEN_PREFIX = "Bearer ";
}
