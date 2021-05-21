Select Products.Name, Providers.Name
from products, providers
where id_categories = 6 
and Products.id_providers=Providers.ID;