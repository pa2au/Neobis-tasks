select Candidate.name,round((s.math*2+s.specific*3+s.project_plan*5)/10,2) as avg
from Candidate
inner join score as s on candidate.id=s.candidate_id
order by avg desc;