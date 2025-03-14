SELECT FP.PRODUCT_ID, FP.PRODUCT_NAME, SUM(FP.PRICE * FO.AMOUNT) TOTAL_SALES
FROM FOOD_PRODUCT FP, FOOD_ORDER FO
WHERE FP.PRODUCT_ID = FO.PRODUCT_ID
AND FO.PRODUCE_DATE LIKE '2022-05%'
GROUP BY FP.PRODUCT_ID, FP.PRODUCT_NAME
ORDER BY TOTAL_SALES DESC, PRODUCT_ID;