# TextProApp

This project was developed under the Coursera course [Data Structures and Performance](https://www.coursera.org/learn/data-structures-optimizing-performance?specialization=java-object-oriented) by University of California San Diego. It is an advanced text editor that uses a variety of data structures to implement following features: 
* Flesch Index - A score of the readability of input text. Higher the score, easier the text is to read.
* Markov Text Generator - It generates a text with specified number of words bases on a sample text.
* Spell-checker - It highlights the misspelled words in the input text.
* Auto-complete - It can be used to give predictions for a word before it is completed.
* Spelling correction - It provides suggestions to correct the misspelled words.

The data structures used are:
* Arrays
* Linked Lists
* Binary Search Trees
* Tries
* Hash Maps

The sketch UI code is provided as part of the course. The [RichTextFX API](https://github.com/FXMisc/RichTextFX) is used for the implementation of the text area in the application.

Here is a sample of the editor.

![Project screenshot](/images/Demo.png)

## Getting started
The following steps will help you in getting a copy of the editor up and running on your local machine for development and testing purposes. 

### Prerequisites
* Eclipse IDE
* Java 8
* Java FX

### Setup
1. Clone the repository
```
git clone https://github.com/amitpant14/TextProApp
```
2. Import the project in eclipse using following steps:
* Create a new Java Project in your workspace.
* Go to File -> Import.
* Select 'File System'
* Browse to the cloned directory and set it as the root directory.

### Running
Run the [MainApp.java](/src/application/MainApp.java) file to get the editor running.

You are free to use any other IDE or to manually compile and run the app.

## License
This project is licensed under the MIT License. You can see the full license [here](/LICENSE.md).
