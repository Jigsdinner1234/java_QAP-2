public class Money
{
    private long dollars;
    private int cents;

    public Money(double amount)
    {
        dollars = (long) amount;
        cents = (int) Math.round((amount - dollars) * 100);

        if (cents == 100)
        {
            dollars++;
            cents = 0;
        }
    }

    // Copy Constructor
    public Money(Money otherObject)
    {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    public Money add(Money otherAmount)
    {
        double total =
                (dollars + cents / 100.0) +
                (otherAmount.dollars + otherAmount.cents / 100.0);

        return new Money(total);
    }

    public Money subtract(Money otherAmount)
    {
        double total =
                (dollars + cents / 100.0) -
                (otherAmount.dollars + otherAmount.cents / 100.0);

        return new Money(total);
    }

    public int compareTo(Money otherObject)
    {
        double thisAmount = dollars + cents / 100.0;
        double otherAmount =
                otherObject.dollars + otherObject.cents / 100.0;

        return Double.compare(thisAmount, otherAmount);
    }

    public boolean equals(Money otherObject)
    {
        return dollars == otherObject.dollars &&
               cents == otherObject.cents;
    }

    @Override
    public String toString()
    {
        return String.format("$%d.%02d", dollars, cents);
    }
}