# Mini Library Manager

A console-based library management application developed in Java. The project models books, members, and loan records while keeping the user interface separate from the application logic.

This project was created to reinforce the concepts covered in Part 6 of the University of Helsinki Java Programming MOOC.

## Features

- Register books and library members
- Prevent duplicate book and member records
- Loan registered books to registered members
- Prevent a book from being loaned more than once
- Return loaned books
- Display books, members, and active loans
- Track the number of books, members, and loans
- Validate unsuccessful loan and return operations

## Testing

The project includes JUnit tests for the main domain classes and library operations.

The tests cover:

- Object equality
- Text representations
- Duplicate prevention
- Successful loan operations
- Rejected loan operations
- Book returns
- Collection counts
- Object references
