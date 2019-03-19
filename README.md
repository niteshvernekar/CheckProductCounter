-----------
Problem #1
-----------
Build a RESTful service that implments a check out counter for an online retail store that scans products and generates an itemized bill.
The bill should also total the cost of all the products and the applicable sales tax for each product.
The total cost and total sales tax should be printed
Sales tax varies based on the type of products
 category A products carry a levy of 10%
 category B products carry a levy of 20%
 category C products carry no levy
The solution should address the following aspects -
1. Use design methodologies - Object oriented, domain driven, service oriented
2. Services should be RESTful
3. Employ applicable frameworks
4. Unit tested
5. Self-sufficient project that can be built, deployed and tested
Bonus points for
1. Security
2. Internationalization
=========================================================




Basic auth-
userName-user
password-admin

POST  http://localhost:8090/checkoutcounter/bill
{
	"purchase": [{
		"productName": "apple",
		"quantity": "2"
	}, {
		"productName": "banana",
		"quantity": "1"
	}, {
		"productName": "cherry",
		"quantity": "2"
	}]
}
GET  http://localhost:8090/checkoutcounter/bill/{id}
GET  http://localhost:8090/checkoutcounter/bill/all

POST  http://localhost:8090/checkoutcounter/category
{
	"name": "Z",
	"salesTaxPercentage": "50"
}
GET http://localhost:8090/checkoutcounter/category/{id}
GET http://localhost:8090/checkoutcounter/category/all

POST  http://localhost:8090/checkoutcounter/product
{
	"name": "grapes",
	"cost": "50",
	"category": "Z"
}
GET  http://localhost:8090/checkoutcounter/product
GET  http://localhost:8090/checkoutcounter/product/all

