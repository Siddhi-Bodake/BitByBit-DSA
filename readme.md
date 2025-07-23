# 🧠 ArrayBasics in Java

Welcome to the **ArrayBasics** program — a simple yet foundational Java program that teaches you how to **take user input in arrays**, store it, and print it back.

## ✨ What This Program Does

This program demonstrates:
- 📥 How to take user input using `Scanner`
- 🗃️ Storing elements in an array
- 🔁 Looping through the array using a `for-each` loop
- 📤 Displaying the array elements

---

## 🧾 Code Summary

```java
int[] arr = new int[5];
➡️ Creates an array of 5 integers.


for (int i = 0; i < arr.length; i++) {
    arr[i] = sc.nextInt();
}
➡️ Takes 5 integers from the user and stores them in the array.


for (int num : arr) {
    System.out.println(num);
}
➡️ Prints each value using a for-each loop.

🛠️ How to Run
Make sure you have Java installed. Then:


javac ArrayBasics.java
java ArrayBasics
Input Example:


Enter 5 integers:
10 20 30 40 50
Output:


You entered:
10
20
30
40
50
🤓 Why This Matters
Understanding how arrays work is a key concept in DSA (Data Structures and Algorithms). This simple program is your first step toward:

Building sorting/searching algorithms

Learning memory structures

Writing optimized solutions in Java

💡 Bonus Tip
Try modifying the array size or the input method. You could:

Accept size dynamically

Store strings or floats

Reverse the array during output

📁 File Structure

📦 ArrayBasics
 └── 🧾 ArrayBasics.java
 └── 📄 README.md
