# TextProApp

This project was developed under the Coursera course [Data Structures and Performance](https://www.coursera.org/learn/data-structures-optimizing-performance?specialization=java-object-oriented) by University of California San Diego. It is a text editor that provides functionality of 
flagging misspelled words as well as suggesting possible corrections for such words. It also includes Markov text generation and Flesch readability score calculation for a given 
piece of text. All these features are developed in Java using efficient data structures like Binary Search Trees, Tries, Hashsets etc.

Here is a sample of how the editor looks.
![Project screenshot](/images/Demo.png)

## Getting started
The following steps will help you in getting a copy of the editor up and running on your local machine for development and testing purposes. 

### Prerequisites
Java-8 should be installed in the system. The editor might not work with Java 9 or above because of the use of the RichTextFX API in the project.

### Installing
To import the project on Eclipse, please follow the steps below:
1. Download and extract the zip file from this repository.
2. Create a new Java project in Eclipse. Copy the src, lib and data folders from the extracted zip to the project directory.
3. Go to project properties and add the richtextfx-fat-0.6.10.jar file to the libraries.
4. To use Java FX libraries which are used for GUI provided by UCSD in Eclipse you must install the e(fx)clipse extension for Eclipse.

### Running
Run the [MainApp.java](/src/application/MainApp.java) file to get the editor running.

## License
This project is licensed under the MIT License. You can see the full license [here](/LICENSE.md).
