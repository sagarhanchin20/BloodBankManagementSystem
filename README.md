This is a mini-project for a Blood Bank Management System developed using NetBeans IDE for the frontend and MySQL Database for the backend. It's designed to help blood bank centers manage donor information and blood stock efficiently. 

# FEATURES ✨
The system provides a comprehensive set of functionalities for managing a blood bank:

**1. User Authentication**
Login Page: Secure access with a predefined username and password (intended for use by blood bank staff only).

**2. Main Menu (Home Page)**
Upon successful login, users are directed to a home page with the following options:
* Add Donor
* Search Donor
* Delete Donor
* Stock Management
* Exit

**3. Add Donor**
This section allows for complete donor record management:
* Add New Donor: Register new blood donors.
* Update Donor Details: Modify existing donor information.
* View All Donor Details: See a complete list of all registered donors.

**4. Search Donor**
Quickly locate donor information using various criteria:
* Search Donor by Blood Group: Find donors based on their blood type.
* Search Donor by Address: Locate donors by their residential address.

**5. Delete Donor**
* Delete Donor: Remove donor records from the system.

**6. Stock Management**
* Increase Stock: Update blood stock levels when new donations are received.
* Decrease Stock: Adjust blood stock levels when blood is dispensed.

**7. Exit Options**
* Logout: Return to the login page.
* Exit Application: Close the application.

# Technologies Used 
* Frontend: NetBeans IDE (Java Swing)
* Backend: MySQL Database

**LIMITATIONS**
As a mini-project, this system has a few limitations that could be addressed in a more advanced version:
1) **Manual Stock Management:** The system requires users to manually increase or decrease blood stock. There is no automated process for updating stock levels based on donor additions or blood requests.
2) **Hardcoded Login Credentials:** The username and password for login are currently hardcoded within the application, which is not suitable for production environments.
3) **Basic User Interface:** The user interface is functional but lacks advanced UI/UX features and modern design elements.
4) **No Reporting:** The system does not include features for generating reports on donor statistics, stock levels, or transaction history.
5) **Single-User Focus:** It's designed primarily for single-user operation and doesn't include features for multiple user roles or concurrent access management.

**USAGE**
* Download the project folder.
* Open the project directly in NetBeans IDE.
* Set up the associated MySQL database by importing the provided SQL file (seprate it out from the file before opening it in netbeans).
* Make sure to change the MySQL username and password in the database connection code (usually found in files like ConnectionProvider.java or similar).
* Run the project from NetBeans.
