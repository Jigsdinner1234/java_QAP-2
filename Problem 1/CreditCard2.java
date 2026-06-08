public class CreditCard2 {
    private Money balance;
    private final Money creditLimit;
    private final Person owner;

    /**
     * Constructor
     * @param newCardHolder owner of the card
     * @param limit credit limit of the card
     */
    public CreditCard2(Person newCardHolder, Money limit)
    {
        owner = newCardHolder;

        // Use copy constructor
        creditLimit = new Money(limit);

        // Start balance at $0.00
        balance = new Money(0);
    }

    /**
     * Returns current balance.
     * Returns a copy to protect the original object.
     */
    public Money getBalance()
    {
        return new Money(balance);
    }

    /**
     * Returns credit limit.
     * Returns a copy to protect the original object.
     */
    public Money getCreditLimit()
    {
        return new Money(creditLimit);
    }

    /**
     * Returns owner's information as a String.
     */
    public String getPersonals()
    {
        return owner.toString();
    }

    /**
     * Charges an amount to the card if limit is not exceeded.
     */
    public void charge(Money amount)
    {
        Money newBalance = balance.add(amount);

        if (newBalance.compareTo(creditLimit) <= 0)
        {
            balance = newBalance;
            System.out.println("Charge: " + amount);
        }
        else
        {
            System.out.println("Exceeds credit limit");
        }
    }

    /**
     * Makes a payment on the card.
     */
    public void payment(Money amount)
    {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}
