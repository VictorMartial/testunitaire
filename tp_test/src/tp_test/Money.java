package tp_test;

class Money {
	private int fAmount; private String fCurrency; 
public Money(int amount, String currency) { fAmount = amount; fCurrency = currency; } 
public int amount() { return fAmount; } 
public String currency() { return fCurrency; } 
public Money add(Money m) { return new Money(amount() + m.amount(), currency()); } 

public boolean equals(Object ob) {
	if(this==ob) {
		return false;
	}
	if(ob == null || getClass() != ob.getClass()){
		return false;
	}
	Money autre= (Money) ob;
	return fAmount==autre.fAmount && fCurrency.equals(autre.fCurrency);
}
} 
