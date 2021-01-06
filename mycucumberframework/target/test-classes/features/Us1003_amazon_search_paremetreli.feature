@Amazon
Feature: Us1003_amazon_search_paremetreli

  Scenario: TC05_paremetre_kullanimi
    When kullanici amazon anasayfaya gider
    And "teapot" icin arma yapar
    Then sonucun "teapot" icerdigini test eder
    And kullanici sayfayi kapar

