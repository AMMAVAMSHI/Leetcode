# Write your MySQL query statement below
SeLECT patient_id,patient_name,conditions
FROM Patients
WHERE conditions LIKE '% DIAB1%'OR  conditions LIKE 'DIAB1%';