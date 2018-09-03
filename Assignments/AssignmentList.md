#Minimum 15 experiments should be conducted based on above topics and covering following
#list. At least two experiments should be conducted on each unit in the syllabus.

1. Create a class called Employee that includes three pieces of information as instance
variables- first name, a last name and a monthly salary. Your class should have a
constructor that initializes the three instance variables. Provide a set and a get method for
each instance variable. If the monthly salary is not positive, set it to 0.0. Write a test
application named EmployeeTest that demonstrates class Employee's capabilities. Create
two Employee objects and display each object's yearly salary. Then give each Employee
a 10% raise and display each Employee's yearly salary again.

2. Create class SavingsAccount. Use a static variable annualInterestRate to store the annual
interest rate for all account holders. Each object of the class contains a private instance
variable savingsBalance indicating the amount the saver currently has on deposit. Provide
method calculateMonthlyInterest to calculate the monthly interest by multiplying the
savingsBalance by annualInterestRate divided by 12this interest should be added to
savingsBalance. Provide a static method modifyInterestRate that sets the
annualInterestRate to a new value.
Write a program to test class SavingsAccount. Instantiate two savingsAccount
objects, saver1 and saver2, with balances of Rs 2000.00 and Rs 3000.00, respectively. Set
annualInterestRate to 4%, then calculate the monthly interest and print the new balances
for both savers. Then set the annualInterestRate to 5%, calculate the next month's
interest and print the new balances for both savers.

3. Create Vehicle Interface with name, maxPassanger, and maxSpeed variables. Create
LandVehicle and SeaVehicle Inteface from Vehicle interface. LandVehicle has
numWheels variable and drive method. SeaVehicle has displacement variable and launch
method. Create Car class from LandVehicle, HoverCraft from LandVehicle and
SeaVehicle interface. Also create Ship from SeaVehicle. Provide additional methods in
HoverCraft as enterLand and enterSea. Similarly provide other methods for class Car and
Ship. Demonstrate all classes in a application.

4. Create Separate Engine, Tyre, and Door Class. Create a Car class using these classes.
And show functionality of each component in the car.

5. Develop a mathematical package for Statistical operations like Mean, Median, Average,
Standard deviation. Create a sub package in the math package -convert. In “convert”
package provide classes to convert decimal to octal, binary, hex and vice-versa. Develop
application program to use this package, and build executable jar file of it.

6. Develop a class Expr to create and evaluate given expression. Constructor accepts the
expression as String. For example, Expr("x^2") or Expr("sin(x)+3*x"). If the parameter
in the constructor call does not represent a legal expression, then the constructor throws
an IllegalArgumentException. The message in the exception describes the error. Provide
eval(double num) and eval(int num) method to evaluate given expression and return
evaluated answer. For example, if Expr represents the expression 3*x+1, then
func.value(5) is 3*5+1, or 16.Finally, getDefinition() returns the definition of the
expression. This is just the string that was used in the constructor that created the
expression object.

7. Write a class to represent Roman numerals. The class should have two constructors. One
constructs a Roman numeral from a string such as "XVII" or "MCMXCV". It should
throw a NumberFormatException if the string is not a legal Roman numeral. The other
constructor constructs a Roman numeral from an int. It should throw a
NumberFormatException if the int is outside the range 1 to 3999.In addition, the class
should have two instance methods. The method toString() returns the string that
represents the Roman numeral. The method toInt() returns the value of the Roman
numeral as an int.

8. Take file name as input to your program, If file is existing the open and display contents
of the file. After displaying contents of file ask user – do you want to add the data at the
end of file. If a user gives yes as response, then accept data from user and append it to
file. If file in not existing then create a fresh new file and store user data into it. User
should type exit on new line to stop the program.

9. Take Student information such as name, age, weight, height, city, phone from user and
store it in the file using DataOutputStream and FileOutputStream and Retrive data using
DataInputStream and FileInputStream and display the result.

10. Write a program to remove whitespaces from a text file. Name of the file is given using
command line.

11. Develop a Swing GUI based standard calculator program.

12. Develop a GUI based application to create Telephone Contacts directory. Store the data
in standard “vcard” format. Also read any standard “vcard” file and display contacts in it.

13. Write a program that bounces a blue ball inside a JPanel. The ball should begin moving
with a mousePressed event. When the ball hits the edge of the JPanel, it should bounce
off the edge and continue in the opposite direction. The ball should be updated using a
Runnable.

14. Create Stop Watch with Swing GUI and Multithreading. Provide Facility for Lap
Counting.

15. Write a Swing GUI based network server program. The program is a simple file server
that makes a collection of files available for transmission to clients. When the server
starts up, it needs to know the name of the directory that contains the collection of files.
Specify this directory name through JFileChooser Dialog. You can assume that the
directory contains only regular files (that is, it does not contain any sub-directories).
When a client connects to the server, the server first reads a one-line command
from the client. The command can be the string "index". In this case, the server responds
by sending a list of names of all the files that are available on the server. Or the command
can be of the form "get <file>", where <file> is a file name. The server checks whether
the requested file actually exists. If so, it first sends the word "ok" as a message to the
client. Then it sends the contents of the file and closes the connection. Otherwise, it sends
the word "error" to the client and closes the connection.

16. Write a GUI based program to create a student registration and Login. Store Registration
data in Database and take Login information from Database.

17. Write a GUI based program to store and retrieve, delete and update Student’s information
in Database.

18. Fill a HashMap with key-value pairs. Print the results to show ordering by hash code.
Extract the pairs, sort by key, and place the result into a LinkedHashMap. Show that the
insertion order is maintained.

19. Write a program to read a text file one line at a time. Read each line as a String and place
that String object into a LinkedList. Print all of the lines in the LinkedList in reverse
order.
