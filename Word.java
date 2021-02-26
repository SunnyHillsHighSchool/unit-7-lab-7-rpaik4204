//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ryan Paik

import static java.lang.System.*;
import java.util.*;
public class Word
{
   private static List<Character> vowels = Arrays.asList('A','E','I','O','U','a','e','i','o','u');   	
   
   //add an instance variable
  private String s;
	//create 2 constructors
	public Word()
  {
    s = "";
  }

  public Word(String str)
  {
    s = str;
  }

  //setter method
  public void setWord(String str)
  {
    s = str;
  }

  //getter method
  public String getWord()
  {
    return s;
  }
  
  //getNumVowels
  public int getNumVowels()
  {
    //declare int variable count and intialize it to 0
    int count = 0;
    //create a for loop that iterates through the word/string
    for(int i = 0; i < s.length(); i++)
    {
      //use .contains method to check if the word contains the vowels at character i
      if (vowels.contains(s.charAt(i)))
      {
        //increase count by 1
        count++;
      }
    }
    return count;
  }
  
  //getLength
  public int getLength()
  {
    //declare int variable called length
    int length = 0;
    //length is equal to the length of the string
    length = s.length();
    //return length
    return length;
  }

	//create a toString method
  public String toString()
  {
    return "" + s;
  }
}