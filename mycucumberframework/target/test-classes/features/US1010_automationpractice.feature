Feature: US1011_AutomationPractice
  Scenario: TC14_Kullanici_yeni_giris_olusturabilmeli
    When kullanici "Ap_url" anasayfaya gider
    Then Ap sign_in tusuna tiklar
    And ap email kutusuna email bilgisi yazar
    And ap create an account tusuna basar
    And ap cinsiyet secer
    And ap isim girer
    And ap soyisim girer

    And ap password girer
    And pagedown tusuna basar
    And ap gun secer
    And ap ay secer
    And ap yil secer

    And ap sirket ismi yazar
    And ap adress yazar
    And ap adress2 yazar
    And ap adres sehir yazar
    And ap state dropdown secer
    And ap adres zip kod yazar
    And pagedown tusuna basar

    And bilgi ekleme yapar
    And home phone yazar
    And reference alanini temizler
    And reference yazar
    And ap register butonuna basar
@Automation
    Scenario: TC15_wrong_signIn_testi
      When kullanici "Ap_url" anasayfaya gider
      And Ap sign_in tusuna tiklar
      And ap email kutusuna gecersiz email bilgisi yazar ve enter'e basar
      And hata mesajini dorular

