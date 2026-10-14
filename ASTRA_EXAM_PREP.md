# 📚 ASTRA EXAM PREP — SE101 Java Final Lab Exam
> เอกสารนี้สร้างขึ้นเพื่อป้อน logic และงานต่างๆ ให้ Astra AI ใช้เตรียมสอบ
> วิชา: 953101 Computers and Programming | ภาษา: Java

---

## ส่วน A — Exam Pattern Analysis

### A1. รูปแบบโจทย์สอบที่พบ (จาก Example-FLabExam.pdf)

โจทย์สอบแต่ละข้อมักมีโครงสร้างแบบนี้:

```
(หัวข้อ) — ชื่อโปรแกรม
คำอธิบาย 2-3 ประโยค บอกว่าโปรแกรมทำอะไร
เงื่อนไข / สูตร / ตาราง
ตัวอย่าง input/output
```

**3 Pattern หลักที่ออกสอบ:**

| # | Pattern | โจทย์ตัวอย่าง | องค์ประกอบหลัก |
|---|---|---|---|
| 1 | **Loop + Sentinel + Statistics** | Temperature Converter with Statistics | while loop, sentinel (-999), accumulator, max tracker |
| 2 | **Method + Validation + Repeat** | Shipping Cost Calculator | method, if-else validation, while repeat |
| 3 | **Array + Multi-stat Report** | Weekly Rainfall Report | array, sum, avg, filter, argmax |

### A2. Output Format ที่ต้องจำ

```java
// ทศนิยม 2 ตำแหน่ง
System.out.printf("%.2f", value);

// จัดซ้าย กว้าง 10 ตัวอักษร
System.out.printf("%-10s", label);

// จัดขวา กว้าง 5 ตัวอักษร
System.out.printf("%5d", num);

// ขึ้นบรรทัดใหม่ใน printf
System.out.printf("...%n");   // หรือ "\n"
```

### A3. จุดที่มักพลาดในสอบ

1. **off-by-one** — `i < n` ✅ vs `i <= n` ❌ (array index ต้องใช้ `< length`)
2. **sentinel loop** — เช็ค sentinel *ก่อน* ทำ logic อื่น
3. **average** — ต้อง cast เป็น `double`: `(double) sum / n` ✅ vs `sum / n` ❌
4. **min/max init** — `int min = arr[0]` ✅ (ไม่ใช่ 0 หรือ Integer.MAX_VALUE เพราะค่าอาจเป็นลบ)
5. **pass-by-value** — primitive types (int, double) ไม่เปลี่ยนค่าต้นทาง แต่ Array เปลี่ยนได้
6. **Scanner สร้างซ้ำ** — สร้างครั้งเดียว ส่ง parameter ถ้าต้องการ

---

## ส่วน B — Concept Quick Reference

### B1. While Loop

```java
// PATTERN: Sentinel-controlled
Scanner sc = new Scanner(System.in);
double val;
int count = 0;
double highest = Double.MIN_VALUE; // หรือ -999 ถ้ารู้ range

while (true) {
    System.out.print("Enter value (-999 to quit): ");
    val = sc.nextDouble();
    if (val == -999) break;        // ← sentinel check ก่อนเสมอ

    count++;
    if (val > highest) highest = val;
    // ... process val ...
}
System.out.println("Count: " + count);
System.out.printf("Highest: %.2f%n", highest);
```

```java
// PATTERN: do-while (ทำอย่างน้อย 1 รอบ)
do {
    // read and process
} while (condition);
```

### B2. For Loop

```java
// Standard for loop
for (int i = 0; i < n; i++) { }

// Two-variable (เช่น ตาราง kg/lb คู่ขนาน)
for (int kg = 1, lb = 20; kg <= 199; kg += 2, lb += 5) { }

// Nested (Pyramid, Multiplication Table)
for (int row = 1; row <= n; row++) {
    for (int col = 1; col <= row; col++) {
        // ...
    }
    System.out.println();
}
```

### B3. Methods

```java
// Value-returning method
public static double celsiusToF(double c) {
    return (9.0 / 5) * c + 32;
}

// void method (ไม่ return)
public static void printBox(String msg, int width) {
    // print to console only
}

// Method signature เรียกใช้
double f = celsiusToF(100);      // value-returning: เก็บค่า
printBox("Hello", 20);           // void: เรียกได้เลย
```

