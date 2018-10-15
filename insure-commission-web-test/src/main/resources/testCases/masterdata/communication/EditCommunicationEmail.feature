#TSTINSC-

Feature: Kommunikation

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Kommunikation vom Typ E-Mail editieren
    Given Ich lege eine Kommunikation-E-Mail an
    And Ich rufe die Kommunikation-Detailansicht auf
    And Ich rufe die Kommunikation-Bearbeiten-Maske auf
    And Ich aendere die Kommunikation-E-Mail
    When Ich speichere die Aenderung fuer Kommunikation
    Then Die Kommunikation-E-Mail ist geaendert