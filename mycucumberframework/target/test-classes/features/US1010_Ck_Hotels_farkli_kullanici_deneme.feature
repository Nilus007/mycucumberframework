Feature: US1010_Ck_Hotels_farkli_kullanici_deneme
  Scenario: TC12_farkli_kullanici_ismi_ve şifre_şifre_yazarak_deneyebilmeliyim
    When kullanici "p_url" anasayfaya gider
    Then log in yazisina tıklar
    And username olarak "manager" girer
    And password olarak "manager" girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
