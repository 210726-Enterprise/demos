package com.revature;

import java.io.*;

public class Driver {
    public static void main(String[] args) {
        File newFile = new File("week1/FileIO/resources/newFile.txt");
        String userInput = "lorum ipsum (i like sourdough)\n";


        // == compares reference in the stack.
        // .equals() compare the value of two objects


        // obj1.equals(obj) == true ? same value
        // obj1 == obj2 == true ? same object

        //System.out.printf("User Input: %s, %d", userInput, 255);

        //writeToFile(userInput, newFile);
        readFromFile(newFile);
    }

    public static void readFromFile(File file) {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = "";
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(String input, File file){
        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);

            //BufferedWriter bw2 = new BufferedWriter(new FileWriter(newFile));

            //bw.append(userInput);
            bw.write(input);
            //bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
