# Write your MySQL query statement below

SELECT (
    SELECT DISTINCT salary FROM(
        SELECT salary,DENSE_RANK() OVER(ORDER BY salary DESC) as rnk
    FROM Employee
)x
WHERE x.rnk = 2
) AS SecondHighestSalary;

