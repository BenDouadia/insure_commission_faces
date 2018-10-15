#TSTINSC-

Feature: Kommunikation

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Kommunikation vom Typ Webseite loeschen
    Given Ich lege eine Kommunikation-Webseite an
    When Ich loesche die Kommunikation
    Then Die Kommunikation-Soziale-Webseite ist geloescht