#TSTINSC-644

Feature: Adresse

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Adresse loeschen
    Given Ich lege eine Adresse an
    When Ich loesche die Adresse
    Then Die Adresse ist geloescht