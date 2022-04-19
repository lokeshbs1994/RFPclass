package com.bridgelabz.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatternForEmail {
    public static void main(String[] args) {
        List emails = new ArrayList();
        emails.add("user@domain.com");
        emails.add("user@domain.co.in");
        emails.add("user1@domain.com");
        emails.add("user.name@domain.com");
        emails.add("user#@domain.co.in");
        emails.add("user@domaincom");
        emails.add("user_name@domain.co.in");
        emails.add("user-name@domain.co.in");
        emails.add("user-name@domain.co.in");


//Invalid emails
        emails.add("user#domain.com");
        emails.add("???@yahoo.com");

        //String regex = "^(.+)@(.+)$";
        //String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";

        Pattern pattern = Pattern.compile(regex);

        for (Object email : emails) {
            Matcher matcher = pattern.matcher((CharSequence) email);
            System.out.println(email + " : " + matcher.matches());
        }
    }

}
