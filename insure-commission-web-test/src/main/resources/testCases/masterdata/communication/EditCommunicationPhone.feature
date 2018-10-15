#TSTINSC-658

Feature: Kommunikation

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Kommunikation vom Typ Telefon editieren
    Given Ich lege eine Kommunikation-Telefon an
    And Ich rufe die Kommunikation-Detailansicht auf
    And Ich rufe die Kommunikation-Bearbeiten-Maske auf
    And Ich aendere die Kommunikation-Telefon
    When Ich speichere die Aenderung fuer Kommunikation
    Then Die Kommunikation-Telefon ist geaendert