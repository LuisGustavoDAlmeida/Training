def max_profit(prices):
    higher_price = prices[0]
    lower_price = prices[0]

    for price in prices:

        if (lower_price > price):
            lower_price = price
        if (higher_price < price):
            higher_price = price

    profit = higher_price - lower_price
    return profit