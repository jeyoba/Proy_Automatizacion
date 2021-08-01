Feature: Buy product in the Shopping Cart
  As a customer user
  I like to buy a new product entering confidential information

  @Test
  Scenario: 1. Buy product
    Given Web page is available
    When The user generates a card number
    And Usuario obtiene valores de tarjeta
    And El usuario compra "8" productos
    And El usuario ingresa los campos obligatorios
    And El usuario genera pago
    Then Verificar pago exitoso
    #And Verificar que regrese a pantalla inicio

