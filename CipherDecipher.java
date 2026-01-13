public class CipherDecipher{
    
    public static void main(String[]args){
    
        String letters = "Efmhiqm";
        int key = 4; 
        
        char[] encrypted = decipher(letters, key);  
         
        System.out.println(encrypted);
    }
    public static char [] cipher(String letters, int key){
        char[] lettersConverted = letters.toCharArray();
        char[] cipheredLetters = new char [lettersConverted.length];

 
        for(int index = 0; index < lettersConverted.length; index++){
            char character = lettersConverted[index];
            if(character >= 'A' && character <= 'Z'){
                //converting letter to number
               int letterExactPosition = character - 'A';    
               cipheredLetters[index] = (char)((letterExactPosition + key) % 26 + 'A');
                   
            }else if(character >= 'a' && character <= 'z'){
                int letterExactPosition = character - 'a';
                cipheredLetters[index] = (char)((letterExactPosition + key) % 26 + 'a');
                
            }else
                cipheredLetters[index] = character;
        }
        return cipheredLetters;
        
    }

    public static char [] decipher(String letters, int key){
        char[] lettersConverted = letters.toCharArray();
        char[] decipheredLetters = new char [lettersConverted.length];

 
        for(int index = 0; index < lettersConverted.length; index++){
            char character = lettersConverted[index];
            if(character >= 'A' && character <= 'Z'){
                //converting letter to number
               int letterExactPosition = character - 'A';    
               decipheredLetters[index] = (char)((letterExactPosition - key) % 26 + 'A');
                   
            }else if(character >= 'a' && character <= 'z'){
                int letterExactPosition = character - 'a';
                decipheredLetters[index] = (char)((letterExactPosition - key) % 26 + 'a');
                
            }else
                decipheredLetters[index] = character;
        }
        return decipheredLetters;
        
    }


}
