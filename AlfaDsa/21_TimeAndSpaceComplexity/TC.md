# Time and Space complexity

## Time complexity 
- **Time complexity is the time taken by the algorithm to execute each set of instructions.**

## Space complexity

- **Space complexity of an algorithm quantifies the amount of space or memory taken by an algorithm to run as a function of the length of the input.**

- If I use HashMap or ArrayList or other data structure, dose this mean I have made a new space,so the space complexity is linear?

- Time and space complexity depends on lots of things like hardware, operating system, processors, etc. 

<img width="373" alt="image" src="https://user-images.githubusercontent.com/78966839/205916479-24085180-216e-4865-8cc0-19358bda0e3f.png">

## Linear Seach
- **Time for linear Search in worst case will remain same even if our array was sorted**
<img width="761" alt="image" src="https://user-images.githubusercontent.com/78966839/205977352-6e9970cc-a759-41e8-9816-0640f5c839dc.png">


<img width="513" alt="image" src="https://user-images.githubusercontent.com/78966839/205978185-fc5f9e40-693c-4b0c-974c-2b407a794d73.png">

- n⬆️ size Increase Operation⬆️ size is increase in worst case.

## case 2 :- constant Operation

- This is a sorted array so, largest elemnt is present in the end.
- largest - arr[n-1]

<img width="435" alt="image" src="https://user-images.githubusercontent.com/78966839/205979305-733de822-698d-46bb-b1d6-30801a6d648e.png">

### Case 1
- N⬆️ is Increase T⬆️ is Increase 
- Time is function of n

### Case 2
- N⬆️ is increase T is constant.
- Time is constant

<img width="287" alt="image" src="https://user-images.githubusercontent.com/78966839/205980429-f4c9f3ea-0775-40bd-b8f1-56de0ba8e002.png">

### Linear Search graph
<img width="270" alt="image" src="https://user-images.githubusercontent.com/78966839/205981513-d704c00a-d574-4de7-a09c-aaeeca1ad085.png">

<img width="760" alt="image" src="https://user-images.githubusercontent.com/78966839/205981733-22b04b59-6d5a-4f8f-9b70-05e4d23f9210.png">


## 2 Process to find the  value of Time complexity
### Experimental (Not use )

<img width="531" alt="image" src="https://user-images.githubusercontent.com/78966839/205982746-6d4af6c7-fd43-44b7-8d0d-5f16e129ff46.png">

### Theoritical  ( use in Interview)
<img width="651" alt="image" src="https://user-images.githubusercontent.com/78966839/205983422-a88f8c10-8319-4c18-b044-e877d4326c14.png">

- In Liner search linear relaction relaction is found.

## Constant Time Complexity

<img width="621" alt="image" src="https://user-images.githubusercontent.com/78966839/207646991-ac66628e-abfe-4715-969e-a6b39c07b4a2.png">

- Constant o(1)
- **In sorted array allways largest and smallest time complexity is Constant.**


# Big o Notation

<img width="667" alt="image" src="https://user-images.githubusercontent.com/78966839/207657443-9e15323c-3de6-45dc-af31-faff2d7961b9.png">

- We allways try to find **worst case** complexity.

- Big o Notation gives Upper bond result
- ex :- o(n),o(logn),o(n2)

- **Upper Bound:- Time or Input size function max o( )**

- Hear, Max TC is o(n2),code not run lower then the worst case time complexity.

## How to find Tc in Bog o Motation ?
- 1) Ignore constant
- 2) Largest term
<img width="627" alt="image" src="https://user-images.githubusercontent.com/78966839/207660225-84c5466e-3be3-44b2-9258-0a0334dc4739.png">

- Hear a , b  and c are contant.

<img width="471" alt="image" src="https://user-images.githubusercontent.com/78966839/207663317-abf46534-a38a-47cf-b48a-bfb309f2e3a2.png">

# Big Omega Notation
- Big Omega Notation gives Lower Bound Notation.
- Bast case TC

<img width="597" alt="image" src="https://user-images.githubusercontent.com/78966839/207665883-eea97b89-a51b-4655-bb73-649a5bd81fac.png">

- **Bog theta(Θ) :- Average case**

# Common Complexiies

- constant -o(1)
- o(logn) worst the constant
- o(n)- Lenier
- expontial o(2n) worst case
- expontial run smaller input.
- recurshion mostly give expontial value.
- **Input size is small use recurshion . TC -> expontial**

<img width="705" alt="image" src="https://user-images.githubusercontent.com/78966839/207670387-fe6409fa-4bed-4b85-82cf-0b3d2fd8aab2.png">

# Space complexity
- Memory sore in 2 type
- 1) Heap :- In Heap sore Object location
- 2) Stack :- function call

<img width="641" alt="image" src="https://user-images.githubusercontent.com/78966839/207682944-df4fb733-671f-484f-8899-786b49971800.png">

<img width="730" alt="image" src="https://user-images.githubusercontent.com/78966839/207686349-16f2f214-75db-4788-97a2-f2433c921136.png">

- Auxiliary space means Extra space
- Space complixity most of time Auxilary.
- In space complexity Marge sort is worst as compair to Quick sort
- Most Time is Priority.

# Theoretical Analusis
<img width="448" alt="image" src="https://user-images.githubusercontent.com/78966839/207834989-5f1314dd-646f-4fab-99e4-40140ac52bf8.png">

## Simple Loop Analysis

- n -> Input size
- Constant is Ignore

<img width="717" alt="image" src="https://user-images.githubusercontent.com/78966839/207836944-cb987913-da94-4ae6-9f84-9cb873074263.png">


# Nested loop1 Analysis

<img width="719" alt="image" src="https://user-images.githubusercontent.com/78966839/207847662-ec6fda60-659c-45e9-809a-2f85886a40cb.png">

