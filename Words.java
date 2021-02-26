//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ryan Paik

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;

	public Words(String[] wordList)
	{
    words = new ArrayList<Word>();
    for (String str: wordList)
    {
      Word currentWord = new Word(str);
      words.add(currentWord);
    }
	}

	public int countWordsWithXChars(int size)
	{
    //declare int variable called count as 0
		int count=0;
    //create a for each loop that goes thorugh the ArrayList
    for(Word currentWord: words)
    {
      //use an if statement to check if the length of current word is equal to the size of the parameter
      if (currentWord.getLength() == size)
      {
        //increment count
        count++;
      }
    }
    //return count
		return count;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
    //declare int vowSum as 0
    int vowSum = 0;
    //Create a for loop that iterates through array going backwards
    for (int i = words.size() - 1; i >= 0; i--)
    {
      //use an if statement to check if the length of the current word is equal to the size of the parameter
      Word currentWord = words.get(i);
      if (currentWord.getLength() == size)
      {
        //add the vowel count to the sum
        vowSum += currentWord.getNumVowels();
        //remove the current element from the ArrayList
        words.remove(i);
      }
    }
    //return vowSum
		return vowSum;
	}

	public int countWordsWithXVowels(int numVowels)
	{
    //declare int variable count as 0
		int count=0;
    //Create a for each loop that iterates through words
    for(Word currentWord: words)
    {
      //use an if statement to check if the number of vowels returned is equal to the numVowels parameter
      if (currentWord.getNumVowels() == numVowels)
      {
        //increment count
        count++;
      }
    }
    //return count
		return count;
	}
	
	//add in a toString
  public String toString()
  {
    return words.toString();
  }

}