# Backend Project  (BNTA Week 7)


# List of Collaborators
This is a 1-week group project consisting of the Bright Network Technology Academy Cohort 5 members:

- Iman Chaudhry (Github: [ImanChaudhry](https://github.com/ImanChaudhry))
- Kim (Jimle) Ye (Github: [JinleYe](https://github.com/JinleYe))
- Mohamed Khaled (Github: [Mohamedk1995](https://github.com/Mohamedk1995))
- Aisha Mohamed (Github: [aisha-png](https://github.com/aisha-png))


# Project Theme
- We took inspiration from banking applications as banking is part of our day to day life in these recent years. Being able to pay online as well as having access to monthly reports of your spending allows for better money management towards customers.

This API was coded in Java. We used the SpringBoot that implements the Spring Framework as well as Postman and H2 database to view the API.



# Project timeline
Friday 20/05/2022 -- Project group was set + ideas for project theme
Monday 23/05/2022 -- Project theme set + Excalidraw live collaboration used for initial class diagram + Model + 
Tuesday 24/05/2022 -- Proje
(insert screenshot from slides of project timeline)



# The API
- We have a Many-to-Many relationship between Account Holders and Accounts
- A One-to-Many relationship between Accounts and Payments as well as Accounts and Subscriptions.



# Entity Relationship Diagram (ERD)
<img width="895" alt="Screenshot 2022-05-25 at 6 38 45 PM" src="https://user-images.githubusercontent.com/67974517/170518755-3a8b542b-0615-4ce3-b7eb-2ccb0add5878.png">



# Class Diagram
<img width="1084" alt="Screenshot 2022-05-25 at 6 37 52 PM" src="https://user-images.githubusercontent.com/67974517/170511038-177da193-f644-4ee1-a118-1a95f727e2b9.png">



# Our Commands

## 1. GET (SHOW)

|**ACCOUNTS**|
|:----------- |
|localhost:8080/accounts|
|localhost:8080/accounts/20|
|localhost:8080/accounts?pinnumber=1649&balance=12469|
|localhost:8080/accounts?relationship=partner|
|localhost:8080/accounts/balance?greaterthan=300000|

|**ACCOUNT HOLDERS**|
|:----------- |
|localhost:8080/account_holders|
|localhost:8080/account_holders/1|
|localhost:8080/account_holders/name|
|localhost:8080/account_holders/dob?dob=1997-07-25|
|localhost:8080/account_holders/addres|
|localhost:8080/account_holders/employmentStatus|

|**PAYMENTS**|
|:----------- |
|localhost:8080/payments|
|localhost:8080/payments/1|
|localhost:8080/payments/search?from=2022-01-01&to=2022-03-01|
|INSERT SEARCH CATEGORY|
|INSERT SEARCH GREATER THAN AMOUNT|
|INSERT SEARCH ACCOUNT ID|
|INSERT SEARCH ACCOUNT_HOLDER BY NAME|


|**SUBSCRIPTIONS**|
|:----------- |
|localhost:8080/subscriptions|
|localhost:8080/subscriptions/1|
|localhost:8080/subscriptions?category=Entertainment|
|localhost:8080/subscriptions/price=50|
|localhost:8080/subscriptions/isActive=true|
|localhost:8080/subscriptions/dateofpayment?dateofpayment=2017-11-23|


## 2. POST (CREATE)

**ALL CLASSES**
| :----|
|localhost:8080/accounts|
|localhost:8080/account_holders|
|localhost:8080/payments|
|localhost:8080/subscriptions|

## 3. PUT
We need to insert 

## 4. DELETE

