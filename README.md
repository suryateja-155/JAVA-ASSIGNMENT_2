<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=7C2D12,C2410C,EA580C&height=220&section=header&text=Java%20Object-Oriented%20Architecture&fontSize=40&fontColor=ffffff&fontAlignY=38&desc=Class%20Hierarchies%2C%20Polymorphic%20Dispatch%20and%20Clean%20OOP%20Design&descSize=16&descAlignY=60&descAlign=50" width="100%" alt="Java Object-Oriented Architecture Banner"/>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java%2017%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Language Java 17+"/>
  <img src="https://img.shields.io/badge/Paradigm-Object-Oriented%20Programming-C2410C?style=for-the-badge" alt="Paradigm Object-Oriented Programming"/>
  <img src="https://img.shields.io/badge/Architecture-Polymorphism%20and%20Inheritance-EA580C?style=for-the-badge" alt="Architecture Polymorphism and Inheritance"/>
  <img src="https://img.shields.io/badge/Status-Verified-10B981?style=for-the-badge" alt="Status Verified"/>
  <img src="https://img.shields.io/badge/License-MIT-FDBA74?style=for-the-badge" alt="License MIT"/>
</p>

---

## Executive Summary / Overview
### Problem Statement & Context
Large-scale software applications require robust structural boundaries to prevent tight coupling and fragile maintenance cycles. Without disciplined Object-Oriented Design (OOD)—including proper encapsulation, abstract base contracts, and dynamic method dispatch—codebases quickly degenerate into spaghetti code that cannot scale.

### Solution Overview
This repository implements a comprehensive suite of **21 Java Object-Oriented Programming (OOP) Modules**. It explores the four foundational pillars of OOP—**Encapsulation, Abstraction, Inheritance, and Polymorphism**—demonstrating constructor overloading, hierarchical inheritance chains, method overriding, and mathematical utilities.

---

## Interactive Table of Contents
- [Executive Summary / Overview](#executive-summary--overview)
- [Key Features & Capabilities](#key-features--capabilities)
- [System Architecture / Pipeline](#system-architecture--pipeline)
- [Tech Stack Breakdown](#tech-stack-breakdown)
- [Reproducible Quickstart & Setup](#reproducible-quickstart--setup)
- [Project Directory Layout](#project-directory-layout)
- [Author & Contributions](#author--contributions)

---

## Key Features & Capabilities
- **Hierarchical Inheritance Trees:** Multi-level class hierarchies modeling real-world abstractions (e.g., `Animal` -> `Domestic` / `WildAnimal`).
- **Dynamic Polymorphism & Overriding:** Subclass runtime method dispatch demonstrating polymorphic behavioral overrides.
- **Encapsulation & Access Invariants:** Proper encapsulation isolating internal mutable state behind access methods.
- **Constructor Overloading:** Robust class instantiation pathways utilizing default, parameterized, and chained constructors.

---

## System Architecture / Pipeline
```mermaid
classDiagram
    class Animal {
        +String name
        +eat()
        +sleep()
    }
    class Domestic {
        +domesticHabits()
    }
    class WildAnimal {
        +huntingHabits()
    }
    class Area {
        +calculateArea()
    }
    class MathOperations {
        +add()
        +multiply()
    }

    Animal <|-- Domestic
    Animal <|-- WildAnimal
```

---

## Tech Stack Breakdown
| Layer | Technology | Details |
| :--- | :--- | :--- |
| **Languages** | Java (JDK 17+) | Strongly-typed object-oriented language |
| **Libraries** | Java Standard Class Library (`java.lang`, `java.util`) | Core collections and string manipulation |
| **Tools** | `javac`, `java`, Eclipse IDE | Bytecode compilation and runtime execution |
| **Architecture** | Classic Object-Oriented Architecture | Four pillars: Encapsulation, Inheritance, Polymorphism, Abstraction |

---

## Reproducible Quickstart & Setup
```bash
# 1. Clone repository
git clone https://github.com/suryateja-155/JAVA-ASSIGNMENT_2.git
cd JAVA-ASSIGNMENT_2

# 2. Compile Java classes
javac *.java

# 3. Execute sample program
java CLASS_Main
```

---

## Project Directory Layout
```text
JAVA-ASSIGNMENT_2/
├── Animal.java           # Base abstract entity for animal hierarchy
├── Domestic.java         # Subclass modeling domestic behaviors
├── WildAnimal.java       # Subclass modeling wild animal behaviors
├── Area.java             # Geometric area calculations and shape contracts
├── ConstructorMain.java  # Constructor overloading and instantiation tests
├── MathOperations.java   # Arithmetic utility library and method overloading
├── Employee.java         # Corporate entity encapsulation model
└── README.md             # Object-oriented architecture and inheritance guide
```

---

## Author & Contributions

**Gettupalli Surya Teja**  
- GitHub Profile: [@suryateja-155](https://github.com/suryateja-155)  
- Portfolio Index: [Gettupalli-Surya-Teja](https://github.com/suryateja-155/Gettupalli-Surya-Teja)

Contributions, issue reports, and feedback are always welcome! Feel free to open an issue or pull request.

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=7C2D12,C2410C,EA580C&height=100&section=footer" width="100%" alt="Footer Banner"/>
</p>
