#TSTINSC-659

Feature: Kommunikation

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Kommunikation vom Typ Telefon loeschen
    Given Ich lege eine Kommunikation-Telefon an
    When Ich loesche die Kommunikation
    Then Die Kommunikation-Telefon ist geloescht