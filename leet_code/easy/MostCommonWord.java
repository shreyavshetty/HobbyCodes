package leet_code.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        String paraWords = paragraph.replaceAll("[^a-zA-z0-9]", " ").toLowerCase();
        String[] paraWordsSplit = paraWords.split("\\s+");
        Map<String, Integer> feqMap = new HashMap<>();
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        for(String word : paraWordsSplit)
        {
            
            if(!bannedSet.contains(word))
            {
                //System.out.println(word);
                if(!feqMap.containsKey(word))
                {
                    feqMap.put(word, 0);
                }
                feqMap.put(word, feqMap.get(word)+1);
            }
        }
        int maxFreq = 0;
        String maxStr = "";
        for(String keys : feqMap.keySet())
        {
            if(feqMap.get(keys)>maxFreq)
            {
                maxFreq = feqMap.get(keys);
                maxStr = keys;
            }
        }
        
        return maxStr;
    }
}
