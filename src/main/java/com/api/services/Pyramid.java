package com.api.services;
import java.util.Arrays;
import org.springframework.stereotype.Service;

@Service
public class Pyramid {
	/**
	 * 
	 * @param input it is a string coming from 
	 * @return
	 */
	public boolean isPyramidSequence(String input) {
        if( input.length() == 0)
			return false;
		
		boolean result = false;
		int[] count = new int[26];
		for(char currentCharacter : input.toLowerCase().toCharArray()) {
			count[currentCharacter - 'a']++;
		}
        
        Arrays.sort(count);
        
        for(int i = 0; i < 26; i++){
            if(count[i] == 0) {
                continue;
            } else {
                if(count[i]-1 == count[i-1]) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }

		return result;
	}
}
