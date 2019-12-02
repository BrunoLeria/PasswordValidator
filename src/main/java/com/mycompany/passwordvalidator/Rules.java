/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.passwordvalidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author bruno
 */
public class Rules {

    private final String password;
    private Pattern pattern;
    private Matcher matcher;
    public Rules(String password) {
        this.password = password;
    }

    public String checkPassword()
    {
        pattern = Pattern.compile(".*?[0-9].*?");
        matcher = pattern.matcher(password);
        if(!matcher.matches())
            return "It does not contain a number";
        pattern = Pattern.compile(".*?[^A-Za-z0-9].*?");
        matcher = pattern.matcher(password);
        if(!matcher.matches())
            return "It does not contain a symbol";
        pattern = Pattern.compile(".*?[\\s].*?");
        matcher = pattern.matcher(password);
        if(matcher.matches())
            return "It contains a blank space";
        else if(password.length() > 10)
            return "It contains more than 10 characters";
        else if(password.length() < 5)
            return "It contains less than 5 characters";
        else
            return "";
    }
}
