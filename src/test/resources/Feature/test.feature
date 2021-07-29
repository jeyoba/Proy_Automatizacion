Feature: Buy product in the Shopping Cart
  As a customer user
  I like to buy a new product entering confidential information

  @Test
  Scenario: 1. Buy product
    Given Web page is available
    When The user generates a card number
    And The user pay a product
    And El usuario selecciona los campos obligatorios
    Then Verificar pago exitoso
    And Verificar que regrese a pantalla inicio


