#TSTINSC-

Feature: Kommunikation

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Kommunikation vom Typ E-Mail loeschen
    Given Ich lege eine Kommunikation-E-Mail an
    When Ich loesche die Kommunikation
    Then Die Kommunikation-E-Mail ist geloescht