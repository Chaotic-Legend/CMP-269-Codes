class VendingMachine:
    def __init__(self):
        self.bottles = 20
        
    def purchase(self, amount):
        self.bottles = self.bottles - amount
      
    def restock(self, amount):
        self.bottles = self.bottles + amount
    
    def get_inventory(self):
        return self.bottles
        
    def report(self):
        print(f'Inventory: {self.bottles} bottles')

if __name__ == "__main__":
    # Create a VendingMachine object.
    machine = VendingMachine()
    
    # Read the number of bottles for the first purchase.
    first_purchase = int(input())
    
    # Read the number of bottles to restock.
    restock_amount = int(input())
    
    # Read the number of bottles for the second purchase.
    second_purchase = int(input())
    
    # Perform the first purchase operation.
    machine.purchase(first_purchase)
    
    # Perform the restock operation.
    machine.restock(restock_amount)
    
    # Perform the second purchase operation.
    machine.purchase(second_purchase)
    
    # Report the final inventory.
    machine.report()
