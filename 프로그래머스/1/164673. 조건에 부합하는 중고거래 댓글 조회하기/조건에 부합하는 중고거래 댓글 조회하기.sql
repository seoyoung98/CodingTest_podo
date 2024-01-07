-- 코드를 입력하세요
SELECT ugb.title, ugb.board_id, ugr.reply_id, ugr.writer_id, ugr.contents, DATE_FORMAT(ugr.created_date, '%Y-%m-%d') as created_date
from USED_GOODS_BOARD ugb join USED_GOODS_REPLY ugr on ugb.board_id = ugr.board_id
where ugb.created_date >= '2022.10.01' and ugb.created_date <= '2022.10.31'
order by ugr.created_date asc, ugb.title asc;