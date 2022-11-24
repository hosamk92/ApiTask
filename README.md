# Backend Task


## First Task 
Make a GET api that have two parameters, start number and the end number and should return the count of all numbersexcept numbers with a 5 in it. The start and the end number are both inclusive!.

start_number < end_number  
Both numbers can be also negative!  
The end number may be a very big integer value like 10^9  

Examples:

- 1, 9 -> 1,2,3,4,6,7,8,9 -> Result 8   
- 4, 17 -> 4,6,7,8,9,10,11,12,13,14,16,17 -> Result 12   
- 40, 66 -> 40,41,42,43,44,46,47,48,49,60,61,62,63,64,66 -> Result 15   


## Second Task 
GET api that have one parameter named input_string. that have the alphabetic string you should return the index of this string.   
index sequence will be like that A=>1, B=>2 ..... , Z=>26, AA=>27, AB=>28 ...... , AZ=>52 , BA=>53 , BB=>54 ..... , BZ => 78 and so on.


Examples:

- "BFG" -> Result 1515   
- "AAA" -> Result 703   
- "AZA" -> Result 1353   
- "ABB" -> Result 730    


## Third Task 
You are given an array Q of N elements. Each element In array Q represent an integer number X. 
The goal is for each element X in the array we need to minimize the number of steps required in order to reduce this number to zero

You can perform each step in any of the 2 operations on X in each move:    
  1: If we take 2 integers a and b where (X == a * b) And (a != 1, b != 1) then we can change X = max (a, b)    
  2: Decrease the value of X by 1.   

Determine the minimum number of moves required to reduce the value of X to 0.



## Testing
- Run `mvn clean test`
