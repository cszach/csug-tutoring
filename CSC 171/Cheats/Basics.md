:bookmark_tabs: CSC 171 CHEAT SHEET: THE BASICS
===============================================

> Example variables are named `foo` and `bar`.

Table of Content
----------------

<!-- vim-markdown-toc GFM -->

* [Types and Variables](#types-and-variables)
* [Arithmetic](#arithmetic)
* [Control/Branch](#controlbranch)
  * [If statement](#if-statement)
  * [If/else statement](#ifelse-statement)
  * [If/else if statement](#ifelse-if-statement)
  * [Switch](#switch)
  * [Ternary operator](#ternary-operator)
* [Loop](#loop)
  * [While loop](#while-loop)
  * [For loop](#for-loop)
  * [Special for loop](#special-for-loop)
  * [Do/while loop](#dowhile-loop)

<!-- vim-markdown-toc -->

Types and Variables
-------------------

- **`int`**: Integers (−2, −1, 0, 1, 2,…).
- **`boolean`**: `true`/`false`.
- **`char`**: A single character (`'a'`, `'b'`, `'c'`,…).
- **`String`**: A sequence of 0 or more characters (`"love"`, `"computer science"`, `""`).
- **`double`**: Decimals (3.3, —101.35,…).

```java
int foo; // Variable declaration
foo = 3; // Assignment
double bar = 5.5; // Declaration and assignment in one
foo = (int) bar; // Convert a type to another
```

Arithmetic
----------

> Can only be used for primitive data types: `int`, `boolean`, `char`, `double`.

- **`+`**: add
- **`-`**: subtract
- **`*`**: multiply
- **`/`**: divide
- **`%`**: modulo (divide and get remainder)
- **`>`**, **`<`**, **`>=`**, **`<=`**: greater than, less than, greater than or equal to, and less than or equal to, respectively

Control/Branch
--------------

### If statement

```java
if (condition) {
  // These statements run only when condition is true
  statement;
  statement;
  …
}
```

### If/else statement

```java
if (condition) {
  // These statements run only when condition is true
  statement;
  statement;
  …
} else {
  // These statements run only when condition is false
  statement;
  statement;
  …
}
```

### If/else if statement

```java
if (condition1) {
  // These statements run only when condition1 is true
  statement;
  statement;
  …
} else if (condition2) {
  // These statements run only when condition1 is false
  // and condition2 is true
  statement;
  statement;
  …
} else if (condition3) {
  // These statements run only when condition1 and
  // condition2 are both false and condition3 is true
  statement;
  statement;
  …
} else {
  // These statements run only when all conditions above
  // are false
  statement;
  statement;
  …
}
```

### Switch

```java
switch (foo) {

  case value1:
    // Execute these statements if foo is value1
    statement;
    statement;
    …
    break;

  case value2:
    // Execute these statements if foo is value2
    statement;
    statement;
    …
    break;

  case value3:
  case value4:
    // Execute these statements if foo is value3 or value4
    statement;
    statement;
    …

  …

  default:
    // If none of the value is matched,
    // execute these statements
    statement;
    statement;
    …
    break;
}
```

### Ternary operator

```java
// If condition is true, return value1.
// If condition is false, return value2.
int bar;
bar = (condition) ? value1 : value2;
```


Loop
----

### While loop

```java
while (condition) {
  // Execute these statements as long as condition is true.
  // To prevent an infinite loop, make sure the condition
  // turns to false at some point in the statements below.
  statement;
  statement;
  …
}
```

### For loop

```java
for (int i = 0; i < n; i++) {
  // Execute the statements below n times
  statement;
  statement;
  …
}

// In general…
for (statement1; condition; statement2) {
  // Run statement1, and then as long as condition is true,
  // execute these statements below, and run statement2 for
  // every loop
  statement;
  statement;
  …
}
```

### Special for loop

```java
int[] foo = {2, 3, 5, 7, 9, 11};

for (int n: foo) {
  // Execute the statements below for every number in foo
  // You can also access the number as n
  statement;
  statement;
  …
}

// In general…
Bar[] array; …

for (Bar foo: array) {
  // …where Bar is a data type e.g. int, double, String, etc.
  statement;
  statement;
  …
}
```

### Do/while loop

```java
do {
  // Execute these statements first, and then check condition.
  // If condition is true, continue executing the statements
  // again and again until condition is false.
  statement;
  statement;
  …
} while (condition);
```
