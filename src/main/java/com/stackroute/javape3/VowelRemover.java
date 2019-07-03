package com.stackroute.javape3;

public class VowelRemover {
    public String removeVowels(String[] inputPlaces) {
        int i = 0;
        String outputPlace="";
        for (i = 0; i < inputPlaces.length; i++) {
            String place=inputPlaces[i];
            // pattern to find if the input string is a numeric string
            if(place.matches("-?\\d+(\\.\\d+)?")){
                outputPlace="input string is a numeric string";
                // if input is a numeric string, throw error message
                return outputPlace;
            }

            // replace all vowels
                outputPlace=outputPlace+"place name without vowel at "+i+" "+place.replaceAll("a|e|i|o|u","")+"\n";
        }
        return outputPlace;
    }
}

