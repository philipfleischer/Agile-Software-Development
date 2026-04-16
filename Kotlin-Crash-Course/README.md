# Kotlin Crash Course Practice Project

A structured Kotlin practice project built while working through a Kotlin crash course.
The goal of this project was not just to “finish the tutorial”, but to actively rewrite, clean up, and organize the code so it became easier to understand, easier to review later, and more useful for exam practice and portfolio use.

## Purpose

This project was created to strengthen my understanding of core Kotlin concepts through hands-on coding.
Instead of keeping the original tutorial-style files as short, unclear snippets, I refactored the code into clearer examples with better naming, better comments, and safer structure.

The result is a collection of small, focused Kotlin files that demonstrate both the syntax and the reasoning behind central language features.

## Topics covered

The project covers the following Kotlin topics:

- variables and basic types
- arithmetic, comparison, and logical operators
- console input
- nullability and null-safe operators
- `if` conditions and `when` expressions
- exceptions and `try/catch`
- arrays and lists
- loops
- normal functions
- extension functions
- function parameters and default values
- lambda functions
- classes and data classes
- interfaces
- abstract classes
- sealed classes and sealed interfaces
- enum classes
- objects and singletons
- generics
- higher-order functions
- simple `Result`-style error modeling

## Project structure

The original files were named `Main1.kt`, `Main2.kt`, ..., `Main9.kt`.
These were renamed and reorganized into clearer topic-based files:

- `BasicsAndInputDemo.kt`
- `ArraysLoopsAndStringsDemo.kt`
- `FunctionsExtensionsAndLambdasDemo.kt`
- `ClassesDataClassesAndInterfacesDemo.kt`
- `AbstractClassesDemo.kt`
- `SealedTypesDemo.kt`
- `EnumsDemo.kt`
- `ObjectsAndSingletonsDemo.kt`
- `GenericsAndResultTypesDemo.kt`

A separate runner file can be used to test individual demos without causing naming conflicts.

## Why I changed the original code

The original tutorial code worked as a learning starting point, but it had some weaknesses:

- very generic function names like `func1`, `funnc2`, `fu3`
- multiple `main()` functions across files
- repeated top-level function names that would cause redeclaration issues
- comments that mostly described *what* happened, but not *why*
- some examples were too rough or unclear to be useful later for revision
- some unsafe or less clear coding patterns that I wanted to improve

Since I wanted this repository to be useful for:
1. exam revision,
2. long-term Kotlin reference,
3. and portfolio presentation,

I decided to rewrite the code into a more maintainable and readable form.

## Refactoring and improvements made

### 1. Clearer file names
The original numbered file names were replaced with descriptive names based on topic.
This makes the project much easier to navigate and review later.

### 2. Better function names
Functions were renamed from vague names like `func1()` and `funnc7()` to descriptive names such as:

- `demoArithmeticOperators()`
- `demoReadIntAndCheckEvenSafeWithElvis()`
- `demoMutableListRecommended()`
- `demoLambdasAndFilter()`

This makes the intent of each example immediately obvious.

### 3. Removed top-level naming conflicts
Because all files are in the same package/folder, Kotlin top-level declarations must have unique names.
I rewrote duplicated names like `main`, `maxArea`, and `sumAreas` so the project compiles cleanly without redeclaration problems.

### 4. Better comments for learning
The comments were rewritten to support understanding rather than just describing output.
The focus is on:

- why something works
- what Kotlin feature is being shown
- when one approach is safer or cleaner than another
- how different language features relate to each other

### 5. Safer code examples
Some examples were adjusted to avoid unsafe patterns where possible, or at least to explain them clearly.

Examples:
- safer parsing with `toIntOrNull()`
- clearer null-checking
- reduced use of risky assertions
- more explicit handling of invalid input

### 6. More portfolio-friendly structure
Instead of looking like raw tutorial leftovers, the code now reads more like a small educational Kotlin reference project.
That makes it much better suited for GitHub and portfolio presentation.

## What I learned

This project helped reinforce both Kotlin syntax and general software quality habits.

Some key takeaways:

- Good naming matters a lot for readability.
- Short tutorial code often needs restructuring before it becomes reusable.
- Kotlin’s null-safety features are one of its strongest practical advantages.
- Top-level functions across multiple files need careful naming when kept in one package.
- Refactoring code for clarity is a useful skill on its own, not just something you do after a project is “done”.

## Example concepts demonstrated

A few concrete examples included in the project:

- checking user input safely with `toIntOrNull()`
- reversing strings with both normal functions and extension functions
- building custom filtering functions with lambdas
- comparing regular classes and data classes
- using interfaces and abstract classes for shared behavior
- showing the benefit of sealed hierarchies in `when` expressions
- using enums for fixed sets of values
- using `object` for singleton-style definitions
- writing generic list utilities
- modeling success/failure states with sealed result types

## Who this project is for

This repository is useful for:

- beginners learning Kotlin
- students revising Kotlin before an exam
- anyone who wants small, focused examples of Kotlin language features
- recruiters or reviewers who want to see a structured learning project with refactoring and code cleanup

## How to run

Open the project in IntelliJ IDEA and run a chosen demo function from a dedicated runner file, for example:

```kotlin
fun main() {
    demoGenericsAndHigherOrderFunctions()
}
```
