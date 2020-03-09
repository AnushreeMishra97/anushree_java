package day2.assignment2;

public class VowelConsonant
{
    public void checkChar(String ch)
    {
     char character=ch.charAt(0);

       boolean isVowel=false;
        switch(character)
        {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' : isVowel = true;
        }
        if(isVowel == true) {
            System.out.println(character+" is  a Vowel");
        }
        else {
            if((character>='a'&&character<='z')||(character>='A'&&character<='Z'))
                System.out.println(character+" is a Consonant");
            else
                System.out.println("Not Valid input:Give character only");
        }

    }
}
