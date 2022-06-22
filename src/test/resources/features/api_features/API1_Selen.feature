@API
Feature:TC01

  Scenario:API

    Given user connects to "/productsList" for search product list
    Then user verifies that status code is 200 for search product  lists
    Then user verifies that response body has 34 products
    And user write to product list into log.txt that is contained price less than 1000








#Tüm ürünlerin sayısının 43 olduğunu doğrulayın
#Fiyatı 1000'den küçük olan ürünleri log.txt dosyasına yazdırın