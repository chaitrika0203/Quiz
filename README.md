
📘 Quiz Application

A simple and interactive Quiz Application built using Java Swing, designed to demonstrate GUI development, event handling, and core OOP concepts in Java. This project includes a login page, rules page, quiz module, score evaluation, and image assets for a more engaging user experience.

🚀 Features:-

🔐 Login System:

Accepts username,
Navigates to the quiz interface,
Simple UI created using JFrame, JLabel, and JButton.

📜 Rules Page:

Displays quiz instructions,
Styled using Swing components,
“Start” button transitions into the main quiz.

❓ Quiz Interface:

Multiple-choice questions,
Options using JRadioButton with ButtonGroup,
Next button to navigate to the next question,
Timer for each question.

🏆 Score Page:

Displays final score based on correct answers,
Shows a message & image using JLabel and ImageIcon,
Option to restart or exit.

🧩 Tech Stack:

Java (JDK 8+),
Java Swing (GUI),
Object-Oriented Programming (OOP),
Uses packages to organize classes (Login.java, Rules.java, Tester.java, Score.java).

📁 Project Structure:-

src/
 └── quiz/
      │── Login.java
      │── Rules.java
      │── Tester.java
      │── Score.java ,
pics/
      │── login.jpg
      │── Quiz.jpg
      │── score.png

▶️ How to Run:-

cd src,
javac -d .. *.java,
cd ..,
java quiz.Login

