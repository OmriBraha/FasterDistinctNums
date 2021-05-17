# FasterDistinctNums
A linear-run time algorithm that finds the distinct number in a given range of numbers in an array

Given an array of integers, all in the range from 10 to 10n
The algorithm finds the distinct elements in a linear run-time
The idea is to get from the user an array with size of n, initialize a counter and a boolean array such that every cell in this array will be 'false'.
Then, for every element A[i], we will initialize B[A[i]] as true.
In the end of the last iteration, we will count ( using the counter ) the y times such that B[y]=true. 
The output will be the number of different elements, founded in a linear run-time
