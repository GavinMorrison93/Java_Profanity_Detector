/************************************************************************************
 *  Author: Gavin Morrison
 *  Student No: D12124782
 *  Course: DT211C-2
 *  Date: 22.04.17  
 ************************************************************************************/
package com.finalAssignmentCode;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import java.io.FileWriter;

//Control CLass
public class AbusiveTextContentDetectorControl {

    //Instances of my attributes
    public static ArrayList < String > abusiveWord1 = new ArrayList < String > ();
    public static ArrayList < String > wordToBeChecked1 = new ArrayList < String > ();
    public static ArrayList < String > checkedForShouting1 = new ArrayList < String > ();
    public static ArrayList < String > checkedForBullying1 = new ArrayList < String > ();

    //Main Method
    public static void main(String[] args)

    //First Scanner input (Abusive text list)
    {
        String fileName1 = "full-list-of-bad-words-banned-by-google-txt-file_2013_11_26_04_53_31_867.txt";
        File file1 = new File(fileName1);
        Scanner in1;
        try {
            in1 = new Scanner(file1);
            String line1 = "";

            while (in1.hasNext()) {

                //Inputted file is converted to Lower case, has punctuation and white space removed
                line1 = in1.nextLine();
                String result1 = line1.toLowerCase().replaceAll("[^a-z]+", " ");
                String[] toBeSplit1 = result1.split("\\s");
                for (String newSplit1: toBeSplit1) {
                    String finalSplit1 = newSplit1;
                    abusiveWord1.add(finalSplit1);
                }
            }

            //Jfilechooser to allow user to choose file to be checked.            
            JFileChooser chooser = new JFileChooser();
            int returnValue = chooser.showOpenDialog(null);
            File file = null;
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                file = chooser.getSelectedFile();
            }
            if (file != null) {
                String fileName2 = file.getPath();

                //Second Scanner input (file to be checked)           
                File file2 = new File(fileName2);
                Scanner in2; {
                    in2 = new Scanner(file2);
                    String line2 = "";

                    while (in2.hasNext()) {
                        //Inputted file is converted to Lower case, has punctuation and white space removed
                        line2 = in2.nextLine();
                        String result2 = line2.toLowerCase().replaceAll("[^a-z]+", " ");
                        String[] toBeSplit = result2.split("\\s");
                        for (String newSplit: toBeSplit) {
                            String finalSplit = newSplit;
                            wordToBeChecked1.add(finalSplit);
                        }
                    }
                }

                //Third Scanner input (Shouting Check)
                File file3 = new File(fileName2);
                Scanner in3; {
                    in3 = new Scanner(file3);
                    String line3 = "";

                    //Inputted file has white space removed
                    while (in3.hasNext()) {
                        line3 = in3.nextLine();
                        String[] shoutToBeSplit = line3.split("\\s");
                        for (String newShoutSplit: shoutToBeSplit) {
                            String finalShoutSplit = newShoutSplit;
                            checkedForShouting1.add(finalShoutSplit);
                        }
                    }
                }
                System.out.println("Potential instances of Shouting: ");

                //Loop to check for Shouting
                int x = 0;
                for (String b: checkedForShouting1) {
                    if (b.matches("[A-Z]*")) {
                        if (b.length() > 1)
                            x++;
                        b = b.trim();
                        if (b.length() > 1)
                            System.out.println(b);
                    }
                }
                System.out.println("Amount of Potential Shouting instances found: " + (x));

                //Loop to check for Swearing
                System.out.println("List of abusive content: ");
                int i = 0;
                for (String s: abusiveWord1) {
                    for (String t: wordToBeChecked1) {

                        if (t.contains(s)) {
                            i++;
                            System.out.println(s); //System.out.println(s);	
                        }
                    }
                }
                System.out.println("Amount of potentially abusive words found: " + (i));

                //Grading system based on amount of abusive text found
                if (i >= 1 && i <= 20) {
                    System.out.println("Low level of potentially Abusive content found!");
                }
                if (i >= 21 && i <= 50) {
                    System.out.println("Medium level of potentially Abusive content found!");
                }
                if (i >= 51 && i <= 100) {
                    System.out.println("High level of potentially Abusive content found!");
                }
                if (i >= 101) {
                    System.out.println("Very High level of potentially Abusive content found!");
                }

                //Fifth Scanner input (Bully Word Check)                 
                String fileName5 = "Bully_words_formatted.txt";
                File file5 = new File(fileName5);
                Scanner in5; {
                    in5 = new Scanner(file5);
                    String line5 = "";

                    while (in5.hasNext()) {

                        //Inputted file is converted to Lower case, has punctuation and white space removed
                        line5 = in5.nextLine();
                        String result5 = line5.toLowerCase().replaceAll("[^a-z]+", " ");
                        String[] toBeSplit5 = result5.split("\\s");
                        for (String newSplit5: toBeSplit5) {
                            String finalSplit5 = newSplit5;
                            checkedForBullying1.add(finalSplit5);
                        }
                    }
                }

                System.out.println("List of potential Bully words: ");
                int y = 0;
                for (String r: checkedForBullying1) {
                    for (String t: wordToBeChecked1) {

                        if (t.contains(r)) {
                            y++;
                            System.out.println(r); //System.out.println(s);	
                        }
                    }
                }
                System.out.println("Amount of potentially Bully words found: " + (y));


                //Fourth Scanner to input new words to list of abusive text.
                System.out.print("Please enter your addition to the list: ");
                Scanner in4 = new Scanner(System.in);
                String abusiveText = in4.nextLine();
                FileWriter fWriter = null;
                BufferedWriter writer = null;

                //Filewriter to write to the Abusive Text file.
                try {
                    fWriter = new FileWriter("List1.txt", true);
                    writer = new BufferedWriter(fWriter);
                    writer.write(abusiveText);
                    writer.newLine();
                    writer.close();
                    System.err.println("Your addition to the list was saved! ");
                } catch (Exception e) {
                    System.out.println("Your Addition to the list was not saved!");
                }

                //Closing the Scanners
                in1.close();
                in2.close();
                in3.close();
                in4.close();
                in5.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            e.printStackTrace();
        }
    }
} //End of program 