-- 코드를 입력하세요
SELECT p.PRODUCT_CODE, sum(SALES_AMOUNT*PRICE) AS 	SALES
from product p, offline_sale s 
where p.PRODUCT_ID = s.PRODUCT_ID
group by PRODUCT_CODE
order by SALES desc, p.PRODUCT_CODE asc
;