Feature: Amazon Booking
Scenario: Complete Booking on Amazon
Given Open Amazon
When I enter Search as sonyTV
Then sonyTV Should be added to cart
When I Search as ear phones
Then ear phones Should be added to cart
When I click Search lava
Then lava Should be added to cart
When I want to buy Redmi5
Then Redmi5 Should be added to cart
When I wish to Buy collegebag
Then collegebag Should be added to cart
When 5 Items are added
Then Go to Payment Page