# Write your MySQL query statement below
select e1.name as Employee
from Employee AS e1, Employee As e2 
where (e1.managerId = e2.id and e1.Salary > e2.Salary)