**Pass-by-value vs Pass-by-reference:**
```java
// Primitive → pass-by-value (ค่าต้นทางไม่เปลี่ยน)
int x = 5;
modify(x);       // x ยังเป็น 5

// Array → pass-by-reference (ค่าต้นทางเปลี่ยนได้)
int[] arr = {1, 2, 3};
modify(arr);     // arr เปลี่ยนได้จริง
```

### B4. Array 1D

```java
// Declare + Create
int[] arr = new int[n];          // ค่า default = 0

// Declare + Initialize
int[] arr = {1, 2, 3, 4, 5};

// Traverse
for (int i = 0; i < arr.length; i++) {
    // use arr[i]
}

// Sum + Average
int sum = 0;
for (int i = 0; i < arr.length; i++) sum += arr[i];
double avg = (double) sum / arr.length;

// Min + Max
int min = arr[0], max = arr[0];
for (int i = 1; i < arr.length; i++) {
    if (arr[i] < min) min = arr[i];
    if (arr[i] > max) max = arr[i];
}

// Linear Search
int foundAt = -1;
for (int i = 0; i < arr.length; i++) {
    if (arr[i] == target) { foundAt = i; break; }
}

// Reverse In-Place
int left = 0, right = arr.length - 1;
while (left < right) {
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
    left++; right--;
}

// ArgMax (หา index ของค่าสูงสุด)
int maxIdx = 0;
for (int i = 1; i < arr.length; i++) {
    if (arr[i] > arr[maxIdx]) maxIdx = i;
}
System.out.println("Highest at index " + maxIdx + " (" + arr[maxIdx] + ")");
```

### B5. Array 2D

```java
// Declare + Create
int[][] m = new int[rows][cols];

// Traverse with nested for
for (int row = 0; row < m.length; row++) {
    for (int col = 0; col < m[row].length; col++) {
        System.out.printf("%-5d", m[row][col]);
    }
    System.out.println();
}

// Sum all elements
int total = 0;
for (int row = 0; row < m.length; row++)
    for (int col = 0; col < m[row].length; col++)
        total += m[row][col];

// Max per row
for (int row = 0; row < m.length; row++) {
    int rowMax = m[row][0];
    for (int col = 1; col < m[row].length; col++)
        if (m[row][col] > rowMax) rowMax = m[row][col];
    System.out.println("Max in row " + row + " = " + rowMax);
}

// 2D Search (early exit pattern)
boolean found = false;
for (int row = 0; row < m.length && !found; row++) {
    for (int col = 0; col < m[row].length && !found; col++) {
        if (m[row][col] == target) {
            System.out.println("Found at [" + row + "][" + col + "]");
            found = true;
        }
    }
}
if (!found) System.out.println(target + " not found.");
```

---

## ส่วน C — Model Solutions (จากข้อสอบจริง)

### C1. (Loop) Temperature Converter with Statistics

**โจทย์:** รับค่า Celsius จนกว่าจะพิมพ์ -999, แสดง F + category, ตอนท้ายแสดง count + highest F

```java
import java.util.Scanner;

public class TempExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double highestF = Double.NEGATIVE_INFINITY;

        while (true) {
            System.out.print("Enter Celsius (-999 to quit): ");
            double c = sc.nextDouble();
            if (c == -999) break;

            double f = (9.0 / 5) * c + 32;
            String category;
            if (f < 50)       category = "Cold";
            else if (f <= 86)  category = "Comfortable";
            else               category = "Hot";

            System.out.printf("%.1f °C = %.2f °F → %s%n", c, f, category);
            count++;
            if (f > highestF) highestF = f;
        }

        System.out.println("----------------------------");
        System.out.println("Total conversions : " + count);
        System.out.printf("Highest Fahrenheit: %.2f °F%n", highestF);
        sc.close();
    }
}
```

**จุดสำคัญ:**
- ใช้ `Double.NEGATIVE_INFINITY` สำหรับ initial highestF (รองรับทุก range)
- ตรวจ sentinel *ก่อน* คำนวณ (break ทันที)
- `f <= 86` ครอบคลุม boundary 86°F เป็น "Comfortable"

---

### C2. (Method) Shipping Cost Calculator

**โจทย์:** method `shippingCost(weight, type)` → คำนวณค่าส่ง D=30/kg min50, I=80/kg min150, repeat จนกว่า weight==0

