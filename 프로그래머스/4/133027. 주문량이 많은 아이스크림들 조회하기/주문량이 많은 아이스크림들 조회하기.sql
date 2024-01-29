-- 코드를 입력하세요
select flavor from(
select  s.flavor, sum(total_order) as sum
from (SELECT *
    from first_half f union 
    select *
    from july j) s
group by s.flavor
order by sum desc)
where rownum <= 3
    