/************************************************************************************
 *  Author: Gavin Morrison
 *  Student No: D12124782
 *  Course: DT211C-2
 *  Date: 22.04.17  
 ************************************************************************************/
package com.finalAssignmentCode;

//Main Class for the assignment
public class AbusiveTextContentDetector {

    //Attributes within the Class
    private String abusiveWord;
    private String wordToBeChecked;
    private String checkedForShouting;
    private String checkedForBullying;

    //Constructor
    public AbusiveTextContentDetector(String abusiveWord, String wordToBeChecked, String checkedForShouting, String checkedForBullying)

    {
        //Encapsulation
    	this.abusiveWord = abusiveWord;
        this.wordToBeChecked = wordToBeChecked;
        this.checkedForShouting = checkedForShouting;
        this.checkedForBullying = checkedForBullying;
    }

    //Getters and Setters for the attributes
    public String getWordToBeChecked() {
        return wordToBeChecked;
    }

    public void setWordToBeChecked(String wordToBeChecked) {
        this.wordToBeChecked = wordToBeChecked;
    }

    public String getAbusiveWord() {
        return abusiveWord;
    }

    public void setAbusiveWord(String abusiveWord) {
        this.abusiveWord = abusiveWord;
    }

    public String getCheckedForShouting() {
        return checkedForShouting;
    }

    public void setCheckedForShouting(String checkedForShouting) {
        this.checkedForShouting = checkedForShouting;
    }

    public String getCheckedForBullying() {
        return checkedForBullying;
    }

    public void setCheckedForBullying(String checkedForBullying) {
        this.checkedForBullying = checkedForBullying;
    }

    public String toString()

    //String to String method
    {
        return "Abusive Word: " + this.abusiveWord + "Checked File Result" + this.wordToBeChecked + "Checked for Shouting" + this.checkedForShouting + "Checked for Bullying" + this.checkedForBullying;
    }

}