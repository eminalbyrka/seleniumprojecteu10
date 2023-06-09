package com.cydeo.tests.utilities;

import java.io.*;
import java.util.*;

public class ConfigurationReader {

    //1- Create the object of Properties
    private static Properties properties = new Properties();

    static{// static block ilk execute olduğu için.
        // ve aşağıdakilerin ilk execute olması için.static yapmış.
        // hemde kodlarımız bir blok içinde olmalıymış.sanırım main method filan kullanmak istemedi.

        try {

            //2- We need to open the file in java memory: FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");

            //3- Load the properties object using FileInputStream object
            properties.load(file);

            //close the file
            file.close();


        } catch (IOException e) {
            System.out.println("File not found in the ConfigurationReader class.");
            e.printStackTrace();
        }

    }

    public static String getProperty(String keyword){//BURADAKİ KEYWORD :"browser",
        // yani String olarak bunu yazsak dahi bir işlevi var.(configuration.propertiesten alıyor bunu.
        // ve return olarak bize value veriyor.orada browserin karşılığı ne ise onu veriyor.
        return properties.getProperty(keyword);//step 4

    }


}