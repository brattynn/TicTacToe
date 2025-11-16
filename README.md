# Tic-Tac-Toe (Java Console Version)

[![Java](https://img.shields.io/badge/Java-17+-red?logo=java&logoColor=white)](https://www.oracle.com/java/)
![Status](https://img.shields.io/badge/Status-In%20Progress-yellow)
![Version](https://img.shields.io/badge/Version-1.0-blue)
![Console App](https://img.shields.io/badge/Platform-Console-lightgrey)
![License](https://img.shields.io/badge/License-MIT-green)

A simple, beginner-friendly implementation of Tic-Tac-Toe built using a **2D array**, **console input**, and clean turn-based game logic.  
This project represents **Version 1** of my Tic-Tac-Toe *learning series*, where I explore different board representations (2D, 1D, Map-based, Bitboards, etc.) as a way to grow my Java skills.

---

## Features

- 3×3 board stored in a **2D `char[][]` array**
- Player turn switching (`X` and `O`)
- Input handling using `Scanner`
- Move validation (prevents playing on occupied spaces)
- Win detection
- Rows
- Columns
- Both diagonals
- Simple console display of the board

---

## Planned Improvements

These will arrive in upcoming versions:

### **Input Safety**
- Prevent the game from crashing when entering:
    - Out-of-range coordinates (`5 5`)
    - Negative numbers
    - Non-numeric input
- Add repeated prompts until valid input is entered.

### **Improved Board Rendering**
- Add row and column labels
- Add separators (`---+---+---`)
- Ensure all three columns display consistently, even when empty.

### **Game Structure Enhancements**
- Move board logic into a dedicated `Board` class
- Add a “play again” option
- Add draw detection
- Clean up printing so the board only displays once per turn

---

## How to Run

1. Clone the repository
2. Open the project in your Java IDE
3. Compile and run **`Main.java`**
4. Follow the console prompts to play

**Input format:**
`2 0`


---

## What I Learned

This first version taught me how to:

- Work with **2D arrays**
- Build a **turn-based game loop**
- Handle input with `Scanner`
- Separate logic into helper methods
- Implement row/column/diagonal win-detection
- Add basic input validation

It also sets the foundation for future versions where I explore:

- 1D array boards
- Map-based boards
- Object-oriented board class
- Immutable board states
- Bitboard representations
- Game AI using Minimax

---

## Why This Project Exists

This isn’t just a Tic-Tac-Toe game — it’s the first stepping stone in a structured series where I practice:

- Data structures
- Game logic
- Clean code design
- Multiple representations of the same system

Each version builds on the last to strengthen my software engineering foundation.

---

## Feedback Welcome

If you'd like to review the code or suggest improvements, feel free to open an issue or PR.  
This is an active learning project, and I’ll continue improving it over time.

---
