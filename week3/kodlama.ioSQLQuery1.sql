--Select
--select*from Customers
--select ContactName,CompanyName,City from Customers

--bu şekilde kolonların ekrana basımını değiştirebiliyoruz.(tablo içerisinde değerleri değişmiyor.)
--select ContactName Adı,CompanyName ŞirketAdı,City Şehir from Customers

--filtreleme
--where demek koşul demek
--select *from Customers where City='London'

--case sensitive
--sELect * from Customers

--or ya da demek
--select *from Products where CategoryID=1 or CategoryID=3

--select *from Products where CategoryID=1 and UnitPrice>=10

--order by sırala demektir.
--select * from Products order by CategoryID,ProductName
--ascending artan demektir.DESC(azalan,düşen) belirtilmiyorsa otomatik asc olarak kabul eder.
--select * from Products order by UnitPrice DESC  
--select * from Products where CategoryID=1 order by UnitPrice DESC 

--count saymak demektir.
--select count(*)from Products where CategoryID=2

--her kategori için ayrı ayrı hesaplanır. 
--select categoryID,count(*) from  Products group by CategoryID 

--önce her zaman where çalışır.count(*) kümülatiftir.having kümülatiflere uygulanır.
--select categoryID,count(*) from  Products where UnitPrice>20 group by CategoryID having count(*)<10


--inner join sadece eşleşen dataları bir araya getirir.
--select Products.ProductID,products.ProductName,products.UnitPrice,categories.CategoryName 
--from Products inner join Categories
--on Products.CategoryID=Categories.CategoryID
--where products.unitprice>10

--DTO Data Transformation object for C#

-- order details iki farklı kod olarak algılanmasın diye köşeli parantez kullanılıyor.
--left ile solda olup sağda olmayanları getir demek.kümeler gibi düşünebiliriz.
select*from Products p left join [Order Details] od
on p.ProductID=od.ProductID

select * from Customers c left join  Orders o 
on c.CustomerID=o.CustomerID
where o.CustomerID is null






