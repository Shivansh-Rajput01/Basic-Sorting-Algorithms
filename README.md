# Sorting Algorithms in Java  

## Description  
This repository contains implementations of fundamental sorting algorithms in Java. These algorithms form the backbone of many computer science concepts and are essential for understanding data structure and algorithm design.  

The repository includes:  
- **Bubble Sort**  
- **Selection Sort**  
- **Insertion Sort**  
- **Count Sort**  

Each algorithm is implemented with clarity and simplicity, making it suitable for beginners and developers looking to revisit the basics of sorting.  

---

## Algorithms Overview  

### 1. Bubble Sort  
- Repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.  
- **Time Complexity**: O(n²)  
- **Space Complexity**: O(1)  

### 2. Selection Sort  
- Selects the smallest element from the unsorted portion and places it at the beginning.  
- **Time Complexity**: O(n²)  
- **Space Complexity**: O(1)  

### 3. Insertion Sort  
- Builds the sorted array one element at a time by inserting elements into their correct position.  
- **Time Complexity**: O(n²) (average case)  
- **Space Complexity**: O(1)  

### 4. Count Sort  
- Counts the occurrences of each element and uses the count to place elements in the sorted order.  
- **Time Complexity**: O(n+k)  
- **Space Complexity**: O(k), where k is the range of the input values.  

---

## Folder Structure  
root
│
├── src/
│ ├── BubbleSort.java
│ ├── SelectionSort.java
│ ├── InsertionSort.java
│ ├── CountSort.java
│
├── README.md
