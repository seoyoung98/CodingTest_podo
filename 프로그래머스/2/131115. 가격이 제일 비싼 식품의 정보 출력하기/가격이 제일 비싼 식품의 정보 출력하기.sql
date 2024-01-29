-- -- 코드를 입력하세요
-- SELECT * 
-- from (
--     select * from food_product
--     order by price desc
-- )
-- where rownum = 1

select *
from food_product
where price = (
    select max(price) from food_product
)