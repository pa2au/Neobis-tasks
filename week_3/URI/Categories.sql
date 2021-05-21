Select Products.ID, Products.Name
from Products, Categories
where Categories.Name like 'super%'
and Products.Id_categories=Categories.ID;