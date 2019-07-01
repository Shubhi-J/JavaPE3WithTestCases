package com.stackroute.javape3;

public class VowelRemover {
    public String removeVowels(String[] inputPlaces) {
        int i = 0;
        String outputPlace="";
        for (i = 0; i < inputPlaces.length; i++) {
            String place=inputPlaces[i];
            if(place.matches("-?\\d+(\\.\\d+)?")){
                outputPlace="input string is a numeric string";
                return outputPlace;
            }
           // if(!place.matches("a|A|e|E|i|I|o|O|u|U")){
                outputPlace=outputPlace+"place name without vowel at "+i+" "+place.replaceAll("a|e|i|o|u","")+"\n";
           // }
//            else {
//                outputPlace=outputPlace+"place name without vowel at "+i+" "+place.replaceAll("a|A|e|E|i|I|o|O|u|U","")+"\n";
//            }
        }
        return outputPlace;
    }
}