```java
import java.util.Scanner;

public class ShippingExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter weight (kg), 0 to quit: ");
            double weight = sc.nextDouble();
            if (weight == 0) { System.out.println("Goodbye!"); break; }

            if (weight <= 0) { System.out.println("Invalid weight."); continue; }

            System.out.print("Destination (D/I): ");
            String type = sc.next().toUpperCase();

            double cost = shippingCost(weight, type);
            if (cost < 0) {
                System.out.println("Invalid destination.");
            } else {
                double raw = (type.equals("D")) ? weight * 30 : weight * 80;
                double min = (type.equals("D")) ? 50 : 150;
                if (raw < min) {
                    System.out.printf("Shipping cost = %.2f baht (minimum applied)%n", cost);
                } else {
                    System.out.printf("Shipping cost = %.2f baht%n", cost);
                }
            }
        }
        sc.close();
    }

    public static double shippingCost(double weight, String type) {
        if (type.equals("D")) {
            double cost = weight * 30;
            return (cost < 50) ? 50 : cost;
        } else if (type.equals("I")) {
            double cost = weight * 80;
            return (cost < 150) ? 150 : cost;
        }
        return -1; // invalid
    }
}
```

**จุดสำคัญ:**
- เช็ค `weight <= 0` แยกกับ sentinel `weight == 0`
- logic minimum fee ใช้ ternary operator `(cost < min) ? min : cost`
- message "(minimum applied)" ต้องเช็คว่า raw cost < minimum ก่อนพิมพ์

---

### C3. (Array) Weekly Rainfall Report

**โจทย์:** Array 7 วัน → แสดง daily, total, avg, วันที่เกินค่าเฉลี่ย, วันที่ฝนตกสูงสุด

```java
import java.util.Scanner;

public class RainfallExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rain = new int[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter rainfall for day " + (i + 1) + ": ");
            rain[i] = sc.nextInt();
        }

        // Sum + Daily display
        System.out.println("--- Weekly Rainfall Report ---");
        int total = 0;
        for (int i = 0; i < 7; i++) {
            System.out.println("Day " + (i + 1) + ": " + rain[i] + " mm");
            total += rain[i];
        }

        double avg = (double) total / 7;
        System.out.println("Total rainfall : " + total + " mm");
        System.out.printf("Average        : %.2f mm%n", avg);

        // Days above average
        System.out.print("Days above average: ");
        int aboveCount = 0;
        StringBuilder aboveDays = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            if (rain[i] > avg) {
                aboveCount++;
                if (aboveDays.length() > 0) aboveDays.append(", ");
                aboveDays.append("Day " + (i + 1));
            }
        }
        System.out.println(aboveCount + " (" + aboveDays + ")");

        // Highest rainfall (argmax)
        int maxIdx = 0;
        for (int i = 1; i < 7; i++) {
            if (rain[i] > rain[maxIdx]) maxIdx = i;
        }
        System.out.println("Highest rainfall : Day " + (maxIdx + 1) + " (" + rain[maxIdx] + " mm)");

        sc.close();
    }
}
```

**จุดสำคัญ:**
- Display daily และสะสม total ใน loop เดียว
- `(i + 1)` แปลง index เป็น "Day 1, Day 2, ..."
- ใช้ StringBuilder เก็บชื่อวัน (หรือ String concat ก็ได้ถ้าง่ายกว่า)
- argmax: เริ่มจาก index 0, loop จาก index 1

---

## ส่วน D — Lab Exercise Cheat Sheet

### Lab 6A — While Loop (7 ข้อ)

| # | ไฟล์ | Algorithm หลัก |
|---|---|---|
| 1 | `Task1_Trace.java` | trace while loop: count 0→3, condition `count < 4`, print then increment |
| 2 | `CountDown.java` | countdown i=10 ลงมา, เช็ค `i % 2 == 0` → "Even"/"Odd", condition `i >= 2` |
| 3 | `SumUntilZero.java` | sentinel loop: อ่านจนได้ 0, sum += num, count++ |
| 4 | `InchToCm.java` | while `inches <= 199`, step +2, printf %-10d %-15.2f |
| 5 | `Divisibility.java` | `(num % 5 == 0) ^ (num % 7 == 0)` → XOR, print 10/line ด้วย count % 10 |
| 6 | `GuessNumber.java` | `Math.random() * 100 + 1`, while guess != secret, hint "Too high/low" |
| 7 | `Calculator.java` | while choice != 5, switch-case 1-4 (+−×÷), default = invalid |

