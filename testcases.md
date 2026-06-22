# ORANGE HRM Login Module - Test Cases

| TC ID | Pre-Condition | Test Description | Steps | Expected Result | Priority |
|-------|---------------|-------------------|-------|------------------|----------|
| TC001 | User account should be registered | Validate log in with valid credentials | 1. Enter valid username<br>2. Enter valid password<br>3. Click log in | User should be logged in successfully and redirected to Dashboard | High |
| TC002 | User account should be registered | Verify signin with invalid username | 1. Enter invalid username<br>2. Enter valid password<br>3. Click log in | Proper error message should be displayed and log in should fail | High |
| TC003 | User account should be registered | Verify signin with invalid Password | 1. Enter valid username<br>2. Enter invalid password<br>3. Click Sigin | Proper error message should be displayed and log in should fail | High |
| TC004 | User account should be registered | Verify signin with Blank Username field | 1. Keep Blank Username Field<br>2. Enter valid password<br>3. click Sign in Button | Proper error message should be displayed and log in should fail | High |
| TC005 | User account should be registered | Verify signin with Blank Password field | 1. Enter Valid Username<br>2. Do not enter password<br>3. click Sign in Button | Proper error message should be displayed and log in should fail | High |
| TC006 | User account should be registered | Verify signin with both Blank Username & Password fields | 1. Do not enter Username<br>2. Do not enter password<br>3. click Sign in Button | Proper error message should be displayed and log in should fail | High |
| TC007 | User account should be registered | Verify Username with maximum allowed length | 1. Enter username exceeding maximum length and click log in | Field should restrict or should display error message | Medium |
| TC008 | User Should be Log out | Verify profile log out functionality | 1. Go to Profile icon<br>2. click log out | User should be logged out successfully and redirected to login page | High |