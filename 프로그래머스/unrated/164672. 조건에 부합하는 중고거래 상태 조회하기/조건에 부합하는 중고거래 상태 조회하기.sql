-- 코드를 입력하세요
SELECT board_id,writer_id,title,price,
    CASE STATUS
        WHEN 'SALE' THEN '판매중'
        WHEN 'RESERVED' THEN '예약중'
        ELSE '거래완료'
    END AS STATUS
from USED_GOODS_BOARD
where date_format(created_date,"%Y-%m-%d") = "2022-10-05"
order by board_id desc
;