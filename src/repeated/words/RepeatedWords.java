/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeated.words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Bhanupro
 */
public class RepeatedWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> words = new ArrayList();
        words.add("AAA");
        words.add("AAA");
        words.add("AAA");
        words.add("BBB");
        words.add("BBB");
        words.add("CC");
        words.add("CC");
        words.add("CC");
        words.add("CC");
        words.add("CC");
        words.add("XXX");
        words.add("XXX");
        words.add("XXX");
        words.add("XXX");
        words.add("QQ");
        words.add("PP");
        //Set<String> unique = new HashSet<>(words);
        Map<String, Integer> unique = new HashMap<>();
        
        for(int i=0;i<words.size();i++){
            String input = words.get(i).toUpperCase();
            if(unique.get(input) != null){
                Integer count = unique.get(input) + 1;
                unique.put(input, count);
                //System.out.println(input);
            }else{
                unique.put(input, 1);
            }
        }
        
        for (int i = 1; i <= 5; i++) {
        int max = -1;
        String maxKey = "bhanu";
        for (String key : unique.keySet()) {
            if (unique.get(key) > max) {
                max = unique.get(key);
                maxKey = key;
            }
        }
        System.out.println(i + ": "+maxKey  + " " + max );
        unique.remove(maxKey);
        }
        
    }
    
}
