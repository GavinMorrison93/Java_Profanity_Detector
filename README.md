# Java_Profanity_Detector

This is a program used to analyze inputted files for abusive language.

It is also used to detect potential instances of shouting

Finally it checks for words that tend to crop up in instances of online bullying.

It also classifies the amount of abusive text into into categories of graduated severity ranging from low to very high.

Content can also be added to the list of abusive words by the user.

The approach I took to this assignment was to build the code to perform the work required, and then attach a GUI once that was done. This approach has proved problematic, and as a result I haven't managed to construct a functioning GUI for this assignment apart from the attached JFileChooser. So this assignment has an M, a P but no V. If you would like to see the work I have done attempting to construct a GUI, you will find it all in the Github repository with the latest attempt being called 'GUI.java' I have not submitted any of that work as part of the finished assignment however.

The final code files for the assignment within the Github repository are called:

AbusiveTextContentDetector.java
AbusiveTextContentDetectorControl.java

The program consists of two files, one containing my main class which has 4 attributes and one containing my control class. The 4 attributes are: 

1. 'abusiveWord' which relates to the list of abusive words used for checking purposes.
2. 'wordToBeChecked' which relates to the document being checked.
3. 'checkedForShouting' this is related to the operations around the Shouring check.
4. 'checkedForBullying' this relates to the list of bully words that used for checking purposes.

The Abusive text and Bully Word aspects of the program function primarily by checking one file against another via a series of iterating loops, with the results used to inform the print statements and level of abuse classification.

The library of abusive words I used was essentially the Full List of Bad Words Banned by Google which I edited to cut out repetition of words that were actually contained within other words within the library.

While I was building the programme, I used small files I had put together myself for testing purposes, but when I started used using larger more complex 'real world' files I encountered for the first time the Scunthorpe Problem. This prompted me to think about possible ways around this issue with possibly some means of filtering however, bearing in mind the way that abusive language evolves I thought maybe that might not be the best approach. 

The Shouting check aspect of the program functions simply by checking for words containing more than one capital letter.

The 'real world' file I used to check my program was the first chapter in the novel Trainspotting by Irvine Welsh. I used this as it was the only written document I could think of which contained profuse swearing.

for more detailed information about specific functions, please see comments within the code. 