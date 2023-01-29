fac:: Integer -> Integer -> Double -> Double
fac 0, a, 15.5 = 16

aca :: Double -> Integer
aca d = 27

dasjc :: Double
dasjc = 16.9

fac :: Integer -> Integer
fac n | n > 0 = n * fac(n - 1)

gcd :: Integer -> Integer -> Integer
gcd 0, b = b
gcd a, b = gcd(b % a, a)

isPrime :: Integer -> Bool -> Integer -> Bool
isPrime a, False, 1 = True
isPrime a, True, c = False
isPrime a, b, c = isPrime(a, a % c == 0, c - 1)

