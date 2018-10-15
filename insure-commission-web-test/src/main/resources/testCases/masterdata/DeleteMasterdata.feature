#TSTINSC-67

Feature: Stammdaten

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Stammdaten loeschen
    Given Ich lege einen Stammdatensatz an
    And Ich suche nach Stammdaten
    When Ich loesche den Stammdatensatz
    Then Der Stammdatensatz ist geloescht