# Write your MySQL query statement below
(select name as results
from MovieRating join Users using(user_id)
group by name
order by count(*) desc,name
limit 1 )

Union all

(select title as results
from MovieRating join Movies using(movie_id)
where created_at BETWEEN '2020-02-01' AND '2020-02-29'
group by title
order by avg(rating) desc,title
limit 1);
