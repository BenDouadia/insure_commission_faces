#TSTINSC-652

Feature: Zuordnung

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Zuordnung loeschen
    Given Ich lege eine Zuordnung an
    When Ich loesche die Zuordnung
    Then Die Zuordnung ist geloescht