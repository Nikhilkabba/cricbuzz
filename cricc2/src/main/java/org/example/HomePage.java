package org.example;

import acko.utilities.ObjectRepositoryLoader;
import acko.utilities.PropertiesFileUtility;

import java.util.*;
import java.lang.*;

public class HomePage extends CommonPage {
    HashMap<String, HashMap<String, String>> homePageElement = null;
    public HashMap<String, String> config = null;

    public HomePage() {
        try {
            config = PropertiesFileUtility.getConfigData();
            this.homePageElement = new ObjectRepositoryLoader().getObjectRepository("HomePage.xml");
        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public boolean clickOnarchives() throws Exception {
        boolean isDone = false;
        try {
            driver.click(homePageElement.get("archivesButton"));
            isDone = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isDone;

    }
    public boolean clickOnyear() throws Exception {
        boolean isDone = false;
        try {
            driver.click(homePageElement.get("yearButton"));
            isDone = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isDone;

    }
    public boolean clickOnmatch() throws Exception {
        boolean isDone = false;
        try {
            driver.click(homePageElement.get("matchButton"));
            isDone = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isDone;

    }
    public boolean clickOnindia() throws Exception {
        boolean isDone = false;
        try {
            driver.click(homePageElement.get("indiaButton"));
            isDone = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isDone;

    }
    public boolean clickOnscore() throws Exception {
        boolean isDone = false;
        try {
            driver.click(homePageElement.get("scoreButton"));
            isDone = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isDone;

    }
    public boolean addScore() throws Exception{
        int sum = 0;
        try{
            for(int i=1;i<=10;i++) {
                String num = driver.getText(homePageElement.get("runAdd"+Integer.toString(i)));
                int value = Integer.parseInt(num);
                System.out.println(value);
                sum += value;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        int num = Integer.parseInt(driver.getText(homePageElement.get("totalScore")));
        System.out.println(sum);
        System.out.println(num);
        return sum == num ? true:false;
    }
}
