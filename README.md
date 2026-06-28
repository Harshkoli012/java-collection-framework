# Java Collection Framework (JCF) Reference Guide

A comprehensive architectural overview and reference guide detailing the Java Collection Framework. This repository serves as a cheat sheet for developers looking to understand core collection interfaces, class hierarchies, performance complexities, and best-practice use cases.

---

## 🏛️ Framework Hierarchy

The Java Collection Framework provides a unified architecture for managing groups of objects. It is divided into two distinct interface trees rooted at the top level:
1. `java.util.Collection` — The root interface for sequential structures (`List`, `Set`, `Queue`).
2. `java.util.Map` — A separate key-value pair map structure (does *not* implement `Collection` but is part of JCF).

### Core Interfaces at a Glance

* **`List`:** An ordered collection that allows duplicate elements. Elements can be accessed by an integer index.
* **`Set`:** A collection that contains **no duplicate elements**. It models the mathematical set abstraction.
* **`Queue`:** A structure designed for holding elements prior to processing (typically FIFO - First-In-First-Out).
* **`Map`:** An object that maps keys to values, preventing duplicate keys.

---

## 📊 Collection Characteristics & Time Complexities

Choosing the right implementation relies heavily on understanding algorithmic efficiency. Below is a breakdown of common collections and their Big-O time complexities:

| Interface | Implementation | Ordering | Duplicates Allowed? | Add / Insertion | Remove | Search / Access |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| **List** | `ArrayList` | Insertion Order | **Yes** | $O(1)$ amortized | $O(n)$ | $O(1)$ by index |
| **List** | `LinkedList` | Insertion Order | **Yes** | $O(1)$ | $O(1)$ | $O(n)$ |
| **Set** | `HashSet` | Unordered | **No** | $O(1)$ | $O(1)$ | $O(1)$ |
| **Set** | `TreeSet` | Natural / Sorted | **No** | $O(\log n)$ | $O(\log n)$ | $O(\log n)$ |
| **Map** | `HashMap` | Unordered | Keys: **No** / Values: **Yes** | $O(1)$ | $O(1)$ | $O(1)$ |
| **Map** | `TreeMap` | Sorted by Key | Keys: **No** / Values: **Yes** | $O(\log n)$ | $O(\log n)$ | $O(\log n)$ |

---

## 💡 Quick Selection Cheat Sheet

Use this practical decision tree when building your applications:

1. **Do you need to store Key-Value pairs?**
   * Yes $\rightarrow$ Use a `Map` (`HashMap` for speed, `TreeMap` if keys must be sorted).
   * No $\rightarrow$ Use a `Collection` interface (Proceed to step 2).

2. **Are duplicate elements allowed?**
   * Yes $\rightarrow$ Use a `List` (`ArrayList` for heavy read operations, `LinkedList` for heavy insert/delete operations at ends).
   * No $\rightarrow$ Use a `Set` (`HashSet` for general use, `LinkedHashSet` to keep insertion order, `TreeSet` for sorting).

3. **Are you processing data in a pipeline (FIFO/LIFO)?**
   * Yes $\rightarrow$ Use a `Queue` or `Deque` (`ArrayDeque` or `PriorityQueue`).

---

## ⚙️ Core Operations Example Code

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. List Example (Ordered, Duplicates allowed)
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java"); // Duplicate
        System.out.println("List: " + list); // Output: [Java, Python, Java]

        // 2. Set Example (Unordered, Unique elements)
        Set<String> set = new HashSet<>(list);
        System.out.println("Set (Unique): " + set); // Output: [Java, Python]

        // 3. Map Example (Key-Value associations)
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Data Structures");
        map.put(2, "Algorithms");
        System.out.println("Map Value for Key 1: " + map.get(1));
    }
}
