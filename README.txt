# Dat3SemAflevering1
Afleveret 23-08-2019

Tilføj venligst følgende en database til din Vagrant server
for hver opgave i dette repository og tilkobl dem hver især
til deres egen database, via den givne persistence.xml fil.
      ----OBS--- Onsdagsopgave behøves ikke database!
      
     Husk også at fylde nogle objekter i hver af 
     databaserne for at kunne teste funktionaliteten. 
     Dog behøves ikke på fredagsopgaven, da jeg har 
     implementeret et nyt end points der gør det automatisk.

-------------------------------------------------------------

Fredags opgave:
FredagsOpgave/api/bankcustomer/
FredagsOpgave/api/bankcustomer/populate 
    - (brug denne for at tilføje objekter til database i første omgang)

FredagsOpgave/api/bankcustomer/all
FredagsOpgave/api/bankcustomer/{id}
-
Kan også forbindes via min droplet på
http://165.22.30.158:8080/FredagsOpgave/api/bankcustomer/
(Med samme endpoints).


Torsdags opgave:
http://localhost:8080/jpa_rest_demo1/api/employee
http://localhost:8080/jpa_rest_demo1/api/employee/id/{id}
http://localhost:8080/jpa_rest_demo1/api/employee/all
http://localhost:8080/jpa_rest_demo1/api/employee/highestpaid
http://localhost:8080/jpa_rest_demo1/api/employee/name/{name}
-
Har ikke fået tilkoblet til min droplet.


Onsdags opgave:
http://localhost:8080/Opgave3/api/customer
http://localhost:8080/Opgave3/api/customer/all
http://localhost:8080/Opgave3/api/customer/random
http://localhost:8080/Opgave3/api/customer/{id}
