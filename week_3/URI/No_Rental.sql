Select Customers.ID, Customers.Name
from Customers
where Customers.ID not in(select id_customers from locations);