### Lab 7A — For Loop (7 ข้อ)

| # | ไฟล์ | Algorithm หลัก |
|---|---|---|
| 1 | `Exercise1.java` | for i=1 to 4: print `i + " squared = " + i*i` |
| 2 | `SumNumber.java` | sum 1-100 **ต้องเพิ่ม even/odd แยก** (โค้ดปัจจุบัน missing ⚠️) |
| 3 | `UnitTable.java` | for kg=1,lb=20; step kg+=2,lb+=5; printf %-10d %-10.2f |
| 4 | `BreakContinue.java` | Snippet A: break เมื่อ i==6 / Snippet B: continue เมื่อ i%3==0 |
| 5 | `GCD.java` | for k=2 to min(n1,n2): ถ้าหาร n1,n2 ลงตัวทั้งคู่ → gcd=k |
| 6 | `PrimeNumbers.java` | while count < 50: ทดสอบ prime ด้วย inner for, พิมพ์ 10 ต่อบรรทัด |
| 7 | `Pyramid.java` | nested for: ช่องว่าง + powers of 2 (**โค้ดปัจจุบัน pattern ต่างจาก docx ⚠️**) |

### Lab 10A — Methods (6 ข้อ)

| # | ไฟล์ | Method Signature + Algorithm |
|---|---|---|
| 1 | `TestMax.java` (trace) | ตาราง trace: call stack, parameter binding, return value |
| 2 | `TestMax.java` | `max(int a, int b): int` → if-else, `max(max(i,j), max(x,y))` หา max 4 ตัว |
| 3 | `SumRange.java` | `sum(int i1, int i2): int` → for loop สะสม sum |
| 4 | `TempConverter.java` | `celsiusToFahrenheit(double c): double` + `fahrenheitToCelsius(double f): double` |
| 5 | `Distance.java` | `distance(double x1, y1, x2, y2): double` → `Math.sqrt(pow + pow)` |
| 6 | `Triangle.java` | `classifyTriangle(a,b,c): String` → validity check ก่อน, ตามด้วย equilateral/isosceles/scalene |

### Lab 10B — Nested Methods & void Methods (6 ข้อ)

| # | ไฟล์ | Key Pattern |
|---|---|---|
| 1 | `PassByValue.java` | demo: primitive ไม่เปลี่ยน (Before=10, Inside=11, After=10) |
| 2 | `GCDModular.java` | `gcd(n1, n2): int` แบบ method, เรียก 2 ครั้งด้วย input ต่างกัน |
| 3 | `PrimeMethod.java` | `isPrime(n): boolean` เรียกภายใน `findPrimes(max)` |
| 4 | `Perfectnumber.java` | `isPerfect(n): boolean` → sum divisors from 1 to n-1 |
| 5 | `TextBox.java` | `void printTop/Bottom(width)` + `void printCentered(msg, width)` |
| 6 | `MultiTable.java` | `void printDivider(cols)`, `void printRow(row, cols)`, `void printMultiTable(size)` |

### Lab 11A — 1D Arrays (6 ข้อ)

| # | ไฟล์ | Algorithm หลัก |
|---|---|---|
| 1 | `TraceArray.java` | trace: i=0..4, total สะสม, arr[i] ได้ค่าอะไร |
| 2 | `ArrayInput.java` | รับขนาด (3-10) → for loop รับสมาชิก → for loop พิมพ์ |
| 3 | `ArrayStats.java` | sum (สะสมระหว่างรับค่า), min/max (เริ่มจาก arr[0]), avg = (double)sum/n |
| 4 | `LinearSearch.java` | for loop, `if arr[i] == target → foundAt = i; break` |
| 5 | `CountFilter.java` | loop หา even print + count, คำนวณ avg, loop หา above-avg print + count |
| 6 | `ReverseArray.java` | left=0, right=n-1, while left < right: swap + left++ right-- |

### Lab 11B — 2D Arrays (5 ข้อ)

