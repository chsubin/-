-- 코드를 입력하세요
SELECT (floor(PRICE/10000)*10000) as PRICE_GROUP, count(*) 
from PRODUCT
group by price_group
order by  price_group
;