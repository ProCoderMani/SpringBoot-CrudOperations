# SpringBoot-CrudOperations
Spring-Boot Crud operation with neat and clean Code. 


EndPoints: - 

1.Register/ Add data to dataBase   (PostData)-->  http://localhost:8008/registerDepartment

Data formating for PostMan ----------------------->      
{
    "departmentName":"Administration",
    "departmentAddress":"Haryana",
    "departmentCodeNo":"0077"
}


2. Get all data (GetData)---> http://localhost:8008/departmentUsers
3. Get data with id (GetData) ---> http://localhost:8008/departmentUsers/1

4. Delete all data (DeleteData) --->  http://localhost:8008/deleteDepartment
5. Delete data with Id (DeleteData) ---> http://localhost:8008/deleteDepartment/1

6. Updata data with Id (PutData) ---> http://localhost:8008/udpateDepartment/1

7. Get data with DepartmentName (GetData) --->  http://localhost:8008/getDepartmentByName/name/Administration
