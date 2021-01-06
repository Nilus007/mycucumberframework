@Smoke
Feature: US1005_Walmart_parametre_arama
  Scenario Outline:  TC07_aranan_kelime_title’da_olmali

    When kullanici walmart ana sayfaya gider
    Then walmart sayfasinda "<arananlar>" icin arama yapar
    Then walmart sayfa basliginin "<arananlar>" icerdigini test eder
    And kullanici sayfayi kapatir

    Examples:
      |arananlar  |
      |Nutella    |
      |pencil     |
      |tomatoes   |
      |popcorn    |