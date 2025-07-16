# Armstrong Number Recap (Base Concept):
A number is called Armstrong if:  
- It is equal to the sum of its digits each raised to the power of the number of digits.  
- Example: 153 = 1³ + 5³ + 3³

---

## Armstrong-like Alternative Problems (20 Problem Statements)
### Level 1: Digit Powers & Math Properties
1. **Check if a number is a Narcissistic number.**  
    - (Same as Armstrong, different name; use for explanation or variation.)
1. **Find all 2-digit numbers equal to the sum of the squares of their digits.**
    - Example: 45 → 4² + 5² = 41 (Not valid)
1. **Find all 3-digit numbers equal to the sum of the cubes of their digits.**
    - Variation of Armstrong limited to 3-digit only.
1. **Check if a number is a Disarium number.**
    - Sum of digits powered to their positions.
    - Example: 135 → 1¹ + 3² + 5³ = 135
1. **Find all Disarium numbers between 1 and 500.**
1. **Check if a number is a Harshad number.**
    - Divisible by the sum of its digits.
    - Example: 18 → 1+8 = 9 → 18 % 9 == 0
1. **Find all Harshad numbers between 1 and N.**
1. **Check if a number is a Happy number.**
    - Repeatedly sum squares of digits; ends in 1 → Happy.
    - 19 → 1² + 9² = 82 → 8² + 2² = 68 → ... → 1
1. **Find all Happy numbers between 1 and 100.**
1. **Check if a number is a Kaprekar number.**
    - Square the number → split digits → add → get original number.
    - Example: 45² = 2025 → 20 + 25 = 45
---
### Level 2: Power and Series Logic
1. **Check if a number is equal to the sum of factorials of its digits.**
    - Example: 145 → 1! + 4! + 5! = 145
1. **Find all such "factorial sum" numbers between 1 and 5000.**
1. **Check if a number is a Strong number.**
    - Same as factorial sum; use as alternate naming.
1. **Find all 4-digit numbers where the sum of 4th powers of digits equals the number.**
1. **Check if a number is a Perfect number.**
    - Sum of its proper divisors equals the number.
    - Example: 6 → 1 + 2 + 3 = 6
1. **Check if a number is a Powerful number.**
    - Every prime factor appears with exponent ≥ 2.
1. **Check if a number is a Spy number.**
    - Sum of digits == product of digits.
    - Example: 1124 → 1+1+2+4 = 8, 1×1×2×4 = 8
1. **Check if a number is a Tech number.**
    - Even digits → split in half → square of sum = number.
    - Example: 2025 → 20+25=45 → 45² = 2025
1. **Check if a number is a Palprime.**
    - Palindrome + Prime = Palprime.
    - Example: 131 is palindrome and prime.
1. **Find all 3-digit numbers where digit cube-sum is divisible by the original number.**
    - E.g., 407 → 4³ + 0³ + 7³ = 407 → 407 % 407 == 0
