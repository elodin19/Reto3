package com.retos;

import java.io.*;

public class Name {

    public static String[] splitName(String fullName){
        return fullName.split(" ");
    }

    public static boolean isSurename(String[] nameParts){

        try {
            FileReader fileReader = new FileReader(new File("nombres.txt"));
            BufferedReader buffer = new BufferedReader(fileReader);
            String line;

            while ((line = buffer.readLine()) != null){
                if (line.equalsIgnoreCase(nameParts[1])) {
                    buffer.close();
                    return false;
                }
            }

            buffer.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        return true;
    }
}
