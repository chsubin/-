-- 코드를 입력하세요
SELECT MEMBER_ID,MEMBER_NAME,GENDER
,date_format(DATE_OF_BIRTH,"%Y-%m-%d") as DATE_OF_BIRTH
from MEMBER_PROFILE
WHERE month(DATE_OF_BIRTH) =03
and GENDER	="W"
and tlno is not null
order by MEMBER_ID;