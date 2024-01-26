SELECT animal_id, name 
from animal_ins
where INTAKE_CONDITION like 'Sick'
order by animal_id