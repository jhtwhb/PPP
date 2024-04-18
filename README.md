POSTMAN:


## Select all items from the items table
GET localhost:8080/animals


## Select one item by its ID
GET localhost:8080/animals/1


## Select all items that belong to a certain user (find by user id FK)
localhost:8080/animals/owner/1


## Insert a new item into the items table
POST localhost:8080/animals
``` json
{
  "name":"Fren",
  "age":6,
  "department":"Aquarium",
  "keeperId":"1"
}
```


## Insert a new user into the users table
POST localhost:8080/keepers
``` json
{
  "name":"Jean",
  "age":"24"
}
```


## Update a user
PATCH localhost:8080/keepers/1
``` json
{
  "name":"Fez",
  "age":"22"
}
```


## Delete an item
DELETE localhost:8080/animals/1


## [Some other functionality of your choice] ====== TO DO
