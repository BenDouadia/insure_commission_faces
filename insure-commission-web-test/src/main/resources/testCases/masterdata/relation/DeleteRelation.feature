#TSTINSC-648

Feature: Beziehung

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Beziehung loeschen
    Given Ich lege eine Beziehung an
    When Ich loesche die Beziehung
    Then Die Beziehung ist geloescht
