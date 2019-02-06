[![Build Status](https://travis-ci.com/StratfordHS-CS2/lab-19-list-sort-username.svg)](https://travis-ci.com/StratfordHS-CS2/lab-19-list-sort-username)

# Lab 19 - List Sort

## Lab Goal
You will use your knowledge of ArrayLists to perform a basic sorting algorithm on a randomly filled ArrayList.

## Instructions
* Complete the method `randomFill` - This method needs to return an ArrayList filled with 100 random integers between 1 and 100.
* Complete the method `doSort` - This method needs to sort the ArrayList provided using the method described below.
* You do not need to edit the `main` method.
* Complete all javadoc comments with the proper tags.

## Sorting Algorithm
While the list is still unsorted, loop through the entire list comparing adjacent values.  If adjacent values are out of order (the one in front is higher than the one following), then swap them.  If you can make it though the entire list without swapping, then the list is sorted.

## Swapping Algorithm
You can't swap the values of `a` and `b` by saying `a = b` and `b = a`.  Instead, you need to do
```
c = a;
a = b;
b = c;
```

## Notes
* The Checkstyle config url is http://www.daveavis.com/cs/checkstyle_SHS.xml
* Make sure you modify the link at the top of your **Readme.md** to reflect your username if you want the badge at the top to represent the status of your code.

## Grading
* 35 - `randomFill` works
* 55 - `doSort` works using the described algorithm
* 10 - style

Note that these are potential maximums; the computer can only check so much.  If your code passes Checkstyle, but I see non-descriptive variable names, then your style grade will go down.  If your code passes all tests, but I see code that was copied off of the internet or from another student your grade will go *way* down.
