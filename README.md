# Tutorial 5B — GUI & Event Handling

TK1143 Program Design & Problem Solving — Section A

Java Swing solutions for the six exercises in Tutorial 5(b).

| Question | Source file | Topics |
| --- | --- | --- |
| 1 | `MyJButton.java` | `FlowLayout`, `JButton`, `ActionListener`; displays `Hi` |
| 2 | `MyJTextField.java` | `BorderLayout`, two text fields, Enter key event |
| 3 | `MyJCheckBox.java` | `GridLayout`, multiple checkbox selection, `ItemListener` |
| 4(a) | `MyJRadioButton.java` | Four mutually exclusive radio buttons including Yellow; horizontal layout |
| 5(a–b) | `SimpleCounter.java` | `JLabel`, `JTextField`, `JButton`; increments on click |
| 6(a–b) | `SimpleCalculator.java` | Four operations (`+`, `-`, `*`, `/`) and input validation |

## Answers to component questions

**Question 5(a):** `JFrame` (window), `JLabel` (Counter Value), `JTextField` (the read-only number), and `JButton` (Count).

**Question 6(a):** `JFrame` (window), `JLabel` (heading and prompts), `JTextField` (two number inputs and read-only result), and `JButton` (operation controls).

## Compile

Requires a JDK (Java 8 or newer).

```bash
javac *.java
```

## Run

Run each program separately, e.g.:

```bash
java MyJButton
java MyJTextField
java MyJCheckBox
java MyJRadioButton
java SimpleCounter
java SimpleCalculator
```

Each application opens a Swing window. Close a window before starting another application in the same terminal.

> The exercises are based on the supplied Tutorial 5B PDF. The source for Q3 is already complete in the handout; Q4(a) adds Yellow and changes the radio-button arrangement. Q5(b) completes the starter code. Q6(b) adds subtraction, multiplication and division.