<img width="712" alt="image" src="https://user-images.githubusercontent.com/78966839/207848335-57a1a8b1-ed49-4385-b62e-875dfa39f25f.png">


# Nested Loop2 Analysis

<img width="785" alt="image" src="https://user-images.githubusercontent.com/78966839/207841056-39570f35-78da-476c-8bee-1fbfcba627b7.png">

## How we think
- Hear,Outer loop run wher to where i =0 to n
- Inner loop run 0 to i
- First time 0 , second time 1 run up to n-1
- Ap series , In ap series T.c n*2  so, tc is o(n*2)

<img width="764" alt="image" src="https://user-images.githubusercontent.com/78966839/207841921-eed2aaaa-48be-4c96-937a-f3d28d12f91a.png">

# Nested loop 3 Analysis
- we look the jump Opter loop jump n/k time's
<img width="712" alt="image" src="https://user-images.githubusercontent.com/78966839/207856054-9a95ccde-dd2b-4ece-b7d9-39ecd9dcf642.png">

# Babble sort Analysis

-  Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order.

<img width="717" alt="image" src="https://user-images.githubusercontent.com/78966839/208031934-107b6bcd-88f8-4395-91eb-7cc7b79d19c1.png">

### 2nd approch
<img width="713" alt="image" src="https://user-images.githubusercontent.com/78966839/208032183-220b39a9-efbc-4d1f-acb0-0a8ef8bb6507.png">

# Babble sort Analysis Bast case

- In Base same o(n*2)
- if the array is already sorted Outer loop and inner loop performing task so T.C is not change.
- we use Optimize Babble sort.

<img width="717" alt="image" src="https://user-images.githubusercontent.com/78966839/208033191-6e1614d0-d5ac-4b17-b83f-551fe7ad7a7a.png">
<img width="254" alt="image" src="https://user-images.githubusercontent.com/78966839/208033688-9c3422f5-64ad-477b-8e05-6ff546b272c3.png">


# Optimize Babble sort

<img width="708" alt="image" src="https://user-images.githubusercontent.com/78966839/208035199-7505584d-e38e-4dd8-a3e8-1fd9c78d9008.png">

---
# Binary Search

-Binary Search is a searching algorithm used in a sorted array by repeatedly dividing the search interval in half.

<img width="777" alt="image" src="https://user-images.githubusercontent.com/78966839/209475038-c749eba8-d38c-4312-b61b-c03dd75d8e82.png">

- for the big input size Binary search Good.

<img width="772" alt="image" src="https://user-images.githubusercontent.com/78966839/209475243-2c0d6edc-41c8-48c1-a160-8828bc65ae7e.png">

- Binary Search is **Efficent**


<img width="457" alt="image" src="https://user-images.githubusercontent.com/78966839/209475346-e0e3607a-6fb0-4807-a70c-bb7a61b642e6.png">

### Mathmaticaly Binary Search

<img width="493" alt="image" src="https://user-images.githubusercontent.com/78966839/209475435-55729892-d893-4de6-a45a-fa1f591bda0b.png">

# Recursive Algorithms

<img width="742" alt="image" src="https://user-images.githubusercontent.com/78966839/209476059-e23e9397-76f4-427c-894e-8b485accbf0d.png">


## Recurshion (factorial visualization)

<img width="720" alt="image" src="https://user-images.githubusercontent.com/78966839/209476347-153379c3-d6cf-427d-b5c0-ecb650fe2f87.png">

## Time Complexity
<img width="472" alt="image" src="https://user-images.githubusercontent.com/78966839/209477033-4ce7d7e3-714d-4f38-8838-944343ecd444.png">

## Space complexity

<img width="335" alt="image" src="https://user-images.githubusercontent.com/78966839/209477125-41b9c895-61df-41a5-8692-8a276300bbb3.png">

## Factorial T.C and S.C

<img width="528" alt="image" src="https://user-images.githubusercontent.com/78966839/209477166-a6e9d2fc-cd8d-4ff2-b832-504080b47d93.png">

# Sum of n (Recurshion) 

- Stack and Tree Analysis

<img width="665" alt="image" src="https://user-images.githubusercontent.com/78966839/209478346-b34e8be6-0183-4668-b449-5109ae9d4969.png">

## Time Complexity
<img width="636" alt="image" src="https://user-images.githubusercontent.com/78966839/209478420-e4e95646-936b-496d-a1f1-7297b24a5de4.png">

## space Complexity

<img width="203" alt="image" src="https://user-images.githubusercontent.com/78966839/209478463-5cb0c3a1-e334-42f4-bc69-6c27a74ca769.png">


<img width="206" alt="image" src="https://user-images.githubusercontent.com/78966839/209478479-48120f0c-1d96-4874-bfa4-2674986e48b9.png">

--- 

# Fibonacci Anallysis

<img width="716" alt="image" src="https://user-images.githubusercontent.com/78966839/209512281-915716a5-267e-4de8-9d7f-0d16df45b3a0.png">


## Treee analysis
<img width="679" alt="image" src="https://user-images.githubusercontent.com/78966839/209513167-24557307-adb0-43ce-86eb-8b9ff5301be4.png">

<img width="229" alt="image" src="https://user-images.githubusercontent.com/78966839/209513250-809d0f8c-5b56-4dce-b6d1-79cd487c5cf3.png">

<img width="322" alt="image" src="https://user-images.githubusercontent.com/78966839/209513348-13ab0be6-dac6-471d-b3de-a6007e57a21f.png">

## T.C AND S.C COMPLEXITY OF FIBONACCI

<img width="520" alt="image" src="https://user-images.githubusercontent.com/78966839/209513542-88458adb-e9a3-4f14-8211-d8fd67690518.png">






