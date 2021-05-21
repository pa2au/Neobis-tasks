Select Products.Name, Providers.Name, Products.price
from Products, providers, categories
where Categories.Name ='Super Luxury' and Products.Price>1000
and Products.id_categories=Categories.ID 
and Products.Id_providers=providers.ID 