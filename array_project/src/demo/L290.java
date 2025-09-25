package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L290 {
    
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if(words.length!=pattern.length()){
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            char c = pattern.charAt(i);
            String word = words[i];

            if(map.containsKey(c)){
                // found
                if(map.get(c).equals(word)==false ){
                    return false;
                }
            } else {
                // not found
                // word find -> 
                List<String> list = new ArrayList<>(map.values());
                if(list.size()>0 && list.contains(word)){
                    return false;
                }
                map.put(c, word);
            }
        }
        return true;
    }

}

