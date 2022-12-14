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












