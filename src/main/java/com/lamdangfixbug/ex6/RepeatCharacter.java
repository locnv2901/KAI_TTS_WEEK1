package com.lamdangfixbug.ex6;

import com.lamdangfixbug.utils.Utils;

import java.util.HashMap;
import java.util.Map;

public class RepeatCharacter {
    public static void main(String[] args) {
        getStringAndPrintRepeatCharacter();
    }

    public static Map<Character,Integer> repeatCharacter(String str){
        Map<Character,Integer> map = new HashMap<>();
        str = str.toLowerCase().replace(" ","");
        for(int i=0;i<str.length();i++){
           map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        return map;
    }

    public static void getStringAndPrintRepeatCharacter(){
        String input = Utils.repeatInputWhenInvalid("Enter a string: ");
        Map<Character,Integer> res = repeatCharacter(input);
        for (Map.Entry<Character,Integer> entry : res.entrySet()) {
            System.out.print(entry.getKey() + " : " + entry.getValue() + "; ");
        }
    }
}
