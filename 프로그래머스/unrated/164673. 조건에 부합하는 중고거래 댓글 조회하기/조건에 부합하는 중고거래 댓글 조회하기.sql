-- 코드를 입력하세요
SELECT b.TITLE,b.BOARD_ID,r.REPLY_ID,r.WRITER_ID,r.CONTENTS,DATE_FORMAT(r.created_date, "%Y-%m-%d")
from USED_GOODS_REPLY r, USED_GOODS_BOARD b
WHERE r.BOARD_ID = b.BOARD_ID
and b.CREATED_DATE >= '2022-10-01'
and b.CREATED_DATE<'2022-11-01'
order by r.created_date asc ,b.title asc;