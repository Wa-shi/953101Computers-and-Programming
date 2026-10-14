"A true society of wisdom begins when knowledge is no longer a secret. Equality starts with access to knowledge." 💡

This repo was created to compile summaries and notes for our exam prep.
I might not be the smartest, and these notes don't guarantee that I'll score higher than any of you.
But I simply believe that "we don't need to gatekeep knowledge just to survive alone."

I hope these summaries will be useful, save you some time, and help us all pass this course together.
Best of luck with the exams. We've got this brooo!

สังคมแห่งปัญญาที่แท้จริง เริ่มต้นจากการที่ความรู้ไม่ใช่ความลับ ความเท่าเทียมในการเข้าถึงความรู้ (( หล่อเฉยไรวะ ))" 💡
Repo นี้สร้างขึ้นมาเพื่อรวบรวมสรุปและโน้ตต่างๆ สำหรับเตรียมสอบ Lab และ มิดเทอมนี้
เราอาจจะไม่ได้เก่งที่สุด และสรุปนี้ก็ไม่ได้การันตีว่าฉันจะได้คะแนนมากกว่าพวกคุณ
แต่ฉันแค่เชื่อว่า "เราอยากจะแบ่งปันสิ่งที่มีให้คนอื่นด้วย"
หวังว่าสรุปนี้จะเป็นประโยชน์ ช่วยประหยัดเวลา และทำให้พวกเราผ่านวิชานี้ไปด้วยกันนะ
ขอโทษที่ Commit ช้า พอดีพึ่งมาจัดระเบียบอะไรใหม่ๆ เผื่อรุ่นน้องไปด้วยเลยล้ากัน

ขอให้ทุกคนโชคดีกับการสอบ สู้ๆน้าเพื่อนๆ!

# 📚 953101 Computers and Programming — Organized Labs & Exam Prep

