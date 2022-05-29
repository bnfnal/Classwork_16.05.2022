# Classwork_16.05.2022

## Task 1: Word a10n (abbreviation) 
 
### Class:  
                Abbreviator {
### Function:    
                abbreviate(String string) 
 
### Task: 
 
The word i18n is a common abbreviation of internationalization in the developer community, used instead of typing the whole word and trying to spell it correctly. Similarly, a11y is an abbreviation of accessibility.
Write a function that takes a string and turns any and all "words" (see below) within that string of length 4 or greater into an abbreviation, following these rules:
A "word" is a sequence of alphabetical characters. By this definition, any other character like a space or hyphen (eg. "elephant-ride") will split up a series of letters into two words (eg. "elephant" and "ride").
The abbreviated version of the word should have the first letter, then the number of removed characters, then the last letter (eg. "elephant ride" => "e6t r2e").
 
### Examples: 
 
     abbreviate("elephant-rides are really fun!")
     //          ^^^^^^^^*^^^^^*^^^*^^^^^^*^^^*
     // words (^):   "elephant" "rides" "are" "really" "fun"
     //                123456     123     1     1234     1
     // ignore short words:               X              X
     // abbreviate:    "e6t"     "r3s"  "are"  "r4y"   "fun"
     // all non-word characters (*) remain in place
     //                     "-"      " "    " "     " "     "!"
     === "e6t-r3s are r4y fun!"
 
 
### Favorite solution: 

     class Abbreviator 
     {
         static String abbreviate(String string) 
         {
             for (var s : string.split("[^a-zA-Z]")) {
             string = string.replaceFirst(s, s.length() > 3 ? "" + s.charAt(0) + (s.length() - 2) + s.substring(s.length() - 1) : s);
             return string;
         }
       }
     }


## Task 2: Triangular Treasure
 
### Class:  
                Triangular 
### Function:    
                triangular(long n) 
 
### Task: 
 
Triangular numbers are so called because of the equilateral triangular shape that they occupy when laid out as dots. i.e.

1st (1)   2nd (3)    3rd (6)
*          **        ***
           *         **
                     *
You need to return the nth triangular number. You should return 0 for out of range values:

### Examples: 
 
     For example: (Input --> Output)
       0 --> 0
       2 --> 3
       3 --> 6
     -10 --> 0
 
 
### Favorite solution: 

      public class Triangular 
      {
          public static int triangular(int n) 
          {
              return (n <= 0) ? 0 : n * (n + 1) / 2;
          }
      }
