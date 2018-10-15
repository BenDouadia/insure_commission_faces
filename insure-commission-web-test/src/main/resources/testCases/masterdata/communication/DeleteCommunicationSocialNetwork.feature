#TSTINSC-

Feature: Kommunikation

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Kommunikation vom Typ Soziale Netzwerke loeschen
    Given Ich lege eine Kommunikation-Soziale-Netzwerke an
    When Ich loesche die Kommunikation
    Then Die Kommunikation-Soziale-Netzwerke ist geloescht