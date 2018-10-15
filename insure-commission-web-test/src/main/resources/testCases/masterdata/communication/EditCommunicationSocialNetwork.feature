#TSTINSC-

Feature: Kommunikation

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Kommunikation vom Typ Soziale Netzwerke editieren
    Given Ich lege eine Kommunikation-Soziale-Netzwerke an
    And Ich rufe die Kommunikation-Detailansicht auf
    And Ich rufe die Kommunikation-Bearbeiten-Maske auf
    And Ich aendere die Kommunikation-Soziale-Netzwerke
    When Ich speichere die Aenderung fuer Kommunikation
    Then Die Kommunikation-Soziale-Netzwerke ist geaendert