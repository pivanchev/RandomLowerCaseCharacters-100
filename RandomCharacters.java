/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomcharacters;




    
public class RandomCharacters {
    
    public static char getRandomCharacter(char ch1,char ch2){
    return (char)(ch1+Math.random()*(ch2-ch1+1));
    }
       
    public static char getRandomLowerCaseLetter(){
    return getRandomCharacter('a','z');
    }
    
    
    public static void main(String[] args) {
        
        final int NUMBER_OF_CHARS=100;
        final int CHARS_PER_LINE=20;
        
        for(int i=0;i<NUMBER_OF_CHARS;i++) {       
        char ch=RandomCharacters.getRandomLowerCaseLetter();
        
        if((i+1)%CHARS_PER_LINE==0){
            System.out.println(ch);
        }else
            System.out.print(ch);
        }     
                    
    }
    
    }
    