| # | ไฟล์ | Algorithm หลัก |
|---|---|---|
| 1 | `TraceMatrix.java` | trace nested loop: row=0..2, col=0..2, แสดง m[row][col] |
| 2 | `MatrixInput.java` | `readMatrix(rows,cols): int[][]` + `printMatrix(m)` แยก method |
| 3 | `MatrixSum.java` | nested loop sum all, avg = (double)sum / (rows*cols) |
| 4 | `MatrixRowMax.java` | per-row: `rowMax = m[row][0]`, inner loop update maxInRow |
| 5 | `MatrixSearch.java` | `boolean found = false`, `for(...&&!found)` early exit pattern |

---

## ส่วน E — High-Probability Exam Topics (Top 10)

จากการเปรียบเทียบ Lab ปีนี้ + Final.md รุ่นพี่:

| ลำดับ | หัวข้อ | เหตุผลที่น่าออก |
|:---:|---|---|
| 🔥1 | **Sentinel Loop + Statistics** | ออกใน PDF exam: pattern Loop+max tracker+count |
| 🔥2 | **Array Stats (sum/avg/min/max)** | ออกใน PDF exam + Lab 11A Ex3 |
| 🔥3 | **Method with validation + repeat** | ออกใน PDF exam + Lab 10A ทุกข้อ |
| 🔥4 | **Array filter + count above-avg** | ออกใน Lab 11A Ex5 + PDF (Days above avg) |
| 🔥5 | **Triangle classifier (method)** | Lab 10A Ex6, Lab 9.1 รุ่นพี่ |
| ⚡6 | **2D Array search (early exit)** | Lab 11B Ex5, Lab 12.1 รุ่นพี่ |
| ⚡7 | **isPrime() as helper method** | Lab 10B Ex3, repeated in senior code |
| ⚡8 | **Reverse array in-place** | Lab 11A Ex6 — ข้อที่มักสับสน left/right boundary |
| ⚡9 | **GCD (brute-force for loop)** | Lab 7A Ex5, Lab 10B Ex2 |
| ⚡10 | **Nested loop (Pyramid/Table)** | Lab 7A Ex7, Lab 8.2 รุ่นพี่ |

### สิ่งที่ต้องระวังมากที่สุดในสอบ:

```
❌ WRONG:  int avg = sum / n;              // integer division!
✅ CORRECT: double avg = (double) sum / n;

❌ WRONG:  int min = 0;                   // ถ้าค่าทุกตัวเป็นบวก min จะไม่ถูกอัปเดต
✅ CORRECT: int min = arr[0];             // เสมอเริ่มจาก element แรก

❌ WRONG:  for (int i = 0; i <= arr.length; i++)   // ArrayIndexOutOfBoundsException!
✅ CORRECT: for (int i = 0; i < arr.length; i++)

❌ WRONG:  Scanner sc = new Scanner(System.in);    // สร้างใน method (resource leak)
✅ CORRECT: Scanner sc = new Scanner(System.in);   // สร้างครั้งเดียวใน main

❌ WRONG:  if (a + b < c) { invalid }    // ตรวจสอบ triangle ไม่ครบ
✅ CORRECT: if (a+b<=c || a+c<=b || b+c<=a) { invalid }

❌ WRONG:  // ใช้ ^ เป็น power  Math.pow(2,3) ≠ 2^3
✅ CORRECT: Math.pow(2, 3) = 8.0   ;  2^3 ใน Java หมายถึง XOR bitwise operator!
```

---

## ส่วน F — Java Syntax ที่ต้องจำ (Cheat Codes)

```java
// Scanner
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int n      = sc.nextInt();
double d   = sc.nextDouble();
String s   = sc.next();         // อ่านคำเดียว
String line = sc.nextLine();    // อ่านทั้งบรรทัด

// Math
Math.sqrt(x)          // รากที่สอง
Math.pow(base, exp)   // ยกกำลัง
Math.abs(x)           // ค่าสัมบูรณ์
Math.min(a, b)        // ค่าน้อยกว่า
Math.max(a, b)        // ค่ามากกว่า
(int)(Math.random() * n) + 1   // สุ่ม 1..n

// String
s.equals("D")         // เปรียบเทียบ String (ไม่ใช้ ==)
s.toUpperCase()       // แปลงเป็นตัวพิมพ์ใหญ่
s.equalsIgnoreCase("yes")

// Array
int[] arr = new int[n];
arr.length            // ขนาด array (ไม่ใช่ length())
int[][] m = new int[r][c];
m.length              // จำนวน rows
m[0].length           // จำนวน cols
```

---

*สร้างโดย Antigravity AI | สอบครั้งนี้ขอให้โชคดี! 🎯*
