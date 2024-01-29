-- 코드를 입력하세요
-- select flavor from(
-- select  s.flavor, sum(total_order) as sum
-- from (SELECT *
--     from first_half f union 
--     select *
--     from july j) s
-- group by s.flavor
-- order by sum desc)
-- where rownum <= 3

select flavor
from (select f.flavor, sum(f.total_order) + sum(j.total_order) as sum
        from first_half f join july j
        on f.flavor = j.flavor
        group by f.flavor
        order by sum desc
     )
where rownum <= 3

-- SELECT flavor
-- FROM (
--     SELECT f.flavor, SUM(f.total_order) + COALESCE(SUM(j.total_order), 0) AS sum
--     FROM first_half f
--     LEFT JOIN july j ON f.flavor = j.flavor
--     GROUP BY f.flavor
--     ORDER BY sum DESC
-- ) subquery
-- WHERE ROWNUM <= 3;
     