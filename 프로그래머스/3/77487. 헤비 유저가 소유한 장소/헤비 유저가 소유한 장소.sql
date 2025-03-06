SELECT ID, NAME, HOST_ID
FROM PLACES
WHERE HOST_ID IN (SELECT HOST_ID
                  FROM PLACES
                  GROUP BY HOST_ID
                  HAVING COUNT(ID) > 1)
                  ORDER BY ID;