> **Course:** 953101 Computers and Programming (Java)  
> **Major:** Software Engineering (SE), College of Arts, Media and Technology (CAMT), Chiang Mai University  
> **Author / Student:** Wa-shi ([@Wa-shi](https://github.com/Wa-shi))  
> **Repository Scope:** คลังเก็บซอร์สโค้ดและเอกสารเตรียมสอบ **Organized Labs** ทั้งหมด 36 แบบฝึกหัด (จัดระเบียบใหม่จาก Lab06A ถึง Lab11B) พร้อมคู่มือสรุปเจาะลึกเตรียมสอบ 94 หน้า

---

## 🌟 โครงสร้างภายใน Repository นี้

```
Organized_Labs/
│
├── 📕 SE101_Java_Master_StudyGuide.pdf  ⭐ คู่มือเตรียมสอบฉบับเต็ม 94 หน้า (ทบทวนพื้นฐาน + 36 ข้อ + ข้อสอบจริง)
├── 🌐 SE101_Java_Master_StudyGuide.html  (คู่มือฉบับ HTML เปิดอ่านบน Browser ได้ทันที)
├── 📘 SE101_Java_StudyGuide.docx        (คู่มือฉบับ Word Document)
├── 📝 ASTRA_EXAM_PREP.md                (สรุป Pattern ข้อสอบและ Model Solutions สำหรับ AI / นักศึกษา)
│
├── 📁 Lab06A_WhileLoop/                  (7 ข้อ: While Loop, Sentinel, Modulo, XOR, Calculator)
├── 📁 Lab07A_ForLoop/                    (7 ข้อ: For Loop, Break/Continue, GCD, Primes, Centered Pyramid)
├── 📁 Lab10A_Methods1/                   (5 ข้อ: Value-Returning Methods, Formulas, Triangle Classifier)
├── 📁 Lab10B_NestedMethods_VoidMethods/  (6 ข้อ: Pass-by-Value, Modular GCD, Perfect Numbers, TextBox)
├── 📁 Lab11A_1DArrays/                   (6 ข้อ: Array Stats, Linear Search, Filtering, In-Place Reversal)
└── 📁 Lab11B_2DArrays/                   (5 ข้อ: Matrix I/O, Row Max, Matrix Sum, 2D Early Exit Search)
```

---

## 📖 เอกสารคู่มือและรายงานเตรียมสอบ (Documentation & Guides)

### 1. [`SE101_Java_Master_StudyGuide.pdf`](./SE101_Java_Master_StudyGuide.pdf) (แนะนำให้อ่านก่อนสอบ)
คู่มือเตรียมสอบความยาว **94 หน้า** จัดพิมพ์ด้วยรูปแบบตำราเรียนมาตรฐาน:
* **บทที่ 0:** ทบทวนพื้นฐาน Java: `printf` formats (`%d`, `%f`, `%.2f`, `%4d`, `%-5d`), `if-else`, Operators (`%`, `^` vs `Math.pow`), และเทคนิค `Scanner`
* **บทที่ 1 - 6:** ครอบคลุมทั้ง 36 แบบฝึกหัด ทุกข้อประกอบด้วย:
  1. ซอร์สโค้ด Java แท้ 100%
  2. วัตถุประสงค์และภาพรวม
  3. หลักการทำงานทีละบรรทัด (Step-by-step logic)
  4. ตาราง Trace ค่าตัวแปร & ตัวอย่างการรัน (Trace Table)
  5. รูปแบบต่างๆ และข้อสอบพลิกแพลง (Variations & Exam Tweaks)
  6. จุดที่ต้องระวังและกับดักในห้องสอบ (Pitfalls)
* **บทที่ 7:** เฉลยข้อสอบเก่า Final Lab Exam 3 ข้อ (Temperature Stats, Shipping Cost, Weekly Rainfall)
* **บทที่ 8:** สรุป Top 10 ข้อผิดพลาดร้ายแรงที่ห้ามทำในห้องสอบ

### 2. [`ASTRA_EXAM_PREP.md`](./ASTRA_EXAM_PREP.md)
คู่มือสำหรับส่งต่อ Context และ Logic ให้กับ AI Agent (เช่น Astra AI) หรือใช้ทบทวน Pattern ข้อสอบ 3 รูปแบบหลัก:
1. `Loop + Sentinel + Statistics`
2. `Method + Validation + Repeat Loop`
3. `1D Array + Multi-stat Report + ArgMax`

---

## 💻 รายการซอร์สโค้ดทั้ง 36 แบบฝึกหัด (All 36 Java Programs)

### 🔹 Lab 06A — While Loop (`Lab06A_WhileLoop/`)
* [`Task1_Trace.java`](./Lab06A_WhileLoop/Task1_Trace.java) — การ Trace ลูป while พื้นฐานและการนับรอบ (Counter loop)
* [`CountDown.java`](./Lab06A_WhileLoop/CountDown.java) — ลูปนับถอยหลัง 10 ถึง 2 พร้อมแยกเลขคู่ (Even) และเลขคี่ (Odd) ด้วย `% 2 == 0`
* [`SumUntilZero.java`](./Lab06A_WhileLoop/SumUntilZero.java) — Sentinel loop รับตัวเลขสะสมผลรวมและค่าเฉลี่ยจนกว่าผู้ใช้จะป้อน 0
* [`InchToCm.java`](./Lab06A_WhileLoop/InchToCm.java) — ตารางแปลงหน่วยนิ้วเป็นเซนติเมตรแบบก้าวทีละ 2 (`inches += 2`) พร้อมจัดหน้าตาด้วย `printf`
* [`Divisibility.java`](./Lab06A_WhileLoop/Divisibility.java) — หาตัวเลขที่หารด้วย 5 หรือ 7 ลงตัวแต่ไม่ใช่ทั้งคู่ ด้วย Bitwise XOR (`^`) และตัดบรรทัดทุก 10 ตัว
* [`GuessNumber.java`](./Lab06A_WhileLoop/GuessNumber.java) — เกมทายตัวเลขสุ่มด้วย `Math.random()` พร้อมคำใบ้ Too high / Too low
* [`Calculator.java`](./Lab06A_WhileLoop/Calculator.java) — เมนูเครื่องคิดเลขแบบ Menu-driven program ด้วย `switch-case` และดักจับ Division by Zero

### 🔹 Lab 07A — For Loop & Nested Loops (`Lab07A_ForLoop/`)
* [`Exercise1.java`](./Lab07A_ForLoop/Exercise1.java) — For loop พื้นฐาน 1 ถึง 4 คำนวณเลขยกกำลังสอง `i * i`
* [`SumNumber.java`](./Lab07A_ForLoop/SumNumber.java) — คำนวณผลรวมสะสม 1 ถึง 100 แยกผลรวมทั้งหมด ผลรวมเลขคู่ และผลรวมเลขคี่ (3 บรรทัด)
* [`UnitTable.java`](./Lab07A_ForLoop/UnitTable.java) — ลูปตัวแปรคู่ `for (int kg = 1, lb = 20; kg <= 199; kg += 2, lb += 5)` แสดงตารางแปลงหน่วย 4 คอลัมน์
* [`BreakContinue.java`](./Lab07A_ForLoop/BreakContinue.java) — เปรียบเทียบการหยุดลูปด้วย `break` เมื่อ `i == 6` และการข้ามรอบด้วย `continue` เมื่อ `i % 3 == 0`
* [`GCD.java`](./Lab07A_ForLoop/GCD.java) — ค้นหาตัวหารร่วมมาก (ห.ร.ม.) ของตัวเลข 2 จำนวนด้วยอัลกอริทึม Brute-force
* [`PrimeNumbers.java`](./Lab07A_ForLoop/PrimeNumbers.java) — Nested loops ค้นหาจำนวนเฉพาะ 50 ตัวแรก แสดงผลแถวละ 10 จำนวน
* [`Pyramid.java`](./Lab07A_ForLoop/Pyramid.java) — พีระมิดเลขยกกำลังฐานสอง ($2^0, 2^1, ..., 2^k$) จัดกึ่งกลางหน้าจออย่างสมบูรณ์แบบด้วยช่องว่างและ `%4d`

### 🔹 Lab 10A — Methods Part 1 (`Lab10A_Methods1/`)
* [`TestMax.java`](./Lab10A_Methods1/TestMax.java) — Method คืนค่า `max(a, b)` และการเรียกซ้อน `max(max(i, j), max(k, l))` เพื่อหาค่ามากสุดจาก 4 ตัวแปร
* [`SumRange.java`](./Lab10A_Methods1/SumRange.java) — ฟังก์ชัน `sum(i1, i2)` คำนวณผลรวมตัวเลขในช่วงที่กำหนด
* [`TempConverter.java`](./Lab10A_Methods1/TempConverter.java) — ฟังก์ชันคณิตศาสตร์แปลงอุณหภูมิไป-กลับสองทางระหว่าง Celsius และ Fahrenheit
* [`Distance.java`](./Lab10A_Methods1/Distance.java) — คำนวณระยะห่างระหว่างจุด 2 มิติด้วยสูตร Euclidean Distance ผ่าน `Math.sqrt` และ `Math.pow`
* [`Triangle.java`](./Lab10A_Methods1/Triangle.java) — ตรวจสอบทฤษฎีอสมการสามเหลี่ยม (Triangle Inequality) และจำแนกประเภท (Equilateral, Isosceles, Scalene)

### 🔹 Lab 10B — Methods Part 2 (`Lab10B_NestedMethods_VoidMethods/`)
* [`PassByValue.java`](./Lab10B_NestedMethods_VoidMethods/PassByValue.java) — สาธิตกลไก Pass-by-Value ใน Java สำหรับชนิดตัวแปร Primitive ว่าค่าต้นทางจะไม่เปลี่ยนแปลง
* [`GCDModular.java`](./Lab10B_NestedMethods_VoidMethods/GCDModular.java) — การจัดระเบียบโค้ดแบบแยกส่วนฟังก์ชัน `gcd(n1, n2)` เพื่อให้นำกลับมาใช้ซ้ำได้
* [`PrimeMethod.java`](./Lab10B_NestedMethods_VoidMethods/PrimeMethod.java) — แยก Helper method `isPrime(n)` คืนค่า boolean เพื่อนำมาใช้ร่วมกับ Method จัดการแสดงผล
* [`Perfectnumber.java`](./Lab10B_NestedMethods_VoidMethods/Perfectnumber.java) — ค้นหาจำนวนสมบูรณ์ (Perfect Numbers เช่น 6, 28, 496, 8128) ที่มีค่าน้อยกว่า 10,000
* [`TextBox.java`](./Lab10B_NestedMethods_VoidMethods/TextBox.java) — Void methods เรียกซ้อนกันเพื่อวาดกรอบข้อความจัดกึ่งกลาง (`printBorder`, `printCentered`, `printBox`)
* [`MultiTable.java`](./Lab10B_NestedMethods_VoidMethods/MultiTable.java) — Void methods ประกอบตารางสูตรคูณแม่ 1-9 พร้อมจัดเส้นแบ่งและหัวคอลัมน์อย่างเป็นระเบียบ

### 🔹 Lab 11A — 1D Arrays (`Lab11A_1DArrays/`)
* [`TraceArray.java`](./Lab11A_1DArrays/TraceArray.java) — โครงสร้าง Array, การจัดเก็บใน Heap, ดัชนีเริ่มต้น 0 ถึง length - 1, และการใช้ `.length`
* [`ArrayInput.java`](./Lab11A_1DArrays/ArrayInput.java) — การจองขนาด Array แบบไดนามิกตามที่ผู้ใช้ป้อน (`new int[n]`) และการวนลูปรับข้อมูล
* [`ArrayStats.java`](./Lab11A_1DArrays/ArrayStats.java) — คำนวณ Sum, Average, Minimum, และ Maximum ครบทั้ง 4 ค่าในลูปเดียว (Single-pass reduction)
* [`LinearSearch.java`](./Lab11A_1DArrays/LinearSearch.java) — อัลกอริทึมค้นหาข้อมูลตามลำดับ พร้อมเทคนิค Early Break และการจัดการกรณีไม่พบข้อมูล (-1)
* [`CountFilter.java`](./Lab11A_1DArrays/CountFilter.java) — การประมวลผลสองรอบ (Multi-pass) เพื่อนับและกรองข้อมูลที่มากกว่าค่าเฉลี่ย (Above Average)
* [`ReverseArray.java`](./Lab11A_1DArrays/ReverseArray.java) — การกลับด้าน Array แบบ In-Place ด้วยเทคนิค Two Pointers (Left/Right Swap)

### 🔹 Lab 11B — 2D Arrays / Matrices (`Lab11B_2DArrays/`)
* [`TraceMatrix.java`](./Lab11B_2DArrays/TraceMatrix.java) — พิกัดเมทริกซ์ 2 มิติ `matrix[row][col]`, `m.length` (Rows) และ `m[0].length` (Cols)
* [`MatrixInput.java`](./Lab11B_2DArrays/MatrixInput.java) — การรับค่าเมทริกซ์ขนาด $R \times C$ จาก Scanner และการส่ง Scanner เป็นพารามิเตอร์อย่างปลอดภัย
* [`MatrixSum.java`](./Lab11B_2DArrays/MatrixSum.java) — คำนวณผลรวมทั้งหมด (Grand Total), ค่าเฉลี่ยรวม, และผลรวมแยกเฉพาะแต่ละแถว (Row Sums)
* [`MatrixRowMax.java`](./Lab11B_2DArrays/MatrixRowMax.java) — ค้นหาค่ามากที่สุดของแต่ละแถวในเมทริกซ์ พร้อมการรีเซ็ต `rowMax = m[r][0]` ที่ถูกต้อง
* [`MatrixSearch.java`](./Lab11B_2DArrays/MatrixSearch.java) — ค้นหาข้อมูลในเมทริกซ์ 2 มิติ พร้อมเทคนิค 2D Early Exit (`&& !found`) เพื่อหยุดทั้งลูปในและลูปนอกทันทีเมื่อพบ

---

## 🔍 ตารางเปรียบเทียบกับโค้ดรุ่นพี่ (`CAMT-SE-JAVA-COMPRO`)

| แล็บปัจจุบัน | แบบฝึกหัด | ไฟล์รุ่นพี่ที่ตรงกัน | คอนเซปต์หลัก |
|---|---|---|---|
| **Lab6A** | Ex 1: Trace while loop | `Lab7_1/WhileLoopExample.java` | การวน while loop |
| **Lab6A** | Ex 4: `InchToCm.java` | `Lab7_1/InchesToCentimeters.java` | ตารางแปลงหน่วย 2 คอลัมน์ |
| **Lab6A** | Ex 5: `Divisibility.java` | `Lab7_1/FiveOrSevenFactorable.java` | หาร 5 หรือ 7 ลงตัวแต่ไม่ใช่ทั้งสอง (XOR `^`) |
| **Lab6A** | Ex 7: `Calculator.java` | `Lab6_3/Calculator.java` | เมนูเครื่องคิดเลขวนซ้ำ |
| **Lab7A** | Ex 2: `SumNumber.java` | `Lab8_1/SumNumber.java` | ผลรวม 1-100, เลขคู่, เลขคี่ |
| **Lab7A** | Ex 3: `UnitTable.java` | `Lab8_1/KGToLBTables.java` | ตาราง 2 ตัวแปรใน for เดียว |
| **Lab7A** | Ex 7: `Pyramid.java` | `Lab8_2/PascalPyramid.java` | พีระมิดเลขยกกำลังจัดกึ่งกลาง |
| **Lab10A** | Ex 1-2: `TestMax.java` | `Lab9_1/TestMax.java` | Max ด้วย Nested Method Calls |
| **Lab10A** | Ex 4: `TempConverter.java` | `Lab9_1/TemperatureConverter2.java` | แปลง C <-> F ด้วย Methods |
| **Lab10A** | Ex 5: `Distance.java` | `Lab9_1/DistanceBetweenTwoPoints.java` | ระยะทาง 2 มิติ (Euclidean) |
| **Lab10A** | Ex 6: `Triangle.java` | `Lab9_1/TriangleClassifier2.java` | ตรวจสอบด้านและประเภทสามเหลี่ยม |
| **Lab10B** | Ex 4: `Perfectnumber.java` | `Lab10_1/PerfectNumber.java` | หา Perfect Number < 10,000 |
| **Lab10B** | Ex 6: `MultiTable.java` | `Lab8_2/MultiplicationTable.java` | แม่สูตรคูณจัดรูปตาราง |
| **Lab11A** | Ex 3: `ArrayStats.java` | `Lab11_1/AnalyzeNumbers.java` | ผลรวม ค่าเฉลี่ย Min Max ของ Array |
| **Lab11B** | Ex 2-3: `MatrixInput.java`, `MatrixSum.java` | `Lab12_1/PassTwoDimensionalArray.java` | 2D Array I/O และ Sum |

---

## 🚀 วิธีคอมไพล์และรันโปรแกรม

```powershell
# คอมไพล์โปรแกรม
javac Pyramid.java

# รันโปรแกรม
java Pyramid
```
