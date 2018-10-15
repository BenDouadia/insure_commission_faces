#TSTINSC-

Feature: Kommunikation

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Kommunikation vom Typ Webseite editieren
    Given Ich lege eine Kommunikation-Webseite an
    And Ich rufe die Kommunikation-Detailansicht auf
    And Ich rufe die Kommunikation-Bearbeiten-Maske auf
    And Ich aendere die Kommunikation-Webseite
    When Ich speichere die Aenderung fuer Kommunikation
    Then Die Kommunikation-Webseite ist geaendert