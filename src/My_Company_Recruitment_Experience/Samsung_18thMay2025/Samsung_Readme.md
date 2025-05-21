# SAMSUNG CODING TEST - 18TH MAY 2025 - EXPERIENCE


## TWO ATTEMPTS CODING TEST - ONSITE - SRI-NOIDA, FOR EXPERIENCED
### PROBLEM 1. DP RELATED QUESTION, BUT IT GAVE TLE. SO IT MIGHT BE EITHER GREEDY OR NEED TO CHECK
* Problem was - Given a truck which can add one or two container in it and send medicine bottle to hospital. Container will have some capacity to store the bottle. 
* Remember you can store exact amount of bottle in the given capacity or bottle will get damaged.
* So you have to find out at what minimum round of truck can it transfer all the bottle to medicine.
* Example (Input)
* N M                   (N = number of container, M = number of bottle of that medicine type)
* [n0, n1, n2, ... nN]  ( n0 = represents the capacity of first container)
* [m0, m1, m2, ... mM]  ( m0 = represents the number of bottle of that medicine type)

* Sample input 1
* 3 4
* [1,2,3,4,2]
* [1,3,5,6,7]
* Note - if the container is large it does not mean it will store all the medicine of all type.
    * It will just at a time store medicine of one type only and that too it must be full
    * Partial filled container will destroy the medicinet bottles as they might get broken.
* Output
* 4
* Means in this below 4 rounds it will transfer all the medicines
* First transfer medicine 1 and 3 as [1,3], 
* Then transfer medicine 5 in two container as[2,3], 
* Then transfer medicine 6 as [4,2], 
* Then transfer medicine 7 as [4,3].

* Sample input 2
* 2 3
* [2,4]
* [1,4,6]
* Output
* -1
* Means it can't transfer all or some of medicines to hospital.
* It can transfer 4 as by using container [4]
* It can transfer 6 as by using container [2,4]
* But it can't transfer 1, as no container with capacity 1. if 1 is getting transfered by 2 or 4, the medicine will get damaged. hence with this stats we can't transfer.

#### MY APPROACH - DP APPROACH
* FORMULA I CAME AT LAST WAS
* DP[N-1]= MATH.MIN(DP[N-1], DP[N-FIRST ELEMENT TAKEN] OR DP[N-SECOND ELEMENT TAKEN] OR DP[N - FIRST AND LAST ELEMENT TAKEN TOGETHER])
* GOT TLE.





### PROBLEM 2 - POSSIBLY SEGMENT TREE OF FENWICK TREE
* Problem - Given array 1 as expected profit and array 2 as investment made,
* You will be given range R
* You have to find the best profit with min range R.

* Sample Input
* N=4 R=2 (N = number of elements, R = min range taken)
* [1,2,3,4]
* [1,1,3,3]

* Output
* 2
* We have got max profit in range R=3 when taken from index 1 to 3
* We will got max profit in range R=4, whent taken from index 0 to 3.
* So our task is find max profit in Range atlest R=2.

#### MY APPROACH - USING PREFIX SUM, BUT GOT TLE
* Looks like it was to be solved either using fenwick or segment tree.


