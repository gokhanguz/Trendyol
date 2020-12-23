package com.Trendyol.tests;

import java.io.*;

public class WriteAndReadFile {
    public static void main(String[] args) throws IOException {
        //Create File In D: Driver.
        String TestFile = "D:\\temp.txt";
        File FC = new File(TestFile);//Created object of java File class.
        FC.createNewFile();//Create file.

        //Writing In to file.
        //Create Object of java FileWriter and BufferedWriter class.
        FileWriter FW = new FileWriter(TestFile);
        BufferedWriter BW = new BufferedWriter(FW);
        BW.write("This Is First Line."); //Writing In To File.
        BW.newLine();//To write next string on new line.
        BW.write("This Is Second Line."); //Writing In To File.
        BW.close();


        //Reading from file.
        //Create Object of java FileReader and BufferedReader class.
        FileReader FR = new FileReader(TestFile);
        BufferedReader BR = new BufferedReader(FR);
        String Content = "";

        //Loop to read all lines one by one from file and print It.
        while((Content = BR.readLine())!= null){
            System.out.println(Content);
        }
    }
}
