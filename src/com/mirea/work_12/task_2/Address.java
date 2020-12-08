package com.mirea.work_12.task_2;

import java.util.StringTokenizer;

public class Address {
    String country, region, city, street, house, corpus, flat;
    String separator;

    public Address() {
        separator = ",";
    }

    public Address(String separator) {
        this.separator = separator;
    }

    boolean splitAddress(String address)  {
        String[] values = address.split(separator);
        if (values.length != 7) {
            return false;
        }
        country = values[0];
        region = values[1];
        city = values[2];
        street = values[3];
        house = values[4];
        corpus = values[5];
        flat = values[6];
        return true;
    }

    boolean tokenizeAddress(String address) {
        StringTokenizer tokenizer = new StringTokenizer(address, separator);
        if(tokenizer.countTokens() != 7) {
            return false;
        }

        country = tokenizer.nextToken();
        region = tokenizer.nextToken();
        city = tokenizer.nextToken();
        street = tokenizer.nextToken();
        house = tokenizer.nextToken();
        corpus = tokenizer.nextToken();
        flat = tokenizer.nextToken();
        return true;
    }

    void printAddress() {
        System.out.println(country + '\n' + region + '\n' + city + '\n' + street + '\n' + house + '\n' + corpus + '\n' + flat);
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", corpus='" + corpus + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
}
