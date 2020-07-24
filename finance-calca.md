## Finance

### Fixed-Rate Mortgage

I'm looking to buy a house. [Here in Seattle][rea] you can buy
a condo for about `$250,000`, or you could splurge to get a house
on a bit of land for `$350,000`. Let's splurge...

    price = 350_000 dollars
    down_payment = 20 percent * price => dollars

    finance_amount = price - down_payment => dollars

    interest_rate = 3.7 percent / year
    term = 30 years

    n = term * 12 / year => 1.
    r = interest_rate / (12/year) => percent

    monthly_payment = r / (1-(1+r)^(-n)) * finance_amount => dollars

Looks like if I don't mind dropping `$70,000`, I can 
get a nice place for about `$1,300` a month.

Try editing the price and interest to see
how much your dream house will cost.

[rea]: http://seattle.craigslist.org/rea/

