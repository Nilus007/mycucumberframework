Feature: US1009Ck Hotels Login
  Scenario: TC11 kullanici gecerli bilgilerle giris yapar
    Given kullanici Ck Hotels ana sayfasina gider
    Then Log in yazisina tiklar
    And gecersiz username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And kulllanici sayfayi kapatir