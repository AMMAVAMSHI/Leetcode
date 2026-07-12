# Write your MySQL query statement below
SELECT e.name 
from Employee e
JOIN Employee m
ON m.managerId = e.id
GROUP BY e.id
HAVING count(*) >= 5;