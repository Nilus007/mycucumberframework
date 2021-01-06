@wip
Feature: US1008Ck Hotels Login
  Scenario: TC10_kullanici_gecerli_bilgilerle_giris_yapar
    Given kullanici Ck Hotels ana sayfasina gider
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yaptigini kontrol eder
    And kulllanici sayfayi kapatir